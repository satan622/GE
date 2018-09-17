package constants;

import java.awt.Color;

public class GEConstants {
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "GraphicEditor-11";
	
	public static final String TITLE_FILEMENU = "����";
	public static final String TITLE_EDITMENU = "����";
	public static final String TITLE_COLORMENU = "�÷�";
	
	public static enum EFileMenuItems{���θ����, ����, ����, �ٸ��̸���������, ����}
	public static enum EEditMenuItems{Undo, Redo, ����, �߶󳻱�, ����, ���̱�, Group, Ungroup}
	public static enum EColorMenuItems{SetLineColor, ClearLineColor, SetFillColor, ClearFillColor}
	
	public static final String TITLE_TOOLBAR = "Shape Tools";
	public static enum EToolBarButtons {Select, Rectangle, Line, Ellipse, Polygon}
	public static final String IMG_URL = "images/";
	public static final String TOOLBAR_BTN = ".gif";
	public static final String TOOLBAR_BTN_SELECT = "SLT.gif";
	
	public static final  Color FOREGROUND_COLOR = Color.BLACK;
	public static final  Color BACKGROUND_COLOR = Color.WHITE;
	public static enum	 EState {Idle, TwoPointsDrawing, NPointsDrawing, Moving}
	public static final Color DEFAULT_LINE_COLOR = Color.BLACK;
	public static final Color DEFAULT_FILL_COLOR = Color.WHITE;
	
	public static final int ANCHOR_W = 6;
	public static final int ANCHOR_H = 6;
	public static final int RR_OFFSET = 30;
	public static final Color ANCHOR_LINE_COLOR = Color.BLACK;
	public static final Color ANCHOR_FILL_COLOR = Color.WHITE;
	public static enum EAnchorTypes{NW, NN, NE, WW, EE, SW, SS, SE, RR, NONE}
	
	public static final String TITLE_FILLCOLOR = "Select Fill Color";
	public static final String TITLE_LINECOLOR = "Select LINE Color";
	
	public static final int DEFAULT_DASH_OFFSET = 4;
	public static final int DEFAULT_DASHEDLINE_WIDTH = 1;
}
