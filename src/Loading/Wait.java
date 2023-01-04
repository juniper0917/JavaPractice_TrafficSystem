package Loading;

public class Wait {

    public static Wait node = new Wait();
    private Wait(){}

    public static void load(int i) {
        try{
            Thread.sleep(i);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
