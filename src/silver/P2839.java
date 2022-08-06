package silver;

import java.util.Scanner;

public class P2839 {
    public static void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int outCnt = 0;
        while(temp <= n){
            int innerCnt = outCnt;
            int innerTemp = temp;
            while(innerTemp <= n){
                innerTemp += 5;
                innerCnt++;
                if(innerTemp == n){
                    System.out.println(innerCnt);
                    return;
                }
            }
            temp += 3;
            outCnt++;
            if(temp == n){
                System.out.println(outCnt);
                return;
            }
        }
        System.out.println(-1);
    }
}
