package com.joffice.rcpl.plugin.office.databinding.types;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabTlc;

/**
 * @author ramin
 * 
 */
public class JOTab {

	/**
	 * @author ramin
	 * 
	 */
	public enum JOTabLeader {
		DOT, HEAVY, HYPHEN, MIDDLE_DOT, NONE, UNDERSCORE;
	}

	/**
	 * @author ramin
	 * 
	 */
	public enum JOTabType {
		BAR, CENTER, CLEAR, DECIMAL, LEFT, NUM, RIGHT;
	}

	private JOTabLeader leader;
	private JOTabType type;
	private JOEmu pos;

	/**
	 * @param tabStop
	 */
	public JOTab(CTTabStop tabStop) {
		STTabTlc.Enum l = tabStop.getLeader();
		if (l != null) {
			if (l.equals(STTabTlc.DOT)) {
				leader = JOTabLeader.DOT;
			} else if (l.equals(STTabTlc.HEAVY)) {
				leader = JOTabLeader.HEAVY;
			} else if (l.equals(STTabTlc.HYPHEN)) {
				leader = JOTabLeader.HYPHEN;
			} else if (l.equals(STTabTlc.MIDDLE_DOT)) {
				leader = JOTabLeader.MIDDLE_DOT;
			} else if (l.equals(STTabTlc.NONE)) {
				leader = JOTabLeader.NONE;
			} else if (l.equals(STTabTlc.UNDERSCORE)) {
				leader = JOTabLeader.UNDERSCORE;
			} else {
				leader = JOTabLeader.NONE;
			}
		} else {
			leader = JOTabLeader.NONE;
		}
		if (tabStop.getPos() != null) {
			pos = new JOEmu20ThPoint(tabStop.getPos());
		}
		if (tabStop.getVal() != null) {
			STTabJc.Enum v = tabStop.getVal();
			if (v.equals(STTabJc.BAR)) {
				type = JOTabType.BAR;
			} else if (v.equals(STTabJc.CENTER)) {
				type = JOTabType.CENTER;
			} else if (v.equals(STTabJc.CLEAR)) {
				type = JOTabType.CLEAR;
			} else if (v.equals(STTabJc.DECIMAL)) {
				type = JOTabType.DECIMAL;
			} else if (v.equals(STTabJc.LEFT)) {
				type = JOTabType.LEFT;
			} else if (v.equals(STTabJc.NUM)) {
				type = JOTabType.NUM;
			} else if (v.equals(STTabJc.RIGHT)) {
				type = JOTabType.RIGHT;
			} else {
				type = JOTabType.LEFT;
			}
		} else {
			type = JOTabType.LEFT;
		}
	}

	/**
	 * @param leader
	 * @param type
	 * @param pos
	 */
	public JOTab(JOTabLeader leader, JOTabType type, JOEmu20ThPoint pos) {
		this.leader = leader;
		this.type = type;
		this.pos = pos;
	}

	/**
	 * @return
	 */
	public JOTabLeader getLeader() {
		return leader;
	}

	/**
	 * @return
	 */
	public JOTabType getType() {
		return type;
	}

	/**
	 * @return
	 */
	public double getPos() {
		if (pos != null) {
			return pos.toPixel();
		}
		return 0;
	}

	public void setLeader(JOTabLeader leader) {
		this.leader = leader;
	}

	public void setType(JOTabType type) {
		this.type = type;
	}

	public void setPos(JOEmu pos) {
		this.pos = pos;
	}

	/**
	 * @return
	 */
	public String getLeadingChar() {
		if (leader != null) {
			if (leader.equals(JOTabLeader.DOT)) {
				return "."; //$NON-NLS-1$
			} else if (leader.equals(JOTabLeader.HEAVY)) {
				return ":"; //$NON-NLS-1$
			} else if (leader.equals(JOTabLeader.HYPHEN)) {
				return " . "; //$NON-NLS-1$
			} else if (leader.equals(JOTabLeader.MIDDLE_DOT)) {
				return "."; //$NON-NLS-1$
			} else if (leader.equals(JOTabLeader.NONE)) {
				return " "; //$NON-NLS-1$
			} else if (leader.equals(JOTabLeader.UNDERSCORE)) {
				return "_"; //$NON-NLS-1$
			}
		}
		return " "; //$NON-NLS-1$
	}

	@SuppressWarnings("nls")
	@Override
	public String toString() {
		String leaderString = "leader: ";
		if (leader != null) {
			leaderString += leader.toString() + " ";
		} else {
			leaderString += " undefined; ";
		}
		String typeString = "type : ";

		if (type != null) {
			typeString += type.toString() + " ";
		} else {
			typeString += "undefined; ";
		}

		return leaderString + typeString + " pos = " + getPos() + "; ";
	}
}
