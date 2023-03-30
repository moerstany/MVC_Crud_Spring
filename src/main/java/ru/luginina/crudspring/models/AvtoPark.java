package ru.luginina.crudspring.models;

public class AvtoPark {
        Integer id;
        String Name;
        String Brend;
        String Number;
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



    public AvtoPark(Integer id, String name, String brend, String number, Double price) {
        this.id = id;
        this.Name = name;
        this.Brend = brend;
        this.Number = number;
        this.Price = price;
    }
    public AvtoPark() {
        this.id = 0;
        this.Name = "name";
        this.Brend = "brend";
        this.Number = "number";
        this.Price = 0.00;
    }


}
