package dev.skyjam.IronDozer.Blocks;

public class Block {
	
	public int x, y, z;
	
	public static int DIRT=0;
	public static int GRASS=1;
	public static int STONE=2;
	public static int OAKLOG=3;
	public static int WOODPLANKS=4;


	
	public int type;
	
	public Block(int x, int y, int z, int type) {
		this.x=x;
	
		this.y=y;
		
		this.y=y;
	
		this.z=z;
		
		this.type=type;
	
	}

}
