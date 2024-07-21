package testefatura;

import java.util.Scanner;

public class Fatura {
	
	String numero;
	String descricao;
	int qtdComprada;
	double preco;
	
	public Fatura() {
		
	}
	public void getNumber() {
		System.out.printf("Nº %s", this.numero);
	}
	
	public void setNumber() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o Número do Produto: ");
		this.numero = entrada.nextLine();
	}
	
	public void getDescription() {
		System.out.printf("%s", this.descricao);
	}

	public void setDescription() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a Descrição do Produto: ");
		this.descricao = entrada.nextLine();
	}

	public void getQuantity() {
		System.out.printf(this.qtdComprada <= 1? this.qtdComprada + " Unidade": this.qtdComprada + " Unidades");
	}

	public void setQuantity() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a Quantidade do Produto: ");
		int storage = entrada.nextInt();
		if(storage < 0) {
			this.qtdComprada = 0;
		}else {
			this.qtdComprada = storage;
		}
	}

	public void getPrice() {
		System.out.printf("R$ %.2f", this.preco);
	}

	public void setPrice() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o Preço do Produto: ");
		double storage = entrada.nextDouble();
		if(storage < 0) {
			this.preco = 0.0;
		}else {
			this.preco = storage;
		}
		
	}

	public void totalComprado() {
		System.out.println("Fatura:");
		this.getNumber();
		System.out.println(' ');
		this.getDescription();
		System.out.println();
		System.out.println("---------------------");
		this.getQuantity();
		System.out.println(", ");
		this.getPrice();
	}
	

}
