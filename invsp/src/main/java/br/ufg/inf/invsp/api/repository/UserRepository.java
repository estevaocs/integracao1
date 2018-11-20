package br.ufg.inf.invsp.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.ufg.inf.invsp.api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);
	
}
