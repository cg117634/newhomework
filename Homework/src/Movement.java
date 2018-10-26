



public class Movement {
	
	
	private int moveLeft;
	private int moveRight;
	private int moveUp;
	private int moveDown;
	
	
	
	public Movement(int moveLeft, int moveRight, int moveUp, int moveDown) {
		
		
		this.moveLeft= moveLeft;
		this.moveRight = moveRight;
		this.moveUp=moveUp;
		this.moveDown=moveDown;
				
		
	}
	
	public int moveObjLeft() {
		
		moveLeft+=1;
		return moveLeft;
	}
	public int moveObjRight() {
		
		moveRight+=1;
		return moveRight;
	}
	public int moveObjUp() {
		
		moveUp+=1;
		return moveUp;
	}
	public int moveObjDown() {
		
		moveDown+=1;
		return moveDown;
	}
	

}
