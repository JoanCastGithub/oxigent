package com.oxigent.challenge.products.repository;

import com.oxigent.challenge.products.domain.TarifEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository
public interface TarifRepository extends JpaRepository<TarifEntity, Long> {

    @Query(value = "Select * from tarif "
    +"where brand_id=:brand_id and product=:product and start_date>=:application and end_date<=:application", nativeQuery = true)
    Optional<List<TarifEntity>> findTarifByBrandIdAndProductAndStartDateAndEndDate(
            @Param("brand_id") Long brandId,  @Param("product")String product,  @Param("application")Timestamp application);
}
