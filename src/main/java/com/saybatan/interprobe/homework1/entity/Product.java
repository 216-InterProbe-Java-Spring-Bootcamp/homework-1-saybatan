package com.saybatan.interprobe.homework1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "Product", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private Double price;

    @Column(name = "EXPIRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "product")
    private Set<ProductComment> productComments;
}
