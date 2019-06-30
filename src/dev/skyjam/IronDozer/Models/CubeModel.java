package dev.skyjam.IronDozer.Models;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public class CubeModel {
	
	private static int defpackSize=(int)16.0f;
	
	public static Vector3f[] EAST_POS = {
			
			new Vector3f(0.5f,0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,0.5f),
			new Vector3f(0.5f,-0.5f,0.5f),
			new Vector3f(0.5f,0.5f,0.5f),
			new Vector3f(0.5f,0.5f,-0.5f)
			
	};
	
	public static Vector3f[] WEST_POS = {
			
			new Vector3f(-0.5f,0.5f,-0.5f),
			new Vector3f(-0.5f,-0.5f,-0.5f),
			new Vector3f(-0.5f,-0.5f,0.5f),
			new Vector3f(-0.5f,-0.5f,0.5f),
			new Vector3f(-0.5f,0.5f,0.5f),
			new Vector3f(-0.5f,0.5f,-0.5f)
			
	};
	
	public static Vector3f[] UP_POS = {
			
			new Vector3f(-0.5f,0.5f,0.5f),
			new Vector3f(-0.5f,0.5f,-0.5f),
			new Vector3f(0.5f,0.5f,-0.5f),
			new Vector3f(0.5f,0.5f,-0.5f),
			new Vector3f(0.5f,0.5f,0.5f),
			new Vector3f(-0.5f,0.5f,0.5f)
			
	};
	
	public static Vector3f[] DOWN_POS = {
			
			new Vector3f(-0.5f,-0.5f,0.5f),
			new Vector3f(-0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,0.5f),
			new Vector3f(-0.5f,-0.5f,0.5f)
			
	};
	
	public static Vector3f[] NORTH_POS = {
			
			new Vector3f(-0.5f,0.5f,0.5f),
			new Vector3f(-0.5f,-0.5f,0.5f),
			new Vector3f(0.5f,-0.5f,0.5f),
			new Vector3f(0.5f,-0.5f,0.5f),
			new Vector3f(0.5f,0.5f,0.5f),
			new Vector3f(-0.5f,0.5f,0.5f)
			
	};
	
	public static Vector3f[] SOUTH_POS = {
			
			new Vector3f(-0.5f,0.5f,-0.5f),
			new Vector3f(-0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,-0.5f,-0.5f),
			new Vector3f(0.5f,0.5f,-0.5f),
			new Vector3f(-0.5f,0.5f,-0.5f)
			
	};
	
	public static Vector2f[] UV = {
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1.f),
			new Vector2f(1.f, 1.f),
			new Vector2f(1.f, 1.f),
			new Vector2f(1.f, 0.f),
			new Vector2f(0.f, 0.f)
			
	};
	
	public static Vector2f[] UV_EAST={
	//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
		
			//GRASS
			
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	
	public static Vector2f[] UV_WEST={
	//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
			//GRASS
			
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	
	public static Vector2f[] UV_UP={
	//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
			//GRASS
			
			new Vector2f(2.f/defpackSize, 0.f),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(2.f/defpackSize, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	
	public static Vector2f[] UV_DOWN={
			//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
			//GRASS
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	
	public static Vector2f[] UV_NORTH={
	//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
//GRASS
			
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	public static Vector2f[] UV_SOUTH={
	//DIRT
			
			new Vector2f(0.f, 0.f),
			new Vector2f(0.f, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(0.f, 0.f),		
			//GRASS
			
			new Vector2f(1.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 1f/defpackSize),
			new Vector2f(2.f/defpackSize, 0.f),
			new Vector2f(1.f/defpackSize, 0.f),
			
			//STONE 
			
			new Vector2f(3.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(3.f/defpackSize, 0.f),
			
			//OAKLOG
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 1f/defpackSize),
			new Vector2f(6.f/defpackSize, 0.f),
			new Vector2f(5.f/defpackSize, 0.f),
			
			//WOODPLANKS
			new Vector2f(4.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 1f/defpackSize),
			new Vector2f(5.f/defpackSize, 0.f),
			new Vector2f(4.f/defpackSize, 0.f),
	};
	
	
	
	
	public static Vector3f[] NORMALS = {
			
			new Vector3f(0.f, 0.f, 0.f),
			new Vector3f(0.f, 0.f, 0.f),
			new Vector3f(0.f, 0.f, 0.f),
			new Vector3f(0.f, 0.f, 0.f),
			new Vector3f(0.f, 0.f, 0.f),
			new Vector3f(0.f, 0.f, 0.f)
			
	};
	
	public static float[] vertices = {
			
			-0.5f,0.5f,-0.5f,	
			-0.5f,-0.5f,-0.5f,	
			0.5f,-0.5f,-0.5f,	
			0.5f,0.5f,-0.5f,		
			
			-0.5f,0.5f,0.5f,	
			-0.5f,-0.5f,0.5f,	
			0.5f,-0.5f,0.5f,	
			0.5f,0.5f,0.5f,
			
			0.5f,0.5f,-0.5f,	
			0.5f,-0.5f,-0.5f,	
			0.5f,-0.5f,0.5f,	
			0.5f,0.5f,0.5f,
			
			-0.5f,0.5f,-0.5f,	
			-0.5f,-0.5f,-0.5f,	
			-0.5f,-0.5f,0.5f,	
			-0.5f,0.5f,0.5f,
			
			-0.5f,0.5f,0.5f,
			-0.5f,0.5f,-0.5f,
			0.5f,0.5f,-0.5f,
			0.5f,0.5f,0.5f,
			
			-0.5f,-0.5f,0.5f,
			-0.5f,-0.5f,-0.5f,
			0.5f,-0.5f,-0.5f,
			0.5f,-0.5f,0.5f
			
	};
	
	public static int[] indices = {
			
			0,1,3,	
			3,1,2,	
			4,5,7,
			7,5,6,
			8,9,11,
			11,9,10,
			12,13,15,
			15,13,14,	
			16,17,19,
			19,17,18,
			20,21,23,
			23,21,22
			
	};
	
	public static float[] uv = {
			
			0, 0,
			0, 1,
			1, 1,
			1, 0,
			0, 0,
			0, 1,
			1, 1,
			1, 0,
			0, 0,
			0, 1,
			1, 1,
			1, 0,
			0, 0,
			0, 1,
			1, 1,
			1, 0,
			0, 0,
			0, 1,
			1, 1,
			1, 0,
			0, 0,
			0, 1,
			1, 1,
			1, 0
			
	};

}