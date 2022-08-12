package trycle;

public class Rect {
    
    public Rect(double len, double br)
    {
        length = len;
        breadth = br;
    }

    public double getArea()
    {
        return length * breadth;
    }

    double length,breadth;
}
