import java.util.Scanner;

public class Comp {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        // exercicio 1
        System.out.println("Digite seu numero : ");

        int x;
        x = sc.nextInt();

        if(x >= 0 ){
            System.out.println("Nao negativo");
        }else{
            System.out.println("Negativo");
        }

        //exercicio 2
        System.out.println("Digite seu numero : ");

        int y;
        y = sc.nextInt();

        if(y % 2 == 0) {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }


        //exercicio 3
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        if(A % B ==0 || B % A ==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        //exercicio 4
        int h1, h2, duracao;

        h1 = sc.nextInt();
        h2 = sc.nextInt();

        if(h1 < h2){
            duracao = h2 -h1;
        }else {
            duracao = 24 - h1 + h2;
        }

        System.out.println("O jogo durou " + duracao +" Hora(s)");


        //exercicio 5
        int cod, quantidade;
        double CA, xB, Xs, Torr, Refri, preco;

        cod = sc.nextInt();
        quantidade = sc.nextInt();
        CA = 4.0;
        xB = 5.0;
        Xs = 4.5;
        Torr = 2.0;
        Refri = 1.5;

        if(cod == 1){
            preco = quantidade * CA;
            System.out.println("Total :"+preco);
        }else if(cod == 2){
            preco = quantidade * Xs;
            System.out.println("Total :"+preco);
        }else if(cod == 3){
            preco = quantidade * xB;
            System.out.println("Total :"+preco);
        }else if(cod == 4){
            preco = quantidade * Torr;
            System.out.println("Total :"+preco);
        }else{
            preco = quantidade * Refri;
            System.out.println("Total :"+preco);
        }

        //exercicio 6
        double number;
        number = sc.nextDouble();

        if( number >= 0 && number <=25 ){
            System.out.println("Intervalo [0,25]");
        }else if(number > 25 && number <=50){
            System.out.println("Intervalo[25,50]");
        }else if(number > 50 && number <=75){
            System.out.println("Intervalo[50, 75]");
        }else if(number > 75 && number <=100 ){
            System.out.println("Intervalo[75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }











         sc.close();
    }
}
