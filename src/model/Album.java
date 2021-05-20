package model;

public class Album {
	
	private String title;
	private int numPages;
	private int picsPerPage;
	private AlbumType type;
	
	//Relationships
	private Photo [] photos;

	public Album(String title, int numPages,int picsPerPage, AlbumType type){

		this.title = title;
		this.numPages = numPages;
		this.picsPerPage = picsPerPage;
		this.type = type;
	}

	////////////////Gets
	public String getTitle(){
		return title;
	}

	public int getNumPages(){
		return numPages;
	}
	
	public int getPicsPerPage(){
		return picsPerPage;
	}

	public AlbumType getType(){
		return type;
	}

	public Photo[] getPhotos(){
		return photos;
	}

	///////////////////Sets
	public void setTitle(String title){
		this.title = title;
	}

	public void setNumPages(int numPages){
		this.numPages = numPages;
	}

	public void setPicsPerPage(int picsPerPage){
		this.picsPerPage = picsPerPage;
	}

	public void setType(AlbumType type){
		this.type = type;
	}

	public void setPhotos(Photo[] photos){
		this.photos = photos;
	}


}
