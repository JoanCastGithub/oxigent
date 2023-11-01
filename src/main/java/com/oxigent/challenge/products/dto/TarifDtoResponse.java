package com.oxigent.challenge.products.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TarifDtoResponse {
    @JsonProperty(namespace = "LIST_PRICE")
    private long tarifId;

    @JsonProperty(namespace = "START_DATE")
    private String startDate;

    @JsonProperty(namespace = "END-DATE")
    private String endDate;

    @JsonProperty(namespace = "PRIORITY")
    private byte priority;

    @JsonProperty(namespace = "PRODUCT_ID")
    private String product;

    @JsonProperty(namespace = "PRICE")
    private float price;

    @JsonProperty(namespace = "CURR")
    private String curr;

    @JsonProperty(namespace = "BRAND_ID")
    private String brandId;
}
