package classes;

public class Information extends AbstructClass {
    public String name;
    public String email;
    public short age;
    // constructor method having the same name as the class
    public Information(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
    public Information(short age) {
        this.age = age;
    }
    public void introduction() {
        System.out.println("Hello "+name);
        System.out.println("Email address: "+email);
    }


    @Override
    public boolean canPlay() {
        return false;
    }

    @Override
    public void play() {
        System.out.println("play from class information");
        super.play();
    }

    @Override
    public void show() {
        System.out.println("Show from abstract method from an abstract class");
    }
}
