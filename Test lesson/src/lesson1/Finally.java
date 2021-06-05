package lesson1;

public class Finally {

	public static void main(String[] args) {
		
		 try {
				int a = 5/0;

			 
		 }catch(Exception e){
			 
		 
			 System.out.println(e);
			 
		 }finally {
			 
			 System.out.println("Finally--I+Made+it__");
			 
		 }
		 
	}

}
