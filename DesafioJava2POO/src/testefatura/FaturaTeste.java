package testefatura;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura();
		
		fatura.setNumber();
		fatura.setDescription();
		fatura.setQuantity();
		fatura.setPrice();
		fatura.totalComprado();
		
	}

}
