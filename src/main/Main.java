package main;

import CarClass.Car;
import CarClass.MakeCar;
import Loading.Loading;
import RoadTravel.RoadTravel;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        System.out.println("--------Start Traffic System--------");
        System.out.println("--------    차를 선택하세요.    --------");
        System.out.println("--------   1. 포르쉐          --------");
        System.out.println("--------   2. 람보르기니       --------");
        System.out.println("--------   3. ev6           --------");
        System.out.println("--------   4. 제네시스        --------");
        System.out.println("--------   5. 나만의 차 만들기  --------");

        Scanner whatCar = new Scanner(System.in);
        int index = whatCar.nextInt();
        System.out.println(index+"번을 선택하셨습니다.");
        MakeCar newCar = new MakeCar();
        RoadTravel newRoad = new RoadTravel();
        Loading loader = new Loading();
        if(index != 5){
            loader.load(" 출고 완료!");
            Car releasedCar =newCar.release(index);
            newRoad.Start(releasedCar);
        }
        else {
            Car makedCar = newCar.makeMyCar();
            loader.load(" 제작 완료!");
            newRoad.Start(makedCar);
        }
    }
}


