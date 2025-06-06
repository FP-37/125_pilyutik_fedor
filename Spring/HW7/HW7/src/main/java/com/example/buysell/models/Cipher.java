package com.example.buysell.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ciphers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cipher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "desc", columnDefinition = "text")
    private String description;

    @Column(name = "creator")
    private String creator;

    @Column(name = "year")
    private int yearCreated;
}