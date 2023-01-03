package CarClass;

public class Car {
    private String name;
    private String carType;
    private int maxSpeed;
    private int curSpeed;
    private int speedPerUnit;

    Car(String name, String carType, int maxSpeed,int speedPerUnit){
        this.name = name;
        this.carType = carType;
        this.maxSpeed = maxSpeed;
        this.curSpeed = 0;
        this.speedPerUnit = speedPerUnit;
    }

    public String getName(){
        return name;
    }
    public String getCarType(){
        return carType;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int getCurSpeed(){
        return curSpeed;
    }
    public int getSpeedPerUnit(){
        return speedPerUnit;
    }
    public void setCurSpeed(int curSpeed){
        this.curSpeed = curSpeed;
    }
}
