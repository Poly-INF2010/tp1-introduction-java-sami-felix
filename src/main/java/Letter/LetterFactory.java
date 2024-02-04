package Letter;

import Point.Point2d;
import Shape.*;
import Shape.Rectangle;

import java.awt.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new BaseShape();

        BaseShape sides = new Rectangle(maxWidth*0.2, maxHeight);
        sides.translate(sides.getCoords(), new Point2d(-0.4*maxWidth, 0.0));
        sides.rotate(sides.getCoords(), 0.2);
        letterA.add(sides);

        sides.rotate(sides.getCoords(), -0.4);
        sides.translate(sides.getCoords(), new Point2d(0.75*maxWidth, -10.0));
        letterA.add(sides);

        letterA.add(new Rectangle(maxWidth*0.40, maxWidth*0.2));

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        //Rectangle a gauche
        BaseShape rectangle = new Rectangle(maxWidth * 0.35, maxHeight);
        rectangle.translate(rectangle.getCoords(), new Point2d(-0.4*maxWidth, 0.0));
        letterB.add(rectangle);

        //Cercle de bas
        BaseShape cercle1 = new Circle(maxWidth*0.6);
        BaseShape cercle1Inside = new Circle(maxWidth*0.5);
        cercle1.remove(cercle1Inside);
        cercle1.translate(cercle1.getCoords(), new Point2d(0.0, maxHeight*0.25));
        letterB.add(cercle1);

        //Cercle de haut
        cercle1.translate(cercle1.getCoords(), new Point2d(0.0, maxHeight*-0.5));
        letterB.add(cercle1);


        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();

        letterC.add(new Ellipse(maxWidth, maxHeight));
        letterC.remove(new Ellipse(maxWidth*0.80, maxHeight*0.80));

        BaseShape rectangle = new Rectangle(maxWidth*0.50, maxHeight*0.40);
        rectangle.translate(rectangle.getCoords(), new Point2d(maxWidth*0.3, 0.0));
        letterC.remove(rectangle);

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        //Rectangle a gauche
        BaseShape leftRect = new Rectangle(maxWidth * 0.35, maxHeight);
        leftRect.translate(leftRect.getCoords(), new Point2d(-0.4*maxWidth, 0.0));
        letterE.add(leftRect);

        //Rectangle cote
        BaseShape sideRect = new Rectangle(maxWidth, maxHeight*0.10);
        letterE.add(sideRect);

        sideRect.translate(sideRect.getCoords(), new Point2d(0.0, maxHeight*0.45));
        letterE.add(sideRect);

        sideRect.translate(sideRect.getCoords(), new Point2d(0.0, maxHeight*-0.9));
        letterE.add(sideRect);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        //Rectangle a gauche et droite
        BaseShape sidesRect = new Rectangle(maxWidth * 0.2, maxHeight);
        sidesRect.translate(sidesRect.getCoords(), new Point2d(-0.4*maxWidth, 0.0));
        letterH.add(sidesRect);

        sidesRect.translate(sidesRect.getCoords(), new Point2d(0.8*maxWidth, 0.0));
        letterH.add(sidesRect);

        BaseShape middle = new Rectangle(maxWidth, 0.2*maxWidth);
        letterH.add(middle);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();


        BaseShape sidesRect = new Rectangle(maxWidth * 0.2, maxHeight);

        sidesRect.rotate(sidesRect.getCoords(), -0.2);
        letterN.add(sidesRect);
        sidesRect.rotate(sidesRect.getCoords(), 0.2);

        sidesRect.translate(sidesRect.getCoords(), new Point2d(-0.4*maxWidth, 0.0));
        letterN.add(sidesRect);

        sidesRect.translate(sidesRect.getCoords(), new Point2d(0.8*maxWidth, 0.0));
        letterN.add(sidesRect);



        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();
        letterO.add(new Ellipse(maxWidth, maxHeight));
        letterO.remove(new Ellipse(maxWidth*0.80, maxHeight*0.80));
        return letterO;
    }

}
