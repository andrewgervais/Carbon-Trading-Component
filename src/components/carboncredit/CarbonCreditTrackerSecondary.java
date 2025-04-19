package components.carboncredit;

public abstract class CarbonCreditTrackerSecondary
        implements CarbonCreditTracker {
    @Override
    public abstract void addEmissionSource(String source, double amount);

    @Override
    public abstract void purchaseCredits(double tons);

    @Override
    public abstract double calculateNetEmissions();

    @Override
    public abstract void setCarbonPrice(double price);

}
