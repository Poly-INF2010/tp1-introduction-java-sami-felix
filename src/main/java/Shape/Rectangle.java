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
        super();
        Double startingX = -width/2;
        Double endX = width/2;
        Double startingY = -height/2;
        Double endY = height/2;
        for (Double x = startingX; x < endX;  x += 0.5)
        {
            for (Double y = startingY; y < endY; y += 0.5){
                add(new Point2d(x,y));
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super();
        Double width = dimensions.X();
        Double height = dimensions.Y();
        this.add(new Rectangle(width, height));
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super();
        this.addAll(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        Rectangle newRectangle = new Rectangle(this.cloneCoords());
        return newRectangle;
    }
}
