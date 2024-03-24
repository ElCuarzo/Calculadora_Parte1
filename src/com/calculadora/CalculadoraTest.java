package com.calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.setOperatorOne(10);
		calculadora.setOperatorTwo(15);
		calculadora.setOperation('+');
		
		calculadora.performOperation();
		
		double result = calculadora.getResult();
		System.out.println("El resultado de su operacion es: " + result);
		
		calculadora.setOperatorOne(10);
		calculadora.setOperatorTwo(15);
		calculadora.setOperation('-');
		
		calculadora.performOperation();
		
		double result2 = calculadora.getResult();
		System.out.println("El resultado de su operacion es: " + result2);
	}
}
