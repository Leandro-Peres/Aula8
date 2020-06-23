package Professores;

public class ProfessorHorista {	
	
	private double quantidadeHora;
	private double valorHora;
	
	public void setHoras(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}
	public double getHoras() {
		return quantidadeHora;
	}
	
	public void setValorHora (double valorHora) {
	this.valorHora = valorHora;
	}
	
	public double getValorHora () {
		return valorHora;
	}
	
	public void calcularPagamento() {
		double pagamento = (quantidadeHora*4)*valorHora;
		System.out.println("Pagamento Horista - R$ "+ pagamento);
		
	}
	
	
}
