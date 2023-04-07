package devsUserApp.Reflection.B;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class TestAplicationService {
	public static void main(String[] args) throws Exception {
		
		Class<?> className = Class.forName("com.devsUsersDB.user.reflection.ApplicationService");
		Constructor<?> constructor = className.getDeclaredConstructor();
		System.out.println(constructor);
		
		//crear objeto con el metodo
		constructor.setAccessible(true);
		Object instance = constructor.newInstance();
	//0btener de la clase los metodos
		Method[] methods = className.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
			if (method.getName().endsWith("sayHello")) {
				method.setAccessible(true);
				method.invoke(instance);
			}
			
		}
		
		
	
	}

}
