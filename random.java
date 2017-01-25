import java.util.Random;
import java.util.Collections;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dksjdksj");
		
		// Finalists from 1 - 30
//		for(int i = 0; i < 3; i++)
//		{
//			int randomInt = (int)(30.0 * Math.random());
//			//System.out.println("Random number between 1 and 30: " + randomInt);
//			int rando = randomInt + 1;
//			System.out.println("Random number between 1 and 30: " + rando);
//		}
		
		int i = 0;
		int num [] = new int[31];
		// generate 3 numbers and store into the array
		while(i < 3)
		{
			num[i] = (int)(Math.random() * 31) + 1; //(int) is required because math.random is double
			i++;
		}
		
		// Check if 1st num == 2nd num
		// if yes generate another 2nd num
		
		if(num[0] == num[1])
		{
			while(num[0] == num[1])
			{
				num[1] = (int)(Math.random() * 31)  + 1;
			}
		}
		
		// Check if 1st num == 3rd number
		// If yes generate a new 3rd num
		if(num[0] == num[2])
		{
			while(num[0] == num[2])
			{
				num[2] = (int)(Math.random() * 31) + 1;
			}
		}
		
		// Check if 2nd num == 3rd num
		// If yes generate a new 3rd num
		if(num[1] == num[2])
		{
			while(num[1] == num[2])
			{
				num[2] = (int)(Math.random() * 31) + 1;
			}
		}
		
		for(int j = 0; j < 3; j++)
		{
			System.out.println("The selected finalist: " + num[j]);
		}

	}

}
