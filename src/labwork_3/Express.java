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
class Express extends Train{
    String name;
    
    Express(){
        super();
        this.name = "no name";
    }
    
    Express (String make, int day, int month, int year, int length, String name){
        super (make, day, month, year, length);
        this.name = name;
    }
    
     //Setterы
    public void setName(String name){
        this.name = name;
    }
    
  
    //Getter
    public String getName (){
        return this.name;
    }
}
