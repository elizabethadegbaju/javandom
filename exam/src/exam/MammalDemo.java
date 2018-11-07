/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Adeotun
 */

class Mammal{
    String body_cover = "fur";
    int number_of_legs = 4;
    void makeSound(){
        System.out.println("Animals make different sounds");
    }
}
class Sheep extends Mammal{
    @Override
    void makeSound(){
        System.out.println("Sheep bleats");
    }
}
class Human extends Mammal{
    String body_cover = "hair";
    int number_of_legs = 2;
    @Override
    void makeSound(){
        System.out.println("Humans make different sounds such as whistling, talking and drumming");
    }
}

public class MammalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mammal aMammal = new Mammal();
        aMammal.makeSound();
        Sheep aSheep = new Sheep();
        Human aHuman = new Human();
        System.out.println("\nSheep Class");
        System.out.println("Body cover: "+aSheep.body_cover);
        System.out.println("No of legs: "+aSheep.number_of_legs);
        aSheep.makeSound();
        System.out.println("\nHuman Class");
        System.out.println("Body cover: "+aHuman.body_cover);
        System.out.println("No of legs: "+aHuman.number_of_legs);
        aHuman.makeSound();
    }
    
}
