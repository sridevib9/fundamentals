package Basics;

public class Example16 {

	public static void main(String[] args) {
		int i, number, count; 
		
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = 10; number <=99; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}

	}

}
