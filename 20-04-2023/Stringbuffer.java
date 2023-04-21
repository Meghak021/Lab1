package String;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("This is a String Buffer");
		
		//add the string 
		buffer1.append(" This is a sample program");
		System.out.println(buffer1);
		
		System.out.println();
		
		//Insert string "Object" at 21st position
		buffer1.insert(21, "Object");
		System.out.println("After Insertion : " + buffer1);
		
		System.out.println();
		
		//reverse the string 
		buffer1.reverse();
		System.out.println("After reverse : "+buffer1);
		
		System.out.println();
		
		//replace the word "Buffer" with "Builder"
		StringBuffer strbf = new StringBuffer("This is String Buffer ");
		strbf.replace(15, 22, "Builder");
		System.out.println("After replace : " + strbf);
		

	}

}
