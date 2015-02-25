
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
	
	public void div(PVector v){
		x = x/v.getX();
		y = y/v.getY();
	}
	
	public void div(float f){
		x = x/f;
		y = y/f;
	}
	
	public void multV(PVector v){
		x = x*v.getX();
		y = y*v.getY();
	}
	
	public void mult(float n){
		x = x*n;
		y = y*n;
	}
	
	public float mag(){
		return (float)Math.sqrt(x*x + y*y);
	}
	
	public void limit(float max){
		if (mag() == max) {
			System.out.println("Limit");
			normalize();
			mult(max);
		}
	}
	
	public void normalize(){
		float m = mag();
		if (m != 0) {
			div(m);
		}
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
