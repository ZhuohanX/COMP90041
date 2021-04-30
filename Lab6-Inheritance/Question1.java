

/**
 * this is a driver class for the program
 *
 * @author Adrienne Decker
 * @version
 */
public class Question1
{
   public static void main(String[] args)
   {
      Figure f1 = new Figure();
      f1.draw();
      f1.erase();
      f1.center();

      Triangle t1 = new Triangle();
      t1.draw();
      t1.erase();
      t1.center();

      Rectangle r1 = new Rectangle();
      r1.draw();
      r1.erase();
      r1.center();
   }
}
