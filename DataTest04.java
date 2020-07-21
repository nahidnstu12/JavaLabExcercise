package javaLab;

class Data3{
	int day;
	int month;
	int year;
	
	Data3(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	void setDay(int d){
		day = d;
	}
	int getDay() {
		return day;
	}
	void setMonth(int m){
		month = m;
	}
	int getMonth() {
		return month;
	}
	void setYear(int y){
		year = y;
	}
	int getYear(){
		return year;
	}
	
	void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
}

public class DataTest04 {
	public static void main(String args[]) {
		Data3 ob1 = new Data3(23,11,2018);
		ob1.displayDate();
	}
}
