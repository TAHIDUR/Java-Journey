package Playground;

/**
 * This class is to play with switch statement
 * @author tahidur <a href="https://github.com/tahidur">github</a>
 * @since 2018
 * @version 0.1
 *
 * */
public class SwitchPlayground {
    public static void main(String[] args) {
        int age = 20;

        System.out.println("-------------break missing execution next case blocks-------------");
        switch (age){
            case 10:
                System.out.println("Age is 10");
                break;
            case 20:
                System.out.println("Age is 20");
            case 30:
                System.out.println("Age is 30");
            case 40:
                System.out.println("Age is 40");
            case 50:
                System.out.println("Age is 50");
            default:
                System.out.println(age);
        }

        System.out.println("-------------switch using byte-------------");

//        byte b = 10;
        byte b = 100;
        switch (b) {
            case 10:
                System.out.println("Age is 10");
                break;
            case 20:
                System.out.println("Age is 20");
                break;
            case 30:
                System.out.println("Age is 30");
                break;
            default:
                System.out.println(b);
        }
    }
}
