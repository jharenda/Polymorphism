/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Jennifer
 */
public class Pineapple implements Fruit {

    private String color;
    private String name;
    private boolean inStock;
    private int quantity;

    public Pineapple(String name, String color, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean inStock() {
        if (quantity > 50) {
            inStock = true;
        } else {
            inStock = false;
        }
        return inStock;
    }

    private void orderMore(boolean inStock) {
        if (inStock = false) {
            System.out.println("You need to order more " + name);
        } else {
            System.out.println("You do not need to order any more" + name);
        }
    }

}
