package com.calculadora;

public class Calculadora {
	private double operandOne;
	private double operandTwo;
	private char operation;
	private double result;
	
	public Calculadora() {
		result = 0.0;
	}
	
	public void setOperatorOne(double numero) {
		this.operandOne = numero;
	}
	
	public void setOperatorTwo(double numero) {
		this.operandTwo = numero;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		switch (operation) {
		case '+':
			result = operandOne + operandTwo;
			break;
		case '-':
			result = operandOne - operandTwo;
			break;
		default:
			System.out.println("Operación no válida");
		}
	}
	
	public double getResult() {
		return result;
	}
}
