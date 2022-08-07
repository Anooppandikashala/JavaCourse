/*

Classes And Objects

    Box  

        length
        width
        height

        calculateVolume
        calculateTotalArea

*/


class Box
{
    // defined properties
    public int lenth;
    public int width, height;

    // operations
    public int calculateVolume()
    {
        int vol = lenth * width * height;
        return vol;
    }

    public int calculateTotalArea()
    {
        int area = (2 * (lenth * width)) + (2 * (lenth * height)) + (2 *(width* height));
        return area;
    }

}




class ClassesAndObjects {

    public static void main(String[] args) {

        Box b1 = new Box();
        b1.lenth = 10;
        b1.height = 20;
        b1.width = 30;

        int vol = b1.calculateVolume();
        System.out.println("Volume : " + vol);

        int area = b1.calculateTotalArea();
        System.out.println("Area : " + area);
        
    }
}