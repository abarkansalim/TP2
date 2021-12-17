package reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

import introduction.Salle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		
		ResourceBundle  rb = ResourceBundle.getBundle("reflection.param");
		String value = rb.getString("key1");
		Class c = Class.forName(value);
		
		
		//Class salle = Salle.class;
		Field[] fields = c.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f.getName().toString());
		}
		
		Method[] methods = c.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m.toString());
		}
		
		
		Constructor[] consts = c.getDeclaredConstructors();
		for(Constructor cons:consts) {
			System.out.println(cons.toString());
		}
		
		consts[2].setAccessible(true);	
		Object o1 = consts[2].newInstance();
		
		consts[1].setAccessible(true);
		Object o2 = consts[1].newInstance("Salle Informatique");
		
		consts[0].setAccessible(true);
		Object o3 = consts[0].newInstance(2,"Salle des cours");
		
		
		System.out.println(o2.equals(o3));
		
		   
	}

}
