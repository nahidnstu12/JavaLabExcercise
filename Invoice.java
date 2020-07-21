/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assignment.pkg2;

/**
 *
 * @author Nahid Aslam 12
 */
public class Invoice {
   private String  part_number;
   private String  part_descript;
   private int purchased_item;
   private double price_item;
   
   public Invoice(String n,String d,int p,double pr)
   {
      part_number = n;
      part_descript = d;
      purchased_item = p;
       price_item = pr;
   }
   public Invoice()
   {
       
   }
   
   public void setNumber(String pn)
   {
      part_number = pn; 
   }
   public String getNumber()
   {
       return part_number;
   }
   public void setDescript(String pn)
   {
      part_descript = pn; 
   }
   public String getDescript()
   {
       return part_descript;
   }
   public void setPurchased(int pn)
   {
      purchased_item = pn; 
   }
   public int getPurchased()
   {
       return purchased_item;
   }
   public void setPerItem(double pn)
   {
      price_item = pn; 
   }
   public double getPerItem()
   {
       return price_item;
   }
   public double getInvoice()
   {
       double amount = 0;
       if(purchased_item > 0 && price_item >0)
       {
           amount = getPurchased()*getPerItem();
       }
       else if(purchased_item <= 0 && price_item <=0)
           amount = 0;
       
       return amount;
   }
   public void display()
   {
       System.out.println("A part Number: "+part_number+"\nA part description: "+part_descript);
       System.out.println("Quantity is: "+purchased_item);
       System.out.printf("Total Amount is:%.2f\n",getInvoice());
   }
   
}
class invoiceTest
{
    public static void main(String args[])
  {
    Invoice c1 = new Invoice("001","Computer",5,120.50);
    c1.display();
    Invoice c2 = new Invoice("002","bi-cycle",5,120.75);
    c2.display();
    Invoice c3 = new Invoice("003","bi-cycle",0,120.75);
    c3.display();
    Invoice c4 = new Invoice("004","bi-cycle",10,-200); 
    c4.display();
    Invoice c5 = new Invoice("005","bi-cycle",10,-200); 
    c5.setPerItem(2);
    c5.setPurchased(3);
    c5.display();
    Invoice c6 = new Invoice();
    c6.setNumber("007X");
    c6.setDescript("Hammer");
    c6.setPurchased(12);
    c6.setPerItem(20);
    c6.display();
    
  }
}
