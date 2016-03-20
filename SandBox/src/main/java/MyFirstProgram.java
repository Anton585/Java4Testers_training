public class MyFirstProgram {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 1;
        p1.y = 1;

        Point p2 = new Point();
        p2.x = 4;
        p2.y = 5;

        prnRes(p1, p2);
    }

    public static void prnRes(Point firstP, Point secondP) {
        System.out.println("Дистанция между точками с координатами " + firstP.x + ":" + firstP.y + " и " + secondP.x +
                           ":"+ secondP.y + " " + "равна " + distance(firstP, secondP));
    };

    public static double distance(Point p1, Point p2) {
        int a;
        int b;
        double c;
        a = p2.x-p1.x;
        b = p2.y-p1.y;
        c = Math.sqrt(a*a+b*b);
        return (c);
    }
}
