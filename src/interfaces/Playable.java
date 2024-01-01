package interfaces;

public interface Playable {
     boolean canPlay();
    default void play(){
        System.out.println("Playing...");
    }
}
