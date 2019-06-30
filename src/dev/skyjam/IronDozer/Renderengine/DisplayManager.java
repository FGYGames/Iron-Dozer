package dev.skyjam.IronDozer.Renderengine;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dev.skyjam.IronDozer.GameLoop;
//import dev.skyjam.IronDozer.GameLoop;
//import dev.skyjam.IronDozer.GameLoop.STATE;
import dev.skyjam.IronDozer.Entities.Camera;
import dev.skyjam.IronDozer.Music.Music;





public class DisplayManager {
	public static final int WIDTH=1359, HEIGHT=767;
	private static final int FPS_CAP=60;
	
	static GameLoop game=new GameLoop();
	static Music music = new Music();

	static float cameraposition;
	
	
	public static void createDisplay() {
	
		ContextAttribs attribs=new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			
			Display.create(new PixelFormat(), attribs);
			Display.setTitle("IronDozer 1.0.0");
			Display.setFullscreen(true);
			GL11.glViewport(0,0,Display.getWidth(),Display.getHeight());
		
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		Mouse.setGrabbed(true);
		
		
		}
	
	
	public static void updateDisplay() {
		
		Display.sync(FPS_CAP);
		Display.update();
		//input
		
		while(Keyboard.next()) {
            if(Keyboard.getEventKeyState()) {
                 
                if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
                    closeDisplay();
                }
                 
                if(Keyboard.isKeyDown(Keyboard.KEY_E) && Mouse.isGrabbed()) {
                    Mouse.setGrabbed(false);
                } else if(Keyboard.isKeyDown(Keyboard.KEY_E) && !Mouse.isGrabbed()) {
                    Mouse.setGrabbed(true);
                }
                 
            }
		}
			
		
	}
	
	public static void closeDisplay() {
		
		GameLoop.loader1.cleanUp();
		GameLoop.shader1.cleanUp();
		
	System.out.println("Closing Game");
		Display.destroy();
		System.out.println("Game Ended");
		System.exit(0);
	}
	
	
}
