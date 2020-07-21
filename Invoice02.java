package javaLab;

class Data{
	String p_number;
	String p_description;
	int quantity;
	double itemPrice;
	
	Data(String num, String des, int qan, double pri){
		p_number = num;
		p_description = des;
		if(qan<0)
			quantity = 0;
		else
			quantity = qan;
		if(pri<0)
			itemPrice = 0;
		else
			itemPrice = pri;
	}
	
	void setIdNumber(String x){
		p_number = x;
	}
	String getIdNumber(){
		return p_number;
	}
	void setProDescription(String x){
		p_description = x;
	}
	String getProDescription(){
		return p_description;
	}
	void setQuantity(int x){
		if(x<0)
			quantity = 0;
		else
			quantity = x;
	}
	int getQuantity(){
		return quantity;
	}
	void setItemPrice(double x){
		if(x<0)
			itemPrice = 0;
		else
			itemPrice = x;
	}
	double getItemPrice() {
		return itemPrice;
	}
	
	double getInvoiceAmount() {
		return quantity*itemPrice;
	}
}
public class Invoice02 {
	public static void main(String args []) {
		Data ob1 = new Data("Forhad","Soshi'r Jamai", -12, -13.33);
		ob1.setIdNumber("Nahid");
		ob1.setProDescription("Tayeba'r jamai");
		ob1.setQuantity(3);
		ob1.setItemPrice(17);
		
		System.out.println(ob1.getInvoiceAmount());
		
		System.out.println(ob1.getIdNumber());
		System.out.println(ob1.getProDescription());
		System.out.println(ob1.getQuantity());
		System.out.println(ob1.getItemPrice());
	}
}
