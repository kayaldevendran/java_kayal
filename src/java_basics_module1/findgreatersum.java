package java_basics_module1;
import java.util.Scanner;

public class findgreatersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,c,d;
		//a=10;b=2;c=5;d=7;
		System.out.println("Enter input a:");
		a = input.nextInt();
		System.out.println("Enter input b:");
		b = input.nextInt();
		System.out.println("Enter input c:");
		c = input.nextInt();
		System.out.println("Enter input d:");
		d = input.nextInt();
		
		if (a+b>c+d)
		{
			
			System.out.println("Sum of a and b is greater than sum of b and d");
			
		}
		else
		{
			System.out.println("Sum of c and d is greater than sum of a and b");	
		}
	}

}
