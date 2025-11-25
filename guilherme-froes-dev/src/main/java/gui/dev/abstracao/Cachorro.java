package gui.dev.abstracao;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("au au");
	}
	
	
	@Override
	public void dormir() {
		System.out.println("cachorro está dormindo na cazinha");
	}

	@Override
	public void dataNascimento() {
		// TODO Auto-generated method stub
		
	}
	

}
