package br.com.db1.db1start.aula1.teste;
import org.junit.Assert;
import org.junit.Test;


import br.com.db1.db1start.aula1.ExercicioInteger;

public class ExercicioIntegerTest {
	 



	
	@Test
	
	public void somaNumeros() {
		ExercicioInteger compar = new ExercicioInteger();
		Integer resultadoSoma = compar.somaNumero(1,2);
		Assert.assertEquals(1,resultadoSoma,2);
		
	}
	 
	@Test
	
	public void subtrairDoisNumero() {
		ExercicioInteger compara = new ExercicioInteger();
		Integer result = compara.subtrair(1, 2);
		Assert.assertEquals(1,result,2);
	}
	
	
	@Test
	
	public void multiplicaDoisNumero() {
		ExercicioInteger mostra = new ExercicioInteger();
		Integer resulte = mostra.multiplicaNumero(2,5);
		Assert.assertEquals(2,resulte,5);
	}
	
	
	@Test
	
	public void divideDoisNumero() {
		ExercicioInteger mostra = new ExercicioInteger();
		Integer resulte = mostra.divideNumero(2,5);
		Assert.assertEquals(2,resulte,5);
	}
	
	@Test
	public void deveRetornarNumero1MenoQueNumero2() {
		ExercicioInteger comparador = new ExercicioInteger();
		Integer resultado = comparador.compara(1, 2); 
		Assert.assertEquals(1, resultado, 2);
	}
	
	@Test
	public void deveRetornarNumero2MenoQueNumero1() {
		ExercicioInteger comparador = new ExercicioInteger();
		Integer resultado = comparador.compara(30, 20); 
		Assert.assertEquals(20, resultado, 30);
	}
		
	
	@Test
	
	public void comparaParOuImpar() {
		ExercicioInteger compara = new ExercicioInteger();
		String resultado = compara.parOuImpar(2);
		Assert.assertEquals("Par",resultado);
	}
	
	
@Test
	
	public void comparaParOuImpar1() {
		ExercicioInteger compara = new ExercicioInteger();
		String resultado = compara.parOuImpar(3);
		Assert.assertEquals("Impar",resultado);
	}
	
			
	@Test
	
	public void imparAteCem() {
		ExercicioInteger compara = new ExercicioInteger();
		Integer resultado = compara.imparCont(3);
		Assert.assertEquals(3,resultado,resultado);
	}
	
	


}
