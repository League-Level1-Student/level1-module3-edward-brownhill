package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class IDK {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		int xpos = 0;
		int ypos = 0;
		for (int i = 0; i < 10; i++) {
			xpos = i;
			for (int j = 0; j < 10; j++) {
				ypos = j;
				Flower flower = new Flower();
				Location location = new Location(xpos, ypos);
				if(xpos < 5 && ypos < 5) {
					if ((xpos + ypos)%2 == 0) {
						flower.setColor(Color.white);
					}
					else flower.setColor(Color.blue);
				}
				else if(xpos%2 == 0) {
					flower.setColor(Color.red);
				}
				else flower.setColor(Color.white);
				world.add(location, flower);
			}
			
		}
	}
}
