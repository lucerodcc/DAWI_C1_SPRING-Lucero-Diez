package pe.edu.i201111613.cl1_jpa_data_diez_lucero.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Countrylanguage {

    @Id
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode", referencedColumnName = "code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Country country;

    @Id
    private String language;

    @Enumerated(EnumType.STRING) // Esto indica que estamos usando un Enum que se guardará como STRING (T/F)
    @Column(name = "isOfficial")
    OfficialStatus isOfficial;

    private double percentage;

    public enum OfficialStatus {
        T, // Representa 'True' o 'Oficial'
        F  // Representa 'False' o 'No oficial'
    }
}