package Loading;

public class Loading {
    public void load(String str){
        for(int i=0; i<27; i++)
        {
            try{
                System.out.print(".");
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(str);
    }
}
