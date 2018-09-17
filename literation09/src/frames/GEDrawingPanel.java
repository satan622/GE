package frames;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import constants.GEConstants;
import constants.GEConstants.EState;
import shapes.GEPolygon;
import shapes.GEShape;
import transformer.GEDrawer;
import transformer.GETransformer;

public class GEDrawingPanel extends JPanel {
	private GEShape currentShape;
	private GEShape selectedShape;
	private ArrayList<GEShape> shapeList;
	private EState currentState;
	private GETransformer transformer;
	private MouseDrawingHandler drawingHandler;
	
	public GEDrawingPanel(){
		super();
		shapeList = new ArrayList<GEShape>();
		currentState = EState.Idle;
		drawingHandler = new MouseDrawingHandler();
		this.addMouseListener(drawingHandler);
		this.addMouseMotionListener(drawingHandler);
		this.setBackground(GEConstants.BACKGROUND_COLOR);
		this.setForeground(GEConstants.FOREGROUND_COLOR);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		for(GEShape shape : shapeList){
			shape.draw(g2D);
		}
	}
	
	public void setCurrentshape(GEShape currentShape){
		this.currentShape = currentShape;
	}
	
	private void initDraw(Point startP){
		currentShape = currentShape.clone();
		transformer = new GEDrawer(currentShape);
		transformer.init(startP);
	}
	
	private void continueDrawing(Point currentP){
		((GEPolygon)currentShape).continueDrawing(currentP);
	}
	
	private void finishDraw(){
		shapeList.add(currentShape);
	}
	
	private GEShape onShape(Point p){
		for(int i = shapeList.size() - 1; i >= 0; i--){
			GEShape shape = shapeList.get(i);
			if(shape.onShape(p)){
				return shape;
			}
		}
		return null;
	}
	
	private void clearSelectedShapes(){
		for(GEShape shape : shapeList){
			shape.setSelected(false);
		}
	}
	/*
	private void animateDraw(Point currentP){
		Graphics2D g2D = (Graphics2D)getGraphics();
		g2D.setXORMode(g2D.getBackground());
		currentShape.draw(g2D);
		currentShape.setCoordinate(currentP);
		currentShape.draw(g2D);
	}
	*/
	
	
	private class MouseDrawingHandler extends MouseInputAdapter{
		public void mouseDragged(MouseEvent e){
			if(currentState == EState.TwoPointsDrawing){
				transformer.transformer((Graphics2D)getGraphics(), e.getPoint());
			}
		}
		
		public void mousePressed(MouseEvent e){
			if(currentState == EState.Idle){
				if(currentShape != null){
					clearSelectedShapes();
					selectedShape = null;
					initDraw(e.getPoint());
				}if(currentShape instanceof GEPolygon){
					currentState = EState.NPointsDrawing;
				}else{
					currentState = EState.TwoPointsDrawing;
				}
			}else{
				selectedShape = onShape(e.getPoint());
				clearSelectedShapes();
				if(selectedShape != null){
					selectedShape.setSelected(true);
				}
			}
		}
		
		public void mouseReleased(MouseEvent e){
			if(currentState == EState.TwoPointsDrawing){
				finishDraw();
				currentState = EState.Idle;
			}else if(currentState == EState.NPointsDrawing){
				return;
			}
			repaint();
		}
		
		public void mouseClicked(MouseEvent e){
			if(e.getButton() == MouseEvent.BUTTON1){
				if(currentState == EState.NPointsDrawing){
					if(e.getClickCount() == 1){
						continueDrawing(e.getPoint());
					}else if(e.getClickCount() == 2){
						finishDraw();
						currentState = EState.Idle;
						repaint();
					}
				}
			}
		}
		
		public void mouseMoved(MouseEvent e){
			if(currentState == EState.NPointsDrawing){
				transformer.transformer((Graphics2D)getGraphics(), e.getPoint());
			}
		}
	}

}
