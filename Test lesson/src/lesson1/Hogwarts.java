/**
 * 
 */
/**
 * @author penprapacalhoun
 *
 */
package lesson1;
import acm.program.*;

public class Hogwarts extends ConsoleProgram {
	
	public void run() {
		bludger(2001);
	}
	
	private void bludger(int y) { //y=2001
		int x = y / 1000; //x=2
		int z = (x + y); //z=2003
		x = quaffle(z, y); //
		println("bludger: x = " + x + ", y = " + y + ", z = " + z);
	}
	
	private int quaffle(int x, int y) { // x=2003, y=1
		int z = snich(x + y, y); // z=1001
		y /= z; // y=1
		println("quaffle: x = " + x + ", y = " + y + ", z = " + z); 
		return z;
	}
	
	private int snich(int x, int y) { //x=4004, y=2001
		y = x / (x % 10);// y=1001
		println("snitch: x = " + x + ", y = " + y);
		return y;			
	}
	
}

