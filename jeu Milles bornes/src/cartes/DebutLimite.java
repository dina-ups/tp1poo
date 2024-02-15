package cartes;

import java.util.List;

import jeu.Joueur;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	 public String toString()
	 {
	 return "Debut Limite";

	 }
	 public boolean appliquer(Joueur j) {
	        List<Limite> limites = j.getLimiteV();


	        if ((!limites.isEmpty() && limites.get(0).equals(this)) || j.estPrioritaire()) {
	            return false;
	        }

	        limites.add(0,this);
	        return true;
	    }
}
