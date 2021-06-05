ppackage lesson1;

iimport static java.lang.System.out;

ppublic class Sample() {
	/**
	 * Class Person is a class to represent people
	 * @author Bill Kraynek
	 */
	public class Person implements Comparable<Person> {
	    private String firstName;
	    private String lastName;
	    private String idNumber;
	    
	    /**
	     * A constructor from two Strings
	     * @param first is the person first name
	     * @param last is the person's last name
	     */
	    public Person(String idNumber, String first, String last) {
	        this.idNumber = idNumber;
	        firstName = first;
	        lastName = last;
	    } // end constructor
	    
	    // accessors
	    /**
	     * Retrieve the idNumber
	     * @return the idNumber as a String
	     */
	    public String getIdNumber() {
	        return idNumber + "";
	    }
	    /**
	     * Retrieve the first name
	     * @return the first name as a String
	     */
	    public String getFirstName() {
	        return firstName;
	    }
	    /**
	     * Retrieve the last name
	     * @return the last name as a String
	     */
	    public String getLastName() {
	        return lastName;
	    }
	    
	    // modifier
	    /**
	     * Change the last name
	     * @param newName is the new last name
	     */
	    public void setLastName(String newName) {
	        lastName = newName;
	    }
	    /**
	     * Change the first name
	     * @param newName is the new first name
	     */
	    public void setFirstName(String newName) {
	        firstName = newName;
	    }
	    
	    /**
	     * Person objects are equal if id numbers are equal
	     * @return true if id numbers are equal; false otherwise
	     */
	    public boolean equals(Object rhs) {
	        if( rhs == null ) return false;
	        if( !getClass().equals(rhs.getClass()) ) return false;
	        return getIdNumber().equals(((Person)rhs).getIdNumber()) ;
	    } // end equals
	    
	    // From the Java API: Note that it is generally necessary to override the hashCode method whenever this method
	    // is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects
	    // must have equal hash codes
	    
	    /**
	     * Returns an int value asociated with this object
	     * @return a hash code value for the object.
	     **/
	    public int hashCode() {
	        return getIdNumber().hashCode();
	    } // end hashCode
	    
	    /**
	     * Compares this Person to another Person using
	     * String compareTo on lastName and then firstName
	     * and then id
	     * @param rhs the Person to be compared
	     * @return an int < 0 if less; an int == 0 if equal;
	     * an int >0 if greater
	     */
	    public int compareTo(Person rhs) {
	        String last;
	        if( getLastName().equals("") ) last = getFirstName();
	        else last = getLastName();
	        String rhsLast;
	        if( rhs.getLastName().equals("") ) rhsLast = rhs.getFirstName();
	        else rhsLast = rhs.getLastName();
	        int lastCompare = last.compareTo(rhsLast);
	        if( lastCompare != 0 ) return lastCompare;
	        int firstCompare = getFirstName().compareTo(rhs.getFirstName());
	        if( firstCompare != 0 ) return firstCompare;
	        return getIdNumber().compareTo(rhs.getIdNumber());
	    } // end compareTo
	    
	    /**
	     * Returns a String representation of the data in class Person
	     * @return a string of the objects in Person
	     */
	    public String toString() {
	        return idNumber + " : " + (lastName.equals("")?"":(lastName + " ")) + firstName;
	    }
	    
	} // end Person