package class13_labs;

public class Employee {

    private String eLastName;
    private String eFirstName;
    private int eNumber;

    public Employee(String eLastName, String eFirstName, int eNumber) {
        this.eLastName = eLastName;
        this.eFirstName = eFirstName;
        this.eNumber = eNumber;
    }

    public String geteLastName() {
        return eLastName;
    }

    public void seteLastName(String eLastName) {
        this.eLastName = eLastName;
    }

    public String geteFirstName() {
        return eFirstName;
    }

    public void seteFirstName(String eFirstName) {
        this.eFirstName = eFirstName;
    }

    public int geteNumber() {
        return eNumber;
    }

    public void seteNumber(int eNumber) {
        this.eNumber = eNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + eLastName + ", " + eFirstName 
                + " (eNumber: " + eNumber + ")" + '}';
    }
}