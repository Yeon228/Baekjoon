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
        boolean isFull = false;
        while (!isFull){
            int dayCount = 0;
            boolean tempBool = true;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(box[j][i] == 0){
                        tempBool =false;
                        break;
                    }
                }
            }
            isFull = tempBool;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(box[j][i] == 1){
                        try{
                            box[j + 1][i] = 2;
                        }catch (ArrayIndexOutOfBoundsException ex){

                        }
                        try{
                            box[j - 1][i] = 2;
                        }catch (ArrayIndexOutOfBoundsException ex){

                        }
                        try{
                            box[j][i - 1] = 2;
                        }catch (ArrayIndexOutOfBoundsException ex){

                        }
                        try{
                            box[j][j + 1] = 2;
                        }catch (ArrayIndexOutOfBoundsException ex){

                        }
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(box[j][i] == 2){
                        box[j][i] = 1;
                    }
                }
            }
            day++;
        }
        System.out.println(day);
    }
}
