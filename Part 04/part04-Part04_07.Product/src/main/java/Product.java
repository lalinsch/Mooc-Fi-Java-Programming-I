/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laloschjetnan
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String itemName, double itemPrice, int itemQuantity){
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = itemQuantity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
    
}
