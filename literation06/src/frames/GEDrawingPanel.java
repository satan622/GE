package frames;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import constants.GEConstants;
import shapes.GEShape;

public class GEDrawingPanel extends JPanel {
	private GEShape currentShape;
	private MouseDrawingHandler drawingHandler;
	
	public GEDrawingPanel(){
		super();
		drawingHandler = new MouseDrawingHandler();
		this.addMouseListener(drawingHandler);
		this.addMouseMotionListener(drawingHandler);
		this.setBackground(GEConstants.BACKGROUND_COLOR);
		this.setForeground(GEConstants.FOREGROUND_COLOR);
	}
	
	public void setCurrentshape(GEShape currentShape){
		this.currentShape = currentShape;
	}
	
	public void initDraw(Point startP){
		currentShape.initDraw(startP);
	}
	
	public void animateDraw(Point currentP){
		Graphics2D g2D = (Graphics2D)getGraphics();
		g2D.setXORMode(g2D.getBackground());
		currentShape.draw(g2D);
		currentShape.setCoordinate(currentP);
		currentShape.draw(g2D);
	}
	
	private class MouseDrawingHandler extends MouseInputAdapter{
		public void mouseDragged(MouseEvent e){
			animateDraw(e.getPoint());
		}
		
		public void mousePressed(MouseEvent e){
			initDraw(e.getPoint());
		}
	}

}
