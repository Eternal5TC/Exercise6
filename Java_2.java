
class Employees{
    String name;

    Employees(String name){
        this.name = name;
    }

    void work(){
        System.out.println("employees is working");
    }
}

class Developer extends Employees{
    Developer(String name){
        super(name);
    }

    @Override
    void work(){
        System.out.println(" the employee is writing code.");
    }
}
class Designer extends Employees{
    Designer(String name){
        super(name);
    }

    @Override
    void work(){
        System.out.println(" the employee is designing a screen layout.");
    }
}

public class Java_2 {
    public static void main (String[] args){
        Employees employee1 = new Developer("Dara");
        Employees employee2 = new Designer("Sokha");

        employee1.work();
        employee2.work();

    }
    
}
