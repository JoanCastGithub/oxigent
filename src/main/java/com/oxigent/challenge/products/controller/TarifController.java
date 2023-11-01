package com.oxigent.challenge.products.controller;


import com.oxigent.challenge.products.dto.TarifDtoResponse;
import com.oxigent.challenge.products.mapper.TarifMapper;
import com.oxigent.challenge.products.service.impl.TarifServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tarif")
public class TarifController {

    @Autowired
    private TarifServiceImpl tarifServiceImpl;
    @Autowired
    private TarifMapper tarifMapper;
    
    @GetMapping("/brand")
    public TarifDtoResponse getTarifByBrand(@RequestParam(name = "brand") long brandId, @RequestParam(name="product") String product,
                                    @RequestParam(name="application_date") String applicationDate){

        return tarifMapper.mapToTarifResponse(tarifServiceImpl
                .getTarifByBrandAndDate(brandId, product, applicationDate));
    }

}
