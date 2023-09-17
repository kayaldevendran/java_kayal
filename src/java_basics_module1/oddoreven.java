package java_basics_module1;
import java.util.Scanner;


public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter input a:");
		a = input.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");	
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
