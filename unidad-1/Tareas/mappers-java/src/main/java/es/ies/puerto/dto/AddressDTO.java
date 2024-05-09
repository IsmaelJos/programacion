package es.ies.puerto.dto;

import es.ies.puerto.model.entity.Customer;

import javax.persistence.*;

public class AddressDTO {

    private Long id;
    private String country;
    private String address;
    private String zipCode;

    private String isla;

    public AddressDTO() {}

    public AddressDTO(Long id) {
        this.id = id;
    }


    public String getIsla() {
        return isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

