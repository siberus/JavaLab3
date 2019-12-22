/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_3;
 
import java.util.Scanner;

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
       
        String tmpString;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите производителя транспортного средства:");
        tmpString = in.nextLine();
        System.out.println("Введите дату производства транспортного средства (последовательно день, месяц, год):");
        int tmp1 = in.nextInt();
        int tmp2 = in.nextInt();
        int tmp3 = in.nextInt();
        in.nextLine();
        Transport vehicle_1 = new Transport(tmpString, tmp1, tmp2, tmp3);
        System.out.println("Данные транспорта " + Transport.getCountOfObject() + ":");
        System.out.println("Производитель " + vehicle_1.getMake());
        System.out.printf("Дата производства %02d.%02d.%04d \n",  vehicle_1.getDay(), vehicle_1.getMonth(),  vehicle_1.getYear());
        
        System.out.println("Введите производителя автомобиля:");
        tmpString = in.nextLine();
        System.out.println("Введите дату производства транспортного средства (последовательно день, месяц, год):");
        tmp1 = in.nextInt();
        tmp2 = in.nextInt();
        tmp3 = in.nextInt();
        in.nextLine();
        System.out.println("Введите модель автомобиля:");
        String tmpString2 = in.nextLine();
        System.out.println("Введите тип автомобиля:");
        String tmpString3 = in.nextLine();
        Car car_1 = new Car(tmpString, tmp1, tmp2, tmp3, tmpString2, tmpString3);
        System.out.println("Данные транспорта " + Transport.getCountOfObject() + ":");
        System.out.println("Производитель " + car_1.getMake());
        System.out.printf("Дата производства %02d.%02d.%04d \n",  car_1.getDay(), car_1.getMonth(),  car_1.getYear());
        System.out.println("Модель " + car_1.getModel());
        System.out.println("Тип " + car_1.getType());
        in.close();
    }
    
}


