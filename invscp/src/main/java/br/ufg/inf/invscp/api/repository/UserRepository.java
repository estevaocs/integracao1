package br.ufg.inf.invscp.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.ufg.inf.invscp.api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);
	
}
