package gui.dev.reflection;

import java.lang.reflect.Field;

public class MainConfig {
	
	public static void main(String[] args) throws Exception {
		
		Config config = new Config();
		
		Field field = Config.class.getDeclaredField("url");
		field.setAccessible(true);
		field.set(config, "jdbc:postgresql://localhost/db");
		
		System.out.println("Ur configurada: " + field.get(config));
		
	}

}
