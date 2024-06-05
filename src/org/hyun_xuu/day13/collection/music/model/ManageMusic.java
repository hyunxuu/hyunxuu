package org.hyun_xuu.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hyun_xuu.day13.collection.music.model.Music;

public class ManageMusic {

		private List<Music> mList;
		
		public ManageMusic() {
			mList = new ArrayList<Music>();
		}
		
		//곡 맨뒤 추가
	public void registerMusic(Music music) {
		// TODO Auto-generated method stub
		mList.add(music);
	}

	//곡 추가
	public void registerMusicAtFirst(Music music) {
		// TODO Auto-generated method stub
		mList.add(0,music);
	}

	//모든 곡 조회
	public List<Music> getAllMusic() {
		// TODO Auto-generated method stub
		return mList;
	}

	// 곡명으로 검색
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
	// 곡명으로 인덱스 검색
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

	public void sortByTitleASC() {
		Collections.sort(mList);
	}

	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
	}

	public void sortBySingerASC() {
		Collections.sort(mList);
		
	}

	public void sortBySingerDESC() {
		Collections.sort(mList,);
		//collection - list,set,map 크기 -size()
//		int nums[] = {4,3,2,1};
//		//버블 정렬
//		for(int i =0; i <mList.size() -1; i++) {
//			for(int j =0; j < (mList.size()-1);j++) {
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				if(mOne.getSinger().compareTo(mTwo.getSinger())<0) {
////					Music temp = mOne;
//					mList.set(j, mTwo);
//					mList.set(j+1, mOne);
//				}
//			}
//		}
//		for(int num : nums) {
//			System.out.print(num+" ");
//		}
//		System.out.println();
		
	}

}
