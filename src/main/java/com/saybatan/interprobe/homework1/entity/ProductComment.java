package com.saybatan.interprobe.homework1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_COMMENT")
@Getter
@Setter
public class ProductComment {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "ProductComment", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProductComment", sequenceName = "PRODUCT_COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @ManyToOne(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                optional = false)
    @JoinColumn(name = "PRODUCT_ID",foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT_PRODUCT"),nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false)
    @JoinColumn(name = "USER_ID",foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT_USER"),nullable = false)
    private User user;

}
