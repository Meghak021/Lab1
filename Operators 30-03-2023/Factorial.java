import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){  
        int i,a=1;
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int b=sc.nextInt();  
            
        for(i=1;i<=b;i++){    
            a=a*i;    
        }    
        System.out.println(" The Factorial of "+b+" is: "+a);    
    }  
}
