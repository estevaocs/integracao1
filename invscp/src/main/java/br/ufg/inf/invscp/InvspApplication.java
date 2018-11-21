package br.ufg.inf.invscp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.ufg.inf.invscp.api.entity.User;
import br.ufg.inf.invscp.api.enums.ProfileEnum;
import br.ufg.inf.invscp.api.repository.UserRepository;

@SpringBootApplication
public class InvspApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvspApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			inserirUsuario(userRepository, passwordEncoder);
		};
	}
	
	private void inserirUsuario(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User adm = new User();
		adm.setEmail("admin@ufg.br");
		adm.setSenha(passwordEncoder.encode("123456"));
		adm.setNome("Adiministrador");
		adm.setProfile(ProfileEnum.CHEFE_DEPART);
		
		User find = userRepository.findByEmail("admin@ufg.br");
		if (find == null) {
			userRepository.save(adm);
		}
	}
}
