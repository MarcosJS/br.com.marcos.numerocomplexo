/**
* Essa classe representa um  numero complexo.
* @author Marcos Jose.
* @version 1.0.0
*/
package br.com.marcos.numerocomplexo;

public class NumeroComplexo {
	
	int nReal;
	int nImaginario;
	
	/**
	* Construtor NumeroComplexo.
	* @param numeroReal Representa a parte real do numero complexo.
	* @param numeroImaginario Representa a parte imaginaria do numero complexo.
	* @author Marcos Jose.
	*/
	NumeroComplexo(int numeroReal, int numeroImaginario) {
		nReal = numeroReal;
		nImaginario = numeroImaginario;
	}
	
	/**
	* Converte o numero complexo em uma string na formatacao padrão para impressao.
	* @return Retorna a string do valor do numero complexo.
	* @author Marcos Jose.
	*/

	String imprNComplexo() {
		String nComplexo = "";
		if(this.nReal != 0) {
			nComplexo = Integer.toString(this.nReal);
		}
		if((this.nImaginario > 0) && (this.nReal != 0)) {
			nComplexo = nComplexo.concat("+");
		}
		if(this.nImaginario == 1) {
			nComplexo = nComplexo.concat("i");
		} else if(this.nImaginario == -1) {
			nComplexo = nComplexo.concat("-i");
		} else if(this.nImaginario > 1) {
			nComplexo = nComplexo.concat(Integer.toString(this.nImaginario)+"i");
		} else if(this.nImaginario < -1) {
			nComplexo = nComplexo.concat(Integer.toString(this.nImaginario)+"i");
		}
		if(nComplexo.equals("")) {
			nComplexo = "0";
		}
		return nComplexo;
	}
	
	/**
	* Compara dois numeros complexos.
	* @param n Numero complexo.
	* @return Verdadeiro se os numeros complexos forem iguais.
	* @author Marcos Jose.
	*/
	boolean eIgual(NumeroComplexo n) {
		boolean resultado = false;
		if((nReal == n.nReal) && (nImaginario == n.nImaginario)) {
			resultado  = true;
		}
		return resultado;
	}
	
	/**
	* Soma dois numeros complexos.
	* @param n Numero complexo.
	* @return Um numero complexo como resultado da soma.
	* @author Marcos Jose.
	*/
	NumeroComplexo somar(NumeroComplexo n) {
		NumeroComplexo soma = new NumeroComplexo(this.nReal, this.nImaginario);
		soma.nReal += n.nReal;
		soma.nImaginario += n.nImaginario;
		return soma;
	}
	
	/**
	* Multiplica dois numeros complexos.
	* @param n Numero complexo.
	* @return Um numero complexo como resultado da multiplicacao.
	* @author Marcos Jose.
	*/
	NumeroComplexo multiplicar(NumeroComplexo n) {
		NumeroComplexo produto = new NumeroComplexo(this.nReal, this.nImaginario);
		produto.nReal = (this.nReal*n.nReal)-(this.nImaginario*n.nImaginario);
		produto.nImaginario = (this.nReal*n.nImaginario)+(this.nImaginario*n.nReal);
		return produto;
	}
	
}
