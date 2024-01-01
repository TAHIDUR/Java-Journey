import classes.*;
import Tests.Customer;

public class Main {
    public static void main(String[] args) {
//        switchCase();
//
//        // call a static method from a class
//        Messages.welcomeMessage();
//
//        // calling method using object
//        // here Messages() is a default no args constructor
//        Messages messages = new Messages();
//        // set value to a variable in Messages class using object
//        messages.name = "Tuhin";
//
//        messages.welcome();
//
//        variables();
//        loops();
//
//        Information info = new Information("Tuhin", "tahidur.cse@gmail.com");
//        info.introduction();
//
//        Information ageInfo = new Information((short) 28);
//        System.out.println("My age is: "+ageInfo.age);
//
//        System.out.println(Constants.PI);
//        PrimitivePlayground.declaration();

        KeywordPlayGround.start();
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

        System.out.println(empty + age); // ascii of empty string is 32
        System.out.println("My age: " + age + " and shoe size: " + shoeSize);
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
        } else {
            result = "I am not adult";
        }
        return result;
    }

    private static void loops() {
        System.out.println("Tabulation sheet for 8");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x 8 = %d\n", i, i * 8);
        }
    }

    private static void switchCase() {
        Customer customer = new Customer();
        customer.name = "Pinky";
        customer.size = "S";

        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                customer.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                customer.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                customer.size = "L";
                break;
            default:
                customer.size = "X";
                break;
        }

        System.out.println(customer.size);
    }
}