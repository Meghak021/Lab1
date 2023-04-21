package String;

public class String1 {
	public static void main(java.lang.String[] args) {
		
		String str = "Welcome to Java World";
		System.out.println("String : " + str);
		
		System.out.println();
		
		//return character at 5th position
		char c = str.charAt(4);
		System.out.println("Character at fifth position : " + c );
		
		System.out.println();
		
		//compare str with "Welcome" lexicographically
		
		int n = str.compareToIgnoreCase("Welcome");
		System.out.println("Lexicographically Compared Strings are : " + n);
		
		System.out.println();
		
		//concatenate "let us learn"
		String concat = str.concat(" Let us Learn");
		System.out.println(concat);
		
		System.out.println();
		
		//return position of first occurrence of character 'a'
		int a = str.indexOf('a');
	  System.out.println("Position of first occurence of character 'a' is : " + a);
	    
	    System.out.println();
		
		//Replace all occurrences of 'a' character with new 'e' 
	    String nstr = str.replaceAll("a", "e");
	    System.out.println("Replaced string :" + nstr );
	    
	    System.out.println();
	    
	    //return string between 4th and 10th position 
	    
	    String substr = str.substring(3, 11);
	    System.out.println("String between 4th and 10th position is : " + substr);
	    
	    System.out.println();
	    
	    //lowercase of string
	    String l = str.toLowerCase();
	    System.out.println("String in lowercase : " + l);
	    
	    System.out.println();
		

	}

}
