
class SchoolMember{
    String name;

    SchoolMember(String name){
        this.name = name;
    }
    void performDuty(){
        System.out.println(name + " performs a general school duty.");
    }
}
class Student extends SchoolMember{
    Student(String name){
        super(name);
    }
    @Override
    void performDuty(){
        System.out.println(name + " studies and attends classes.");
    }
}
class Teacher extends SchoolMember {

    Teacher(String name) {
        super(name);
    }
    @Override
    void performDuty() {
        System.out.println(name + " teaches students.");
    }
}

class SecurityGuard extends SchoolMember {

    SecurityGuard(String name) {
        super(name);
    }
    @Override
    void performDuty() {
        System.out.println(name + " protects the school. come with gun haaha");
    }
}

public class Java_5 {
    public static void main(String[] args) {
        SchoolMember[] schoolmember = {
            new Student("nana"),
            new Teacher("odete"),
            new SecurityGuard("baymern")
        };
        
        for (SchoolMember sc : schoolmember){
            sc.performDuty();
        }
        
    }
    
}
