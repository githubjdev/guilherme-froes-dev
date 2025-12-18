package gui.dev.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainUser {

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("gui.dev.reflection.Usuario");
		Object obj = clazz.getDeclaredConstructor().newInstance();
		Method metodo = clazz.getMethod("getNome");
		metodo.setAccessible(true);
		String nome = (String) metodo.invoke(obj);
		System.out.println("Nome: " + nome);

		for (Field f : clazz.getDeclaredFields()) {
			System.out.println("Field: " + f.getName());
		}

		for (Method f : clazz.getDeclaredMethods()) {
			System.out.println("Método: " + f.getName());
		}

	}

}
