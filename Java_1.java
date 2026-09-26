
class Animal{
    void makeSound(){
        System.out.println("The animal make sound");
    }
}
class Dog extends Animal{
    @Override 
    void makeSound(){
        System.out.println("dog says woof ");
    }
}
class Cat extends Animal{
    @Override 
    void makeSound(){
        System.out.println("cat says moew");
    }
}

public class Java_1 {
    public static void main(String[] args){
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

    }
}
