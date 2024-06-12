package lab7.prob3;

public class Marketing {
    private String employeename;
    private String productname;
    private double salesamount;

    public Marketing(String employeename, String productname, double salesamount) {
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public String toString() {
        return employeename + " " + productname + " " + salesamount;
    }

    // g. Override the equals() method inside Marketing.java
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Marketing marketing) {
            return marketing.employeename.equals(employeename) && marketing.productname.equals(productname) && marketing.salesamount == salesamount;
        }
        return false;
    }
}