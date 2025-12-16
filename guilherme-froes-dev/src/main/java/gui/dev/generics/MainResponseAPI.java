package gui.dev.generics;

public class MainResponseAPI {
	
	
	public static void main(String[] args) {
		
      Produto produto = new Produto();
      produto.setNome("teclado");
      produto.setValor(50.00);
      
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Alex");
      pessoa.setIdade(38);
      
      ResponseApi<Produto> respProduto = new ResponseApi<Produto>();
      respProduto.setObjeto(produto);
      respProduto.setMessage("Salvo com sucesso");
      respProduto.setCode(200);
      
      
      ResponseApi<Pessoa> respPessoa = new ResponseApi<Pessoa>();
      respPessoa.setObjeto(pessoa);
      respPessoa.setMessage("atualizado com sucesso");
      respPessoa.setCode(200);
      
      
      System.out.println("Nome Produto: " + respProduto.getObjeto().getNome());
      System.out.println("Valor Produto: " + respProduto.getObjeto().getValor());
      
      System.out.println("=====================================================");
      
      System.out.println("Nome Pessoa: " + respPessoa.getObjeto().getNome());
      System.out.println("Idade Pessoa: " + respPessoa.getObjeto().getIdade());
		
	}

}
