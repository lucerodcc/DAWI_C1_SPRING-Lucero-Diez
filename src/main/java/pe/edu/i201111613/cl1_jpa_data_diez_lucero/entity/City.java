package pe.edu.i201111613.cl1_jpa_data_diez_lucero.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    private int population;

    // Relación con Country (muchos a 1)
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode", referencedColumnName = "code")
    private Country country;


}
