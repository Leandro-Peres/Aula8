package classeAbstrata;

public class Gerente extends Funcionario  {

	String usuario;
	String senha;
	
	
	public void calculaBonificacao (double valor) {
		double salario;
		salario = valor*1.1;
		
		System.out.println("Seu nome é: " +nome);
		System.out.println("Sua senha é: " +senha);		
		System.out.println("Seu salario é: " +salario);
		System.out.println("Seu usuário é: " +usuario);
		System.out.println("Seu endereço é: " +endereco);
		
	}
	
	
}
