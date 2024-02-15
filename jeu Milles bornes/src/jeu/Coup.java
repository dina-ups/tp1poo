package jeu;
import cartes.*;
public class Coup {
	Carte carte;
    Joueur cible;

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public Joueur getCible() {
        return cible;
    }

    public void setCible(Joueur cible) {
        this.cible = cible;
    }

    public Coup(Carte carte, Joueur cible) {
        this.carte = carte;
        this.cible = cible;
    }





    public boolean estValide(Joueur joueur) {
        if (cible == null)
            return true;
        if (carte instanceof DebutLimite || carte instanceof Attaque) {
            return !cible.equals(joueur);
        }
        return cible.equals(joueur);
    }

    public boolean jouer(Joueur joueur) {
        joueur.getMain().jouer(carte);
        if (cible == null) {
            joueur.getJeu().getSabot().ajouterCarte(carte);
            System.out.println("Le joueur " + joueur + " respose la " + carte);
            return true;
        } else {
            if (carte.appliquer(cible)) {
                System.out.println("Le joueur " + joueur + " et le  " + joueur + " et : " + carte);
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coup coup)
            return coup.getCarte().equals(carte) && coup.getCible().equals(cible);
        return false;
    }

    @Override
    public int hashCode() {
        return 31*(carte.hashCode() + cible.hashCode());

    }

}

