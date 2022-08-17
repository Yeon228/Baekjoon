package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        String[] arr = temp.split(" ");
        long a,b,v;
        a = Long.parseLong(arr[0]);
        b = Long.parseLong(arr[1]);
        v = Long.parseLong(arr[2]);
        long day = a-b;
        long cnt;

        if(a >= v){
            System.out.println(1);
        }
        else{
            cnt = (v - a) / day;
            if((v - a) % day != 0)cnt++;
            cnt++;
            System.out.println(cnt);
        }
    }
}
