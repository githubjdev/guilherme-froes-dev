package gui.dev.generics;

public class MainCrud {
	
	public static void main(String[] args) {
		GenericRepository<Produto, Long> repository = new GenericRepositoryImpl<Produto, Long>();
		
		GenericRepository<Pessoa, Long> repositoryPessoa = new GenericRepositoryImpl<Pessoa, Long>();
		
		
		Produto produto = new Produto();
		produto.setNome("Monitor");
		produto.setValor(500.00);
		
		
		repository.save(1L, produto);
		
		
		Produto consulta = repository.findById(1L);
		System.out.println("Produto salvo: " + consulta.getNome());
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex");
        pessoa.setIdade(38);
        repositoryPessoa.save(1L, pessoa);
        
        Pessoa pessoaConsutla = repositoryPessoa.findById(1L);
        System.out.println("Pessoa Salva: " + pessoaConsutla.getNome());
	}

}
