package lab7.prob3;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return employeeName + " " + productName + " " + salesAmount;
    }

    // g. Override the equals() method inside Marketing.java
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Marketing marketing) {
            return marketing.employeeName.equals(employeeName) && marketing.productName.equals(productName) && marketing.salesAmount == salesAmount;
        }
        return false;
    }
}