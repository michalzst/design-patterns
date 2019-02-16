package pl.sda.creational.builder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Customer customer =new Customer.Builder("Ja","Ja2")
                .livesInCity("Szczecin")
                .livesCountry("PL")
                .bornAt(LocalDate.now())
                .whitPesel("00000000000")
                .workingAs("Lumberjack")
                .build();

        System.out.println(customer);

    }
}
