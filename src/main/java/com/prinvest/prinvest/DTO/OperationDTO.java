package com.prinvest.prinvest.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class OperationDTO {

    private Long id;
    private String coin;
    private BigDecimal entry;
    private BigDecimal entryBTC;
    private BigDecimal entryUSD;
    private BigDecimal exit;
    private BigDecimal exitBTC;
    private BigDecimal exitUSD;
    private BigDecimal profit;
    private BigDecimal btcCost;
    private BigDecimal btcGain;
    private BigDecimal usdGain;
    private Long userId;
    private String userName;
    private OffsetDateTime date;
    private OffsetDateTime created;
    private OffsetDateTime modified;
    private String comment;
}
