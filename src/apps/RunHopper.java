package apps;

import java.util.Scanner;

public class RunHopper {
	
	
	
	public void run () {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the file name: ");
		String choice = keyboard.nextLine();
		
		
		BallFactory b1 = new BallFactory();
//		List<Ball> nbaBalls = new ArrayList<>();
//		List<Ball> nbaBalls2 = new ArrayList<>();
		
		Hopper nba = new Hopper();
		System.out.println(nba.shuffle(b1.takeFile(choice)));
		keyboard.close();
	}
	
	
	
}
