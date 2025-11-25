package gui.dev.abstracao;

public class TesteAnimal {
	public static void main(String[] args) {
		
		
		Animal cachorro = new Cachorro("Zeus");
		Animal gato = new Gato("Miau");
		
		
		cachorro.emitirSom();
		cachorro.dormir();
		
		System.out.println("--------------------------------------");
		
		gato.emitirSom();
		gato.dormir();
 	}
}
