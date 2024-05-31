package org.hyun_xuu.day11.oop.interfacepkg.music;

public class Stage {
	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play(new Drum());
		musician.play(new Guitar());
		musician.play(new piano());
		
	}
}
