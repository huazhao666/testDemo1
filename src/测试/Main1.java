package 测试;

import java.util.HashMap;
import java.util.Map;

public class Main1{
    /*public static void main(String[] args){
        Cake cake = new Cake();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                try {
                    cake.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"做蛋糕").start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                try {
                    cake.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"吃蛋糕").start();
    }
}
class Cake{
    //蛋糕三个
    private static int number = 3;
    //放蛋糕
    public synchronized void add() throws InterruptedException {
        while (number == 3){
            this.wait();
        }
        number++;
        System.out.println("放蛋糕啦");
        this.notifyAll();
    }
    //吃蛋糕啦
    public synchronized void sub() throws InterruptedException {
        while (number == 0){
            this.wait();
        }
        number--;
        System.out.println("吃蛋糕啦");
        this.notifyAll();
    }*/

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"冲鸭1");
        map.put(2,"冲鸭2");
        map.put(3,"冲鸭3");
        map.put(4,"冲鸭4");
        map.put(5,"冲鸭5");
        map.put(6,"冲鸭6");
        map.put(7,"冲鸭7");
        map.put(8,"冲鸭8");
        map.put(9,"冲鸭9");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
        }


    }
}
