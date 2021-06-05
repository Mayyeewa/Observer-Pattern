package lesson1;

import java.awt.Color;

import acm.graphics.GRect;

public class GraphicsProgram {
	/* Parameter for Drawing*/
	
	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 150;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
	

public void run () {
	drawHead();
	}

private void drawHead() {
	GRect head = new GRect (5,5,100,100);
	head.setFilled(true);
	head.setFillColor(Color.PINK);
	add(head);
	}
	
}


