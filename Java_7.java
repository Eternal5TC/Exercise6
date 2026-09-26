import java.util.Scanner;

class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void prepare() {
        System.out.println("the food is preparing");
    }
    void displayinfo() {
        System.out.println("Food: " + name);
        System.out.printf("Price: %.2f $%n", price);
    }
}

class Pizza extends Food {
    Pizza(String name, double price) {
        super(name, price);
    }
    @Override
    void prepare() {
        System.out.printf("the %s is preparing%n", name);
    }
}

class Burger extends Food {
    Burger(String name, double price) {
        super(name, price);
    }
    @Override
    void prepare() {
        System.out.printf("the %s is preparing%n", name);
    }
}

class Noodle extends Food {
    Noodle(String name, double price) {
        super(name, price);
    }
    @Override
    void prepare() {
        System.out.printf("the %s is preparing%n", name);
    }
}

public class Java_7 {

    static Scanner input = new Scanner(System.in);
    static Food selectedFood;

    static void menu() {

        int choice;

        System.out.println("====== FOOD FOOD is here ======");
        System.out.println("staff: what you would like to eat today?");
        System.out.println(" => 1. Pizza");
        System.out.println(" => 2. Burger");
        System.out.println(" => 3. Noodle");
        System.out.println(" X  0. Cancel");

        System.out.print("Which one sir? : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                selectedFood = new Pizza("Pepperoni Pizza", 8.5);
                break;
            case 2:
                selectedFood = new Burger("Cheese Burger", 6);
                break;
            case 3:
                selectedFood = new Noodle("Fried Noodle", 5);
                break;
            case 0:
                System.out.println("cancel....");
                return;
            default:
                System.out.println("staff: again please sir...");
                return;
        }
        System.out.println();
        selectedFood.displayinfo();
        selectedFood.prepare();
    }

    public static void main(String[] args) {
        menu();
    }
}