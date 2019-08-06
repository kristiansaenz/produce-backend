package com.saenz.produce;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Farmers")
public class Farmer {
    @Id
    private String id;
    private String name;
    private String email;
    private Address address;
    private Booth booth;

    public Farmer(String name, String email, Address address, Booth booth){
        this.name = name;
        this.email = email;
        this.address = address;
        this.booth = booth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Booth getBooth() {
        return booth;
    }

    public void setBooth(Booth booth) {
        this.booth = booth;
    }

}
