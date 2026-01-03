package day5_03012026.chapitre6_Exceptions;

public class Main {

	public static void main(String[] args)  {
		//Animal a = new Animal();
		try {
			Animal.info();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Fin du programme");
	}

}
