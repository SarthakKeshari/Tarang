package com.tarang.musicalbumcreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongList {
	public static List<Map<Integer, List<String>>> songList = new ArrayList<>();
	Map<Integer, List<String>> songMap = new HashMap<>();
	List<String> songDetail = new ArrayList<>();
	
	void initialAddSong() {
		Map<Integer, List<String>> songMap1 = new HashMap<>();
		List<String> songDetail1 = new ArrayList<>();
		songDetail1.add("Tum Hi Ho");
		songDetail1.add("It makes me feel romantic.");
		songDetail1.add("TumHiHo.mp3");
		
		songMap1.put(1, songDetail1);
		
		songList.add(songMap1);
		
		Map<Integer, List<String>> songMap2 = new HashMap<>();
		List<String> songDetail2 = new ArrayList<>();
		songDetail2.add("Khuda Bhi");
		songDetail2.add("It makes me feel happy.");
		songDetail2.add("KhudaBhi.mp3");
		
		songMap2.put(2, songDetail2);
		
		songList.add(songMap2);
	}
	
	void addSong(String title, String description, String song){
		Map<Integer, List<String>> songMapAdd = new HashMap<>();
		List<String> songDetailAdd = new ArrayList<>();
		songDetailAdd.add(title);
		songDetailAdd.add(description);
		songDetailAdd.add(song);
		
		songMapAdd.put(songList.size()+1, songDetailAdd);
		
		songList.add(songMapAdd);
	}
	
	List<Map<Integer, List<String>>> getSongs() {
		return this.songList;
	}
}
