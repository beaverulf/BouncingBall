
public class PVector {
	private float x;
	private float y;
	
	public PVector(float x, float y){
		this.x = x;
		this.y = y; 
	}
	
	public void add(PVector v){
		x = x + v.getX();
		y = y + v.getY();
	}
	
	public void sub(PVector v){
	    x = x - v.getX();
	    y = y - v.getY();
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	
}
