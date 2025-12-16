package gui.dev.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericRepositoryImpl<T, ID> implements GenericRepository<T, ID> {

	/*Persistencia com o banco de dados*/
	private Map<ID, T> repository = new HashMap<>();

	@Override
	public void save(ID id, T e) {
		repository.put(id, e);
	}

	@Override
	public T findById(ID id) {
		return repository.get(id);
	}
	
	

}
