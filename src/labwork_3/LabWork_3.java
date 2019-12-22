/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_3;
 
import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LabWork_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        ArrayList<Transport> transport = new ArrayList<Transport>();
        int mainmenu = 0, submenu1 = 0, submenu2 = 0;    
        
        
        do{
            fMenu(1);
            mainmenu = in.nextInt();
            in.nextLine();
            
            switch(mainmenu) {
                case 1:
                    System.out.println("Выбран первый пункт меню.");
                    do{
                        fMenu(2);
                        submenu1 = in.nextInt();
                        in.nextLine();
                        if (submenu1 > 0 & submenu1 < 5){
                            fMenu(3);
                            submenu2 = in.nextInt();
                            //in.nextLine();
                            if (submenu2 > 0 & submenu2 < 3){
                            inputTransport(transport, submenu1, submenu2);
                            }
                            submenu1 = 0;
                        }
                        else{
                            if (submenu1 != 0){
                                System.out.println("Выбран неверный пункт меню.");
                            }
                        }
                    }while (submenu1 != 0);
                    
                    
                    break;
                    
                case 2:
                    System.out.println("Выбран второй пункт меню.");
                    if(transport.size()== 0) {
			System.out.println("Список объектов пуст!");
                        in.nextLine();
                    }
                    else {
                        System.out.println("Введите индекс удаляемого объекта: ");
                        int removeObjIndex = in.nextInt();	
                        if(removeObjIndex < 1 || removeObjIndex > transport.size()) {
						System.out.println("Введенный вами индекс больше " + transport.size() + "или мешьше 1" );
						break;
					}
					
					transport.remove(removeObjIndex - 1);	
					Transport.minusCountOfObject();
                    }
                        
                    break;
                    
                case 3:
                    System.out.println("Выбран третий пункт меню.");
                    
                        if (transport.size() != 0){
                            outputArrayTransport(transport);
                        }
                        else {
                            System.out.println("Список пуст!");
                        }
                        in.nextLine();
                        
                                          
                    break;
                    
                case 4:
                    System.out.println("Выбран четвертый пункт меню.");
                    if (transport.size() != 0){
                            // Вызов метода сравнения
                        }
                        else {
                            System.out.println("Список пуст!");
                        }
                        in.nextLine();                       
                    break; 
                    
                case 0:
                                           
                    break; 
                    
                default:
                    System.out.println("Выбран не верный пункт меню!");
            } 
        }while (mainmenu != 0);
        System.out.println("Работа программы завершена!");
                
        
      
     
        
        
      
    }
    
    private static void inputTransport (ArrayList<Transport> transport, int classNumber, int constructNumber){
        Scanner in2 = new Scanner(System.in);
        switch (classNumber){
            case 1:
                if (constructNumber == 1){
                    System.out.println("Введите производителя транспортного средства:");
                    String tmpString = in2.nextLine();
                    System.out.println("Введите дату производства транспортного средства (последовательно день, месяц, год):");
                    int tmp1 = in2.nextInt();
                    int tmp2 = in2.nextInt();
                    int tmp3 = in2.nextInt();
                    in2.nextLine();
                    transport.add(new Transport(tmpString, tmp1, tmp2, tmp3));
                }
                else {
                    transport.add(new Transport());
                }
                break;
            case 2:
                if (constructNumber == 1){
                    System.out.println("Введите производителя автомобиля:");
                    String tmpString = in2.nextLine();
                    System.out.println("Введите дату производства автомобиля (последовательно день, месяц, год):");
                    int tmp1 = in2.nextInt();
                    int tmp2 = in2.nextInt();
                    int tmp3 = in2.nextInt();
                    in2.nextLine();
                    System.out.println("Введите модель автомобиля:");
                    String tmpString2 = in2.nextLine();
                    System.out.println("Введите тип автомобиля:");
                    String tmpString3 = in2.nextLine();
                    transport.add(new Car(tmpString, tmp1, tmp2, tmp3,  tmpString2,  tmpString3));
                }
                else {
                    transport.add(new Car());
                }
                break;
            case 3:
                if (constructNumber == 1){
                    System.out.println("Введите производителя поезда:");
                    String tmpString = in2.nextLine();
                    System.out.println("Введите дату производства поезда (последовательно день, месяц, год):");
                    int tmp1 = in2.nextInt();
                    int tmp2 = in2.nextInt();
                    int tmp3 = in2.nextInt();
                    in2.nextLine();
                    System.out.println("Введите длину состава поезда:");
                    int tmp4 = in2.nextInt();
                    in2.nextLine();
                    System.out.println("Введите модель автомобиля:");
                    String tmpString2 = in2.nextLine();
                    transport.add(new Express(tmpString, tmp1, tmp2, tmp3,  tmp4, tmpString2));
                }
                else {
                    transport.add(new Train());
                }
                break;
            case 4:
                if (constructNumber == 1){
                    System.out.println("Введите производителя поезда:");
                    String tmpString = in2.nextLine();
                    System.out.println("Введите дату производства поезда (последовательно день, месяц, год):");
                    int tmp1 = in2.nextInt();
                    int tmp2 = in2.nextInt();
                    int tmp3 = in2.nextInt();
                    in2.nextLine();
                    System.out.println("Введите длину состава поезда:");
                    int tmp4 = in2.nextInt();
                    in2.nextLine();
                    transport.add(new Train(tmpString, tmp1, tmp2, tmp3,  tmp4));
                }
                else {
                    transport.add(new Express());
                }
                break;    
        }
        
        in2.close();
       
    }
    
    private static void fMenu(int choice){
        switch (choice){
            case 1:
                System.out.println("Выберете пункт меню:");
                System.out.println("1. Добавить объект");	
                System.out.println("2. Удалить объект");
                System.out.println("3. Вывести на экран объекты");
                System.out.println("4. Сравнить объекты");
                System.out.println("0. Выход");
                break;
                
            case 2:
                System.out.println("Выберете объект для добавления:");
                System.out.println("1. Добавить транспортное средство.");	
                System.out.println("2. Добавить автомобиль.");
                System.out.println("3. Добавить поезд.");
                System.out.println("4. Добавить экспресс.");
                System.out.println("0. Выход");
                break;
                
            case 3:
                System.out.println("Выберете способ добавления:");
                System.out.println("1. Добавить объект с конкретными значениями.");	
                System.out.println("2. Добавить объект со значениями по умолчанию.");
                System.out.println("0. Выход");
                break;
                                       
        }
            
    } 
    
    private static void outputArrayTransport(ArrayList<Transport> transport){
        for(Object x : transport) {
            if (x instanceof Transport){
                System.out.println("Производитель " + ((Transport) x).getMake());
                System.out.printf("Дата производства %02d.%02d.%04d \n\n",  ((Transport) x).getDay(), ((Transport) x).getMonth(),  ((Transport) x).getYear());
            }
            if (x instanceof Car){
                System.out.println("Производитель " + ((Car) x).getMake());
                System.out.printf("Дата производства %02d.%02d.%04d \n",  ((Car) x).getDay(), ((Car) x).getMonth(),  ((Car) x).getYear());
                System.out.println("Модель " +  ((Car) x).getModel());
                System.out.println("Тип " +  ((Car) x).getType());
                System.out.println();
            }
            if (x instanceof Train){
                System.out.println("Производитель " + ((Train) x).getMake());
                System.out.printf("Дата производства %02d.%02d.%04d \n",  ((Train) x).getDay(), ((Train) x).getMonth(),  ((Train) x).getYear());
                System.out.println("Длина состава " +  ((Train) x).getLength());
                System.out.println();
            }
            if (x instanceof Express){
                System.out.println("Производитель " + ((Express) x).getMake());
                System.out.printf("Дата производства %02d.%02d.%04d \n",  ((Express) x).getDay(), ((Express) x).getMonth(),  ((Express) x).getYear());
                System.out.println("Длина состава " +  ((Express) x).getLength());
                System.out.println("Название экпресса " +  ((Express) x).getName());
                System.out.println();
            }
        }
        

    }
    
}


