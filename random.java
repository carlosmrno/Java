import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int num [] = new int[3]; // array to hold the 3 random numbers
		// generate 3 random numbers and store into the array
		while(i < 3)
		{
			num[i] = (int)(Math.random() * 30) + 1; //(int) is required because math.random is double
			i++;
		}
		
		// Check if 1st num == 2nd num
		// if yes generate another 2nd num
		
		if(num[0] == num[1])
		{
			while(num[0] == num[1])
			{
				num[1] = (int)(Math.random() * 30)  + 1; // Random number from 1 - 30
			}
		}
		
		// Check if 1st num == 3rd number
		// If yes generate a new 3rd num
		if(num[0] == num[2])
		{
			while(num[0] == num[2])
			{
				num[2] = (int)(Math.random() * 30) + 1;
			}
		}
		
		// Check if 2nd num == 3rd num
		// If yes generate a new 3rd num
		if(num[1] == num[2])
		{
			while(num[1] == num[2])
			{
				num[2] = (int)(Math.random() * 30) + 1;
			}
		}
		
		for(int j = 0; j < 3; j++)
		{
			System.out.println("The selected finalist: " + num[j]);
		}
	
	}

}
