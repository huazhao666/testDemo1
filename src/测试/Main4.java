package 测试;

import java.util.*;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-13
 * Time : 16:39
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }
            for (int i = 0; i < n - k + 1; i++) {
                long[] s = new long[k];
                System.arraycopy(x,i,s,0,k);
                help(s);
            }
        }
    }
        public static void help(long[] array){
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0L)+1);
        }
        long[] index = {Long.MAX_VALUE,Long.MIN_VALUE};
        for(long x : map.keySet()){
            if(map.getOrDefault(x,0L) > index[1]){
                index = new long[]{x,map.getOrDefault(x,0L)};
            }else {
                if(map.getOrDefault(x,0L) == index[1] && x < index[0]){
                    index = new long[]{x,map.getOrDefault(x,0L)};
                }
            }
        }
        System.out.println(index[0]);
    }
}
