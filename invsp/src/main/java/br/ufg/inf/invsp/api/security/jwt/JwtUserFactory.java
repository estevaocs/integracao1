package br.ufg.inf.invsp.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.ufg.inf.invsp.api.entity.User;
import br.ufg.inf.invsp.api.enums.ProfileEnum;

public class JwtUserFactory {

	private JwtUserFactory() {}
	
	public static JwtUser create(User user) {
		JwtUser jwtUser = new JwtUser(user.getId(), user.getEmail(), user.getSenha(), 
				mapToGrantedAuthorities(user.getProfile()));
		return jwtUser;
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profile) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(profile.toString()));
		return authorities;
	}
}
