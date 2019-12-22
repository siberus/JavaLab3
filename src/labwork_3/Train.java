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
class Train extends Transport{
    int length;
    
    Train(){
        super();
        this.length = 0;
    }
    
    Train (String make, int day, int month, int year, int length){
        super (make, day, month, year);
        this.length = length;
    }
    
     //Setterы
    public void setLength(int length){
        this.length = length;
    }
    
  
    //Getter
    public int getLength (){
        return this.length;
    }
    
   
}
