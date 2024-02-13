package edu.step.conversion;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        CurrencyConverter obj = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti suma EUR");
        double EUR = scanner.nextDouble();
        System.out.print("Introduceti rata de conversie din Eur in Lei ");
        double rataEUR = scanner.nextDouble();
        double ResultEurToLei = obj.convertToEur(EUR, rataEUR);
        System.out.println(EUR + "=" + ResultEurToLei + "Lei");

        System.out.print("Introduceti suma Lei");
        double LEI = scanner.nextDouble();
        System.out.print("Introduceti rata de conversie din Lei in Eur ");
        double rataLEI = scanner.nextDouble();
        double ResultLeiToEur = obj.convertToEur(EUR, rataLEI);
        System.out.println(LEI + "=" + ResultLeiToEur + "Eur");
    }
}
