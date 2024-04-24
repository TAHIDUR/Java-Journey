package Playground;

public class DecimalToBinary {

    // Function converting decimal to binary
    public static int[] decimalToBinary(int num)
    {
        int[] binary = new int[35];
        int id = 0;

        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        return binary;
    }
}
