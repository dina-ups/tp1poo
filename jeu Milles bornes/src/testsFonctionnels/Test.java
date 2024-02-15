package testsFonctionnels;


import cartes.Carte;
import utils.Utils;
import jeu.Coup;
import jeu.Joueur;
import jeu.Sabot;
import cartes.Probleme;
import cartes.Probleme.Type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.JeuDeCartes;
import cartes.Limite;
import cartes.Parade;
public class Test {
	public static void main(String[] args) {
		
		Carte c=new Attaque(50, Type.ACCIDENT);
		Carte c1=new Parade(50,Type.ACCIDENT);
		Carte c2= new Botte(50,Type.ACCIDENT);
		
		Sabot s=new Sabot(110);
		
		s.ajouterCarte(c);
		s.ajouterCarte(c1);
		
		s.ajouterFamilleCarte(c1, 3);
		
		s.ajouterFamilleCarte(c,c,c );		
		s.ajouterCarte(c2);
			//while (s.nbcarte()!=0)
				//{
			//s.piocher();
			
			//s.ajouterCarte(c2);
	//} //on commente a la derniere question du tp pour mettre ce qui a en bas 
	
//		while (s.nbcarte()!=0)
//{
//		Iterator<Carte> iter1 =s.iterator();
//		iter1.hasNext();
//		iter1.next();
//		s.ajouterCarte(c2);
//			//iter1.remove();
//	}	
		

       
		System.out.println(c1.equals(c2));
			JeuDeCartes lis=new JeuDeCartes();
			
			System.out.println(lis.getListeCartes());
			//System.out.println(lis.checkCount());
			
			JeuDeCartes jeu = new JeuDeCartes();
			List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
			List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
			System.out.println(listeCartes);
			listeCartes = Utils.melanger(listeCartes);
			System.out.println(listeCartes);
			System.out.println("liste mélangée sans erreur ? "
			+ Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
			listeCartes = Utils.rassembler(listeCartes);
			System.out.println(listeCartes);
			System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
			
			
				
				//instanciation de sjoueur
		        Joueur joueur1 = new Joueur("Joueur 1");
		        Joueur joueur2 = new Joueur("Joueur 2");
		        List<Joueur> participant= new ArrayList<>();
		        participant.add(joueur2);
		        participant.add(joueur1);
		        ///creation des carte 
		        Attaque c9=new Attaque(50, Type.ACCIDENT);
		        Attaque c3=new Attaque(50, Type.CREVAISON);
		        
		       
				
				
				Borne b1=new Borne(50,10);
				Borne b2=new Borne(49,10);
				Borne b3=new Borne(60,10);
				
				Parade c7=new Parade(89,Type.ESSENCE);
				Parade cc=new Parade(50,Type.CREVAISON);
				Parade c8=new Parade(50,Type.CREVAISON);
				
				
				FinLimite f1=new FinLimite(50);
				FinLimite f2=new FinLimite(75);
				
				
				DebutLimite d1= new DebutLimite(25);
				DebutLimite d2=new DebutLimite(50);

		        joueur1.donner(cc);
		        joueur1.donner(c9);
		        joueur1.donner(c3);
		        //taille de la main est 3 
		      
		        joueur1.getCollectionBorne().add(b1);
		        joueur1.getCollectionBorne().add(b2);
		        joueur1.getCollectionBorne().add(b3);
		        

		        
		        Botte bot12= new Botte(50,Type.FEU);
		        
				Botte bot11= new Botte(50,Type.ACCIDENT);
				
		        System.out.println("Cartes en main du Joueur 1 :");
		        for (Carte carte : joueur1.getMain().getlist())
		        {
		        	 System.out.println("-"+ carte);
		        	 
		        }
		        
		        
		        ///////test de getLimite()
		      
		        //cas1 pile vide 
		        System.out.println("Pile vide limite :"+joueur1.getLimite());
		        
		        ///cas2 sommet de pil est une lin fe limite 
		        joueur1.getLimiteV().add(d2);
		        joueur1.getLimiteV().add(f1);
		        
		        System.out.println("sommet finlimite, la limite est: "+joueur1.getLimite());
		        
		        
		        //cas3:le joueur a la bote feu 
		        joueur1.getEnsBotte().add(bot11);
		        joueur1.getEnsBotte().add(bot12);
		        
		        System.out.println("botte feu, la limite est: "+joueur1.getLimite());
		        
		        joueur1.getEnsBotte().clear();
		        joueur1.getLimiteV().clear();//vide la pile
		        joueur1.getEnsBotte().add(bot12);
		        //dernier cas
		        joueur1.getLimiteV().add(d2);
		        joueur1.getLimiteV().add(f2);
		        joueur1.getLimiteV().add(d1);
		        
		        System.out.println("Last, la limite est: "+joueur1.getLimite());
		        
		        
		        /////GetLimite Marche
		        
		        
		        
		        System.out.println("Kilométrage du Joueur 1 : " + joueur1.getKM());

		        System.out.println("Limite de vitesse du Joueur 1 : " + joueur1.getLimite());

		
		        
		        
		        Attaque a1=new Attaque(50,Type.FEU);//feu rouge
		        Botte bot2= new Botte(50,Type.FEU);//vehicule prioritaire
		        Parade c6=new Parade(50,Type.ACCIDENT);//reparation
		        
				Botte bot1= new Botte(50,Type.ACCIDENT);//as du volant
				Attaque a2=new Attaque(50,Type.ESSENCE);//pane essence
				
				Parade c17=new Parade(89,Type.ESSENCE);//essence
				Parade c18=new Parade(50,Type.FEU);//feu-vert
				
				
				joueur1.getpileBataille().add(c18);
				joueur1.getpileBataille().add(c1);
				joueur1.getpileBataille().add(c17);
				
				joueur2.getpileBataille().add(c3);
				joueur2.getpileBataille().add(c18);
				joueur2.getpileBataille().add(c);
				
				
				
				
				
				
				Attaque ccc=new Attaque(50, Type.ACCIDENT); //accident
		        //Attaque c3=new Attaque(50, Type.CREVAISON); //crevaison
				//parade->crevaison->roue secour
				
		        ////test-estbloque

		        // Test 1: Ajouter un FEU_ROUGE (true) //bon
		        joueur2.getpileBataille().add(Carte.FEU_ROUGE);
		        System.out.println("T  Est bloqué (après ajout FEU_ROUGE) : " + joueur2.estBloque());

		        // Test 2: Ajouter un VEHICULE_PRIORITAIRE (false) //bon
		        joueur2.getEnsBotte().add(bot2);
		        System.out.println(" F Est bloqué (après ajout VEHICULE_PRIORITAIRE) : " + joueur2.estBloque());

		        // Test 3: Ajouter un ACCIDENT (true)  //bon
		        joueur2.getpileBataille().add(ccc);
		        System.out.println(" T Est bloqué (après ajout ACCIDENT) : " + joueur2.estBloque());

		        
		        // Test 4: Ajouter un AS_DU_VOLANT (false)
		        joueur2.getEnsBotte().add(bot1);
		        System.out.println("F Est bloqué (après ajout AS_DU_VOLANT) : " + joueur2.estBloque());

		     
		        // Test 5: Ajouter une PANNE_D_ESSENCE (true) //bon 
		        joueur2.getpileBataille().add(a2);
		        System.out.println("T Est bloqué (après ajout PANNE_D_ESSENCE) : " + joueur2.estBloque());

		        
		        // Test 6: Ajouter de L_ESSENCE (false) //bon 
		        joueur2.getpileBataille().add(c17);
		        System.out.println("F Est bloqué (après ajout L_ESSENCE) : " + joueur2.estBloque());

		        // Test 7: Effacer les bottes (true)  //bon
		        joueur2.getEnsBotte().clear();
		        System.out.println(" T Est bloqué (après effacement des bottes) : " + joueur2.estBloque());

		        // Test 8: Ajouter un FEU_VERT (false) //bon
		        joueur2.getpileBataille().add(Carte.FEU_VERT);
		        System.out.println("F Est bloqué (après ajout FEU_VERT) : " + joueur2.estBloque());
		        
			// test tp4 QUESTION 3 TOUS LES COUPS POSSIBLE
		        System.out.println("\n TEST COUPS POSSIBLES"+participant+"pile joueur1"+joueur1.getpileBataille()+"pile joueur2:"+joueur2.getpileBataille());
		        System.out.println("les COUSP POSSIBLES SONT:"+joueur1.coupsPossibles(participant));
		        // TEST QUESTION 2
		        System.out.println("\n TEST appliquer:");
		        
		        Joueur j = new Joueur("J");
		        Carte c111 = new Parade(0,Probleme.Type.FEU);
		        Limite limite = new DebutLimite(1);
		        Borne borne = new Borne(5,100);
		        Botte botte = new Botte(1,Type.FEU);
		        Carte parade = new Parade(3,Type.ACCIDENT);
		        Carte carte4 = new Parade(0,Type.ESSENCE);
		        Coup coup1= new Coup(ccc,j);
		        Joueur joueur = new Joueur("Joueur");
		        Carte carte1 = new Parade(0,Type.FEU);
		        System.out.println("appliquer "+carte1+":"+carte1.appliquer(joueur));
		        System.out.println("appliquer "+carte1+":"+carte1.appliquer(joueur));
		        Carte carte2 = new Attaque(0,Type.FEU);
		        System.out.println("appliquer "+carte2+":"+carte2.appliquer(joueur));
		        System.out.println("appliquer "+borne+":"+carte4.appliquer(joueur));
		        System.out.println("appliquer "+botte+":"+botte.appliquer(joueur));
		        System.out.println("appliquer "+borne+":"+borne.appliquer(joueur));
		        System.out.println("appliquer "+borne+":"+borne.appliquer(joueur));
		        System.out.println("appliquer "+limite+":"+limite.appliquer(joueur));
		        Carte carte3 = new Attaque(0,Type.ESSENCE);
		        System.out.println("appliquer "+carte3+":"+carte3.appliquer(joueur));
		        System.out.println("appliquer "+borne+":"+carte1.appliquer(joueur));
		        System.out.println("appliquer "+parade+":"+parade.appliquer(joueur));
		        
		        System.out.println("appliquer "+carte4+":"+carte4.appliquer(joueur));
		        System.out.println("TEST JOUER CLASSE COUP");
		        System.out.println(coup1.jouer(joueur2));
//		        System.out.println("appliquer "+c111+":"+c111.appliquer(j));
//		        System.out.println("appliquer "+c111+":"+c111.appliquer(j));
//		        
//		        System.out.println("appliquer "+c2+":"+c2.appliquer(j));
//		        System.out.println("appliquer "+c2+":"+c2.appliquer(j));
//		        
//		        System.out.println("appliquer "+c17+":"+c17.appliquer(j));
//		        System.out.println("appliquer "+c17+":"+c17.appliquer(j));
//		       
//		        System.out.println("appliquer "+c1+":"+c1.appliquer(j));
//		        System.out.println("appliquer "+c1+":"+c1.appliquer(j));
	}
	
			




			
	}



