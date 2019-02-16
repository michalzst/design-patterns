package pl.sda.creational.builder;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.time.LocalDate;

public class Customer_PrivateBuilder {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer_PrivateBuilder(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    
    public static class Builder{
        private Customer_PrivateBuilder customer;

        public Builder(String name, String lastname){
            customer=new Customer_PrivateBuilder(name,lastname);
        }

        public Builder bornAt(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder whitPesel(String pesel) {
            Regex regex = new Regex("\\d{11}");
            customer.pesel = pesel;
            return this;
        }

        public Builder workingAs(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder livesInCity(String city) {
            customer.city = city;
            return this;
        }

        public Builder livesCountry(String country) {
            customer.country = country;
            return this;
        }
        
        public Customer_PrivateBuilder build() {
            return customer;
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
