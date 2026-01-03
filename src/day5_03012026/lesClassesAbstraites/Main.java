package day5_03012026.lesClassesAbstraites;

public class Main {

	public static void main(String[] args) {
		Animal animals[] = new Animal[4];  // tableau polymorphe : générique
		animals[0] = new Oiseau();
		animals[1] = new Poisson();
		animals[2] = new Serpent();
		animals[3] = new Chien();
		
		for(Animal a : animals)
		{
			a.seDeplacer();
		}
	}

}
