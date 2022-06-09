package prod;

import java.util.Scanner;


class Product{
    int prodID;
    String prodName;
    double price;
    String prodDetails;
    
    public Product(int id,String name, double price,String details){
        prodID = id;
        prodName = name;
        this.price= price;
        prodDetails= details;
    }
}

class Customer{
    int cusID;
    String cusName;
    String cusContact;
    String cusAddrs;
    public Customer(int id, String name, String contact,String address){
        cusID = id;
        cusName = name;
        cusContact = contact;
        cusAddrs = address;
    }
}


public class Prod {

    public static void main(String[] args) {
        Product Cola = new Product(1,"Coca Cola",20,"A bottle of toxic fluid");
        Product Kitkat = new Product(2, "Kitkat", 0, "An out of date kitkat completely free for you.");
        Product Tissue = new Product(3, "Tissue", 25, "A tissue for your sickness");
        
        
        Product[] cart={};
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the shop...\nPress 1 to add products");
            System.out.println("Press 2 to check your cart");
            System.out.println("Press 3 to checkout");
            System.out.println("Press 0 to exit the program.");
            int input = Integer.parseInt(scan.nextLine());  
            
            switch(input){
                case 0: {
                    System.exit(0);
                }
                case 1:{
                    System.out.println("Adding Products");
                    
                    System.out.println("Enter the number of products you want to buy");
                    int size = Integer.parseInt(scan.nextLine());
                    System.out.println("List of the available products");
                    System.out.println("1 for "+Cola.prodName);
                    System.out.println("2 for "+Kitkat.prodName);
                    System.out.println("3 for "+Tissue.prodName);
                    
                    cart = new Product[size];
                    
                    for (int i =0;i<size;i++){
                        int productNo = Integer.parseInt(scan.nextLine());
                        
                        switch(productNo){
                            case 1:{
                                cart[i] = Cola;
                                System.out.println("Cola added to the cart");
                                break;
                            }
                            case 2:{
                                cart[i]=Kitkat;
                                System.out.println("Kitkat added to the cart");
                                break;
                            }
                            case 3:{
                                cart[i]=Tissue;
                                System.out.println("Tissue added to the cart");
                                break;
                            }
                            default:{
                                i--;
                                System.out.println("Invalid input");
                                break;
                            }
                        }
                        
                    }
                    break;
                }
                case 2:{
                    System.out.println("Checking cart");
                    System.out.println("Cart Elements:");
                    System.out.println("______________");
                    for(int i =0;i<cart.length;i++){
                        System.out.println(cart[i].prodName +"\t"+cart[i].price);
                    }
                    break;
                }
                case 3:{
                    System.out.println("Checking Out");
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
    
}
