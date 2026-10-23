package main;

import models.Medicine;

public class Main {
    public static void main (String[] args) {
        Medicine m1 = new Medicine("DE1234","panadol","ABC company");
        m1.displayMedicineDetails();
    }
}