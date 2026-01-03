package day5_03012026.chapitre6_Exceptions;

public class CommunExceptions {

	public static void getAge(int age)
	{
		if(age>0) System.out.println("Age valide");
		else
			throw new IllegalArgumentException("Age invalide!");
	}
	
	public static void formatNombre(String nombre)
	{
		double v = Double.parseDouble(nombre);
		
	}
	public static void main(String[] args) {
		//int tab[] = {10,2,8};
		//System.out.println(tab[3]); //ArrayIndexOutOfBoundsException
		//String word = null;
		//System.out.println(word.length()); //NullPointerException
		//Object x = "Java"; // upcasting
		//Integer y = (Integer)x; // downcasting; //ClassCastException
		
		int x = 10;
		int y = 0;
		String nom = null;
		try {
		  System.out.println(nom.length());
		  System.out.println(x/y);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			return;
		}
		
		finally {
		System.out.println("Fin du programme");
		}
		System.out.println("Fin du programme 2");

	}

}
