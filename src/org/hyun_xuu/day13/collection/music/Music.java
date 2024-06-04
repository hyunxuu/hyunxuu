package org.hyun_xuu.day13.collection.music;

public class Music {

	private String title;
	private String singer;
	public Music() {}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Music(String title,String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	

}
