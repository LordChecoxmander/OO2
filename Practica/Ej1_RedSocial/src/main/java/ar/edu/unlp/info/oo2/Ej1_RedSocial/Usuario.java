package ar.edu.unlp.info.oo2.Ej1_RedSocial;

import java.util.ArrayList;

public class Usuario {
		
	private String screenName;
	private ArrayList<Tweet> tweets;

	
	public Usuario(String name, ArrayList<Tweet> twee) {
			
		this.setScreenName(name);
		this.setTweets(twee);
	
	}
	
	public void eliminarTweets() {
		this.getTweets().removeAll(tweets);
	}
	
	public boolean verificarUsuario(Usuario us) {
		
		//si los nombres son iguales devuelvo true
		if(us.getScreenName().equals(this.getScreenName())) {
			this.eliminarTweets();
			return true;
		}
		return false;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}
	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	
}
