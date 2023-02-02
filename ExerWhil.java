import java.util.Scanner;

public class ExerWhil {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int password;
        password = sc.nextInt();

        while (password == 2002){
            System.out.println("Acesso permitido");
            password = sc.nextInt();
        }

        System.out.println("Senha invalida");



        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x >0 && y >0){
                System.out.println("Primeiro");
            }else if( x <0 && y >0){
                System.out.println("Segundo");
            }else if( x > 0 && y < 0){
                System.out.println("Terceiro");
            }else if( x <0 && y <0){
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }





        int al, ga, di,cod;

        al =0;
        ga =0;
        di =0;


        cod = sc.nextInt();

        while( cod != 4){
            if(cod ==1){

                al += 1;

            }else if(cod == 2){

                ga += 1;

            }else if(cod == 3){

                di += 1;

            }

            cod = sc.nextInt();

        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool : "+al);
        System.out.println("Gasolina : "+ga);
        System.out.println("Diesel : "+di);









        sc.close();
    }
}
