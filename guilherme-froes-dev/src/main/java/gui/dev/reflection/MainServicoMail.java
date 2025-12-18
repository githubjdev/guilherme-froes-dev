package gui.dev.reflection;

public class MainServicoMail {

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("gui.dev.reflection.ServicoEmail");
		Object obj = Class.forName("gui.dev.reflection.ServicoEmail").getDeclaredConstructor().newInstance();
		clazz.getMethod("enviar", String.class)
		.invoke(obj,  "teste envio de email");
	}

}
