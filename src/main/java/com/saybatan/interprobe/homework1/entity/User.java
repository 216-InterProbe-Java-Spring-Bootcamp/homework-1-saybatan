package com.saybatan.interprobe.homework1.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "Users", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Users", sequenceName = "USERS_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 50, nullable = false)
    private String surname;

    @Email
    @Column(name = "EMAIL",length = 50, nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 15, nullable = false)
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "user")
    private Set<ProductComment> productComments;
}
