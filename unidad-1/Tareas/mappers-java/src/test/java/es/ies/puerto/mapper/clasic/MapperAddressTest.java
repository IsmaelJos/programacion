package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void addressToAddresDTOTest(){
        addressDTOMapper = MapperAddress.addressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMapper.getId());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMapper.getAddress());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMapper.getZipCode());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMapper.getCountry());

    }

    @Test
    public void addressDTOToAddresTest(){
        addressEntityMapper = MapperAddress.addressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(),addressEntityMapper.getId());
        Assertions.assertEquals(addressEntity.getAddress(),addressEntityMapper.getAddress());
        Assertions.assertEquals(addressEntity.getZipCode(),addressEntityMapper.getZipCode());
        Assertions.assertEquals(addressEntity.getCountry(),addressEntityMapper.getCountry());

    }




}
