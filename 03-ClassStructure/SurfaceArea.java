public class SurfaceArea()
{
	double a,b,h,r;
	
	public static double circle(double a)
	{
		return r*r*3.14;
	}
	
	public static double rect(double a, double b)
	{
		return a*b;
	}
	public static double triangle(double a, double b)
	{
		return a*h/2;
	}
}

public static void main(double []args)
{
	double poleKola = circle(3);
	double poleProstokota = rect(3,4);
	double poleTrojkata = triangle(3,4);
	
	System.out.printin(poleKola.circle);
	System.out.printin(poleProstokota.rect);
	System.out.printin(poleTrojkata.triangle);
}