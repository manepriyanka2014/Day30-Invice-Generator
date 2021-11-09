package bridgelabz.Day30invoice_generator;

public class InvoiceGenerator {
    private static final double MIN_COST_PER_KM = 10.0;
    private static final double COST_PER_TIME = 1;


    public double calculateFare(double distance, int time) {
        return ((distance * MIN_COST_PER_KM) + (time * COST_PER_TIME));
    }
}