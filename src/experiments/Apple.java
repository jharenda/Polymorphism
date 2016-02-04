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
public class Apple implements Fruit {

    private String name = "apple";
    private String color;
    private boolean inStock;
    private int quantity;

    public Apple(String name, String color, int quantity) {
        this.name = name;
        this.quantity = quantity;
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
    public String getColor() {
        if (color.toLowerCase().equals("red")) {
            this.color = "Red- the only valid apple color";
        } else {
            this.color = "gross, green is a terrible apple color";
        }

        return color;
    }

    @Override
    public void setColor(String color) {

        this.color = color;

    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public boolean inStock() {
        if (quantity > 10) {
            inStock = true;
        } else if (quantity > 5) {
            inStock = false;

        }
        return inStock;
    }

    public void orderMore(boolean inStock) {
        if (inStock = false) {
            System.out.println("You need to order more " + name);
        } else {
            System.out.println("You do not need to order any more" + name);
        }
    }

}
