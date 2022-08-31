package silver;

import java.util.Scanner;

public class P1049{
    public void solution(){
        class Brand {
            private int one,set;

            public int getOne() {
                return one;
            }

            public void setOne(int one) {
                this.one = one;
            }

            public int getSet() {
                return set;
            }

            public void setSet(int set) {
                this.set = set;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Brand[] brands = new Brand[m];
        for(int i = 0; i < m; i++){
            brands[i] = new Brand();
        }
        for(int i = 0; i < m; i++){
            brands[i].setSet(sc.nextInt());
            brands[i].setOne(sc.nextInt());
        }
        int minSet = brands[0].getSet();
        int minOne = brands[0].getOne();
        for(int i = 1; i < m; i++){
            minSet = Math.min(minSet, brands[i].getSet());
            minOne = Math.min(minOne, brands[i].getOne());
        }

        if(minOne * 6 < minSet){
            System.out.println(minOne * n);
        }
        else{
            if(n >= 6){
                int one;
                int two;
                one = minSet * (n / 6) + minOne * (n % 6);
                two = minSet * ((n / 6) + 1);
                System.out.println(Math.min(one,two));
            }
            else{
                System.out.println(Math.min(minOne * n, minSet));
            }
        }
    }
}
