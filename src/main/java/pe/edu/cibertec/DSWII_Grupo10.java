package pe.edu.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pe.edu.cibertec.modelo.services")
public class DSWII_Grupo10 {
	public static void main(String[] args) {
		SpringApplication.run(DSWII_Grupo10.class, args);
	}
}
