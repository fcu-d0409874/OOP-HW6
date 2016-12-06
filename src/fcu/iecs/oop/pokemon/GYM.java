package fcu.iecs.oop.pokemon;

public class GYM {
	
	private static final int n = (int) (Math.random() * 2);
	
	public static void fight(Player p1,Player p2){
		Pokemon[] pkm1=p1.getPokemons();
		Pokemon[] pkm2=p2.getPokemons();
		int pn1=0;
		int pn2=0;
		for(int i=0;i<3;i++){
			if(pkm1[i].getType()==pkm2[2].getType()){
				if(pkm1[i].getCp()==pkm2[2].getCp()){
					if(n==1){
						System.out.println("Round"+(i+1)+":"+"Winner is "+p1.getPlayername());
						pn1++;
					}else{
						System.out.println("Round"+(i+1)+":"+"Winner is "+p2.getPlayername());
						pn2++;
					}
				}
			}else{
				if(pkm1[i].getType()==PokemonType.FIRE&&pkm2[i].getType()==PokemonType.GRASS){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p1.getPlayername());
					pn1++;
				}else if(pkm1[i].getType()==PokemonType.GRASS&&pkm2[i].getType()==PokemonType.WATER){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p1.getPlayername());
					pn1++;
				}else if(pkm1[i].getType()==PokemonType.WATER&&pkm2[i].getType()==PokemonType.FIRE){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p1.getPlayername());
					pn1++;
				}else if(pkm2[i].getType()==PokemonType.FIRE&&pkm1[i].getType()==PokemonType.GRASS){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p2.getPlayername());
					pn2++;
				}else if(pkm2[i].getType()==PokemonType.GRASS&&pkm1[i].getType()==PokemonType.WATER){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p2.getPlayername());
					pn2++;
				}else if(pkm2[i].getType()==PokemonType.WATER&&pkm1[i].getType()==PokemonType.FIRE){
					System.out.println("Round"+(i+1)+":"+"Winner is "+p2.getPlayername());
					pn2++;
				}
			}
		}if(pn1>pn2){
			p1.setLevel(p1.getLevel()+1);
			System.out.println("Winner is "+p1.getPlayername()+" and his/her level becomes "+p1.getLevel()+".");
		}else{
			p2.setLevel(p2.getLevel()+1);
			System.out.println("Winner is "+p2.getPlayername()+" and his/her level becomes "+p2.getLevel()+".");
		}
		
	}


}
