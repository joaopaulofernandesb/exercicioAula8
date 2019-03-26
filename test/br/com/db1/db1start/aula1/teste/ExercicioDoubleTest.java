package br.com.db1.db1start.aula1.teste;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.aula1.ExercicioDouble;


public class ExercicioDoubleTest {

	@Test
	
	public void menorCompara() {
		ExercicioDouble compara = new ExercicioDouble();
		double resultado = compara.menor(3,2);
		Assert.assertEquals(3,resultado,resultado);
	}
	
	@Test 
	public void menorEntreTresNumeros() {
		
		ExercicioDouble compara = new ExercicioDouble();
		double resultado = compara.menorTres(10.0, 20.0, 30.0);
		Assert.assertEquals(10.0,resultado,10.30);
	}
	
	
	@Test 
	public void mediaDeTresNumero() {
		
		ExercicioDouble compara = new ExercicioDouble();
		double resultado = compara.media(10.0,10.0,120.0);
		Assert.assertEquals(10.0,resultado,120.0);
	}
	
	@Test
	
	public void calculaAreaDeUmTriangula() {
		ExercicioDouble calcula = new ExercicioDouble();
		double result = calcula.calculaArea(20.0,10.0);
		Assert.assertEquals(20.0,result,10.0);
		
	}
	

}
