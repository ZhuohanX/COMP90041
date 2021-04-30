public class Q5 {

    public static void main(String[] args) {
//        Figure f = new Figure();
//        f.draw();
//        f.erase();
//        f.center();
//        Rectangle r = new Rectangle();
//        r.draw();
//        r.erase();
//        r.center();
//        Triangle t = new Triangle();
//        t.draw();
//        t.erase();
//        t.center();
        Figure t = new Triangle(5);
        Triangle t2 = (Triangle) new Figure();
        t.center();
        Figure r = new Rectangle(4,5);
        r.center();
    }
}
