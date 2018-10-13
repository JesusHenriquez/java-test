package objects;

public class House {

	protected String direction;
	protected String pCode;
	protected int nHabitants;
	protected double sMeters;
	
	public House (String direction, String pCode, int nHabitants, double sMeters) {
		this.direction = direction;
		this.pCode = pCode;
		this.nHabitants = nHabitants;
		this.sMeters = sMeters;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public int getnHabitants() {
		return nHabitants;
	}

	public void setnHabitants(int nHabitants) {
		this.nHabitants = nHabitants;
	}

	public double getsMeters() {
		return sMeters;
	}

	public void setsMeters(int sMeters) {
		this.sMeters = sMeters;
	}
	
}
