package com.prinvest.prinvest.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "Operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coin;
    @Digits(integer = 15, fraction = 15)
    private BigDecimal entry;
    @Digits(integer = 15, fraction = 15)
    private BigDecimal entryBTC;
    private BigDecimal entryUSD;
    @Digits(integer = 15, fraction = 15)
    private BigDecimal exit;
    @Digits(integer = 15, fraction = 15)
    private BigDecimal exitBTC;
    private BigDecimal exitUSD;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    private OffsetDateTime date;

    @CreatedDate
    private OffsetDateTime created;

    @LastModifiedDate
    private OffsetDateTime modified;

    private String comment;

}
