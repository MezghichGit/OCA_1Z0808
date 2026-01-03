package day5_03012026.lesInterfaces;

public interface Imprimante {
	public final static int age = 100;
	public void imprimer();
	
	// version 8
	
	public default void infos1() {
		infosPrivate();
		System.out.println("Infos spécifique 1");
	}
	
	public default void infos2() {
		infosPrivate();
		System.out.println("Infos spécifique 2");
	}
	
	public static void infoStatics() {
		System.out.println("Infos");
	}
	
	// Version 10
	
	private void infosPrivate() {
		System.out.println("Infos1");
		System.out.println("Infos2");
	}
	
	private static void infosPrivateStatic() {
		System.out.println("Infos");
	}
}
