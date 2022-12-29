package Telusko_Java_tutorials;

public class MultithreadDemo {
    public static void main(String[] args) {
        new Thread(() -> new MultithreadDemo().show("Hi")).start();
        new Thread(() -> new MultithreadDemo().show("Hello")).start();
    }
    public void show(String str){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(str);
        }
    }
}
class A6 extends Thread{
    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void run() {
       show();
    }
}

class B6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
    }
}
