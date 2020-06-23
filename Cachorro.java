package classeAbstrataAnimal;

public class Cachorro extends Animal {

       public Cachorro() {
		
		this.nome= "zé";
		this.numeroPatas=4;
		
		System.out.println(nome);
		System.out.println(numeroPatas);
		
	}
	
       @Override
	public void som() {
		System.out.println("Au.. Au.. Au..!!!!");
	}
	
	
	
}
