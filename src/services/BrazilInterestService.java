package services;

public class BrazilInterestService implements InteresetService {

  private double interestRate;

  public BrazilInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }
}
