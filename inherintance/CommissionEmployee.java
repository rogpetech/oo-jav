package inherintance;

public class CommissionEmployee extends Object {
  protected final String firstName;
  protected final String lastName;
  protected final String socialSecurityNumber;
  protected double grossSales;
  protected double commissionRate;

  public CommissionEmployee(String firstName, String lastName, 
                            String socialSecurityNumber, double grossSales,
                            double commissionRate) {
    
    messageArgument(grossSales < 0.0, "Gross sales must be >= 0.0");
    messageArgument(commissionRate <= 0.0 || commissionRate >= 1.0,
                  "Commission rate must be > 0.0 and < 1.0");

    this.firstName = firstName;
    this.lastName = lastName;
    this.commissionRate = commissionRate;
    this.grossSales = grossSales;
    this.socialSecurityNumber = socialSecurityNumber;
  }
  
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setGrossSales(double grossSales) {
    messageArgument(grossSales < 0.0, "Gross sales must be >= 0.0");

    this.grossSales = grossSales;
  }

  public double getGrossSales() {
    return grossSales;
  }

  public void setCommissionRate(double commissionRate) {
    messageArgument(commissionRate <= 0.0 || commissionRate >= 1.0,
                  "Commission rate must be > 0.0 and < 1.0");

    this.commissionRate = commissionRate;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  protected void messageArgument(Boolean rules, String message){
    if(rules) {
      throw new IllegalArgumentException(message);
    }
  }

  public double earnings() {
    return getCommissionRate() * getGrossSales();
  }

  @Override
  public String toString() {
    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                          "commission employee", firstName, lastName,
                          "social security number", socialSecurityNumber,
                          "gross sales", grossSales,
                          "commission rate", commissionRate);
  }
}
