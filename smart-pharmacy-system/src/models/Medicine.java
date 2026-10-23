package models;

//just a test code

public class Medicine{
    String medicieId;
    String medicineName;
    String companyName;

    /*
    String category;
    String batchNumber;
    double unitPrice;
    int size;
    int stockQuantity;
    int expiryDate;   */    //if expiryDate gonna be changing have to import 'import java.time.LocalDate' package.

    public Medicine(String medicieId, String medicineName, String companyName) {
        this.medicieId = medicieId;
        this.medicineName = medicineName;
        this.companyName = companyName;
    }

    public void displayMedicineDetails() {
        System.out.println("Medicine ID: " + medicieId);
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------");
    }
}