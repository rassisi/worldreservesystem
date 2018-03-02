package com.joffice.rcpl.plugin.office;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EnDocumentType;
import org.eclipse.rcpl.IBorder;
import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IFocusable;
import org.eclipse.rcpl.IJOProperty;
import org.eclipse.rcpl.ILayoutAnchor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.ISection;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.EnLayoutAlignment;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign;

import com.joffice.rcpl.plugin.office.databinding.JOProperty;
import com.joffice.rcpl.plugin.office.databinding.JOPropertyIndent;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOIndent;
import com.joffice.rcpl.plugin.office.databinding2.JOBoolean;
import com.joffice.rcpl.plugin.office.databinding2.JOColorProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmu20ThPointProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuInsetProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOEmuProperty;
import com.joffice.rcpl.plugin.office.databinding2.JOPropertySize;
import com.joffice.rcpl.plugin.office.internal.JOStyleTemplate;
import com.joffice.rcpl.plugin.office.internal.model.spreadsheet.JOSpreadsheetDocument;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOPict;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;
import com.joffice.rcpl.plugin.office.internal.model.word.JOTable;
import com.joffice.rcpl.plugin.office.internal.model.word.JOWordDocument;

import javafx.geometry.Rectangle2D;

/**
 * This is the super class for all ooxml objects that can be layouted The layout
 * deals with x, y and z coordinates
 * 
 * @author ramin
 * 
 */
public abstract class JOObject implements ILayoutObject {

	protected XmlObject xmlObject;

	private XmlObject xmlParent;

	private List<ILayoutObject> children;

	private ILayoutObject parent;

	private ILayoutObject vAnchorObject;

	private ILayoutObject hAnchorObject;

	// ---------- new databinding 2 properties ---------------------------------

	protected JOColorProperty lineColorProperty;
	protected JOColorProperty fillColorProperty;
	protected JOEmuProperty lineWidthProperty;
	protected JOEmu20ThPointProperty spacingBefore;
	protected JOEmu20ThPointProperty spacingAfter;
	protected JOEmuProperty width;
	protected JOEmuProperty height;
	protected JOEmuProperty xOff;
	protected JOEmuProperty yOff;
	protected JOEmuProperty x;
	protected JOEmuProperty y;

	protected JOEmuProperty marginTop;
	protected JOEmuProperty marginLeft;
	protected JOEmuProperty marginRight;
	protected JOEmuProperty marginBottom;

	protected JOBoolean pageBreakBefore;
	protected JOEmuInsetProperty insets;
	protected JOEmuProperty leftMargin;
	protected JOEmuProperty topMargin;
	protected JOEmuProperty rightMargin;
	protected JOEmuProperty bottomMargin;

	// -------------------------------------------------------------------------

	private Rectangle2D layoutBounds = null;

	private boolean asCharacter;

	protected boolean pageBreakAfter;

	private XmlObject template;

	// ---------- new databinding properties -----------------------------------

	protected JOPropertyIndent<JOIndent> valueIndent;

	private List<Method> dataBindingGetter;
	private List<Method> dataBindingSetter;

	private ILayoutObject rootObject;

	private double rotation;

	// ---------- new emu properties -------------------------------------------

	protected JOEmu lineWidth;

	// ---------- crop (percentage) --------------------------------------------

	protected float cropBottom;
	protected float cropTop;
	protected float cropLeft;
	protected float cropRight;

	// ---------- arcsize (percentage of smaller rect side) --------------------

	protected float arcsize;

	// ---------- pure layout properties ---------------------------------------

	protected boolean isRootObject; // TODO: ???
	protected ILayoutAnchor hAnchor = ILayoutAnchor.TEXT;
	protected ILayoutAnchor vAnchor = ILayoutAnchor.TEXT;
	protected double leftFromText = -1;
	protected double rightFromText = -1;
	protected double topFromText = -1;
	protected double bottomFromText = -1;
	protected double zOrder = 1;
	private double savedZOrder = 1;

	protected EnLayoutAlignment xAlign;
	protected EnLayoutAlignment yAlign;
	protected boolean renderedPageBreak = false;
	protected boolean columnBreak = false;
	protected LineSpacingRule ooxmlLineSpacingRule;
	protected boolean allowOverlap = false;
	protected boolean behindDoc = false;

	// ---------- dirty flags --------------------------------------------------

	private boolean dirtyContent = true;
	// protected boolean dirtyHeight = true;
	protected boolean dirtyLayout = true;

	protected ILayoutFigure layoutFigure;
	protected JOPict pict;
	protected JOTable containerTable;
	protected IPage page;

	// ---------- colors -------------------------------------------------------

	private IColor solidFillColor;

	// ----------- misc --------------------------------------------------------

	// protected JOCharacterLayout characterLayout;
	protected boolean focus;
	protected String hRef;
	protected String title;
	protected String source;
	protected IBorder border;
	private boolean childObject;
	protected IColor lineColor;
	protected JOSection section;

	public IStyle style;

	protected JOPropertySize size;

	private double heightOverflow = 0;

	private String uuId;

	private boolean disposed;

	// ---------- TODO: reengineer it ------------------------------------------

	// protected CTTextAlignment textAlignment;
	// protected CTJc jc;

	JOObject(IDocument document) {

		this(document, null, null, null, false, false, -1);
	}

	/**
	 * @param parentObject
	 */
	public JOObject(IDocument document, ILayoutObject parentObject, XmlObject parent, XmlObject xmlObject,
			boolean childObject, boolean isRootObject, int index) {
		this.document = document;
		this.uuId = UUID.randomUUID().toString();
		this.parent = parentObject;
		this.xmlObject = xmlObject;
		this.xmlParent = parent;
		this.childObject = childObject;
		this.isRootObject = isRootObject;
		this.height = new JOEmuProperty();
		this.dirtyLayout = true;
		this.width = new JOEmuProperty();
		this.x = new JOEmuProperty();
		this.y = new JOEmuProperty();

		if (document != null) {
			if (index >= 0) {
				document.addLayoutObject(index, this);
			} else {
				document.addLayoutObject(this);
			}
		}
		if (isRootObject) {
			rootObject = this;
		}
		if (parentObject != null) {
			rootObject = parentObject.getRootObject();
		}

		init();

	}

	// /**
	// * @return
	// */
	// private boolean loadLayoutInfo() {
	// try {
	//
	// int index = document.getLayoutObjects().indexOf(this);
	// Object o = document.get(JO.REGISTRY_PARAGRAPH_LAYOUT_INFO + index);
	// if (o instanceof JOLayoutInfo) {
	// layoutInfo = (JOLayoutInfo) o;
	// // System. out.("*** height = " + layoutInfo.height);
	// layoutInfo.setCharacterLayouts(null);
	// if (layoutInfo.height > 0) {
	// dirtyHeight = false;
	// }
	// return true;
	// }
	// dirtyHeight = true;
	// dirtyLayout = true;
	// return false;
	//
	// } catch (Exception ex) {
	// return false;
	// }
	// }

	/**
	 * 
	 */
	protected void init() {
		// shapes;
		bottomFromText = -1;
		hAnchor = ILayoutAnchor.TEXT;
		leftFromText = -1;
		rightFromText = -1;
		xAlign = null;
		yAlign = null;
		topFromText = -1;
		vAnchor = ILayoutAnchor.TEXT;
		zOrder = 1;
		// textAlignment = null;
		valueIndent = null;
		// jc = null;
		border = null;
		renderedPageBreak = false;
		ooxmlLineSpacingRule = null;

		dataBindingGetter = new ArrayList<Method>();
		dataBindingSetter = new ArrayList<Method>();
		Method[] methods = getClass().getMethods();
		for (Method method : methods) {
			if (isGetter(method)) {
				Class<?> cl = method.getReturnType();
				String className = cl.getSimpleName();
				if (className.startsWith("JOProperty")) { //$NON-NLS-1$
					dataBindingGetter.add(method);
				}
			} else if (isSetter(method)) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				if (parameterTypes != null && parameterTypes.length == 1) {
					Class<?> firstParameterClass = parameterTypes[0];
					String className = firstParameterClass.getSimpleName();
					if (className.startsWith("JOProperty")) { //$NON-NLS-1$
						dataBindingSetter.add(method);
					}
				}
			}
		}

	}

	public static XmlObject[] selectPath(XmlObject xmlObject, String alias, String nsUri, String tag) {

		String path = "declare namespace " + alias + "='" + nsUri //$NON-NLS-1$//$NON-NLS-2$
				+ "'; .//" + alias + ":" + tag; // + "[@nx='ss']";
		XmlObject[] result = xmlObject.selectPath(path); // $NON-NLS-1$
															// //$NON-NLS-2$
		return result;
	}

	// /**
	// * @param node
	// */
	// protected void stepThroughNodes(Node rootNode, Node node) {
	// if (node == rootNode) {
	// }
	//
	// String elementNodeName = node.getNodeName();
	// int type = node.getNodeType();
	// // String uri = node.getBaseURI();
	//
	// switch (type) {
	// case Node.ELEMENT_NODE:
	// // ------- attributes ----
	// NamedNodeMap attrs = node.getAttributes();
	// if (attrs != null) {
	// int len = attrs.getLength();
	// for (int i = 0; i < len; i++) {
	// Attr attr = (Attr) attrs.item(i);
	// String attributeName = attr.getNodeName();
	// String value = attr.getNodeValue();
	//
	// if (elementNodeName.equals("v:shape")) { //$NON-NLS-1$
	// } else if (elementNodeName.equals("a:ext")) { //$NON-NLS-1$
	// double w;
	// double h;
	//
	// if (attributeName.equals("cx")) { //$NON-NLS-1$
	// w = Double.valueOf(value.trim());
	// }
	// if (attributeName.equals("cy")) { //$NON-NLS-1$
	// h = Double.valueOf(value.trim());
	// }
	//
	// size = new JOPropertySize<JOSize>(xmlObject, key)
	// // the shape
	//
	// } else if (elementNodeName.equals("wp:extent")) { //$NON-NLS-1$
	// if (attributeName.equals("cx")) { //$NON-NLS-1$
	// size.x = (int) OOXMLConversion.emu2Pt(Double
	// .valueOf(value.trim()));
	// size.y = OOXMLConversion.pointsToPixel(size.y);
	//
	// } else if (attributeName.equals("cy")) { //$NON-NLS-1$
	// // size.y = (int) OOXMLConversion.emu2Dot(Double
	// // .valueOf(value.trim()));
	//
	// }
	//
	// // a little bit extra space arount the shape because of
	// // effects
	//
	// }
	// // else if (elementNodeName.equals("wp:effectExtent")) { //$NON-NLS-1$
	// // if (attributeName.equals("l")) { //$NON-NLS-1$
	// // int l = (int) OOXMLConversion.emu2Pt(Double
	// // .valueOf(value.trim()));
	// // } else if (attributeName.equals("r")) { //$NON-NLS-1$
	// // int l = (int) OOXMLConversion.emu2Pt(Double
	// // .valueOf(value.trim()));
	// // } else if (attributeName.equals("t")) { //$NON-NLS-1$
	// // int l = (int) OOXMLConversion.emu2Pt(Double
	// // .valueOf(value.trim()));
	// // } else if (attributeName.equals("b")) { //$NON-NLS-1$
	// // int l = (int) OOXMLConversion.emu2Pt(Double
	// // .valueOf(value.trim()));
	// // }
	// // }
	// }
	// }
	//
	// NodeList nodeList = node.getChildNodes();
	// if (nodeList != null) {
	// int length = nodeList.getLength();
	// for (int i = 0; i < length; i++) {
	// Node childItem = nodeList.item(i);
	// stepThroughNodes(rootNode, childItem);
	// }
	// }
	//
	// break;
	// case Node.ENTITY_REFERENCE_NODE:
	// break;
	// case Node.CDATA_SECTION_NODE:
	// break;
	// case Node.TEXT_NODE:
	// break;
	// case Node.PROCESSING_INSTRUCTION_NODE:
	// String data = node.getNodeValue();
	// if (data != null && data.length() > 0)
	// break;
	// }
	//
	// }

	@Override
	public boolean dispose() {
		try {
			getDocument().removeLayoutObject(this);
			getLayoutFigure().dispose();
			if (getParent() != null) {
				getParent().getChildList().remove(this);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		return true;
	}

	public void setFocus(boolean focus) {
		Iterator<ILayoutObject> it = getDocument().layoutObjects();
		while (it.hasNext()) {
			ILayoutObject lo = it.next();
			if (lo instanceof IFocusable) {
				((IFocusable) lo).setFocus(false);
			}
		}
		this.focus = focus;
	}

	// public JOCharacterLayout getCharacterLayout() {
	// if (characterLayout == null) {
	// characterLayout = new JOCharacterLayout();
	// }
	// return characterLayout;
	// }
	//
	// public void setLayoutLocations(JOCharacterLayout characterLayout) {
	// this.characterLayout = characterLayout;
	// }

	private int xmlIndex = -1;

	@Override
	public int getRootIndex() {
		if (isRootObject) {
			return getDocument().getRootObjects().indexOf(this);
		}
		return -1;
	}

	/**
	 * @return
	 */
	@Override
	public int getIndex() {

		try {
			// if (getEditorFigure() == null || getEditorFigure().isSortMode())
			// {
			// // if (xmlIndex == -1)
			// {
			// xmlIndex = JOUtil2.getIndex(getXmlObject(), false);
			// }
			// return xmlIndex;
			// }
			// xmlIndex = JOUtil2.getIndex(getXmlObject(), false);
			//
			//

			return xmlIndex;
		} catch (Exception ex) {
			return -1;
		}
	}

	// public int getIndex(XmlObject xmlObject) {
	// Node node = xmlObject.getDomNode();
	// Node parentNode = node.getParentNode();
	// NodeList nodeList = parentNode.getChildNodes();
	// int index = 0;
	// int length = nodeList.getLength();
	// for (; index < length; index++) {
	// if (nodeList.item(index) == node) {
	// break;
	// }
	// }
	// return index;
	// }

	// public CTJc getJc() {
	// return jc;
	// }
	//
	// public void setJc(CTJc jc) {
	// this.jc = jc;
	// }
	//
	// public CTTextAlignment getTextAlignment() {
	// return textAlignment;
	// }
	//
	// public void setTextAlignment(CTTextAlignment textAlignment) {
	// this.textAlignment = textAlignment;
	// }

	@Override
	public void setLayoutFigure(ILayoutFigure layoutFigure) {
		this.layoutFigure = layoutFigure;
	}

	@Override
	public abstract String getDisplayName();

	/**
	 * @return
	 */
	@Override
	public ILayoutFigure getLayoutFigure() {

		if (layoutFigure == null) {
			layoutFigure = createLayoutFigure();
			if (layoutFigure == null) {
				return null;
			}
			double h = Math.max(20, layoutFigure.getFx().getHeight());
			height.set(h);
			if (layoutFigure != null) {
				double w2 = Math.max(1, width.get().toPixel());
				double h2 = Math.max(1, height.get().toPixel());
				layoutFigure.setWidth(w2 + 4);
				layoutFigure.setHeight(h2);
			}
		}
		return layoutFigure;
	}

	@Override
	public double getWidthPixel() {
		if (size != null) {
			return size.getWidthPixel();
		}
		return width.get().toPixel();
	}

	@Override
	public double getHeightPixel() {
		if (size != null) {
			return size.getHeightPixel();
		}
		return height.get().toPixel();
	}

	/**
	 * @return
	 */
	@Override
	public abstract ILayoutFigure createLayoutFigure();

	/**
	 * @return
	 */
	@Override
	public boolean isDirtyContent() {
		return dirtyContent;
	}

	/**
	 * @param dirtyContent
	 */
	@Override
	public void setDirtyContent(boolean dirtyContent) {
		this.dirtyContent = dirtyContent;
		if (dirtyContent) {
			getDocument().setDirty(true);
		}
	}

	private CTShd ooxmlCtShd;

	public CTShd getOoxmlCtShd() {
		return ooxmlCtShd;
	}

	public IColor getBackgroundColor() {
		if (getOoxmlCtShd() != null) {
			Object o = getOoxmlCtShd().getFill();
			if (o instanceof byte[]) {
				return Rcpl.colorProvider().get((byte[]) o);
			}
		}
		if (getDocument().getBackground() != null && getDocument().getBackground() != null) {
			return (IColor) getDocument().getBackground().get();
		}
		return IColor.WHITE;
	}

	public void setOoxmlCtShd(CTShd ooxmlCtShd) {
		this.ooxmlCtShd = ooxmlCtShd;
	}

	private IDocument document;

	/**
	 * @return
	 */
	@Override
	public IDocument getDocument() {
		if (document == null) {
			IEditor ef = getEditorFigure();
			if (ef != null) {
				document = ef.getDocument();
			}
		}
		return document;
	}

	public LineSpacingRule getOoxmlLineSpacingRule() {
		return ooxmlLineSpacingRule;
	}

	public void setOoxmlLineSpacingRule(LineSpacingRule ooxmlLineSpacingRule) {
		this.ooxmlLineSpacingRule = ooxmlLineSpacingRule;
	}

	/**
	 * @return
	 */
	@Override
	public int getLayoutIndex() {
		return getDocument().getObjectIndex(this);
	}

	/**
	 * @return
	 */
	@Override
	public int getRootObjectIndex() {
		return getDocument().getRootObjectIndex(this);
	}

	/**
	 * @return
	 */
	public ILayoutObject getNext() {
		int index = getLayoutIndex();
		if (index == getDocument().getLayoutObjectSize() - 1) {
			return null;
		}
		return getDocument().getLayoutObject(index + 1);
	}

	/**
	 * @return
	 */
	@Override
	public ISection getSection() {
		if (section == null) {
			return getDocument().getSection();
		}
		return section;
	}

	/**
	 * @return
	 */
	public ILayoutObject getPrevious() {
		try {
			int index = getLayoutIndex();
			if (index <= 0) {
				return null;
			}
			ILayoutObject result = getDocument().getLayoutObject(index - 1);
			return result;
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
			return null;
		}
	}

	/**
	 * @return
	 */
	@Override
	public ILayoutObject getNextRootObject() {
		List<ILayoutObject> rootList = getDocument().getRootObjects();
		int index = rootList.indexOf(this);
		if (index >= rootList.size() - 1) {
			return null;
		}
		return rootList.get(index + 1);
	}

	// TODO: in table cells eigene

	/**
	 * @return
	 */
	@Override
	public ILayoutObject getPreviousRootObject() {
		List<ILayoutObject> rootList = getDocument().getRootObjects();
		int index = rootList.indexOf(this);
		if (index <= 0) {
			return null;
		}
		return rootList.get(index - 1);
	}

	/**
	 * @return
	 */
	@Override
	public JOParagraph getPreviousRootParagraph() {
		ILayoutObject o = this;
		while (true) {
			o = o.getPreviousRootObject();
			if (o == null) {
				return null;
			}
			if (o instanceof JOParagraph) {
				return (JOParagraph) o;
			}
		}
	}

	/**
	 * @return
	 */
	@Override
	public JOParagraph getNextRootParagraph() {
		ILayoutObject o = this;
		while (true) {
			o = o.getNextRootObject();
			if (o == null) {
				return null;
			}
			if (o instanceof JOParagraph) {
				return (JOParagraph) o;
			}
		}
	}

	/**
	 * 
	 */
	@Override
	public abstract void updateFromXml();

	/**
	 * @return
	 */
	public double getBottomFromText() {
		return bottomFromText;
	}

	/**
	 * @param bottomFromText
	 */
	public void setBottomFromText(BigInteger bottomFromText) {
		this.bottomFromText = bottomFromText.doubleValue();
	}

	/**
	 * @return
	 */
	@Override
	public ILayoutAnchor getHAnchor() {
		return hAnchor;
	}

	/**
	 * @param hAnchor
	 */
	public void setHAnchor(ILayoutAnchor hAnchor) {
		this.hAnchor = hAnchor;
	}

	@Override
	public ILayoutObject getHAnchorObject() {
		if (hAnchorObject == null) {
			hAnchorObject = getRootObject();
		}
		return hAnchorObject;
	}

	public double getLeftFromText() {
		return leftFromText;
	}

	public void setLeftFromText(BigInteger leftFromText) {
		this.leftFromText = leftFromText.doubleValue();
	}

	public double getRightFromText() {
		return rightFromText;
	}

	public void setRightFromText(BigInteger rightFromText) {
		this.rightFromText = rightFromText.doubleValue();
	}

	@Override
	public EnLayoutAlignment getxAlign() {
		return xAlign;
	}

	public void setxAlign(EnLayoutAlignment xAlign) {
		this.xAlign = xAlign;
	}

	@Override
	public EnLayoutAlignment getyAlign() {
		return yAlign;
	}

	public EnLayoutAlignment getAlign(STXAlign.Enum align) {
		if (align.equals(STXAlign.CENTER)) {
			return EnLayoutAlignment.CENTER;
		} else if (align.equals(STXAlign.INSIDE)) {
			return EnLayoutAlignment.INSIDE;
		} else if (align.equals(STXAlign.LEFT)) {
			return EnLayoutAlignment.LEFT;
		} else if (align.equals(STXAlign.OUTSIDE)) {
			return EnLayoutAlignment.OUTSIDE;
		} else if (align.equals(STXAlign.RIGHT)) {
			return EnLayoutAlignment.RIGHT;
		}
		return null;
	}

	protected EnLayoutAlignment getAlign(STYAlign.Enum align) {
		if (align.equals(STYAlign.BOTTOM)) {
			return EnLayoutAlignment.BOTTOM;
		} else if (align.equals(STYAlign.CENTER)) {
			return EnLayoutAlignment.CENTER;
		} else if (align.equals(STYAlign.INLINE)) {
			return EnLayoutAlignment.INLINE;
		} else if (align.equals(STYAlign.INSIDE)) {
			return EnLayoutAlignment.INSIDE;
		} else if (align.equals(STYAlign.OUTSIDE)) {
			return EnLayoutAlignment.OUTSIDE;
		} else if (align.equals(STYAlign.TOP)) {
			return EnLayoutAlignment.TOP;
		}
		return null;
	}

	public void setyAlign(EnLayoutAlignment yAlign) {
		this.yAlign = yAlign;
	}

	public double getTopFromText() {
		return topFromText;
	}

	public void setTopFromText(BigInteger topFromText) {
		this.topFromText = topFromText.doubleValue();
	}

	@Override
	public ILayoutAnchor getVAnchor() {
		return vAnchor;
	}

	public void setVAnchor(ILayoutAnchor vAnchor) {
		this.vAnchor = vAnchor;
	}

	public void setBorder(CTPBdr border) {
		this.border = new JOBorder(this, border);
	}

	@Override
	public IBorder getBorder() {
		return border;
	}

	public void setBorder(IBorder border) {
		this.border = border;
	}

	@Override
	public void setVAnchorObject(ILayoutObject vAnchorObject) {
		this.vAnchorObject = vAnchorObject;
	}

	@Override
	public void setHAnchorObject(ILayoutObject anchorObject) {
		this.hAnchorObject = anchorObject;
	}

	public void setX(JOEmuProperty x) {
		this.x = x;
	}

	public void setXPixel(double x) {
		this.x.set(x);
	}

	public void setY(JOEmuProperty y) {
		this.y = y;
	}

	public void setYPixel(double y) {
		this.y.set(y);
	}

	public void setLeftFromText(double leftFromText) {
		this.leftFromText = leftFromText;
	}

	public void setRightFromText(double rightFromText) {
		this.rightFromText = rightFromText;
	}

	public void setTopFromText(double topFromText) {
		this.topFromText = topFromText;
	}

	public void setBottomFromText(double bottomFromText) {
		this.bottomFromText = bottomFromText;
	}

	public void setBorder(CTBorder border) {
		this.border = new JOBorder(this, border);
	}

	public void setBorder(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder border) {
		this.border = new JOBorder(this, border);
	}

	public boolean isRenderedPageBreak() {
		return renderedPageBreak;
	}

	public void setRenderedPageBreak(boolean renderedPageBreak) {
		this.renderedPageBreak = renderedPageBreak;
	}

	@Override
	public double getZOrder() {
		if (isRootObject) {
			return 0;
		}
		return zOrder;
	}

	public int getZIndex() {
		if (getDocument() instanceof JOSpreadsheetDocument) {

		} else if (getDocument() instanceof JOWordDocument) {
			if (getPage() != null) {
				List<ILayoutObject> sorted = getZOrderedList(getPage().getLayoutObjects());
				return sorted.indexOf(this);
			} else {
				// LOGGER.error("Page == null");
			}
		}
		return 1;
	}

	/**
	 * @param layoutObjects
	 */
	public List<ILayoutObject> getZOrderedList(List<ILayoutObject> layoutObjects) {
		Rcpl.profile("getZOrderdList"); //$NON-NLS-1$
		List<ILayoutObject> sortedList = new ArrayList<ILayoutObject>();
		sortedList.addAll(layoutObjects);
		Collections.sort(sortedList, new Comparator<ILayoutObject>() {
			@Override
			public int compare(ILayoutObject o1, ILayoutObject o2) {
				return JOObject.this.compareZOrder((JOObject) o1, (JOObject) o2);
			}
		});
		Rcpl.profileEnd();
		return sortedList;
	}

	/**
	 * @param o1
	 * @param o2
	 * @return
	 */
	private int compareZOrder(JOObject o1, JOObject o2) {
		if (o1.isBehindDoc()) {
			return -1;
		}
		if (o2.isBehindDoc()) {
			return 1;
		}
		double z1 = o1.getZOrder();
		double z2 = o2.getZOrder();
		if (z1 > z2) {
			return 1;
		} else if (z1 < z2) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public void setZOrder(double zOrder) {
		savedZOrder = zOrder;
		this.zOrder = zOrder;
	}

	@Override
	public void setZOrderBehindDoc(boolean behindDoc) {
	}

	public void setActiveZOrder() {
		this.zOrder = Double.MAX_VALUE;
	}

	public void restoreZOrder() {
		setZOrder(savedZOrder);
	}

	@Override
	public ILayoutObject getVAnchorObject() {
		if (vAnchorObject == null) {
			vAnchorObject = getRootObject();
		}
		return vAnchorObject;
	}

	protected IEditor getEditorFigure() {
		if (document != null) {
			return document.getEditor();
		}
		return null;
	}

	public boolean isFocus() {
		return focus;
	}

	public JOPict getPict() {
		return pict;
	}

	public void setPict(JOPict pict) {
		this.pict = pict;
	}

	public JOTable getContainerTable() {
		return containerTable;
	}

	public void setContainerTable(JOTable containerTable) {
		this.containerTable = containerTable;
	}

	// private static Hashtable<Image, JOObject> figureImages = new
	// Hashtable<Image, JOObject>();

	// private static List<Image> figureImagesList = new ArrayList<Image>();

	// public Image getFigureImage() {
	// if (figureImage == null || dirtyFigureImage) {
	// createFigureImage();
	// if (figureImage != null) {
	// dirtyFigureImage = false;
	// figureImages.put(figureImage, this);
	// figureImagesList.add(figureImage);
	// if (figureImagesList.size() > 500) {
	// Image image = figureImagesList.get(0);
	// figureImagesList.remove(0);
	// JOLayoutObject lo = figureImages.get(image);
	// if (lo != null) {
	// lo.setDirtyFigureImage(true);
	// figureImages.remove(image);
	// }
	// }
	// }
	// }
	// return figureImage;
	// }

	/**
	 * @param pStyle
	 * @return
	 */
	protected IStyle getStyle(CTString pStyle) {
		IStyle newStyle = null;
		String styleId = "-";
		if (pStyle != null) {
			styleId = pStyle.getVal();
			newStyle = ((JOStyleTemplate) getDocument().getStyleTemplate()).getParagraphStyleById(styleId);
			if (newStyle != null) {

				return newStyle;
			}
		}
		// if (style == null) {
		// return JO.getGlobalStyleTemplate().getDefaultStyle();
		// }
		// return style;

		// LOGGER.error("Style " + styleId + " not found");
		return null;
	}

	/**
	 * 
	 */
	public void createFigureImage() {
	}

	@Override
	public XmlObject getXmlObject() {
		return xmlObject;
	}

	// public void setDirtyFigureImage(boolean dirtyFigureImage) {
	// if (dirtyFigureImage) {
	// if (figureImage != null && !figureImage.isDisposed()) {
	// JOUtil.disposeResource(figureImage);
	// figureImage = null;
	// }
	// }
	// this.dirtyFigureImage = dirtyFigureImage;
	// }
	//
	// public void setFigureImage(Image figureImage) {
	// this.figureImage = figureImage;
	// }

	public void setXmlObject(XmlObject xmlObject) {
		this.xmlObject = xmlObject;
	}

	public boolean isColumnBreak() {
		return columnBreak;
	}

	public void setColumnBreak(boolean columnBreak) {
		this.columnBreak = columnBreak;
	}

	public boolean isAllowOverlap() {
		return allowOverlap;
	}

	public void setAllowOverlap(boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
	}

	@Override
	public boolean isBehindDoc() {
		return behindDoc;
	}

	public void setBehindDoc(boolean behindDoc) {
		this.behindDoc = behindDoc;
	}

	@Override
	public boolean isDirtyLayout() {
		return dirtyLayout;
	}

	@Override
	public void setDirtyLayout(boolean dirtyLayout) {
		if (!isRootObject()) {
			return;
		}
		this.dirtyLayout = dirtyLayout;
	}

	@Override
	public IPage getPage() {
		if (page == null && parent != null) {
			page = parent.getPage();
		}
		return page;
	}

	@Override
	public void setPage(IPage page) {
		this.page = page;
	}

	@Override
	public boolean isRootObject() {
		return isRootObject;
	}

	@Override
	public double getXPixel() {
		return x.get().toPixel();
	}

	@Override
	public double getYPixel() {
		return y.get().toPixel();
	}

	@Override
	public void setRootObject(boolean isRootObject) {
		this.isRootObject = isRootObject;
	}

	public IColor getSolidFillColor() {
		return solidFillColor;
	}

	public void setSolidFillColor(IColor solidFillColor) {
		this.solidFillColor = solidFillColor;
	}

	public String gethRef() {
		return hRef;
	}

	public void sethRef(String hRef) {
		this.hRef = hRef;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public float getCropBottom() {
		return cropBottom;
	}

	public void setCropBottom(float cropBottom) {
		this.cropBottom = cropBottom;
	}

	public float getCropTop() {
		return cropTop;
	}

	public void setCropTop(float cropTop) {
		this.cropTop = cropTop;
	}

	public float getCropLeft() {
		return cropLeft;
	}

	public void setCropLeft(float cropLeft) {
		this.cropLeft = cropLeft;
	}

	public float getCropRight() {
		return cropRight;
	}

	public void setCropRight(float cropRight) {
		this.cropRight = cropRight;
	}

	public float getArcsize() {
		return arcsize;
	}

	public void setArcsize(float arcsize) {
		this.arcsize = arcsize;
	}

	@Override
	public double getLeftMargin() {
		if (leftMargin == null) {
			return 0;
		}
		return leftMargin.get().toPixel();
	}

	public void setLeftMargin(JOEmuProperty leftMargin) {
		this.leftMargin = leftMargin;
	}

	/**
	 * @return
	 */
	@Override
	public double getTopMargin() {
		if (topMargin == null) {
			return 0;
		}
		return topMargin.get().toPixel();
	}

	/**
	 * @param topMargin
	 */
	public void setTopMargin(JOEmuProperty topMargin) {
		this.topMargin = topMargin;
	}

	/**
	 * @return
	 */
	@Override
	public double getRightMargin() {
		if (rightMargin == null) {
			return 0;
		}
		return rightMargin.get().toPixel();
	}

	/**
	 * @param rightMargin
	 */
	public void setRightMargin(JOEmuProperty rightMargin) {
		this.rightMargin = rightMargin;
	}

	/**
	 * @return
	 */
	@Override
	public double getBottomMargin() {
		if (bottomMargin == null) {
			return 0;
		}
		return bottomMargin.get().toPixel();
	}

	public JOEmu getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(JOEmu lineWidth) {
		this.lineWidth = lineWidth;
	}

	public IColor getLineColor() {
		return lineColor;
	}

	public void setLineColor(IColor lineColor) {
		this.lineColor = lineColor;
	}

	public XmlObject getXmlParent() {
		return xmlParent;
	}

	public boolean isDirty() {
		return isDirtyContent() || isDirtyLayout();
	}

	@Override
	public String toString() {
		return "z: " + getZIndex() + "/" + getZOrder() + "   x: " //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (x != null ? x.get().toPixel() : "") + " y: " + (y != null ? y.get().toPixel() : "") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ "   page = " + page; //$NON-NLS-1$
	}

	public boolean isChildObject() {
		return childObject;
	}

	public void setSection(JOSection section) {
		this.section = section;
	}

	@Override
	public double getSavedZOrder() {
		return savedZOrder;
	}

	@Override
	public void setXmlIndex(int xmlIndex) {
		this.xmlIndex = xmlIndex;
	}

	/**
	 * @return
	 */
	public boolean isPageBreakBefore() {
		if (pageBreakBefore != null) {
			return pageBreakBefore.get();
		}
		return false;
	}

	/**
	 * @return
	 */
	@Override
	public boolean isPageBreakAfter() {
		return pageBreakAfter;
	}

	@Override
	public boolean isRealPageBreakAfterAndNoSectionBreak() {
		return pageBreakAfter;
	}

	public void setPageBreakAfter(boolean pageBreakAfter) {
		this.pageBreakAfter = pageBreakAfter;
	}

	public boolean isPageBreakAfterToNextColumn() {
		return false;
	}

	@Override
	public IStyle getStyle() {
		return style;
	}

	public void setStyle(IStyle style) {
		this.style = style;
	}

	/**
	 * @return
	 */
	@Override
	public IJOProperty getIndent() {
		if (valueIndent == null) {
			if (style != null) {
				return style.getIndent();
			}
		}
		return valueIndent;
	}

	/**
	 * @return
	 */
	public double getFirstLineIndentPixel() {
		if (getIndent() != null) {
			if (((JOIndent) getIndent().get()).firstLine != null) {
				return ((JOIndent) getIndent().get()).firstLine.toPixel();
			}
		}
		return 0;
	}

	/**
	 * @return
	 */
	public double getHangingIndentPixel() {
		if (getIndent() != null) {
			if (((JOIndent) getIndent().get()).hanging != null) {
				return ((JOIndent) getIndent().get()).hanging.toPixel();
			}
		}
		return 0;
	}

	/**
	 * @return
	 */
	public double getLeftIndentPixel() {
		if (getIndent() != null) {
			if (((JOIndent) getIndent().get()).left != null) {
				return ((JOIndent) getIndent().get()).left.toPixel();
			}
		}
		return 0;
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get")) //$NON-NLS-1$
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set")) //$NON-NLS-1$
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

	/**
	 * @param name
	 * @return
	 */
	public Method getGetter(String name) {
		if (dataBindingGetter == null) {
			return null;
		}
		for (Method m : dataBindingGetter) {
			String methodName = m.getName();
			if (methodName.equalsIgnoreCase("get" + name)) { //$NON-NLS-1$
				return m;
			}
		}
		return null;
	}

	/**
	 * @param name
	 * @return
	 */
	public Method getSetter(String name) {
		if (dataBindingSetter == null) {
			return null;
		}
		for (Method m : dataBindingSetter) {
			String methodName = m.getName();
			if (methodName.equalsIgnoreCase("set" + name)) { //$NON-NLS-1$
				return m;
			}
		}
		return null;
	}

	public JOProperty<?> createValue(String key) {
		if (key.equals("indent")) { //$NON-NLS-1$

		}
		return null;
	}

	public void add(JOObject joObject) {
		if (children == null) {
			children = new ArrayList<ILayoutObject>();
		}
		children.add(joObject);
		joObject.setParent(this);
	}

	@Override
	public void remove(ILayoutObject joObject) {
		if (children != null) {
			children.remove(joObject);
		}
		joObject.setParent(null);
	}

	public ILayoutObject getChild(int index) {
		return children.get(index);
	}

	@Override
	public JOObject[] getChildren() {
		if (children == null) {
			return new JOObject[0];
		}
		return children.toArray(new JOObject[children.size()]);
	}

	@Override
	public List<ILayoutObject> getChildList() {
		if (children == null) {
			children = new ArrayList<ILayoutObject>();
		}
		return children;
	}

	@Override
	public Iterator<ILayoutObject> iterator() {
		try {
			if (children == null) {
				children = new ArrayList<ILayoutObject>();
			}
			return children.iterator();
		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public ILayoutObject getParent() {
		return parent;
	}

	@Override
	public void setParent(ILayoutObject parent) {
		this.parent = parent;
	}

	public JOEmu20ThPointProperty getSpacingBefore() {
		return spacingBefore;
	}

	public void setSpacingBefore(JOEmu20ThPointProperty spacingBefore) {
		this.spacingBefore = spacingBefore;
	}

	public JOEmu20ThPointProperty getSpacingAfter() {
		return spacingAfter;
	}

	public void setSpacingAfter(JOEmu20ThPointProperty spacingAfter) {
		this.spacingAfter = spacingAfter;
	}

	/**
	 * use getter because of overwritten methods in JOParagraph
	 * 
	 * @return
	 */
	@Override
	public double getSpacingBeforePixel() {
		if (getSpacingBefore() != null) {
			return getSpacingBefore().get().toPixel();
		}
		return 0;
	}

	@Override
	public double getSpacingAfterPixel() {
		if (getSpacingAfter() != null) {
			return getSpacingAfter().get().toPixel();
		}
		return 0;
	}

	public void setSize(JOPropertySize size) {
		this.size = size;
		size.get();
		width.get().setPixel(size.getWidthPixel());
		height.get().setPixel(size.getHeightPixel());
	}

	public void setSize(double width, double height) {
		setWidthPixel(width);
		setHeightPixel(height);
		if (size != null) {
			size.setWidthPixel2(width);
			size.setHeightPixel2(height);
		}
	}

	@Override
	public void setWidthPixel(double width) {
		this.width.get().setPixel(width);
		if (size != null) {
			size.setWidthPixel2(width);
		}
	}

	@Override
	public void setHeightPixel(double height) {
		this.height.get().setPixel(height);
		if (size != null) {
			size.setWidthPixel2(height);
		}
	}

	/**
	 * @param delta
	 */
	public void increaseWidth(int delta) {
		this.width.get().increasePixel(delta);
		if (size != null) {
			size.increaseWidthPixel2(delta);
		}
	}

	/**
	 * @param delta
	 */
	public void decreaseWidth(int delta) {
		this.width.get().decreasePixel(delta);
		if (size != null) {
			size.decreaseWidthPixel2(delta);
		}
	}

	/**
	 * @param delta
	 */
	public void increaseHeight(int delta) {
		this.height.get().increasePixel(delta);
		if (size != null) {
			size.increaseHeightPixel2(delta);
		}
	}

	/**
	 * @param delta
	 */
	public void decreaseHeight(int delta) {
		this.height.get().decreasePixel(delta);
		if (size != null) {
			size.decreaseHeightPixel2(delta);
		}
	}

	/**
	 * @return
	 */
	@Override
	public ILayoutObject getRootObject() {
		if (rootObject == null) {
			if (isRootObject()) {
				rootObject = this;
			} else {
				ILayoutObject parent = getParent();
				while (parent != null && !parent.isRootObject()) {
					rootObject = parent;
					parent = parent.getParent();
				}
				if (parent != null) {
					rootObject = parent;
				}
			}
		}
		return rootObject;
	}

	/**
	 * @return
	 */
	@Override
	public double getHeightOverflow() {
		return heightOverflow;
	}

	/**
	 * @param heightOverflow
	 */
	@Override
	public void setHeightOverflow(double heightOverflow) {
		this.heightOverflow = heightOverflow;
	}

	public boolean isWord() {
		return getEditorFigure().getDocument().getDocumentType().equals(EnDocumentType.OOXML_WORDPROCESSING);
	}

	/**
	 * 
	 */

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public JOEmuProperty getXOff() {
		return xOff;
	}

	public JOEmuProperty getYOff() {
		return yOff;
	}

	public JOColorProperty getLineColorProperty() {
		return lineColorProperty;
	}

	/**
	 * @return
	 */
	public JOEmuProperty getLineWidthProperty() {
		return lineWidthProperty;
	}

	/**
	 * @param width
	 */
	/**
	 * @param newWidth
	 */
	public void setWidth(JOEmuProperty newWidth) {
		this.width = newWidth;
	}

	/**
	 * @param newHeight
	 */
	public void setHeight(JOEmuProperty newHeight) {
		this.height = newHeight;
	}

	/**
	 * @param newWidth
	 */
	public void changeWidth(double newWidth) {
		if (width != null) {
			width.set(newWidth);
		}
		if (size != null) {
			size.setWidthPixel2(newWidth);
		}
	}

	/**
	 * @param newHeight
	 */
	public void changeHeight(double newHeight) {
		if (height != null) {
			height.set(newHeight);
		}
		if (size != null) {
			size.setHeightPixel2(newHeight);
		}
	}

	/**
	 * @param newWidth
	 * @param newHeight
	 */
	public void changeSize(int newWidth, int newHeight) {
		changeWidth(newWidth);
		changeHeight(newHeight);
	}

	public boolean hasX() {
		return x != null;
	}

	public boolean hasY() {
		return y != null;
	}

	public XmlObject getTemplate() {
		return template;
	}

	public void setTemplate(XmlObject template) {
		this.template = template;
	}

	public boolean isAsCharacter() {
		return asCharacter;
	}

	public void setAsCharacter(boolean asCharacter) {
		this.asCharacter = asCharacter;
	}

	/**
	 * @return
	 */
	@Override
	public JOEmuInsetProperty getInsets() {
		return insets;
	}

	/**
	 * @return
	 */
	public JOColorProperty getFillColorProperty() {
		return fillColorProperty;
	}

	/**
	 * 
	 */
	public void bindProperties() {

		// if (getDocument() != null) {
		// for (JOProperty2 prop : ((JOAbstractDocument) getDocument())
		// .getDataBindingProperties()) {
		// if (prop.getJoObject() == this) {
		// String[] keys = prop.getDataBindingKeys();
		// for (String key : keys) {
		// try {
		// List<IToolComponent> tools = JOUtil2
		// .findToolComponents(key);
		// for (IToolComponent joToolComponent : tools) {
		// joToolComponent.update(prop);
		// }
		// } catch (Exception ex) {
		// LOGGER.error("key=", key); //$NON-NLS-1$
		// }
		// }
		// }
		// }
		// }
	}

	@Override
	public JOEmuProperty getWidth() {
		return width;
	}

	@Override
	public JOEmuProperty getHeight() {
		return height;
	}

	@Override
	public JOPropertySize getSize() {
		return size;
	}

	@Override
	public IImage getImage() {
		return null;
	}

	@Override
	public void setBorderColor(IColor color) {
		// TODO Auto-generated method stub

	}

	@Override
	public Rectangle2D getLayoutBounds() {
		layoutBounds = new Rectangle2D(getXPixel(), getYPixel(), getWidthPixel(), getHeightPixel());
		return layoutBounds;
	}

	@Override
	public void setLayoutBounds(Rectangle2D layoutBounds) {
		this.layoutBounds = layoutBounds;
	}

	@Override
	public void update() {

	}

	@Override
	public void removeChildren() {

	}

	@Override
	public boolean commit() {
		return false;
	}

	private boolean wait;

	@Override
	public int hashCode() {
		return uuId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (hashCode() == obj.hashCode())
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

	@Override
	public void boundsChanged2(Rectangle2D newBounds) {
	}

	@Override
	public void deActivate() {
		if (layoutFigure != null) {
			layoutFigure.deActivate();
		}
	}

	public JOEmuProperty getMarginTop() {
		return marginTop;
	}

	public void setMarginTop(JOEmuProperty marginTop) {
		this.marginTop = marginTop;
	}

	public JOEmuProperty getMarginLeft() {
		return marginLeft;
	}

	public void setMarginLeft(JOEmuProperty marginLeft) {
		this.marginLeft = marginLeft;
	}

	public JOEmuProperty getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(JOEmuProperty marginRight) {
		this.marginRight = marginRight;
	}

	public JOEmuProperty getMarginBottom() {
		return marginBottom;
	}

	public void setMarginBottom(JOEmuProperty marginBottom) {
		this.marginBottom = marginBottom;
	}

	public boolean isDisposed() {
		return disposed;
	}

	public void setDisposed(boolean disposed) {
		this.disposed = disposed;
	}

}
