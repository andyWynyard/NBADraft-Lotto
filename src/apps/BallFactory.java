package apps;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class BallFactory {
	// private String team;

	public BallFactory() {

	}

	public List<Ball> createBall(int amount, String team) {
		List<Ball> balls = new ArrayList<>();
		for (int i = 0; i < amount; i++) {
			Ball b1 = new Ball(team);
			balls.add(b1);

		}
		return balls;
	}

	public Ball createBall(String team) {

		Ball b1 = new Ball(team);

		return b1;
	}

	public List<Ball> takeFile(String fileName) {

		List<Ball> draft = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName + ".txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(", ");
				draft.addAll(createBall(Integer.parseInt(fields[0]), fields[1]));
				

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		//System.out.println(draft);
		return draft;
	}

}
