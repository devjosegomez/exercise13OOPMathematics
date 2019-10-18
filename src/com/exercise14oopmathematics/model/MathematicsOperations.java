package com.exercise14oopmathematics.model;

public class MathematicsOperations {
	final double PI= 3.141516;
	public double areaTriangle(double base, double height) {
		return (base*height)/2;
	}
	
	public double areaSquare(double side) {
		return (side*side);
	}
	
	public double areaCircle(double radio) {
		return this.PI*(radio*radio);
	}
	
	
	
}
