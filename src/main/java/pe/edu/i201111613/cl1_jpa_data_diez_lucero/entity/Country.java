package pe.edu.i201111613.cl1_jpa_data_diez_lucero.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private Integer indepYear;
    private int population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    // Relación con City (1 a muchos)
    @OneToMany(mappedBy = "country", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<City> cities;

    // Relación con CountryLanguage (1 a muchos)
    @OneToMany(mappedBy = "country", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Countrylanguage> languages;
}

