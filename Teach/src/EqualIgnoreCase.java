
public class EqualIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  public static void main(String[] args) {
	    
	    String name1 = "Juniper Calhoun";
	    String name2 = "juniper calhoun";
	    String name3 = "Nefraska Calhoun";
	    
	    boolean equals1 = name1.equalsIgnoreCase(name2);
	    boolean equals2 = name1.equalsIgnoreCase(name3);
	    
	    System.out.println();
	   System.out.println("\"" + name1 + "\" equals \"" + name2 + "\"? "+ equals1);
	   System.out.println("\"" + name1 + "\" equals \"" + name3 + "\"? "+ equals2);
	

	}

}
