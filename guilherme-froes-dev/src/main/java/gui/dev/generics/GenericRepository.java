package gui.dev.generics;

public interface GenericRepository<T, ID> {

	
	  void save(ID id, T e);
	  
	  T findById(ID id);
	  
	
}
