package Inheritance;
class Product{
    int productId;
    String productName;
    String brand;
    double price;

    Product(int productId,String productName,String brand,double price){
        this.productId=productId;
        this.productName=productName;
        this.brand=brand;
        this.price=price;
    }
    public void displayProductdetails(){
        System.out.println("Product Id: "+productId);
        System.out.println("Product Name: "+productName);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}
class Electronics extends Product{
    int warrantyPeriod;
    int powerconsumption;

    Electronics(int productId,String productName,String brand,double price,int warrantyPeriod,int powerconsumption){
        super(productId,productName,brand,price);
        this.warrantyPeriod=warrantyPeriod;
        this.powerconsumption=powerconsumption;
    }
    public void showWarranty(){
        System.out.println("Warranty Period: "+warrantyPeriod+" months");
        System.out.println("Power Consumption: "+powerconsumption+" watts");
    }
}
class Clothing  extends Product{
    int size;
    String fabricType;
    Clothing(int productId,String productName,String brand,double price,int size,String fabricType){
        super(productId,productName,brand,price);
        this.size=size;
        this.fabricType=fabricType;
    }
    public void showSize(){
        System.out.println("Size of Clothing: "+size);
        System.out.println("Fabric Type: "+fabricType);
    }
}
class Grocery  extends Product{
    int expiryDate;
    int weight;
    Grocery(int productId,String productName,String brand,double price,int weight,int expiryDate){
        super(productId,productName,brand,price);
        this.weight=weight;
        this.expiryDate=expiryDate;
    }
    public void checkExpiry(){
        System.out.println("Weight of Grocery: "+weight+" grams");
        System.out.println("Expiry Date: "+expiryDate);
    }
}

public class AmazonOrderManagementSystem {
    public static void main(String[] args) {
        Electronics E=new Electronics(101,"Smartphone","Samsung",50000,24,15);
        E.displayProductdetails();
        E.showWarranty();
        Clothing C=new Clothing(102,"T-Shirt","Nike",2000,42,"Cotton");
        C.displayProductdetails();
        C.showSize();
        Grocery G=new Grocery(103,"Milk","Amul",50,1000,2024);
        G.displayProductdetails();
        G.checkExpiry();
    }
}
