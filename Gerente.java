package classeAbstrata;

public class Gerente extends Funcionario  {

	String usuario;
	String senha;
	
	
	public void calculaBonificacao (double valor) {
		double salario;
		salario = valor*1.1;
		
		System.out.println("Seu nome �: " +nome);
		System.out.println("Sua senha �: " +senha);		
		System.out.println("Seu salario �: " +salario);
		System.out.println("Seu usu�rio �: " +usuario);
		System.out.println("Seu endere�o �: " +endereco);
		
	}
	
	
}
