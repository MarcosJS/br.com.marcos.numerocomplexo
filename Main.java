package br.com.marcos.numerocomplexo;

public class Main {

	public static void main(String[] args) {
		
		NumeroComplexo nC1 = new NumeroComplexo(2, 5);
		NumeroComplexo nC2 = new NumeroComplexo(1, -2);
		NumeroComplexo nC3 = new NumeroComplexo(4, 3);
		NumeroComplexo nC4 = new NumeroComplexo(2, 6);
		NumeroComplexo nC5 = new NumeroComplexo(2, 6);
		
		System.out.println("Lista de números complexos:");
		System.out.println("nC1: "+nC1.imprNComplexo());
		System.out.println("nC2: "+nC2.imprNComplexo());
		System.out.println("nC3: "+nC3.imprNComplexo());
		System.out.println("nC4: "+nC4.imprNComplexo());
		System.out.println("nC5: "+nC5.imprNComplexo()+"\n");
		
		System.out.println("Equivalencia de nC4 e nC5: "+nC4.eIgual(nC5));
		System.out.println("Equivalencia de nC1 e nC2: "+nC1.eIgual(nC2)+"\n");
		
		NumeroComplexo soma1 = nC1.somar(nC2);
		NumeroComplexo soma2 = nC3.somar(nC4);
		System.out.println("A soma de nC1 e nC2: "+soma1.imprNComplexo());
		System.out.println("A soma de nC3 e nC4: "+soma2.imprNComplexo()+"\n");
		
		NumeroComplexo produto1 = nC1.multiplicar(nC2);
		NumeroComplexo produto2 = nC3.multiplicar(nC4);
		System.out.println("O produto de nC1 e nC2: "+produto1.imprNComplexo());
		System.out.println("O produto de nC3 e nC4: "+produto2.imprNComplexo()+"\n");
	}
	
}
