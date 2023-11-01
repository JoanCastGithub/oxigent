package com.oxigent.challenge.products.mapper;


import com.oxigent.challenge.products.domain.TarifEntity;
import com.oxigent.challenge.products.dto.TarifDto;
import com.oxigent.challenge.products.dto.TarifDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Mapper(componentModel="spring")
public interface TarifMapper {

    @Mapping(target = "tarifId", source="tarifId")
    TarifDto mapToTarifDomain(TarifEntity tarif);

    TarifEntity mapToTarifEntity(TarifDto tarifDto);
    @Mapping(target = "brandId", source="brandId.brandId")
    TarifDtoResponse mapToTarifResponse(TarifDto tarifDto);



 }
