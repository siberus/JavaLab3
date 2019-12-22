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
class Car extends Transport {
    String type;
    String model;
    
    Car (){
        super();
        this.model = "no model";
        this.type = "no type";
    }
    
    Car (String make, int day, int month, int year, String model, String type){
        super (make, day, month, year);
        this.model = model;
        this.type = type;
        
    }
    
    //Setterы
    public void setModel(String model){
        this.model = model;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    
    
    //Getter
    public String getModel (){
        return this.model;
    }
    
     public String getType (){
        return this.type;
    }
    
    
}
