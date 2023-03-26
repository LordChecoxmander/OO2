package ar.edu.unlp.info.oo2.Ej1_RedSocial;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	
	public void twitter(ArrayList<Usuario> user) {
		this.setUsuarios(user);
		
	}

	public void eliminarUsuario(Usuario userElim) {
		//getUsuarios().stream().forEach(c -> c.verificarUsuario(userElim) );
		this.getUsuarios().removeIf(u -> u.verificarUsuario(userElim));
	}
	
	
	public void agregarUsuario(Usuario userNew) {
		this.getUsuarios().add(userNew);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(ArrayList<Usuario> usua) {
		usuarios = usua;
	}
	
	
}
