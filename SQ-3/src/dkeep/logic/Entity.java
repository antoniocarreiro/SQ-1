package dkeep.logic;

public class Entity {
	
	protected Position position;
	protected DragonsBane game;
	protected char title;
	
	
	public Entity() {
		position = new Position();
	}
	
	public Entity(DragonsBane game, int x, int y, char title) {
		position = new Position(x, y);
		this.title = title;
		this.game = game;
	}
	
	protected boolean validMove(int x, int y) {
		return true;
	}
	
	public boolean move(String direction) {
		switch(direction) {
		case "w":
			if(position.getX() > 0) {
				if(game.map.getMaze()[position.getX() - 1][position.getY()] != 'X') {
					if(validMove(position.getX() - 1, position.getY()))
						position.setX(position.getX()-1);
				}
				return true;
			}
			break;

		case "a":
			if(position.getY() > 0) {
				if(game.map.getMaze()[position.getX()][position.getY() - 1] != 'X') {
					if(validMove(position.getX(), position.getY() - 1))
						position.setY(position.getY()-1);
				}
				return true;
			}
			break;

		case "s":
			if(position.getX() < game.getMap().getMaze().length -1) {
				if(game.map.getMaze()[position.getX() + 1][position.getY()] != 'X') {
					if(validMove(position.getX() + 1, position.getY()))
						position.setX(position.getX()+1);
				}
				return true;
			}
			break;

		case "d":
			if(position.getY() < game.getMap().getMaze().length -1) {
				if(game.map.getMaze()[position.getX()][position.getY() + 1] != 'X') {
					if(validMove(position.getX(), position.getY() + 1))
						position.setY(position.getY()+1);
				}
				return true;
			}
			break;
		}
		return false;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public char getTitle() {
		return title;
	}

	public void setTitle(char title) {
		this.title = title;
	}
	
	public int getX() {
		return position.getX();
	}

	public int getY() {
		return position.getY();
	}
	
}
