package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10828 {
    void solution()throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        int n = Integer.parseInt(a);
        String[] st = new String[10000];
        int cnt = 0;
        String[] temp = new String[n];
        for(int i = 0; i < n; i++){
            temp[i] = bf.readLine();
        }
        for(int i = 0; i < n; i++){
            if(temp[i].length() > 5){
                String[] t = temp[i].split(" ");
                st[cnt] = t[1];
                cnt++;
            }
            else if(temp[i].equals("pop")){
                if(cnt != 0){
                    cnt--;
                    System.out.println(st[cnt]);
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(temp[i].equals("size")){
                System.out.println(cnt);
            }
            else if(temp[i].equals("empty")){
                if(cnt != 0){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }
            else if(temp[i].equals("top")){
                if(cnt != 0){
                    System.out.println(st[cnt-1]);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
