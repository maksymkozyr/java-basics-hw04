import java.util.Locale;

public class Employee implements Payable {

  private String name;
  private String employeeId;
  private double averageMonthlySalary;



  public Employee(String employeeId, String name) {
    this.name = name;
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId ;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  public void setAverageMonthlySalary(double averageMonthlySalary) {
    this.averageMonthlySalary = averageMonthlySalary;
  }

  @Override
  public String toString() {
    return String.format(new Locale("en","US"), "name: %s id: %s salary %.2f", name, employeeId, averageMonthlySalary);
  }


  @Override
  public void calculatePay() {

  }
}
