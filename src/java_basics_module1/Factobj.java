package java_basics_module1;

public class Factobj {

	public static void main(String[] args) 
	{
		int employeeAge=100;

		// TODO Auto-generated method stub
		Factobj fact= new Factobj();
		fact.factorialCalculation();
		fact.factorialCalculationWithNos(6);
		//System.out.println("The value of employee age is "+fact.employeeAge);
		
		
		// we can create n no of objects to a class
		Factobj fact1= new Factobj();
		fact1.factorialCalculation();
		fact1.factorialCalculationWithNos(10);
		
		Factobj fact2= new Factobj();
		fact2.factorialCalculation();
		fact2.factorialCalculationWithNos(12);
			
			//Inside class, we will have 2 things one is method and variable
			
			//method is created for storing the logic of the program
			
	}
			public void factorialCalculation()
			{
				int number = 5;
				int factorial = 1;
				for (int i=1; i<=number; i++)
				{
					factorial = factorial * i;
					
				}
				System.out.println("Factorial is: "+factorial);
			}
			
			public void factorialCalculationWithNos(int num)
			{
				int factorial = 1;
				for (int i=1; i<=num; i++)
				{
					factorial = factorial * i;
					
				}
				System.out.println("Factorial is: "+factorial);
			}
			
				

			
		

	}


