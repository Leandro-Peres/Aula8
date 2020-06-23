package Interface;

public class TesteCasamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homem Julio = new Homem();
		
		Mulher Carla = new Mulher();
		
		Carla.nomePretendente = "Julio";
		Julio.nomePatroa = "Carla";
		
		Julio.casar();
		Carla.casar();
		
		
		
		
		
	}

}
