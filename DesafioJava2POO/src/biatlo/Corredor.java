package biatlo;

public interface Corredor{
	

	public default void correr(String nome) {
		System.out.printf("O %s Correu por kilômetros", nome);
	}
	
}
