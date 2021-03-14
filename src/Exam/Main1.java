package Exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-14
 * Time : 22:52
 */
public class Main1 {
    //5.观察者
    public interface Observer{
        void update(String event);
    }

    public class Observable{
        private List<Observer> observers = new ArrayList<>();
        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void nofifyObserver(String event) {
            for (Observer observer : observers) {
                observer.update(event);
            }
        }
    }

    public static void main(String[] args) {

    }

}
//生产者消费者
class Date {
    private static int a = 3;
    public synchronized void  add() throws InterruptedException {
        if(a == 3){
            this.wait();
        }
        a++;
        this.notify();
        System.out.println("生产");
    }
    public synchronized void  sub() throws InterruptedException {
        if(a == 0){
            this.wait();
        }
        a--;
        this.notify();
        System.out.println("消费者");
    }

    public static void main(String[] args) {
        Date date = new Date();
        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                try {
                    date.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"生产").start();
        new Thread(() ->{
            for (int i = 0; i <10 ; i++) {
                try {
                    date.sub();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"消费").start();
    }
}

