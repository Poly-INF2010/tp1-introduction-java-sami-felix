package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        BaseShape rectangle = new BaseShape();
        Double startingX = -width/2;
        Double startingY = -height/2;
        for (Double k = 0.0; k < width*height;  k++)
        {
            startingX += 0.5;
            while(startingY < height/2)
            {
                Point2d pointAdd = new Point2d(startingX, startingY);
                rectangle.add(pointAdd);
                startingY += 0.5;
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {

    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return null;
    }
}
