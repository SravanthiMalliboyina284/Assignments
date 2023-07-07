
import java.util.Scanner.*;

class Triangle
{
	 public static void main(String[] args)
    {
        FindArea t1=new FindArea();
        t1.base=4;
        t1.height=8;
        System.out.println(t1.area());
        System.out.println(t1.length());

    }
}
class FindArea
{
    double base,height;
    public double area()
    {
        return 0.5*base*height;
    }
    public double length()
    {
        return 2*base*height;
    }
}
