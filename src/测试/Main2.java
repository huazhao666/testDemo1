package 测试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-12
 * Time : 21:08
 */
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int  n = sc.nextInt();
            String[] s = new String[n];
            for(int i = 0;i < n;i++){
                s[i] = sc.next();
            }
            String s1 = sc.next();
            String s2 = sc.next();
            int num = 0;
            if(s1.equals(s2)){
                List<Integer> list = new ArrayList<>();
                for(int i = 0;i < s.length;i++){
                    if(s[i].equals(s1)){
                        list.add(i);
                    }
                }
                int min = Integer.MAX_VALUE;
                for (int i = 1; i < list.size(); i++) {
                    min= Math.min(min,list.get(i)-list.get(i-1));
                }
                num = min;
            }else {
                List<Integer> list = new ArrayList<>();
                List<Integer> list1 = new ArrayList<>();
                for(int i = 0;i < s.length;i++){
                    if(s[i].equals(s1)){
                        list.add(i);
                    }
                    if(s[i].equals(s2)){
                        list1.add(i);
                    }
                }
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < list.size(); i++) {
                    for(int j = 0;j < list1.size();j++){
                        int tmp = Math.abs(list.get(i)-list1.get(j));
                        min = Math.min(min,tmp);
                    }
                }
                num = min;
            }
            System.out.println(num);
        }
    }
}
