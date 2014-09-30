//Matthew Schlogel
//Quiz 3
//Triangle Class

import java.lang.Math;

public class Triangle extends GeometricObject {
	
	//Encapsulated attributes
	
	private double side1;
	private double side2;
	private double side3;
	
	//Default Constructor
	
	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	//Custom constructor
	
	public Triangle(double s1, double s2, double s3){
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	//Get methods
	
	//Side 1
	public double getSide1(){
		return this.side1;
	}
	
	//Side 2
	public double getSide2(){
		return this.side2;
	}
	
	//Side 3
	public double getSide3(){
		return this.side3;
	}
	
	//Area
	
	public double getArea(){
		double temp = ((.5)*(this.side1 +this.side2 + this.side3));
		double area = Math.sqrt(temp*(temp-this.side1)*(temp-this.side2)*(temp-this.side3));
		return (area);
	}
	
	//Perimeter
	public double getPerimeter(){
		double perimeter = (this.side1+this.side2+this.side3);
		return perimeter;
	}
	
	//toString
	
	public String toString(){
		double area = this.getArea();
		double perimeter = this.getPerimeter();
		return ("Side 1: " + this.side1 + '\n'
				+"Side 2: " + this.side2 + '\n'
				+ "Side 3: " + this.side3 + '\n'
				+ "Area: " + area + '\n'
				+ "Perimeter: " + perimeter);		
	}
	
	//Tests and such
	
	public static void main(String[] args){
		Triangle test = new Triangle();
		Triangle test2 = new Triangle(5,6,7);
		System.out.println(test.toString());
		System.out.println(test2.toString());
		//Tests pass
	}
}
