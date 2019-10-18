package com.exercise14oopmathematics.app;

import java.util.Scanner;

import com.exercise14oopmathematics.model.MathematicsOperations;

public class MathematicsApp {

	public static void main(String[] args) {
		//variables declaration
		double base = 0;
		double height = 0;
		double radio = 0;
		double side = 0;
		double result = 0;
		
		Scanner input = new Scanner(System.in);
		//MathematicsOperations myOperations = new MathematicsOperations();
		
		System.out.println("Enter the base: ");
		base = input.nextDouble();
		System.out.println("Enter the height: ");
		height = input.nextDouble();
		//result = myOperations.areaTriangle(base, height);
		result = MathematicsOperations.areaTriangle(base, height);
		System.out.println("Triangle area: " + result);
		
	}

}
