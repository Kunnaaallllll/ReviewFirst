class Animal{
void makeSound(){
}
}
class Dog extends Animal {
void makeSound() {
System.out.println("Barking");
}
}
class Cat extends Animal {
void makeSound() {
System.out.println("cat sound");
}
}

public class Main{
public static void main(String [] args){
Animal dog=new Dog();
Animal cat=new Cat();
dog.makeSound();
cat.makeSound();
}
}
