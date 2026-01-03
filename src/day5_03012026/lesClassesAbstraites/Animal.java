package day5_03012026.lesClassesAbstraites;

public abstract class Animal {
	String espece;
	double poids;
	
	public void manger()
	{
		System.out.println("Je manges");
	}
	public void dormir() 
	{
		System.out.println("Je dors");
	}
	
	public abstract void seDeplacer(); 
	
}
