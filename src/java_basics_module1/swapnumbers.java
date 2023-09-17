package java_basics_module1;
import java.util.Scanner;


public class swapnumbers {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
int a,b,c;
System.out.println("Enter first number a:");
a = input.nextInt();
System.out.println("Enter second number b:");
b = input.nextInt();
	
c=a;
a=b;
b=c;
System.out.println("swapped number a:" +a);
System.out.println("swapped number b:" +b);

}
}