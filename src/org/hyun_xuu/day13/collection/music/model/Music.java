package org.hyun_xuu.day13.collection.music.model;

public class Music implements Comparable<Music> {

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
	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.getTitle());
	}	

}
