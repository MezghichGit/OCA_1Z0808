package day1_06122025;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal("Chat",2);
		
		System.out.println(Animal.MAX_AGE);
		System.out.println(a1.MAX_AGE);
		Animal.getMAX_AGE();

	}

}
