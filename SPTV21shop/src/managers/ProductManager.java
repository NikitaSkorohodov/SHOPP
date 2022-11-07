/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;
import java.util.Scanner;

import enyity.Product;

/**
 *
 * @author NikitaSkr
 */

public class ProductManager {
 private final Scanner scanner;
    public ProductManager() {
    scanner = new Scanner(System.in);       
    }
    
    public void printListProducts(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(i+1+". "+products[i].getProdName()+". количество "+products[i].getQuantity()+". цена "+"$"+products[i].getPrice());
        }

    }
    public Product[] changeProduct(Product[] products) {
        int numProductForEdit = scanner.nextInt(); scanner.nextLine();
    System.out.print("Введите нынешний оборот магазина: ");
            products[numProductForEdit - 1].setQuantity(scanner.nextInt());scanner.nextLine();
     return products;
        }
}

