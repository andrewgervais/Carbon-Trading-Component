package components.carboncredit;

import java.util.HashMap;
import java.util.Map;

public class CarbonCreditTracker1 implements CarbonCreditTracker {

    private Map<String, Double> emissionSources;
    private double creditsPurchased;
    private double carbonPrice;
    private final double EMISSION_LIMIT = 100.0;

    public CarbonCreditTracker1() {
        this.emissionSources = new HashMap<>();
        this.creditsPurchased = 0.0;
        this.carbonPrice = 50.0;
        // average price per metric ton
        // this value can be manually changed to meet market price

    }

    @Override
    public void addEmissionSource(String source, double amount) {
        emissionSources.put(source, amount);
    }

    @Override
    public void purchaseCredits(double tons) {
        creditsPurchased = creditsPurchased + tons;
    }

}
