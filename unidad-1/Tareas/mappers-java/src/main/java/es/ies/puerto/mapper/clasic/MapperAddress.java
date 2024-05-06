package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;

public class MapperAddress {

    public static CustomerDTO addtressToCustomerDTO(Address address){
        CustomerDTO customerDTO = null;
        if (address == null){
            return customerDTO;
        }
        customerDTO = new CustomerDTO();
        customerDTO.setId(address.getId());
        customerDTO.setCountry(address.getCountry());
        customerDTO.setAddress(address.getAddress());
        customerDTO.setZipCode(address.getZipCode());
        return customerDTO;
    }
    public static Address customerDtoToAddress(CustomerDTO customerDTO){
        Address address = null;
        if (customerDTO == null){
            return address;
        }
        address = new Address();
        address.setId(customerDTO.getId());
        address.setCountry(customerDTO.getCountry());
        address.setAddress(customerDTO.getAddress());
        address.setZipCode(customerDTO.getZipCode());
        return address;
    }
}
