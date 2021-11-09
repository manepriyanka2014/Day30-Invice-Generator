package bridgelabz.Day30invoice_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import bridgelabz.Day30invoice_generator.InvoiceGenerator;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceTime_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare= invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);
    }
}