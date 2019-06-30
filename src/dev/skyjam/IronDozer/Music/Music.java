package dev.skyjam.IronDozer.Music;


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	
	public void playMusic(String musicLocation) {
		System.out.println("Initializing Audio");
		try {
			File musicPath=new File(musicLocation);
			
			if(musicPath.exists()) {
				
				AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
				Clip clip=AudioSystem.getClip();
				clip.open(audioInput);
				clip.loop(0);
								
				System.out.println("Audio loaded successfully");
			

			}else {
				System.out.println("Can't find music file");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	
	}
	

	
	

}
