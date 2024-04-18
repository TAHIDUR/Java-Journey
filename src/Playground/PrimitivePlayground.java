package Playground;

public class PrimitivePlayground {

    public static void main(String[] args) {
        new PrimitivePlayground().byteAdd();
    }

    /**
     * <h1>Playing with byte data type</h1>
     * @return byte <b>Returning the sum of two byte values</b>
     * */
    public byte byteAdd(){
        byte age1 = 1;
        byte age2 = 1;

        // error if not type cast into (byte) age1 + age2
//        byte sum = age1 + age2;
        byte sum = (byte) (age1 + age2);

        return sum;
    }
}
