package model;

public class Photo {
	
	private String date;
	private Orientation orientation;
	private int resolution;
	private String comment;
	
	//Relationships
	private Coordinate latitude;
	private Coordinate longitude;
	
	public Photo(String date, Orientation orientation, int resolution, String comment, Coordinate latitude,
			Coordinate longitude) {
		super();
		this.date = date;
		this.orientation = orientation;
		this.resolution = resolution;
		this.comment = comment;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Coordinate getLatitude() {
		return latitude;
	}

	public void setLatitude(Coordinate latitude) {
		this.latitude = latitude;
	}
	
	public Coordinate getLongitude() {
		return longitude;
	}

	public void setLongitude(Coordinate longitude) {
		this.longitude = longitude;
	}

}
