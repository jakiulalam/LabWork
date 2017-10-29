public class triangle{

private point a;
private point b;
private point c;


public triangle(point a,point b,point c){
	
	this.a=a;
		this.b=b;
			this.c=c;
	
	
	
}
 public void setA(point a){
		
		 this.a=a;
	}
 public void setB(point b){
		
		 this.b=b;
	}
	 public void setC(point c){
		
		 this.c=c;
	}

public point getA(){
		
		return this.a;
	}

public point getB(){
		
		return this.b;
	}

public point getC(){
		
		return this.c;
	}


public void displaytriangle(point a,point b,point c){
	
	
	System.out.println(a.getX());
		System.out.println(a.getY());
			System.out.println(b.getX());
				System.out.println(b.getY());
					System.out.println(c.getX());
						System.out.println(c.getY());
	
	
	
	
	
	
	
	
}

public static void main(String [] args){

point p1= new point (0,0);
point p2= new point (0,0);
point p3= new point (0,0);

p1.setX(3);
p1.setY(4);
p2.setX(5);
p2.setY(5);
p3.setX(7);
p3.setY(8);

triangle t1= new triangle (p1,p2,p3);

t1.setA(p1);
t1.setB(p2);
t1.setC(p3);
t1.displaytriangle(p1,p2,p3);

}

}