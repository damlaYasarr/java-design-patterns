package com.iluwatar.facades;

public class Converter {
        
    public String name; 
    public String type; 
    Converter(String _name, String _type){
            this.name=_name;
            this.type=_type;
    }

    public String getName() {
        
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
