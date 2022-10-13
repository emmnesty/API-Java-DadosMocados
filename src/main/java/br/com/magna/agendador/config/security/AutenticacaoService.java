package br.com.magna.agendador.config.security;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.magna.agendador.entity.AlunoEntity;

//@Service
//public class AutenticacaoService implements UserDetailsService {
//
//	@Autowired
//    AlunoRepositoryBase alunoRepository;
//
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Optional<AlunoEntity> usuario =  alunoRepository.findByNome(username);
//		GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
//		return new User(usuario.get().getNome(), usuario.get().getSenha(), Arrays.asList(authority));
//	}
//
//
//}
