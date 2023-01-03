package RoadTravel;

import CarClass.Car;
import Loading.Wait;
import Traffic.Traffic;

import java.util.Scanner;

public class RoadTravel {
    public void Start(Car car){
        Wait time = new Wait();
        Traffic traffic = new Traffic();
        System.out.println("[옵션 선택]");
        System.out.println("1. 도로주행");
        System.out.println("2. 시스템 종료");
        Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input==1){
                time.Wait(200);
                System.out.print(car.getName()+"가 주행을 시작합니다.");
                for(int i=0;i<3;i++)
                {
                    time.Wait(400);
                    System.out.print(".");
                }
                System.out.println();
                traffic.system(car);
            }
            else{
                System.out.println("Traffic 시스템을 종료합니다.");
                return;
        }


    }
}
