package com.company;

public class Game extends Apps {
    private Certificate certificate;

    public Game() {
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public Game(Color color, Certificate certificate) {
        super(color);
        this.certificate = certificate;
    }

    final void moving(int distance, String navigation) {
        for (int i = 0; i < distance; i++) {
            System.out.println("He moved: " + (i + 1) + " meter.");
        }
        System.out.println("He turned to " + navigation);
    }

    public void moving(String navigation, int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.println("He moved: " + (i + 1) + " meter.");
        }
        System.out.println("He turned to " + navigation);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCertificate name: " + certificate.getName() + "\nCertificate year: " + certificate.getYear();
    }
}
