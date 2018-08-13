
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

import java.awt.Point;  

public class Cluedo {
	public Cluedo() {
		Map<Point, String> map = new HashMap<Point, String>();
		map.put(new Point(4,6), "Kitchen");
		
		map.put(new Point(8,5), "Ball Room");
		map.put(new Point(9,7), "Ball Room");
		map.put(new Point(14,7), "Ball Room");
		map.put(new Point(15,5), "Ball Room");
		
		map.put(new Point(18,4), "Conservatory");
		
		map.put(new Point(18,9), "Billard Room");
		map.put(new Point(22,12), "Billard Room");
		
		map.put(new Point(20,14), "Library");
		map.put(new Point(17,16), "Library");
		
		map.put(new Point(17,21), "Study");
		
		map.put(new Point(12,18), "Hall");
		map.put(new Point(11,18), "Hall");
		map.put(new Point(14,20), "Hall");
		
		map.put(new Point(6,19), "Lounge");
		
		map.put(new Point(6,15), "Dining Room");
		map.put(new Point(7,12), "Dining Room");
		
		public void makeAccusation() {
			System.out.println("Accuse a character");
			String characterGuess = sc.next();
			System.out.println("Accuse a weapon");
			String weaponGuess = sc.next();
			System.out.println("Accuse a room");
			String roomGuess = sc.next();
			gameWon(characterGuess, weaponGuess, roomGuess);
			
		}
		
		public void gameWon(String characterGuess, String weaponGuess, String roomGuess) {
			if(solution.get(0).equals(characterGuess) && solution.get(1).equals(weaponGuess) && solution.get(2).equals(roomGuess)) {
				won = true;
			}
			
		}
	}

}
