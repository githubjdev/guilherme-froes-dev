package gui.dev.abstracao;

public class Zoologico {
	
	
	public void interagirComAnimal(Animal animal) {
		animal.emitirSom();
		animal.dormir();
		animal.comendo();
		animal.dataNascimento();
	}

}
