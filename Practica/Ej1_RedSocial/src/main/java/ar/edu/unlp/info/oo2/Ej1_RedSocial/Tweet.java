package ar.edu.unlp.info.oo2.Ej1_RedSocial;

public class Tweet {

	private String texto ;
	private Tweet reTweet;
	
	public Tweet(String txt) {
		this.setTexto(txt);
	}
	
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Tweet getReTweet() {
		return reTweet;
	}
	public void setReTweet(Tweet reTweet) {
		this.reTweet = reTweet;
	}
	
	
	
	
	a= 3
	b= 6
	
	3 4 5 6
	
	
	
	
	
	
	
	public static void tres(int a, int b) {

//        System.out.println(a);
        if (a<b) {
        	tres(a++, b);
        	System.out.println(a);
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
