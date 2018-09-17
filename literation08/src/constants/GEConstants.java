package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame 상수
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "GE-08";
	
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
	public static enum EState {Idle, TwoPointsDrawing, NPointsDrawing}

}
