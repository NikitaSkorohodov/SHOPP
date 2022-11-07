package managers;

import enyity.Oborot;
import enyity.Product;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class OborotManager {
 private final Scanner scanner;
    public OborotManager() {
        scanner = new Scanner(System.in);  
    }
    
   public Oborot[] changeOborot(Oborot[] oborots) {
        int numOborotForEdit = scanner.nextInt(); scanner.nextLine();
    System.out.print("Введите нынешний оборот магазина: ");
            oborots[numOborotForEdit - 1].setSumma(scanner.nextInt());scanner.nextLine();
     return oborots; 
}
 public void printListOborots(Oborot[] oborots){
        for (int i = 0; i < oborots.length; i++) {
            System.out.println(i+1+". "+oborots[i].getSumma());
        }
 
        
}}
