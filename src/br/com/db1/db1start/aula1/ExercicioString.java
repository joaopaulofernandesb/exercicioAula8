package br.com.db1.db1start.aula1;

public class ExercicioString {
	
	
	public String LetraMaiuscula(String letra) {

		return letra = letra.toUpperCase();
		
	}
	
	

	public String LetraMainuscula(String letra) {

		return letra = letra.toLowerCase();
		
	}

	
	public int contaLetras(String nome) {
		
		return nome.length();
	
	}
	
	

	public int contaLetrasComEspaco(String letra) {
		
		return letra.length();
	
	}
	
	
	// 5 tem que modificar
	
	
	public int contaLetrasIgualAoNumeroItem3(String nome) {
		
		return nome.length();
	
	}
	
	
	
	public String  mostraAsQuatroPrimeirasLetras(String letra) {
		
		return letra = letra.substring(0, 4);
	}

	
	public String  mostraTercieira(String letra) {
		
		return letra = letra.substring(3);
	}


	public String mostraAsQuatroUltimas(String letra) {
		
		String nome = letra.substring (letra.length() - 4);
		
		return nome;
	}
	
	public String substitui(String nome) {
		
		nome = nome.replaceAll("Joao", "Aluno");
		
		return nome;
		
	}
	
	public String[] separa(String nome) {
		
		String[] textoSepara;
		
		textoSepara = nome.split("\";|;\\\\s\"");
		return textoSepara;
	}
	
	public int contaVogal(String texto) {
		
		 int contarVogais = 0;
	        texto.toLowerCase();
	        for (int i = 0; i < texto.length(); i++){
	            char c = texto.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
	                contarVogais++;
	        }
	        return contarVogais;
	   
	}

	
	public String inverteTexto(String texto) {
		
		String invertida = new StringBuilder(texto).reverse().toString();
		
		return invertida;
	}
}
