package classeAbstrata;

public class testeFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente ger1 = new Gerente();
		
		ger1.nome = "José";
		ger1.salario = 10000;
		ger1.senha ="1234";
		ger1.endereco = "Rua Quatro";
		ger1.usuario = "desni";
		
		ger1.calculaBonificacao(200);
		
		
	}

}
