import classes.Constants;
import classes.Information;
import classes.Messages;

public class Main {
    public static void main(String[] args) {
        // call a static method from a class
        Messages.welcomeMessage();

        // calling method using object
        // here Messages() is a default no args constructor
        Messages messages = new Messages();
        // set value to a variable in Messages class using object
        messages.name = "Tuhin";

        messages.welcome();

        variables();
        loops();

        Information info = new Information("Tuhin", "tahidur.cse@gmail.com");
        info.introduction();

        Information ageInfo = new Information((short) 28);
        System.out.println("My age is: "+ageInfo.age);

//        Constants constants = new Constants();
//        constants.PI = 3.14;
//        System.out.println(constants.PI);


        System.out.println(Constants.PI);
    }

    private static void variables() {
        // primitive types
        // starts with lowercase
        short age = 10;
        float shoeSize = 9.5f;
        char empty = ' ';

        // non-primitive types
        // starts with uppercase
        String name = "Tuhin";

        System.out.println(empty + age); // ascii of empty string (' ') is 32
        System.out.println("My age: "+age+" and shoe size: "+shoeSize);
        System.out.printf("My age: %d and shoe size: %.2f\n", age, shoeSize);
        System.out.printf("My name is %s\n", name);

        methodWithParameter(age);
    }

    private static void methodWithParameter(short age) {

        String result = methodWithReturn(age);

        System.out.println(result);
    }

    private static String methodWithReturn(short age) {
        String result;

        // conditional statement
        if (age > 18) {
            result = "I am adult";
        } else if (age <= 0) {
            result = "invalid age";
        } else{
            result = "I am not adult";
        }
        return result;
    }

    private static void loops() {
        System.out.println("Tabulation sheet for 8");
        for(int i = 1; i < 11; i++) {
            System.out.printf("%d x 8 = %d\n", i, i*8);
        }
    }
}