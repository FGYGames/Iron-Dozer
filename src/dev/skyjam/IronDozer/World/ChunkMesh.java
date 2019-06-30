package dev.skyjam.IronDozer.World;

import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;
import java.util.List;

import dev.skyjam.IronDozer.Blocks.Block;
import dev.skyjam.IronDozer.Blocks.Vertex;
import dev.skyjam.IronDozer.Models.CubeModel;

public class ChunkMesh {

	private List<Vertex> vertices;
	
	private List<Float> positionsList;
	private List<Float> uvsList;
	private List<Float> normalsList;
	
	public float[] positions, uvs, normals;
	
	public Chunk chunk;
	
	public ChunkMesh(Chunk chunk) {
		this.chunk=chunk;
		
		vertices = new ArrayList<Vertex>();
		positionsList=new ArrayList<Float>();
		uvsList=new ArrayList<Float>();
		normalsList=new ArrayList<Float>();
		
		buildMesh();
		populateLists();
	}
	
	public void update(Chunk chunk) {
		
		this.chunk=chunk;
		
		buildMesh();
		populateLists();
	}

	private void buildMesh() {
		
		for (int i=0; i< chunk.blocks.size();i++) {
			
			Block blockI=chunk.blocks.get(i);
			
			boolean east = false, west=false, north=false, south=false, up=false, down=false;
			
			for(int j=0; j < chunk.blocks.size(); j++) {
				
				Block blockJ=chunk.blocks.get(j); 
				
				//EAST
				
				if(((blockI.x+1)==(blockJ.x))&&((blockI.y)==(blockJ.y))&&((blockI.z)==(blockJ.z))) {
					east=true;
				}
				//WEST
				
				if(((blockI.x-1)==(blockJ.x))&&((blockI.y)==(blockJ.y))&&((blockI.z)==(blockJ.z))) {
					west=true;
				}
				
				//UP
				
				if(((blockI.x)==(blockJ.x))&&((blockI.y+1)==(blockJ.y))&&((blockI.z)==(blockJ.z))) {
					up=true;
				}
				//DOWN
				
				if(((blockI.x)==(blockJ.x))&&((blockI.y-1)==(blockJ.y))&&((blockI.z)==(blockJ.z))) {
					down=true;
				}
				
				//NORTH
				
				if(((blockI.x)==(blockJ.x))&&((blockI.y)==(blockJ.y))&&((blockI.z+1)==(blockJ.z))) {
					north=true;
				}
				//SOUTH
				
				if(((blockI.x)==(blockJ.x))&&((blockI.y)==(blockJ.y))&&((blockI.z-1)==(blockJ.z))) {
					south=true;
				}
				
			}
			
			//Add visible face
			
			if(!east) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.EAST_POS[k].x+blockI.x,
						CubeModel.EAST_POS[k].y+blockI.y,
						CubeModel.EAST_POS[k].z+blockI.z),
						CubeModel.UV_EAST[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			if(!west) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.WEST_POS[k].x+blockI.x,
						CubeModel.WEST_POS[k].y+blockI.y,
						CubeModel.WEST_POS[k].z+blockI.z),
						CubeModel.UV_WEST[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			if(!up) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.UP_POS[k].x+blockI.x,
						CubeModel.UP_POS[k].y+blockI.y,
						CubeModel.UP_POS[k].z+blockI.z),
						CubeModel.UV_UP[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			if(!down) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.DOWN_POS[k].x+blockI.x,
						CubeModel.DOWN_POS[k].y+blockI.y,
						CubeModel.DOWN_POS[k].z+blockI.z),
						CubeModel.UV_DOWN[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			if(!north) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.NORTH_POS[k].x+blockI.x,
						CubeModel.NORTH_POS[k].y+blockI.y,
						CubeModel.NORTH_POS[k].z+blockI.z),
						CubeModel.UV_NORTH[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			if(!south) {
				for(int k=0; k<6;k++) {
				vertices.add(new Vertex(new Vector3f(CubeModel.SOUTH_POS[k].x+blockI.x,
						CubeModel.SOUTH_POS[k].y+blockI.y,
						CubeModel.SOUTH_POS[k].z+blockI.z),
						CubeModel.UV_SOUTH[(blockI.type*6)+k], 
						CubeModel.NORMALS[k]));
				}
			}
			
		}
		
	}
	
	private void populateLists() {
		
		for(int i=0; i < vertices.size(); i++) {
			positionsList.add(vertices.get(i).positions.x);
			positionsList.add(vertices.get(i).positions.y);
			positionsList.add(vertices.get(i).positions.z);
			uvsList.add(vertices.get(i).uvs.x);
			uvsList.add(vertices.get(i).uvs.y);
			normalsList.add(vertices.get(i).normals.x);
			normalsList.add(vertices.get(i).normals.y);
			normalsList.add(vertices.get(i).normals.z);
		}
		
		positions=new float[positionsList.size()];
		uvs=new float[uvsList.size()];
		normals=new float[normalsList.size()];
		
		for(int i=0; i<positionsList.size(); i++) {
			positions[i]=positionsList.get(i);
		}
		for(int i=0; i<uvsList.size(); i++) {
			uvs[i]=uvsList.get(i);
		}
		for(int i=0; i<normalsList.size(); i++) {
			normals[i]=normalsList.get(i);
		}
		
		positionsList.clear();
		uvsList.clear();
		normalsList.clear();
	}

}
