package model;

public class Coordinate {

	private int degrees;
	private int minutes;
	private int seconds;
	
	
	public Coordinate(int deg, int min, int sec) {
		degrees= deg;
		minutes = min;
		seconds = sec;
		
	}
	
	//Getters and setters
	public int getDegrees() {
		return degrees;
	}
	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

}
