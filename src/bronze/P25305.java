package bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P25305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-(k)));
    }
}
