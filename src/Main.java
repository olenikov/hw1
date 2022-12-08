public class Main {
    public static void main(String[] args) {
        int salary = 29000;
        double total = 0;
        int mounth = 0;
        for (int i = 0; i < 12; i++) {
            total = ( total + salary ) * 1.01;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + total + " рублей");
        }

        }
    }
