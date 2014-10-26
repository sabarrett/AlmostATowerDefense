package game.zombies.zombietypes;

import game.base.Room;
import game.grid.Path;
import game.strategy.FollowPathMovement;
import game.zombies.Zombie;

import java.awt.Color;
import java.awt.geom.Point2D;

public class Runner extends Zombie {

	private final static int SIZE = 5;
	private final static int HEALTH = 50;
	private final static double SPEED = 3;
	private final static int MUNNEY = 10;
	private final static Color COLOR = Color.GREEN;
	
	public Runner(Room parent, Point2D pos, Path path) {
		super(parent, pos, SIZE, SIZE, HEALTH, SPEED, COLOR, MUNNEY, new FollowPathMovement(path));
	}
}
