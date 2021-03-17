package Exam;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-17
 * Time : 18:58
 */
public class Main2 {
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()){
                String s =  sc.nextLine();
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < s.length() ; i++) {
                    char x = s.charAt(i);
                    if(Character.isDigit(x) || x =='+' || x == '-' || x == '*' || x == '/'){
                        sb.append(x);
                    }
                }
                Stack<Integer> stack = new Stack<>();
                for (int i = 0; i < sb.length() ; i++) {
                    char x = sb.charAt(i);
                    if(x == '*' || x == '/'){
                        stack.push(i);
                    }
                }
                s = sb.toString();
                while (!stack.isEmpty()){
                    int i = stack.pop();

                }



        }
        /*Scanner sc = new Scanner(System.in);
        int X = 10;
        int count = 1;
        while(X > 0){
            X = X - count;
            if(X > 0){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count-1);
        //while (sc.hasNext()){
            int m = 2;
            int n = 2;
           *//* int[][] x = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    x[i][j] = sc.nextInt();
                }
            }*//*
            int[][] x  = {{1,2},{5,6}};
            Stack<int[]> stack = new Stack<>();
            StringBuffer sb = new StringBuffer();
            for(int i = m-1;i >= 0;i--){
                stack.push(new int[]{i,n-1});
            }
            for(int i = n-2;i >= 0;i--){
                stack.push(new int[]{0,i});
            }
            while (!stack.isEmpty()){
                int[] help = stack.pop();
                int a = help[0];
                int b = help[1];
                while (a < m && b >= 0){
                    sb.append(x[a][b]);
                    sb.append(",");
                    a++;
                    b--;
                }
            }
            sb.deleteCharAt(sb.length()-1);
           // System.out.println(sb.toString());
       // }*/

    }
}
