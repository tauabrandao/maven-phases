package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("bala juquinha", 0.12);
		
		System.out.println("Minha bala preferida é a " +produto.getNome() + " e custa " +produto.getPreco());
	}
}
