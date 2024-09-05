package harshad;
class cylinder{
	int radius;
	int height;

	public int getRadius() {
		return radius;
	}
	public int getHeight() {
		return height;
	}
	public double getSurfaceArea() {
		return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
	}
	public double getVolume() {
		return Math.PI*radius*radius*height;
	}
	cylinder(int r,int h){
		radius = r;
		height = h;
	}
}
public class Practice_gettersetter {
	public static void main(String[] args) {
		cylinder c = new cylinder(2,5);
		System.out.println(c.getRadius());
		System.out.println(c.getHeight());
		System.out.println(c.getSurfaceArea());
		System.out.println(c.getVolume());
	}

}
