/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_3;

/**
 *
 * @author admin
 */
class Transport {
    private static int count = 0;
    protected String make;
    protected Date date = new Date (00, 00, 0000);
    
    protected class Date{

        int day;
        int month;
        int year;
        
        private Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    }
    
    Transport (){
        make = "No name";
        date.day = 00;
        date.month = 00;
        date.year = 0000;
        count++;
    }
    
    Transport (String make, int day, int month, int year){
        this.make = make;
        this.date.day = day;
        this.date.month = month;
        this.date.year = year;
        count++;
        
    }
    
    //Setter
    public void setMake(String make){
        this.make = make;
    }
    
    public void setDate (int day, int month, int year){
        this.date.day = day;
        this.date.month = month;
        this.date.year = year;
    }
    
    public static void minusCountOfObject() {
		count--;
	}
    
    
    
    //Getter
    public String getMake (){
        return this.make;
    }
    
    public int getDay(){
        return this.date.day;
    }
    
    public int getMonth(){
        return this.date.month;
    }
    
    public int getYear(){
        return this.date.year;
    }
    public static int getCountOfObject() {
		return count;
	}
    
}
