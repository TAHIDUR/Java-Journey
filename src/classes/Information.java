package classes;

public class Information {
    public String name;
    public String email;
    // constructor method having the same name as the class
    public Information(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void introduction() {
        System.out.println("Hello "+name);
        System.out.println("Email address "+email);
    }
}
