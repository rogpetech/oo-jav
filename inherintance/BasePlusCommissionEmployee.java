package inherintance;

public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(String firstName, String lastName,
                                    String socialSecurityNumber, double grossSales,
                                    double commissionRate, double baseSalary) {
    
    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

    ruleBaseSalaryArguments(baseSalary);
  }

  public void setBaseSalary(double baseSalary) {
    ruleBaseSalaryArguments(baseSalary);
  }

  public double getBaseSalary () {
    return baseSalary;
  }
  
  private void ruleBaseSalaryArguments(double baseSalary) {
    if (baseSalary < 0.0) {
      throw new IllegalArgumentException("Base salary must be >= 0.0");
    }

    this.baseSalary = baseSalary;
  }

  @Override
  public double earnings() {
    return baseSalary + (commissionRate * grossSales);
  }

  @Override
  public String toString() {
    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
    "commission employee", firstName, lastName,
    "social security number", socialSecurityNumber,
    "gross sales", grossSales,
    "commission rate", commissionRate,
    "base salary", baseSalary);
  }
}
