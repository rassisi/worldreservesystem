package com.joffice.rcpl.plugin.office.databinding;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IObverserObvervable;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IParagraph;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab;
import com.joffice.rcpl.plugin.office.databinding.types.JOTabArray;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab.JOTabLeader;
import com.joffice.rcpl.plugin.office.databinding.types.JOTab.JOTabType;

/**
 * @author ramin
 * 
 * @param <T>
 */
public class JOPropertyTabs<T extends JOTabArray> extends JOProperty<JOTabArray>implements IObverserObvervable {

	public JOPropertyTabs(ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject) {
		this(layoutObject, xmlParent, xmlObject, false);
	}

	public JOPropertyTabs(ILayoutObject layoutObject, XmlObject xmlParent, XmlObject xmlObject, boolean immutable) {
		super(null, layoutObject, xmlParent, xmlObject, "tabs", immutable); //$NON-NLS-1$
	}

	@Override
	public JOTabArray get() {
		if (data == null) {
			data = new JOTabArray();
			JOTabArray ts = (JOTabArray) data;
			CTTabStop[] tabStops = ((CTTabs) xmlObject).getTabArray();
			for (CTTabStop ctTabStop : tabStops) {
				JOTab tab = new JOTab(ctTabStop);
				ts.addTab(tab);
			}
		}
		return (JOTabArray) data;
	}

	@Override
	public void set(XmlObject xmlObject) {
	}

	@Override
	public void update(ILayoutObject layoutObject, Object dat) {
		Object[] values = (Object[]) dat;
		JOTab oldTab = (JOTab) values[0];
		int newPosition = (Integer) values[1];
		JOTabType type = (JOTabType) values[2];
		JOTabLeader leader = (JOTabLeader) values[3];
		updateTabs(layoutObject, oldTab, newPosition, type, leader);
	}

	/**
	 * @param oldTab
	 * @param newPosition
	 * @param tabType
	 * @param leader
	 */
	private void updateTabs(ILayoutObject layoutObject, JOTab oldTab, int newPosition, JOTabType tabType,
			JOTabLeader leader) {
		IEditor editorFigure = layoutObject.getDocument().getEditor();
		CTTabs ctTabs = (CTTabs) getXmlObject();
		JOTab tab = null;
		for (int i = 0; i < get().getTabCount(); i++) {
			JOTab t = get().getTab(i);
			if (t.getPos() == oldTab.getPos()) {
				if (t.getType().equals(oldTab.getType())) {
					if (t.getLeader().equals(oldTab.getLeader())) {
						tab = t;
						break;
					}
				}
			}
		}

		if (tab != null) {
			IPage page = editorFigure.getSelectedPage();
			List<Double> tabStops = new ArrayList<Double>();
			for (int i = 0; i < get().getTabCount(); i++) {
				double pos = get().getTab(i).getPos() + page.getMarginLeft();
				tabStops.add(pos);
			}
			Collections.sort(tabStops);
			JOEmu emuPos = new JOEmuPixel(newPosition);
			tab.setPos(emuPos);
			int index = get().getIndex(tab);
			CTTabStop tabStop = ctTabs.getTabArray(index);
			long newPos = (long) (emuPos.toPoints() * 20);
			tabStop.setPos(BigInteger.valueOf(newPos));
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JOProperty<JOTabArray> createCopyFromTemplate(ILayoutObject layoutObject) {
		if (template) {
			IParagraph par = (IParagraph) layoutObject;
			if (par.getXmlObject() instanceof CTP) {
				if (((CTP) par.getXmlObject()).getPPr().getTabs() != null) {
					((CTP) par.getXmlObject()).getPPr().unsetTabs();
				}
				XmlObject newXmlObject = ((CTP) par.getXmlObject()).getPPr().addNewTabs();
				newXmlObject.set(xmlObject);
			}
			layoutObject.setDirtyLayout(true);
			layoutObject.setDirtyContent(true);
			layoutObject.updateFromXml();
			layoutObject.getDocument().getEditor().layoutDocument();
			return (JOProperty<JOTabArray>) par.getTabs();
		}
		return null;
	}

}
