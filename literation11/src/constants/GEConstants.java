package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame 상수
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "GE-11";
	
	//GEMenu 상수
	public static final String TITLE_FILEMENU = "파일";
	public static final String TITLE_EDITMENU = "편집";
	public static final String TITLE_COLORMENU = "컬러";
	
	//GEMenuItems 상수
	public static enum EFileMenuItems { 새로만들기, 열기, 저장, 다른이름으로저장, 종료 }
	public static enum EEditMenuItems { 실행취소, 되돌리기, 삭제, 잘라내기, 복사, 붙이기, Group, Ungroup }
	public static enum EColorMenuItems { SetLineColor, ClearLineColor, SetFillColor, ClearFillColor }
	
	//GEToolBar 상수
	public static final String TITLE_TOOLBAR = "Shape Tools";
	public static enum EToolBarButtons {Select, Rectangle, Line, Ellipse, Polygon}
	public static final String IMG_URL = "images/";
	public static final String TOOLBAR_BTN = ".gif";
	public static final String TOOLBAR_BTN_SELECT = "SLT.gif";
	
	//GEDrawingPanel 상수
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	public static enum EState {Idle, TwoPointsDrawing, NPointsDrawing, Moving}
	public static final Color DEFAULT_LINE_COLOR = Color.BLACK;
	public static final Color DEFAULT_FILL_COLOR = Color.WHITE;
	
	//GEAnchorList 상수
	public static final int ANCHOR_W = 6;
	public static final int ANCHOR_H = 6;
	public static final int RR_OFFSET = 30;
	public static final Color ANCHOR_LINE_COLOR = Color.BLACK;
	public static final Color ANCHOR_FILL_COLOR = Color.WHITE;
	public static enum EAnchorTypes {NW, NN, NE, WW, EE, SW, SS, SE, RR, NONE}
	
	//GEMenuColor 상수
	public static final String TITLE_FILLCOLOR = "Select Fill Color";
	public static final String TITLE_LINECOLOR = "Select Line Color";
	
	//GETransformer 상수
	public static final int DEFAULT_DASH_OFFSET = 4;
	public static final int DEFAULT_DASHEDLINE_WIDTH = 1;

}
