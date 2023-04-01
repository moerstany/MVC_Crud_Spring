package ru.luginina.crudspring.AutoDao;

import org.springframework.stereotype.Component;
import ru.luginina.crudspring.models.Auto;

import java.util.ArrayList;
import java.util.List;
@Component
public class AutoDao {
    private static int AvtoCount;
    private List<Auto> autos;

    {
        autos = new ArrayList<>();
        autos.add(new Auto(++AvtoCount, "Tractor", "Men", "v4837sd54", 5000.00));
        autos.add(new Auto(++AvtoCount, "Tractor", "Chery", "v4667sd54", 3000.00));
    }
    public List<Auto> index(){
        return autos;
    }
    public Auto show(int id){
        //найти авто с таким же id  в списке если его нет то вернуть ничто.
        return autos.stream().filter(auto -> auto.getId() == id).findAny().orElse(null);
    }
    public void save(Auto auto){
        auto.setId(++AvtoCount);
        autos.add(auto);
    }
    public void update(int id, Auto updatedAuto){
        Auto autoUpdated=show(id);
        autoUpdated.setName(updatedAuto.getName());
        autoUpdated.setBrend(updatedAuto.getBrend());
        autoUpdated.setNumber(updatedAuto.getNumber());
        autoUpdated.setPrice(updatedAuto.getPrice());
    }
    public void delete(int id){
        autos.removeIf(a->a.getId()==id);
    }
}