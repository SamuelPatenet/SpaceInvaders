package fr.unilim.iut.etu.spaceinvaders;

public class Envahisseur extends Sprite {
	Direction prochaineDirection;
	
	public Envahisseur(Dimension dimension, Position positionInitiale, int vitesse) {
		super(dimension, positionInitiale, vitesse);
		this.prochaineDirection = Direction.DROITE;
	}
	
	public Direction recupererDirection() {
		return this.prochaineDirection;
	}
	
	public void changerDirection(Direction direction) {
		this.prochaineDirection = direction;
	}
}