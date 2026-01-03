package day5_03012026.chapitre6_Exceptions;

public class Animal {
	
	public static void info()throws Exception{ // pour déclarer une exception
		System.out.println("Hello World");
		throw new Exception("Test");  // déclencher une exception
	}

}
