package Q5;

public  class Ponto {
	private double x ;
	private double y ;
	
	public Ponto(double x,double y){
	this.x = x ;
	this.y = y ;
	}
	
	public void setX(double xVal){ 
		x = xVal ; 
	}
	
	public void setY(double yVal){
		y = yVal ;
	}
	
	
	public double getX() { 
		return ( x ); 
		}
	public double getY ( ) { return ( y ) ; }
	
	
	
	public String toString( ){
	return " ( "+ x + " , " + y + " )" ;
	}
	}

