package com.oxigent.challenge.products.helper;

import com.oxigent.challenge.products.domain.GroupCompanyEntity;
import com.oxigent.challenge.products.domain.TarifEntity;
import com.oxigent.challenge.products.repository.GroupCompanyRepository;
import com.oxigent.challenge.products.repository.TarifRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoaderHelper implements CommandLineRunner {

    private final GroupCompanyRepository groupCompanyRepository;
    private final TarifRepository tarifRepository;

    public DataLoaderHelper(GroupCompanyRepository groupCompanyRepository, TarifRepository tarifRepository) {
        this.groupCompanyRepository = groupCompanyRepository;
        this.tarifRepository = tarifRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        GroupCompanyEntity companyEntity =GroupCompanyEntity.builder()
                .brand("ZARA")
                .build();
        groupCompanyRepository.save(companyEntity);
        tarifRepository.saveAll(createListTarifEntity(companyEntity));

    }

    private List<TarifEntity> createListTarifEntity(GroupCompanyEntity group){
        List<TarifEntity> tarifEntityList = new ArrayList<>();
        final String PRODUCT_ID= "35455";
        final String CURR= "EUR";

        tarifEntityList.add(createTarifEntity(Timestamp.valueOf("2020-06-14 00:00:00"),Timestamp.valueOf("2020-12-31 23:59:59"),PRODUCT_ID, 0, 35.50f,CURR, group));
        tarifEntityList.add(createTarifEntity(Timestamp.valueOf("2020-06-14 15:00:00"),Timestamp.valueOf("2020-06-14 18:30:00"),PRODUCT_ID, 1, 25.45f,CURR, group));
        tarifEntityList.add(createTarifEntity(Timestamp.valueOf("2020-06-15 00:00:00"),Timestamp.valueOf("2020-06-15 11:00:00"),PRODUCT_ID, 1, 30.50f,CURR, group));
        tarifEntityList.add(createTarifEntity(Timestamp.valueOf("2020-06-15 16:00:00"),Timestamp.valueOf("2020-12-31 23:59:59"),PRODUCT_ID, 1, 38.95f,CURR, group));
        return tarifEntityList;
    }

    private TarifEntity createTarifEntity(
            Timestamp starDate, Timestamp endDate, String productId, int priority, float price, String curr, GroupCompanyEntity group){

        TarifEntity tarif = TarifEntity.builder()
                .startDate(starDate)
                .endDate(endDate)
                .product(productId)
                .price(price)
                .curr(curr)
                .brandId(group)
                .build();
        return tarif;
    }
}
