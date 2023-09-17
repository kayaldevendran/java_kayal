package java_basics_module1;
import java.util.Scanner;
public class findprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,n,i;
		n=0;
		System.out.println("Enter input a:");
		a = input.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
				n++;
		}
		if(n==2)
		{
			System.out.println("The entered nunmber is a prime number");
		}
		else {
			
			System.out.println("The entered nunmber is not a prime number");
			
		}
	}

}
