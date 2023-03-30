package basic;

import java.util.Scanner;
class Module{
	public int Add(int a,int b) {
		return a+b;
		}
	public int Sub(int a, int b) {
		return a-b;
	}
	public int Mul(int a, int b) {
		return a*b;
	}
	public int Div(int a, int b) {
		return a/b;
	}
}

public class Operator {

	public static void main(String[] args) {
		Module ca=new Module();
		do {
		System.out.println("Enter the Numbers");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Enter your Choice\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Sum is:"+ca.Add(x, y));
			break;
		case 2:
			System.out.println("Difference is"+ca.Sub(x, y));
			break;
		case 3:
			System.out.println("Difference is"+ca.Mul(x, y));
			break;
		case 4:
			System.out.println("Difference is"+ca.Div(x, y));
			break;
		default:
			System.out.println("Invalid input");
		}
		}while(true);
	}

}
