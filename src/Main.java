public class Main {
    public static void main(String[] args) {
        int balance = 600;
        int balancePlus = 1200;
        int finalBalance;


        if (balancePlus > 1000) {
            finalBalance = balancePlus / 100;
        } else {
            finalBalance = 0;
        }

        System.out.println(finalBalance);
        System.out.println(balance + balancePlus + finalBalance);
    }
}

