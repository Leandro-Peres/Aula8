package Professores;

public class ProfessorAssociado {

	
	private double salario;
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	
	public void calcularPagamento() {
	double pagamento = salario;
	
	System.out.println("Pagamento Associado - R$ " +pagamento);
	System.out.println("Você é um professor Associado e tem salário fixo! ");
	
	
	}		
		
		
}
