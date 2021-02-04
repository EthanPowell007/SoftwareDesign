/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign;

/**
 *
 * @author emann
 */
import java.util.Scanner;

public class SoftwareDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Not funny. Didn't laugh.
        
        Scanner input = new Scanner(System.in);
        
        String customerType = null;
        double customer = 0;
        double discount = 0;
        
        System.out.println("Is this customer a premium or regular customer?");
        
        customerType = input.nextLine();
        
        System.out.println("How much is the customer spending?");
        
        customer = input.nextDouble();
        
        switch(customerType){
            case "S":        
                if(customer >=250){
                    System.out.println("A 25% discount has been applied.");
                    discount = 0.75;
                }else if((customer >= 100) & (customer < 250)){
                    System.out.println("A 10% discount has been applied.");
                    discount = 0.9;
                }else{
                    System.out.println("No discount.");
                }
                break;
            case "P":
                if(customer > 250){
                    System.out.println("A 30% discount has been applied.");
                    discount = 0.7;
                }else{
                    System.out.println("A 25% discount has been applied.");
                    discount = 0.75;
                }
                break;
            default:
                throw new IllegalArgumentException("Who are we dealing with? We dunno!");
        }
        
        System.out.println("The customers final total is $" + (customer * discount));
        
    }
    
}
