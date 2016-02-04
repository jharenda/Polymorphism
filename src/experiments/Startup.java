/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 * I have a "orderMore method provided in both classes, however since it is not
 * in the Superclass, I cannot accessed it using objects of type fruit. WHich
 * makes complete sense, but just really proves the point that objects typed by
 * there superclass can only act as superclass objects, and not at their own
 * type/both. They really do temporarily lose their identity.
 * Overall, I feel I understand the basics of Polymorphism fairly well. I am currently looking around for 
 * more examples that might be a bit more challenging to me. Will come back to this if I do find/think of more to explore. 
 *  Need to remember that I can use Polymorphism with methods ( pass a method a Fruit parameter which could be of any subclass),
 * and that this is also an example of LSP, which states that subclasses can/should be interchangable with their superclasses. 
 * @author Jennifer
 */
public class Startup {

    public static void main(String[] args) {
        Fruit[] fruits = {new Apple("apple", "red", 50), new Pineapple("pineapple", "yellow", 50)};
        for (Fruit fr : fruits) {
            System.out.println(fr.inStock());

            System.out.println(fr.getColor());
            
        }
    // thought it would be safer to check if my apple really was an apple before downcasting it to an apple
    // doing this so that I can run the orderMore method. 
        if (fruits[0] instanceof Apple) {

            Apple a = (Apple) fruits[0];
            System.out.println("true");
            a.orderMore(true);

        } else {
            System.out.println("false");
        }

    }
}
