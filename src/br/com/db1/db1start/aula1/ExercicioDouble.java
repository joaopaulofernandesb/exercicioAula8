package br.com.db1.db1start.aula1;

public class ExercicioDouble {
	
	public double menor(double numero1, double numero2) {
		if (numero1 < numero2) {
			return numero1;
		}
		return numero2;
	}
	
	
	public double menorTres(double numero1, double numero2 , double numero3) {
		
		
		
		
		if(numero1 < numero2) {
			
	
			return numero1;
			
		}else if( numero1 < numero3) {
			
			return numero1;
			
		}else{
			return numero3;
		}
		
		
}
	
	public double media(double numero1, double numero2, double numero3) {
		
		double soma = numero1+numero2+numero3;
		
		return soma /3 ;
		
		
	}
	
	public double calculaArea(double base, double altura ) {
		
		double resultado = base * altura;
		
		return resultado / 2;
		
	}

}
