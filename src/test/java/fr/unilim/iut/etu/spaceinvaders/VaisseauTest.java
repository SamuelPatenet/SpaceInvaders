package fr.unilim.iut.etu.spaceinvaders;

import org.junit.Test;

import fr.unilim.iut.etu.spaceinvaders.utils.MissileException;
import fr.unilim.iut.etu.spaceinvaders.Vaisseau;
import fr.unilim.iut.etu.spaceinvaders.Position;
import fr.unilim.iut.etu.spaceinvaders.Dimension;

public class VaisseauTest {
	
	@Test(expected = MissileException.class)
	public void test_LongueurMissileSuperieureALongueurVaisseau_UneExceptionEstLevee() throws Exception {
		Vaisseau vaisseau = new Vaisseau(new Dimension(5,2),new Position(5,9), 1);
		vaisseau.tirerUnMissile(new Dimension(7,2),1);
	}
}