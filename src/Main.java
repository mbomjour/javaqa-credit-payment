public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
//        int creditRub = 1_000_000;
//        int periodYear = 1;
//        double creditRate = 9.99;
//        int monthlyPayment = service.calculate(creditRub, periodYear, creditRate);
//
//        System.out.println(monthlyPayment);

        System.out.println("Ежемесячный платеж в течение 1 года:");
        System.out.println(service.calculate(1_000_000, 1, 9.99) + " рублей\n");

        System.out.println("Ежемесячный платеж в течение 2 лет:");
        System.out.println(service.calculate(1_000_000, 2, 9.99) + " рублей\n");

        System.out.println("Ежемесячный платеж в течение 3 лет:");
        System.out.println(service.calculate(1_000_000, 3, 9.99) + " рублей\n");
    }
}
