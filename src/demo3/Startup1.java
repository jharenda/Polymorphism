package demo3;

public class Startup1 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        for(int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
        
        for(Animal a : animals) {
            a.speak();
        }
    }
    
}
