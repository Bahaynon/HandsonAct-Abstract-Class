import java.util.*;
class RunAnimal{
	public static void main(String[] args){
		Scanner scs = new Scanner(System.in);
		Animal an = new Bird();
		Animal and = new Cat();
		Animal ans = new Dog();
		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String rnmal = scs.nextLine();
		
		if(rnmal.equalsIgnoreCase("B")){
			an.eat();
			an.sleep();
			an.makeSound();
		}
		if(rnmal.equalsIgnoreCase("C")){
			and.eat();
			and.sleep();
			and.makeSound();
		}
		if(rnmal.equalsIgnoreCase("D")){
			ans.eat();
			ans.sleep();
			ans.makeSound();
		}
		else if(rnmal.isEmpty()){
			System.out.print("Please enter a proper input!");
			
		}
		
	}
}