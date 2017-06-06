package fr.unilim.iut.etu.spaceinvaders;

public class Collision {
	public static boolean detecterCollision(Sprite objetA, Sprite objetB) {
		return (objetA.abscisseLaPlusAGauche() < objetB.abscisseLaPlusADroite() && objetA.abscisseLaPlusADroite() > objetB.abscisseLaPlusAGauche() && objetA.ordonneeLaPlusBasse() < objetB.ordonneeLaPlusHaute()&& objetA.ordonneeLaPlusHaute() > objetB.ordonneeLaPlusBasse());
	}
}