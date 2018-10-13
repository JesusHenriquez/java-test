package general;

import objects.House;

public class main {

	public static void main(String[] args) {
		
		House[] hs = new House[5];
		House h;
		for (int i = 0; i < hs.length; i++) {
			h = new House("Km " + i +" via La Calera", ""+i+i+i, i+2, 	30.5*i);
			hs[i] = h;
		}
		
		for (House house : hs) {
			System.out.println(house.getDirection() + "\t" +
							   house.getnHabitants() + "\t" +
							   house.getpCode() + "\t" +
							   house.getsMeters());
		}

	}

}
