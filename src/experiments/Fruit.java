/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 * All fruit objects will have these methods in common, but will implement them
 * differently.
 *
 * @author Jennifer
 */
public interface Fruit {

    public abstract void setColor(String color);

    public abstract void setName(String name);

    public abstract boolean inStock();

    public abstract String getColor();
}
