package com.oxigent.challenge.products.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tarif")
public class TarifEntity implements  Comparable<TarifEntity> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tarif_id")
    private long tarifId;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;

    private int priority;

    @Column(name = "product")
    private String product;

    private float price;

    private String curr;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id" , nullable = false)
    private GroupCompanyEntity brandId;

    @Override
    public int compareTo(TarifEntity o) {
        if(this.getPriority()>o.getPriority()){
            return 1;
        }else if(this.getPriority()<o.getPriority()){
            return -1;
        }else{
            return 0;
        }

    }
}
