package br.com.db1.db1start.aula1;

public class ExercicioInteger {
	
	public Integer somaNumero(Integer numero1, Integer numero2) {
		
		Integer resultado;
		
		resultado = numero1 + numero2;
		
		return resultado;
		
	}
	
	public Integer subtrair(Integer a, Integer b) {
		
		return a /b;
		
		
		
	}
	
	public Integer multiplicaNumero(Integer valor1, Integer valor2) {
		
		
		return valor1 * valor2;
		
	}
	
	
	public Integer divideNumero(Integer valor1, Integer valor2) {
		
		
		return valor1 / valor2;
	}
	
		
	
	public Integer compara(Integer num1, Integer num2) {
		
		
		if (num2 < num2) {
			return num1;
		}
		return num2;
	}
	
	public String parOuImpar(Integer numero) {
		
		
		
		
		if(numero%2 == 0 ) {
			
			return  "Par";
			
		}
		
		return "Impar";
		
	}
	
	public Integer imparCont(Integer num) {
		
		Integer contImpar = 0;
		for(Integer i = 1; i <= 100; i++){

 
            if(num % 2 == 1){
                contImpar++;
            }
            
        }
		return contImpar;
	}
	 
	

}
