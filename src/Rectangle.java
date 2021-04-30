public class Rectangle  extends Figure {
    private int width;
    private int height;

    public Rectangle(){
//        System.out.println("Creating Rectangle Class with no parameters.");
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(Rectangle r) {
//        System.out.println("Creating Rectangle Class from the other rectangle.");
        this.height = r.height + 1;
        this.width = r.width + 1;
    }

    public Rectangle(int width, int height){
//        System.out.println("Creating a Rectangle Class using height and width.");
        this.width = width;
        this.height = height;
    }


    public void draw(){
//        System.out.println("Call to Rectangle's draw method.");
        for (int i = 0; i < height; i ++) {
            for (int j = 0 ; j < width ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void erase(){
        super.erase();
//        System.out.println("Call to Rectangle's erase method.");
    }

    public void center(){
        super.center();
    }


}
