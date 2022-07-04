package com.emlakjet.emlakjetbannerservice.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Address extends BaseEntity {
    private String province;
    private String district;
    private String fullAddress;

}
