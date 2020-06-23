package exemploConstrutores;

public class carro {

	String marca, modelo, cor;
	int ano;
	
	public carro (String marca, String modelo, String cor, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ano: "+this.ano);
		
		
		
		
	}
	
	
}
