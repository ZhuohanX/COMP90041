public class Figure {

    public Figure () {
//        System.out.println("Creating a new figure with no parameters.");
    }

    public Figure (Figure f) {
//        System.out.println("Creating a new Figure using the other figure.");
    }

    public void erase() {
//        System.out.println("Call to Figure's erase method.");
        for (int i = 0; i < 15; i++){
            System.out.println();
        }
    }

    public void draw() {
//        System.out.println("Call to figure's draw method.");
    }

    public void center() {
//        System.out.println("Call to figure's center method.");
        this.draw();
        this.erase();
    }


}
