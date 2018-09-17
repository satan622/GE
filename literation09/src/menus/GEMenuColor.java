package menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.GEConstants.EColorMenuItems;

public class GEMenuColor extends JMenu {
	
	public GEMenuColor(String s) {
		super(s);
		for(EColorMenuItems btn : EColorMenuItems.values()) {
			JMenuItem menuItem = new JMenuItem(btn.toString());
			this.add(menuItem);
		}
	}
}
