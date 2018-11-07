/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2practice;

/**
 *
 * @author Adeotun
 */
class Animal{
    public String type;
    public String sound;
    void sound(){
        System.out.println("Animals have different sound");
    }
}

class Goat extends Animal{
    @Override
    void sound(){
        System.out.println("Goat bleat.");
    }
}

class Frog extends Animal{
    @Override
    void sound(){
        super.sound();
        System.out.println("Frogs cloak.");
    }
}

public class Test2practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal();
        a.sound();
        Goat g = new Goat();
        g.sound();
        Frog f = new Frog();
        f.sound();
    }
    
}
