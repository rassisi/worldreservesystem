package com.joffice.rcpl.plugin.office.databinding.types;

import java.util.ArrayList;
import java.util.List;

public class JOTabArray {

	private List<JOTab> tabs;

	public JOTabArray() {
	}

	public void addTab(JOTab tab) {
		if (tabs == null) {
			tabs = new ArrayList<JOTab>();
		}
		tabs.add(tab);
	}

	public int getTabCount() {
		if (tabs == null) {
			return 0;
		}
		return tabs.size();
	}

	/**
	 * @param index
	 * @return
	 */
	public JOTab getTab(int index) {
		if (tabs != null && index < tabs.size()) {
			return tabs.get(index);
		}
		return null;
	}
	
	/**
	 * @param tab
	 * @return
	 */
	public int getIndex(JOTab tab){
		return tabs.indexOf(tab);
	}
}
