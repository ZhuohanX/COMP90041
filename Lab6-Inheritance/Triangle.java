public class Triangle extends Figure {
    private int height;

    public Triangle(){
//        System.out.println("Creating Triangle's Class with no parameters.");
        this.height = 0;
    }

    public Triangle (Triangle other) {
//        System.out.println("Creating Triangle's Class from the other triangle.");
        this.height = other.height;
    }

    public Triangle (int height) {
//        System.out.println("Creating Triangle's Class given height.");
        this.height = height;
    }

    public void draw() {
//        System.out.println("Call to Triangle's draw method.");
        for (int i =1 ; i <=height; i++){
            for(int j=0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void erase() {
        super.erase();
    }


}
