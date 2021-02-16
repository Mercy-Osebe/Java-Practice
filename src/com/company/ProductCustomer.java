package com.company;
class Product{
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public String getItemNo() {
        return itemNo;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int p) {
        if(price>0)
      price=p;
        else
            price=20;
    }

    public void setQuantity(int q) {
        if(quantity>0)
        quantity=q;
        else
            quantity=0;
    }
    public Product(String item,String namee){
        price=0;
        quantity=0;
    }
    public Product(String item,String namee,int p,int q){
        itemNo=item;
        name=namee;
        price=p;
        quantity=q;
    }
    public double total(){
        return getPrice()*getQuantity();
    }


}
class Customer{
    private String custId;
    private String name;
    private String address;
    private String phoneNo;

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
         address=a;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String p) {
        phoneNo = p;
    }

    public Customer(String c, String n, String a, String p){
        custId=c;name=n;address=a;phoneNo=p;
    }
}


public class ProductCustomer {
    public static void main(String[] args) {
        Product p=new Product("r3427","BlueBand",0,4);
        p.setPrice(12);
        p.setQuantity(4);

        Customer cu=new Customer("312649f","Mercy","Roysambu","+254711174275");
        cu.setAddress("K.West");
        cu.setPhoneNo("+254110068171");
        System.out.println("This customer is called "+cu.getName()+"\nShe lives in "+cu.getAddress());
        System.out.println("Her ID is: "+cu.getCustId()+" reach her through "+cu.getPhoneNo());
        System.out.println("She bought:\n"+p.getName()+"\n"+"of ItemNo:"+p.getItemNo()+"\n@ "+p.getPrice());
        System.out.println("and quantity being: "+p.getQuantity()+"\nThe total is: "+p.total());
    }
}
