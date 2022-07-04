package com.emlakjet.emlakjetbannerservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Banner extends BaseEntity {
    private int advertNo;
    private String phone;
    private int total;
    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;

}
