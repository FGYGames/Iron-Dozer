package dev.skyjam.IronDozer.World;

import org.lwjgl.util.vector.Vector3f;

import java.util.List;

import dev.skyjam.IronDozer.Blocks.Block;

public class Chunk {

	public List<Block> blocks;
	public Vector3f origin;
	
	public Chunk(List<Block> blocks, Vector3f origin	) {
		
		this.blocks=blocks;
		this.origin=origin;
	}


	
	
}
