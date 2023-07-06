package Practice12;

public class Cat extends Animal {
	
	String name;
	
	public Cat(String name) {
		
		this.name=name;
		//super(name);
		
	}
	
	public void AnimalName() {
		System.out.println("名前は、"+this.name);
		
	}
	
	public void bark () {
		
		System.out.println("ニャーニャー");
	}

}
