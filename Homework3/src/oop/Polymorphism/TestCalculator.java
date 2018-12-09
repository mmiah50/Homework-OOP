package oop.Polymorphism;

public class TestCalculator {

	public static void main(String[]args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.roomOfSize(5, 5));
		System.out.println(calc.roomOfSize(3, 4, 5));
		System.out.println(calc.roomOfSize(7, 8, 9, 10));
		
		
		ModernCalculator mc1 = new ModernCalculator();
		System.out.println(mc1.roomOfSize(7, 8, 9, 10));
		
	}

}
