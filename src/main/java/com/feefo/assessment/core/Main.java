package com.feefo.assessment.core;

public class Main {
    public static void main(String[] args) {
        Normalizer normalizer = new Normalizer();
        String engineer = normalizer.normalize("Java engineer");
        String accountant = normalizer.normalize("Chief Accountant");
        String assurance = normalizer.normalize("Assurance Chief");

        System.out.println("Normalize Java engineer to " + engineer);
        System.out.println("Normalize Chief Accountant to  " + accountant);
        System.out.println("Normalize Chief Accountant to  " + assurance);
    }
}
