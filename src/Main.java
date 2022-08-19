import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        String[] tempArr = temp.split(" ");
        int m = Integer.parseInt(tempArr[0]);
        int n = Integer.parseInt(tempArr[1]);
        int[][] box = new int[m][n];
        for(int i = 0; i < n; i++){
            temp = br.readLine();
            tempArr = temp.split(" ");
            for(int j = 0; j < m; j++){
                box[j][i] = Integer.parseInt(tempArr[j]);
            }
        }

        int day = 0;
        int afterZero = 0;
        boolean isFull = false;
        while (!isFull){
            int beforeZero = 0;
            boolean tempFull = true;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(box[i][j] == 0){
                        tempFull = false;
                        beforeZero++;
                    }
                    if(box[i][j] == 2){
                        box[i][j] = 1;
                    }
                }
            }
            isFull = tempFull;
            if(isFull){
                System.out.println(day);
                return;
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(box[i][j] == 1){
                        if(i < m - 1 && box[i+1][j] == 0){
                            box[i+1][j] = 2;
                        }
                        if(i > 0 && box[i-1][j] == 0){
                            box[i-1][j] = 2;
                        }
                        if(j < n - 1 && box[i][j+1] == 0){
                            box[i][j+1] = 2;
                        }
                        if(j > 0 && box[i][j-1] == 0){
                            box[i][j-1] = 2;
                        }
                    }
                }
            }
            day++;
            if(beforeZero == afterZero){
                System.out.println("-1");
                return;
            }
            afterZero = beforeZero;
        }
        System.out.println(day);
    }
}
