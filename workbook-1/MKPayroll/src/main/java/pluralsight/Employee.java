package pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double hoursWorked;
    private double payRate;
    private String Address;

    public Employee(int id, String name, double hours, double rate, String address) {
        this.employeeId = id;
        this.employeeName = name;
        this.hoursWorked = hours;
        this.payRate = rate;
        this.Address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
//    public Employee(int id, String name, double hours, double rate) {
//        this.employeeId = id;
//        this.employeeName = name;
//        this.hoursWorked = hours;
//        this.payRate = rate;
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public double getHoursWorked() {
//        return hoursWorked;
//    }
//
//    public void setHoursWorked(double hoursWorked) {
//        this.hoursWorked = hoursWorked;
//    }
//
//    public double getPayRate() {
//        return payRate;
//    }
//
//    public void setPayRate(double payRate) {
//        this.payRate = payRate;
//    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }


}
