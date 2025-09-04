package interfaces;

public interface Playable {
     boolean canPlay();
     boolean canRun();
     default void play(){
        System.out.println("Playing...");
    }
}
