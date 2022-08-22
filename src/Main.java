import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{

<<<<<<< HEAD
=======
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
            day++;
            if(beforeZero == afterZero){
                System.out.println("-1");
                return;
            }
            afterZero = beforeZero;
        }
        System.out.println(day);
>>>>>>> e5473c9bfd6c022c0e1557f0de42194a0f87aa0f
    }
}
