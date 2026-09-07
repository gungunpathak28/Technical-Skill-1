class DataUsage {

    String customerName;
    double totalDataPlan;
    double dataUsed;
    DataUsage(String customerName, double totalDataPlan, double dataUsed) {
        this.customerName = customerName;
        this.totalDataPlan = totalDataPlan;
        this.dataUsed = dataUsed;
    }
    void displayRemainingData() {
        double remainingData = totalDataPlan - dataUsed;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Data Plan : " + totalDataPlan + " GB");
        System.out.println("Data Used : " + dataUsed + " GB");
        System.out.println("Remaining Data : " + remainingData + " GB");
    }
}

public class Telecom_Company {

    public static void main(String[] args) {

        DataUsage customer1 = new DataUsage("Gungun", 50, 18.5);

        customer1.displayRemainingData();
    }
}
