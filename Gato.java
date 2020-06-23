package classeAbstrataAnimal;

public class Gato extends Animal{

	public Gato() {
		
		this.nome= "Ozzi";
		this.numeroPatas=4;
		
		System.out.println(nome);
		System.out.println(numeroPatas);
		
		
	}
	
	@Override
	public void som() {
		System.out.println("Miauuuuuu.... Miau.....!!!!");
	}
	
	
	
}
