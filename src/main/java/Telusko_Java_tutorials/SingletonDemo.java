package Telusko_Java_tutorials;

public class SingletonDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                ABC9 obj=ABC9.getInstance();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                ABC9 obj=ABC9.getInstance();
            }
        });
        t1.start();
        //try{Thread.sleep(10);}catch (Exception e){}
        t2.start();


    }
}
class ABC9{
    static ABC9 obj;
    private ABC9(){
        System.out.println("Instnce Created");
    }
    public static ABC9 getInstance(){
        if(obj==null) {
            synchronized (ABC9.class){
                if(obj==null)
                  obj = new ABC9();
            }
        }
        return obj;
    }

}
