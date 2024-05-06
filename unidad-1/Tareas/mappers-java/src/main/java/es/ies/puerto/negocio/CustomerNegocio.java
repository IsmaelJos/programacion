package es.ies.puerto.negocio;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.clasic.MapperAddress;
import es.ies.puerto.mapper.clasic.MapperCustomer;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CustomerNegocio {
    public CustomerDTO obtenerCustomer(CustomerDTO customerDTO){

        if (customerDTO == null){
            return null;
        }
        Customer customer = MapperCustomer.customerDtoToCustomerEntity(customerDTO);
        Address address = MapperAddress.customerDtoToAddress(customerDTO);

        CustomerDTO respuesta = MapperCustomer.customerEntityToCustomerDto(customer,address);

        return respuesta;
    }
    public CustomerDTO obtenerCustomer(Long id){
        if (id == null){
            return null;
        }
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO = obtenerCustomer(customerDTO);
        return customerDTO;
    }
}
