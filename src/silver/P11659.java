package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11659 {
    public static void main(String[] args) throws IOException {
        int n,m;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        temp = bufferedReader.readLine();
        String[] tempArr = temp.split(" ");
        n = Integer.parseInt(tempArr[0]);
        m = Integer.parseInt(tempArr[1]);


        int[] arr = new int[n];
        tempArr = bufferedReader.readLine().split(" ");
        for(int i = 0; i < tempArr.length; i++){
            arr[i] = Integer.parseInt(tempArr[i]);
        }
        int[] sum = new int[n + 1];
        sum[0] = 0;
        for(int i = 1; i <= arr.length; i++){
            sum[i] = sum[i - 1] + arr[i-1];
        }
        for(int a = 0; a < m; a++){
            int i, j;
            tempArr = bufferedReader.readLine().split(" ");
            i = Integer.parseInt(tempArr[0]);
            j = Integer.parseInt(tempArr[1]);
            System.out.println(sum[j] - sum[i-1]);
        }
    }
}
