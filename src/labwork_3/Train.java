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
    
   //Переопределение функции Equals

    @Override
    public boolean equals(Object compareObject){
        if (this == compareObject) return true;
        if (compareObject == null) return false;
        if (getClass() != compareObject.getClass()) return false;
        Train object = (Train) compareObject;
        return date.day == object.date.day && date.month == object.date.month && date.year == object.date.year && make.equals(object.make) && length == object.length;

    }
}
