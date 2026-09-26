
class Vehicle{
    void move(){
        System.out.println("the vehicle is can't be moved..lol");
    }
}

class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("the car is moveing");
    }
}
class Boat extends Vehicle{
    @Override
    void move(){
        System.out.println("the boat is floating");
    }
}
class Airplane extends Vehicle{
    @Override
    void move(){
        System.out.println("the airplane is flying");
    }
}

public class Java_3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(), 
            new Boat(), 
            new Airplane()
        };

        for (Vehicle v : vehicles){
            v.move();
        }
    }
    
}
