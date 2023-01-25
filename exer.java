public class exer{
    public static void main(String[] args){

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products :%n %s, which price is $ %.2f %s, which price is $ %.2f %n",
                product1, price1, product2, price2);
        System.out.printf("Record : %d years old, code %d and gender : %s %n",
                age, code, gender);
        System.out.printf("Measue with eight decimal class places: %f %n Rouded(three decimal places): %.3f",
                measure, measure);

    }
}
