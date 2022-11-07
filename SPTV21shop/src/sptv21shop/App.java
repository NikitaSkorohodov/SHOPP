/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptv21shop;
import enyity.Client;

import enyity.Product;
import java.util.Arrays;
import java.util.Scanner;
import managers.ClientManager;
import managers.HistoryManager;
import managers.ProductManager;
import managers.OborotManager;
import enyity.History;
import enyity.Oborot;
/**
 *
 * @author NikitaSkr
 */
public class App {
    private final ProductManager productManager;
    private final ClientManager clientManager;
    private final OborotManager oborotman;
    private Product[] products;
    private Oborot[] oborots;
    private Client[] clients;
    private final HistoryManager historyManager;
    private History[] histories;
    int n = 0;
    int[] arr1 = new int[n];
    
    public App() {
        oborots=new Oborot[0];
        products=new Product[0];
        clients=new Client[0];
        clientManager=new ClientManager();
        histories = new History[0];
        historyManager = new HistoryManager();
        productManager = new ProductManager();
        oborotman= new OborotManager();
    }
    
    @SuppressWarnings("empty-statement")
   public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        
        do{
            System.out.println("Задачи: ");
            System.out.println("1. Закончить программу");
            System.out.println("2. Добавить обувь");
            System.out.println("3. список обуви");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список зарегистрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Оборот магазина за все время работы");
            System.out.println("8. Добавить денег покупателю ");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 1:
                    repeat = false;
                    break;
                case 2:
                    System.out.println("2. Добавить обувь");
                    System.out.print("Введите название обуви: ");
                    String prodName = scanner.nextLine();
                    System.out.print("Введите цену обуви: ");
                    String price= scanner.nextLine();
                    System.out.print("Введите количество пар: ");
                    String quantity= scanner.nextLine();
                    
                    Product product = createProd(prodName,new Integer(quantity), new Integer(price));
                    products= Arrays.copyOf(products, this.products.length+1);
                    products[products.length-1] =product;
                    
                    break;

                case 3:
                    
                    productManager.printListProducts(products);
                    break;
                            
                    
                case 4:
                    
                    addClient(clientManager.createClient());
                    
                    break;
                case 5:
                    System.out.println("5. Список клиентов");
                    for (int i = 0; i < clients.length; i++) {
                        System.out.printf("%d. %s %s. щет: %s%n"
                                ,i+1
                                ,clients[i].getFirstname()
                                ,clients[i].getLastname()
                                ,clients[i].getMony()
                        );
                    }
                    break;
                case 6:
                    System.out.println("Покупка покупателем продукта");
                    addHistory(historyManager.takeOnProduct(products, clients));
                    this.clients= clientManager.changeClient(clients);
                    System.out.println("Покупка покупателем продукта");
                    String summa= scanner.nextLine();
                    Oborot oborot = createOborot(new Integer(summa));
                    oborots= Arrays.copyOf(oborots, this.oborots.length+1);
                    oborots[oborots.length-1] =oborot;

                    
                        
                    
                    break;
                case 7:
                    System.out.println("7. Оборот магазина за все время работы");
                    
                    oborotman.printListOborots(oborots);
                        break;  

                case 8:
                    this.clients= clientManager.changeClient(clients); 
                    
                    break;    
                   
                   
            }}while(repeat);
}
   public Product createProd(String prodName,int quantity, int price){
        Product product = new Product();
        product.setProdName(prodName);
        product.setQuantity(quantity);
        product.setPrice(price);
        return product;
   }
private void addClient(Client client) {
        this.clients = Arrays.copyOf(this.clients, this.clients.length+1);
        
        this.clients[this.clients.length - 1] = client;   
    }
    private void addHistory(History histories) {
        this.histories = Arrays.copyOf(this.histories, this.histories.length+1);
        this.histories[this.histories.length - 1] = histories;   
    }
public Oborot createOborot(int summa){
        Oborot oborot = new Oborot();
        oborot.setSumma(summa);
        return oborot;}
            }
