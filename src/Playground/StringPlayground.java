package Playground;

public class StringPlayground {
    public static void main(String[] args){
        String address = "Banasree, Dhaka";

        System.out.println(address);
        System.out.println(address.length());
        System.out.println(address.endsWith("Dhaka"));
        System.out.println(address.startsWith("Banasree"));
        System.out.println(address.substring(0, 8));
    }
}
