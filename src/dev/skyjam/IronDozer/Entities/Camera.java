package dev.skyjam.IronDozer.Entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.util.vector.Vector3f;

//import dev.skyjam.IronDozer.GameLoop;
import dev.skyjam.IronDozer.Blocks.Block;

public class Camera {

	Vector3f position;
	float rotX;
	float rotY;
	float rotZ;
	
	float speed=0.1f;
	float turnSpeed=0.1f;
	float moveAt=0;
	
	boolean collisionX=false;
	boolean collisionY=false;
	boolean collisionZ=false;
	
	
	public Camera(Vector3f position, float rotX, float rotY, float rotZ) {
		
		this.position = position;
		this.rotX = rotX;
		this.rotY = rotY;
		this.rotZ = rotZ;
	}
	



	public void move()	{
	
	
	
	
		rotX += -Mouse.getDY()*turnSpeed;
		rotY+=Mouse.getDX()*turnSpeed;
		
	
			
			
	
			
		
		if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
			moveAt=-speed;
		}else if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
			moveAt=speed;
			
		}else if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
			moveAt=speed;
		}else{
			moveAt = 0;
		}
		float dx=(float)-(moveAt*Math.sin(Math.toRadians(rotY)));
		float dy=(float)(moveAt*Math.sin(Math.toRadians(rotX)));
		float dz=(float)(moveAt*Math.cos(Math.toRadians(rotY)));
		
		position.x +=dx;
		position.y+=dy;
		position.z+=dz;
		
	}
				
	
	



	public Vector3f getPosition() {
		return position;
	}
	public float getRotX() {
		return rotX;
	}
	public float getRotY() {
		return rotY;
	}
	public float getRotZ() {
		return rotZ;
	}



	public void setPosition(Vector3f position) {
		this.position = position;
	}
	
}
