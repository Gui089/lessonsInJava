import java.util.Scanner;

public class For {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        // exercico 1
        int x;
        x = sc.nextInt();

        for (int i =1; i <= x; i++){
             if( i % 2!= 0){
                 System.out.println(i);
             }
        }



        //exercico 2

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in +=1;
            }else {
                out+=1;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+ " out");



     sc.close();
    }
}
