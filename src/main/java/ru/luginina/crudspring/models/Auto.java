package ru.luginina.crudspring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Auto {
        Integer id;
       // @NotEmpty(message = "name shuld not be empty")
       // @Size(min = 2,max = 50,message = "another name")
        String Name;
       // @NotEmpty(message = "brend shuld not be empty")
        String Brend;
       // @NotEmpty(message = "number shuld not be empty")
        String Number;
       // @NotEmpty(message = "price shuld not be empty")
        Double Price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrend() {
        return Brend;
    }

    public void setBrend(String brend) {
        Brend = brend;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }



    public Auto(Integer id, String name, String brend, String number, Double price) {
        this.id = id;
        this.Name = name;
        this.Brend = brend;
        this.Number = number;
        this.Price = price;
    }
    public Auto() {
        this.id = 0;
        this.Name = "name";
        this.Brend = "brend";
        this.Number = "number";
        this.Price = 0.00;
    }


}
