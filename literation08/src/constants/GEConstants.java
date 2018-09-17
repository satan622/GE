package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame ���
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "GE-08";
	
	//GEMenu ���
	public static final String TITLE_FILEMENU = "����";
	public static final String TITLE_EDITMENU = "����";
	public static final String TITLE_COLORMENU = "�÷�";
	
	//GEMenuItems ���
	public static enum EFileMenuItems { ���θ����, ����, ����, �ٸ��̸���������, ���� }
	public static enum EEditMenuItems { �������, �ǵ�����, ����, �߶󳻱�, ����, ���̱�, Group, Ungroup }
	public static enum EColorMenuItems { SetLineColor, ClearLineColor, SetFillColor, ClearFillColor }
	
	//GEToolBar ���
	public static final String TITLE_TOOLBAR = "Shape Tools";
	public static enum EToolBarButtons {Select, Rectangle, Line, Ellipse, Polygon}
	public static final String IMG_URL = "images/";
	public static final String TOOLBAR_BTN = ".gif";
	public static final String TOOLBAR_BTN_SELECT = "SLT.gif";
	
	//GEDrawingPanel ���
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	public static enum EState {Idle, TwoPointsDrawing, NPointsDrawing}

}
