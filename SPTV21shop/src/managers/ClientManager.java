/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import enyity.Client;
import java.util.Scanner;
;
/**
 *
 * @author NikitaSkr
 */
public class ClientManager {
    
    private final Scanner scanner;
    
    public ClientManager() {
       scanner = new Scanner(System.in);
    }
    
   public Client createClient(){
        System.out.println("4. Добавить клиента");
        Client client = new Client();
        System.out.print("Введите имя клинта: ");
        client.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию клинта: ");
        client.setLastname(scanner.nextLine());
        System.out.print("Введите телефон клинта: ");
        client.setPhone(scanner.nextLine());
        System.out.print("Введите деньги клинта: ");
        client.setMony(scanner.nextInt());
        
        return client;
    }
   public void printListClients(Client[] clients){
        for (int i = 0; i < clients.length; i++) {
            System.out.printf("%d. %s %s. щет: %s%n"
                    ,i+1
                    ,clients[i].getFirstname()
                    ,clients[i].getLastname()                    
                    ,clients[i].getMony()
            );
        }
    }
  
   public Client[] changeClient(Client[] clients) {
        System.out.println("Список клиентов: ");
        this.printListClients(clients);
        System.out.print("Выберите номер клиента: ");
        int numberClient = scanner.nextInt();scanner.nextLine();
        System.out.println("Имя: "+clients[numberClient-1].getFirstname());
        System.out.println(clients[numberClient - 1].getMony()+" нынешний щет клиента");
        System.out.println("Введите деньги клиента: ");
        clients[numberClient - 1].setMony(scanner.nextInt());
      
       
        
        return clients;
}
}
