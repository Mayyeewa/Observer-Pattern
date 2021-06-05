package lesson1;

import standford.karel;


public class FRobot extends GraphicsProgram {
	public static void main(String[] args) {
	
	public class karel {

	}

	public void run () {
		moveUpRow();
		for (int i =0; i<4; i++) {
			handleBorder();
			nextPosition();
					
		}
	}

		private void handleBorder() {
			move();
			while (frontIsClear()) {
				if (noBeepersPresent()) {
					putBeeper();
					
				}
				move();
			}
		}
		private void putBeeper() {
			// TODO Auto-generated method stub
			
		}

		private boolean noBeepersPresent() {
			// TODO Auto-generated method stub
			return false;
		}

		private boolean frontIsClear() {
			// TODO Auto-generated method stub
			return false;
		}

		private void move() {
			// TODO Auto-generated method stub
			
		}

		private void moveUpRow() {
			turnLeft();
			move();
			turnLeft();
		}
		private void turnLeft() {
			// TODO Auto-generated method stub
			
		}

		private void nextPosition() {
			turnLeft();
			move();
			turnLeft();
			move();
			turnLeft();
		}
}


	
