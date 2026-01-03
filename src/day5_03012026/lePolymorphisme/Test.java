package day5_03012026.lePolymorphisme;

public class Test {
	
	public static void display(Animal a)  // méthode polymorphe : générique
	{}

	public static void main(String[] args) {
		
		 display(new Oiseau());
		 display(new Poisson());
		 display(new Animal());
		 
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		 a = o;  // upcasting
		 o = (Oiseau)a; //downcasting

	}

}
