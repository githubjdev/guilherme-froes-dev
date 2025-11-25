package gui.dev.abstracao;

/*Representa o esqueleto de uma arquitetura que representa o contexto de Animal*/
public abstract class Animal {

	protected String nome;

	/* Deverá ser implementado e sobreescrito pela classe concreta */
	public abstract void emitirSom();
	
	public abstract void dataNascimento();

	public Animal(String nome) {
		this.nome = nome;
	}
	

	public void dormir() {
		System.out.println(nome + " animal está dormindo");
	}
	
	public void comendo() {
		System.out.println("animal comendo");
	}

}
