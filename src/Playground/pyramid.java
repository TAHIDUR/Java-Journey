package Playground;

public class pyramid {
    public static void main(String[] args){
        for(int i=2; i<6; i++){
            for (int j=1; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=5; i>1; i--){
            for (int j=1; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
