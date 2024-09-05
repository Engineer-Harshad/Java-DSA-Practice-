package harshad;

class Circle{
	private double radius;
	private double area;
	private double perimeter;
	public void setRadi(double r) {
		radius = r;
	}
	public void setArea(double a) {
      
		if (a == Math.PI*radius*radius) {
			area = a;
		}
		else {
			System.out.println("Warning Area");
		}
	}
	public void setPeri(double p) {
       if (p == 2*Math.PI*radius) {
    	   perimeter = p;
       }
       else {
    	   System.out.println("Warning peri");
       }
	}
	public double getRadi() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	public double getPeri() {
		return perimeter;
	}
}

public class Circlegettersetter {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadi(5.0);
		c.setArea(78.53982);
		c.setPeri(31.41593);
		System.out.println(c.getRadi());
		System.out.println(c.getArea());
		System.out.println(c.getPeri());
	}
}
