package com.oxigent.challenge.products.service.impl;

import com.oxigent.challenge.products.domain.TarifEntity;
import com.oxigent.challenge.products.dto.TarifDto;
import com.oxigent.challenge.products.mapper.TarifMapper;
import com.oxigent.challenge.products.repository.TarifRepository;
import com.oxigent.challenge.products.service.TarifService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TarifServiceImpl implements TarifService {

    @Autowired
    private TarifRepository tarifRepository;

    @Autowired
    private TarifMapper tarifMapper;

    @Override
    public TarifDto getTarifByBrandAndDate(Long brandId, String product, String applicationDate) {
        Timestamp application = Timestamp.valueOf(applicationDate);
        TarifDto tarifDto = new TarifDto();
        Optional<List<TarifEntity>> listTarif = tarifRepository.findTarifByBrandIdAndProductAndStartDateAndEndDate(
                brandId, product, application);

        if(listTarif.get().isEmpty()){
            return TarifDto.builder().build();
        }
        if (listTarif.get().size()>1){

            Collections.sort(listTarif.get(), Comparator.naturalOrder());
          return tarifDto = tarifMapper.mapToTarifDomain(listTarif.get().get(listTarif.get().size()-1));

        }
        return tarifMapper.mapToTarifDomain(listTarif.get().get(0));


    }
}
