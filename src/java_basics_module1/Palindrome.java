package java_basics_module1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = input.next();
		String org_str = str;
		String rev = "";
		int len = str.length();
		System.out.println("Length of the String: "+len);
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	
	if(org_str.equals(rev))
	{
		System.out.println(org_str +" is a Palindrome String");
		
	}
	else
	{
		
		System.out.println(org_str +" is not a Palindrome String");
	}
	}

}
