package gui.dev.abstracao;

public class TesteZoologico {
	
	public static void main(String[] args) {
		
		Animal cAnimal = new Cachorro("Zeus");
		Animal gAnimal = new Gato("Miau");
		Animal gPassro = new Passaro("Pica pau");
		
		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(cAnimal);
		
		System.out.println("--------------------------------------");
		
		zoologico.interagirComAnimal(gAnimal);
		
		System.out.println("--------------------------------------");
		
		zoologico.interagirComAnimal(gPassro);
		
	}

}
