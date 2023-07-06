package Practice12;

public class Dog extends Animal {
	
   String name; 
	
	public Dog(String name) {
		this.name=name;
		//super(name);
	}
	
	public void AnimalName() {
		System.out.println("名前は、"+this.name);
		
	}
	
	public void bark() {
		System.out.println("ワンワン");
	    
		
	}

}
