package fcu.iecs.oop.pokemon;

public class Player {
	
	private String Playername;
	
	private Pokemon[] pokemons;
	
	private int level=1;
	

	public Player(String Playername) {
		this.Playername = Playername;
	}


	public String getPlayername() {
		return Playername;
	}


	public void setPlayername(String playername) {
		Playername = playername;
	}


	public Pokemon[] getPokemons() {
		return pokemons;
	}


	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	
	

}
