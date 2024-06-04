package org.hyun_xuu.day13.collection.music;

import java.util.ArrayList;
import java.util.List;

public class ManageMusic {

		private List<Music> mList;
		
		public ManageMusic() {
			mList = new ArrayList<Music>();
		}
		
		
	public void registerMusic(Music music) {
		// TODO Auto-generated method stub
		mList.add(music);
	}


	public void registerMusicAtFirst(Music music) {
		// TODO Auto-generated method stub
		mList.add(0,music);
	}


	public List<Music> getAllMusic() {
		// TODO Auto-generated method stub
		return mList;
	}


	public Music searchMusicByTitle(String name) {
		// TODO Auto-generated method stub
		if(name != "" && name != null) {
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}
	
	public int searchIndexByName(String name) {
		if(name != "" && name != null) {
			int index =0;
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}	
		return 0;
	}


	public void modifyMusic(int index, Music music) {
		// TODO Auto-generated method stub
		mList.set(index, music);
	}


	public void deleteMusic(int index) {
		// TODO Auto-generated method stub
		mList.remove(index);
	}

}
