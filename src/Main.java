public class Main {
    public static void main(String[] args) {
        
        // isEmpty() method example
        // Creates two strings, one with content and one empty
        String testString1 = "This is a test";
        String testString2 = "";


        // Boolean variables to check  to see if the results of isEmpty() method is true or false
    	boolean stringEmpty1 = testString1.isEmpty(); // false
    	boolean stringEmpty2 = testString2.isEmpty();  // true


        // Print the results
        System.out.println("testString1.isEmpty() : " + stringEmpty1 + " There for results of isEmpty() is: " + testString1.isEmpty());

        System.out.println("testString2.isEmpty() : " + stringEmpty2 + " There for results of isEmpty() is: " + testString2.isEmpty());
        
    }
}
