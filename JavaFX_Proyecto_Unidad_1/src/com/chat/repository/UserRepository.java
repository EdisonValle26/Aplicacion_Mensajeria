package com.chat.repository;

import java.util.ArrayList;
import java.util.List;

import com.chat.domain.Usuarios_Password;

public class UserRepository {
	
	public List<Usuarios_Password> user_pass = new ArrayList<>();

	public UserRepository() {

		user_pass.add(new Usuarios_Password(1,"Usuario1", "123"));
		user_pass.add(new Usuarios_Password(2,"Usuario2", "456"));
	}

	public List<Usuarios_Password> getUsuarios_Password(String usuario, String password) {
		List<Usuarios_Password> result = new ArrayList<>();
		for (Usuarios_Password msg : user_pass) {
			if (msg.getUsuario().equals(usuario) && msg.getPassword().equals(password)) {
				result.add(msg);	
			}

		}
		return result;
	}
	
}
