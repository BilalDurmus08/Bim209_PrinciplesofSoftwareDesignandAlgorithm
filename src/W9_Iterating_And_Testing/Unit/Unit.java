package W9_Iterating_And_Testing.Unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {
    private String type;
    private int id;
    private String name;
    private List<Weapon> weapons;
    private Map<Object, Object> properties;

    public Unit (int id){
        this.id = id;
    }

    public void addWeapon (Weapon weapon){
        if (weapons == null){
            weapons = new LinkedList<Weapon>();
        }
        weapons.add(weapon);
    }

    public List<Weapon> getWeapon(Weapon weapon){
        return weapons;
    }

    public void setProperty(String property, Object value){
        if (properties == null){
            properties = new HashMap<>();
        }
        properties.put(property, value);

    }

    public Object getProperty(String property){
        if (properties == null){
            return null;
        }
        return properties.get(property);
    }






    public int setId (int id){
        this.id = id;
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}



