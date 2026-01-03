package day5_03012026.exos;

public interface Vehicule {
	
	public default void info() {}
	
	static void display() {}
	
	void move();
}
