package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "descendant")
@DiscriminatorValue("DESCENDANT")
@Getter
@Setter
public class DescendantEntity extends BaseEntity {
    private String surname;
}
