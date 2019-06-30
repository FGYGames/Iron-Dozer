package dev.skyjam.IronDozer.Shaders;

import org.lwjgl.util.vector.Matrix4f;

import dev.skyjam.IronDozer.Entities.Camera;
import dev.skyjam.IronDozer.toolbox.Maths;

public class StaticShader extends ShaderProgram{

	private static final String vertexFile="/dev/skyjam/IronDozer/shaders/vertexShader.txt";
	private static final String fragmentFile="/dev/skyjam/IronDozer/shaders/fragmentShader.txt";
	
	int location_transformationMatrix;
	int location_projectionMatrix;
	int location_viewMatrix;
	
	public StaticShader() {
		super(vertexFile, fragmentFile);
	}

	@Override
	protected void bindAttributes() {
		super.bindAttribute("position", 0);
		super.bindAttribute("textureCoords", 1);
	}

	@Override
	protected void getAllUniformLocations() {
		
		location_transformationMatrix=super.getUniformLocation("transformationMatrix");
		location_projectionMatrix=super.getUniformLocation("projectionMatrix");
		location_viewMatrix = super.getUniformLocation("viewMatrix");
	}
	
	public void loadTransformationMatrix(Matrix4f matrix) {
		super.loadMatrix(location_transformationMatrix, matrix);
	
	}

	public void loadProjectionMatrix(Matrix4f matrix) {
		super.loadMatrix(location_projectionMatrix, matrix);
	}
	
	public void loadViewMatrix(Camera camera) {
		super.loadMatrix(location_viewMatrix, Maths.createViewMatrix(camera));
	}
	
}
