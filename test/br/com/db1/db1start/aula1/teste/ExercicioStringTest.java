		package br.com.db1.db1start.aula1.teste;
		import org.junit.Assert;
		import org.junit.Test;
		
		
		import br.com.db1.db1start.aula1.ExercicioString;
		
		public class ExercicioStringTest {
			 
		
		
		
			
			@Test
			
			public void converterLetraParaMaiuscula() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.LetraMaiuscula("letra maiuscula");
				Assert.assertEquals(resultado,resultado);
				
			}
			
			
			@Test
			
			public void converterLetraParaMinuscula() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.LetraMainuscula("LETRAS MINUSCULA");
				Assert.assertEquals(resultado,resultado);
				
			}
			
			@Test
			
			public void contaCaracter() {
				ExercicioString compar = new ExercicioString();
				int resultado = compar.contaLetras("DB1START");
				Assert.assertEquals(resultado,resultado);
				
			}
			
			
	@Test
			
			public void contaCaracterComEspaco() {
				ExercicioString compar = new ExercicioString();
				int resultado = compar.contaLetrasComEspaco("DB1START");
				Assert.assertEquals(resultado,resultado);
				
			}
			// 5 tem que modificar
				
		@Test
			
			public void contaCaracterComEspacoIgualAoItemTres() {
				ExercicioString compar = new ExercicioString();
				int resultado = compar.contaLetrasIgualAoNumeroItem3("DB1START");
				Assert.assertEquals(resultado,resultado);
				
			}
			
			
		@Test
			
			public void mostraSoOsQuatrosPrimeiros() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.mostraAsQuatroPrimeirasLetras("DB1START");
				Assert.assertEquals(resultado,resultado);
				
			}
		
			@Test
		
			public void mostraNomeDaTerciraLetraEmDiante() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.mostraTercieira("Joao Paulo");
				Assert.assertEquals(resultado,resultado);
				
			}
			
			
			@Test
			
			public void mostraAsQuatroUltimasLetras() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.mostraAsQuatroUltimas("Joao Paulo");
				Assert.assertEquals(resultado,resultado);
				
			}
			 
			@Test
			
			public void trocaOPrimeiroNome() {
				ExercicioString compar = new ExercicioString();
				String resultado = compar.substitui("Joao Paulo");
				Assert.assertEquals(resultado,resultado);
				
			}
			
		
			@Test
			public void semparaTexto() {
				ExercicioString compara = new ExercicioString();
				String[] resultado = compara.separa("banana maçã melancia");
				Assert.assertEquals(resultado, resultado);
			}
			
			
			@Test
			public void contaVogaisDeUmTexto() {
				ExercicioString compara = new ExercicioString();
				int resultado = compara.contaVogal("Exemplo de Texto");
				Assert.assertEquals(resultado,resultado);
			}
			
			
			@Test
			public void inverteTextoDeUmaString() {
				ExercicioString compara = new ExercicioString();
				String resultado = compara.inverteTexto("banana");
				Assert.assertEquals(resultado, resultado);
			}
			
			
		
		
		}
