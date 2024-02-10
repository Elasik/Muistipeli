import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
public class muistipeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> guesses = new ArrayList<Integer>();
		ArrayList<Integer> randoms = new ArrayList<Integer>();
		
		
		int randomNumber1; 
		int randomNumber2; 
		int randomNumber3; 
		int randomNumber4;
		int randomNumber5; 
		int randomNumber6; 
		int randomNumber7;
		int guess1;
		int guess2;
		int guess3;
		int guess4;
		int guess5;
		int guess6;
		int guess7;
		
		try
		{
			
			System.out.println("Yritä muistaa numerot");
			randomNumber1 = random.nextInt(5);
			System.out.println("Random number(1) : " + randomNumber1);
			randoms.add(randomNumber1);
			
			randomNumber2 = random.nextInt(5);
			System.out.println("Random number(2) : " + randomNumber2);
			randoms.add(randomNumber2);
			
			randomNumber3 = random.nextInt(5);
			System.out.println("Random number(3) : " + randomNumber3);
			randoms.add(randomNumber3);
			
			randomNumber4 = random.nextInt(5);
			System.out.println("Random number(4) : " + randomNumber4);
			randoms.add(randomNumber4);
			
			randomNumber5 = random.nextInt(5);
			System.out.println("Random number(5) : " + randomNumber5);
			randoms.add(randomNumber5);
			
			randomNumber6 = random.nextInt(5);
			System.out.println("Random number(6) : " + randomNumber6);
			randoms.add(randomNumber6);
			
			randomNumber7 = random.nextInt(5);
			System.out.println("Random number(7) : " + randomNumber7);
			randoms.add(randomNumber7);
			
			Thread.sleep(7000);
			
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread() .interrupt();
		}

		for (int i = 0; i < 20; ++i) System.out.println();
		
		System.out.println("1. numero oli:");
		guess1 = in.nextInt();
		guesses.add(guess1);
		
		System.out.println("2. numero oli:");
		guess2 = in.nextInt();
		guesses.add(guess2);
		
		System.out.println("3. numero oli:");
		guess3 = in.nextInt();
		guesses.add(guess3);
		
		System.out.println("4. numero oli:");
		guess4 = in.nextInt();
		guesses.add(guess4);
		
		System.out.println("5. numero oli:");
		guess5 = in.nextInt();
		guesses.add(guess5);
		
		System.out.println("6. numero oli:");
		guess6 = in.nextInt();
		guesses.add(guess6);
		
		System.out.println("7. numero oli:");
		guess7 = in.nextInt();
		guesses.add(guess7);
		
		System.out.println("Sinun numerosi olivat:");
		for (int i= 0; i<guesses.size(); i++ )
		{
			System.out.println(guesses.get(i));
		}
		
		System.out.println("Oikeat numerot olivat:");
		for (int i= 0; i<randoms.size(); i++ )
		{
			System.out.println(randoms.get(i));
		}
		
		
	
		
		
		
		
		
	}

}
