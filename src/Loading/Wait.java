package Loading;

public class Wait {
    public void Wait(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
