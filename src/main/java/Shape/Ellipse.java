package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double widthRad = widthDiameter/2;
        Double heightRad = heightDiameter/2;

        for(Double y=-heightRad; y<=heightRad; y+=0.5) {
            for(Double x=-widthRad; x<=0; x+=0.5) {
                Double dx = x / widthRad;
                Double dy = y / heightRad;
                if(dx*dx+dy*dy <= 1) {
                    add(new Point2d(x, y));
                    add(new Point2d(-x, y));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        super();
        Double width = dimensions.X();
        Double height = dimensions.Y();
        this.add(new Ellipse(width, height));
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super();
        this.addAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
