public class CreditPaymentService {
    public int calculate(int creditRub, int periodYear, double creditRate) {
        double monthlyRate = creditRate / 12 / 100;
        int periodMonth = periodYear * 12;
        double coefficient = (monthlyRate * Math.pow((1 + monthlyRate), periodMonth)) / (Math.pow((1 + monthlyRate), periodMonth) - 1);
        double result = coefficient * creditRub;
        return (int) result;
    }
}
