package ru.luginina.crudspring.AvtoDao;

import ru.luginina.crudspring.models.AvtoPark;

import java.util.ArrayList;
import java.util.List;

public class AvtoDao {
    private List<AvtoPark> avtoParks;

    {
        avtoParks = new ArrayList<>();
        avtoParks.add(new AvtoPark(1, "Tractor", "Men", "v4837sd54", 5000.00));
        avtoParks.add(new AvtoPark(2, "Tractor", "Chery", "v4667sd54", 3000.00));
    }
}