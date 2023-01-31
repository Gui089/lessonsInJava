import java.util.Scanner;

public class exer{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 valores para somar :");
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int result = x + y;

        System.out.println("A soma dos valores : "+ result);


        System.out.println("Digite o valor do raio : ");

        double raio, area, pi;

        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * Math.pow(raio, 2);


        System.out.printf("A area e igual a = %.4f", area);


        int A, B, C, D, Dife;

        System.out.println("Digte quatro valores : ");

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        Dife = (A * B - C * D);
        System.out.println(" A diferença é : " + Dife);

        int number, ht;
        double vp, salary;

        number = sc.nextInt();
        ht = sc.nextInt();
        vp = sc.nextDouble();
        salary = ht * vp;

        System.out.println("O seu numero : " + number);
        System.out.printf("O seu salario : %.2f", salary);


        System.out.println("Digite o codigo da peça 1, o valor unitario 1" +
                ", o codigo da peça 2, o valor unitario 2");

        int cod1, cod2, n1, n2;
        double v1, v2, total;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();
        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        total = (n1 * v1) + (v2 * n2);

        System.out.println("Valor a pagar : " + total);



        double A, B, C, Trian, Cir, Trape, Quad, Reta, pi;

        pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        Trian = (A * C) /2;
        Cir = Math.pow(C, 2) * pi;
        Trape = ((A + B) * C) /2;
        Quad = Math.pow(B, 2);
        Reta = A * B;

        System.out.printf("Triangulo : %.3f %n Circulo : %.3f %n " +
                "Trapezio : %.3f %n Quadrado : %.3f %n Retangulo : %.3f %n",
                Trian, Cir, Trape, Quad, Reta);













    }
}
