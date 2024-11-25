package pe.edu.i201111613.cl1_jpa_data_diez_lucero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i201111613.cl1_jpa_data_diez_lucero.entity.Country;
import pe.edu.i201111613.cl1_jpa_data_diez_lucero.repository.CountryRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataDiezLuceroApplication implements CommandLineRunner {

	@Autowired        //permite usar el
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataDiezLuceroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hola");

		// Buscar el país "ARG" (Argentina)
//		Optional<Country> argentina = countryRepository.findById("ARG");
//		argentina.ifPresentOrElse(country -> {
//			System.out.println("Lenguajes hablados en Argentina:");
//			country.getLanguages().forEach(language -> System.out.println(language.getLanguage()));
//		}, () -> {
//			// Si no se encuentra "ARG", buscamos "PER" (Perú) y mostramos sus lenguajes
//			Optional<Country> peru = countryRepository.findById("PER");
//			peru.ifPresentOrElse(country -> {
//				System.out.println("Lenguajes hablados en Perú:");
//				country.getLanguages().forEach(language -> System.out.println(language.getLanguage()));
//			}, () -> {
//				System.out.println("No se encontraron lenguajes para los países Argentina ni Perú.");
//			});
//		});

		//Consulta ifPresentOrElse()
//		countryRepository.findById("ARG").ifPresentOrElse(
//				country -> country.getLanguages().forEach(language -> System.out.println(language.getLanguage())),
//				() -> countryRepository.findById("PER").ifPresent(peru -> peru.getLanguages().forEach(lang -> System.out.println(lang.getLanguage())))
//		);

//		// Eliminar países: deleteAllById()
//			countryRepository.deleteAllById(List.of("ABW", "AFG"));

	}


}
