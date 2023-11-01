package com.oxigent.challenge.products.service;

import com.oxigent.challenge.products.dto.TarifDto;

import java.sql.Timestamp;
import java.util.List;

public interface TarifService {
    public TarifDto getTarifByBrandAndDate(Long brandId, String product, String applicationDate);
}
