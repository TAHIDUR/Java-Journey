package classes;

import interfaces.Playable;

abstract class AbstructClass implements Playable {
    // No bound to implement all methods of interface
    public boolean canRun() {
        System.out.println("I can run");
        return false;
    }


    public int age;

    AbstructClass() {
        this.age = age;
    }


    // abstract method
    abstract void show();
    
    
    final void display(){
        System.out.println("Abstract class final method");
    }
    
    
    
}
