package Traffic;

import CarClass.Car;
import Loading.Wait;

import java.util.Scanner;

public class Traffic {
    private String TrafficLight;

    public void system(Car car){
        Scanner sc = new Scanner(System.in);
        Wait time = new Wait();
        Boolean notFirst = false;
        while(true){
            System.out.println("[옵션 선택]");
            System.out.println("1. RED");
            System.out.println("2. GREEN");
            System.out.println("3. 주행종료");
            int lightOption = sc.nextInt();
            if(lightOption==1){
                if(notFirst && getTraffic()!="RED"){
                    System.out.println("    "+ getTraffic() + "    ");
                    time.Wait(1000);
                    setLight("YELLOW");
                    System.out.println("");
                    System.out.println("    "+ getTraffic() + "    ");
                    System.out.println("");
                    time.Wait(1000);
                }
                setLight("RED");
                car.setCurSpeed(0);
                System.out.println("    "+getTraffic()+"             속력");
                System.out.println("|    |    |          "+ car.getCurSpeed());
            } else if (lightOption==2) {
                if(notFirst&& getTraffic()!="GREEN"){
                    System.out.println("    "+ getTraffic() + "    ");
                    time.Wait(1000);
                    setLight("YELLOW");
                    System.out.println("");
                    System.out.println("    "+ getTraffic() + "    ");
                    System.out.println("");
                    time.Wait(1000);
                }
                setLight("GREEN");
                System.out.println("    "+getTraffic()+"             속력");
                for(int i=car.getCurSpeed(); i < car.getMaxSpeed()+1; i+=car.getSpeedPerUnit())
                {
                    car.setCurSpeed(i);
                    System.out.println("|    |    |          "+ car.getCurSpeed());
                    time.Wait(200);
                }
            }
            else{
                System.out.println("주행을 종료합니다.");
                break;
            }
            notFirst = true;
        }
    }

    public String getTraffic(){
        return TrafficLight;
    }

    public void setLight(String light){
        if(light == "RED"){
            this.TrafficLight = "XOO";
        }
        if(light == "YELLOW")
        {
            this.TrafficLight = "OXO";
        }
        if(light == "GREEN")
        {
            this.TrafficLight = "OOX";
        }

    }
}
