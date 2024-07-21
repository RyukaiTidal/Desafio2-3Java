package biatlo;

public interface Ciclista{

	public default void Pedalar(String Atleta) {
		System.out.printf("O atleta %s Pedalou por Quilômetros!",Atleta);
	}
	
}
