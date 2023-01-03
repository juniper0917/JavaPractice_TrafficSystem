package CarClass;

import java.util.Scanner;

public class MakeCar {
    public Car release(int index){
        Car[] data = new Car[4];
        data[0] = new Car("포르쉐","승용차",300,50);
        data[1] = new Car("람보르기니","승용차",400,40);
        data[2] = new Car("ev6","SUV",200,20);
        data[3] = new Car("제네시스","승용차",150,10);
        return data[index];
    }
    public Car makeMyCar(){
        String name,carType;
        int maxSpeed,speedPerUnit;
        Scanner in = new Scanner(System.in);
        System.out.println("[____주문제작서____]");
        System.out.print("[차 이름]: ");
        name = in.next();
        System.out.print("[차종]: ");
        carType = in.next();
        System.out.print("[최고속력]: ");
        maxSpeed = in.nextInt();
        System.out.print("[단위 당 속력]: ");
        speedPerUnit = in.nextInt();

        return new Car(name,carType,maxSpeed,speedPerUnit);
    }

}
