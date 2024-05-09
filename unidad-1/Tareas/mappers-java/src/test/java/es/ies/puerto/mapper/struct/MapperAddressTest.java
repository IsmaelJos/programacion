package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.mapper.clasic.MapperAddress;
import es.ies.puerto.mapper.clasic.MappersHelp;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void addressToAddresDTOTest(){
        addressDTOMapper = IMapperAddress.INSTANCE.addressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMapper.getId());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMapper.getAddress());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMapper.getZipCode());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMapper.getCountry());
        Assertions.assertEquals(addressDTO.getIsla(),addressDTOMapper.getIsla());
    }

    @Test
    public void addressDTOToAddresTest(){
        addressEntityMapper = IMapperAddress.INSTANCE.addressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(),addressEntityMapper.getId());
        Assertions.assertEquals(addressEntity.getAddress(),addressEntityMapper.getAddress());
        Assertions.assertEquals(addressEntity.getZipCode(),addressEntityMapper.getZipCode());
        Assertions.assertEquals(addressEntity.getProvincia(),addressEntityMapper.getProvincia());

    }




}
