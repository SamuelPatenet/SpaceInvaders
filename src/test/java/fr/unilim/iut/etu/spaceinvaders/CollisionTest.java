package fr.unilim.iut.etu.spaceinvaders;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollisionTest {
	@Test
	public void test_CollisionMissileEnvahisseur() {
		Missile missile = new Missile(new Dimension(Constante.MISSILE_LONGUEUR, Constante.MISSILE_HAUTEUR), new Position(0, 0), 1);
		Envahisseur envahisseur = new Envahisseur(new Dimension(Constante.ENVAHISSEUR_LONGUEUR, Constante.ENVAHISSEUR_HAUTEUR), new Position(0, 0), 1);
		Collision collision = new Collision();
		assertEquals(collision.detecterCollision(missile, envahisseur), true);
	}
	
	@Test
	public void test_CollisionVaisseauEnvahisseur() {
		Vaisseau vaisseau = new Vaisseau(new Dimension(Constante.VAISSEAU_LONGUEUR, Constante.VAISSEAU_HAUTEUR), new Position(10, 10), 1);
		Envahisseur envahisseur = new Envahisseur(new Dimension(Constante.ENVAHISSEUR_LONGUEUR, Constante.ENVAHISSEUR_HAUTEUR), new Position(0, 0), 1);
		Collision collision = new Collision();
		assertEquals(collision.detecterCollision(vaisseau, envahisseur), true);
	}
}