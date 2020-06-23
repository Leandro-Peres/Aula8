package Professores;

public class TesteProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfessorHorista hor1 = new ProfessorHorista();
		ProfessorAssociado ass1 = new ProfessorAssociado();
		
	//Horista
		hor1.setHoras(8);
		hor1.setValorHora(100);
		
	//associado	
		ass1.setSalario(8000);
		
		hor1.calcularPagamento();
		ass1.calcularPagamento();
		
		
		
	}

}
