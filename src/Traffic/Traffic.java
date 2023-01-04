package Traffic;

import CarClass.Car;
import Loading.Wait;

import java.util.Scanner;

public class Traffic {
    private String TrafficLight;

    public void system(Car car){
        Scanner sc = new Scanner(System.in);
        Boolean notFirst = false;
        while(true){
            System.out.println("[옵션 선택]");
            System.out.println("1. RED");
            System.out.println("2. GREEN");
            System.out.println("3. 주행종료");
            int lightOption = sc.nextInt();
            if(lightOption==1){
                if(notFirst && getTraffic()!="XOO"){
                    showChangeTraffic();
                    setLight("RED");
                    System.out.println("    "+ getTraffic() + "    ");
                    Wait.load(1000);
                    System.out.println("\n");
                    System.out.println("    "+getTraffic()+"              속력");
                    for(int i=car.getCurSpeed(); i >= 0 ; i-=car.getSpeedPerUnit())
                    {
                        car.setCurSpeed(i);
                        if(i<0){
                            car.setCurSpeed(0);
                        }
                        System.out.println("|    |    |          "+ car.getCurSpeed());
                        Wait.load(200);
                    }
                    continue;
                }
                setLight("RED");
                car.setCurSpeed(0);
                System.out.println("    "+getTraffic()+"             속력");
                System.out.println("|    |    |          "+ car.getCurSpeed());
            } else if (lightOption==2) {
                if(notFirst&& getTraffic()!="OOX"){
                    showChangeTraffic();
                    setLight("GREEN");
                    System.out.println("    "+ getTraffic() + "    ");
                    System.out.println("\n");
                    Wait.load(1000);
                }
                setLight("GREEN");
                System.out.println("    "+getTraffic()+"             속력");
                for(int i=car.getCurSpeed(); i < car.getMaxSpeed()+1; i+=car.getSpeedPerUnit())
                {
                    car.setCurSpeed(i);
                    System.out.println("|    |    |          "+ car.getCurSpeed());
                    Wait.load(1000);
                }
            }

            else{
                System.out.println("주행을 종료합니다.");
                break;
            }
            notFirst = true;
        }
    }

    public void showChangeTraffic(){
        System.out.println("    "+ getTraffic() + "    ");
        Wait.load(1000);
        setLight("YELLOW");
        System.out.println("");
        System.out.println("    "+ getTraffic() + "    ");
        System.out.println("");
        Wait.load(1000);

    }

    public String getTraffic(){
        return TrafficLight;
    }

    public void setLight(String light){
        if(light == "RED"){
            this.TrafficLight = "XOO";
        }
        else if(light == "YELLOW")
        {
            this.TrafficLight = "OXO";
        }
        else if(light == "GREEN")
        {
            this.TrafficLight = "OOX";
        }
    }
}
