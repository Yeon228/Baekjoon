package silver;

import java.util.Scanner;

public class P1065 {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 100){
            System.out.println(n);
        }
        else if(n == 1000)System.out.println(144);
        else{
            int cnt = 99;
            while (n > 100){
                int first,second,third;
                first = n / 100;
                second = (n / 10) % 10;
                third = n % 10;
                if(first - second == second - third)cnt++;
                n--;
            }
            System.out.println(cnt);
        }
    }
}
