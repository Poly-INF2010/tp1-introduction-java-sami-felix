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

        Double xi = widthDiameter/2;
        Double hxh = heightDiameter*heightDiameter;
        Double wxw = widthDiameter*widthDiameter;
        Double hhxww = hxh*wxw;
        Double slope = 0.0;

        // Creer l'axe du milieu
        for (Double x = -widthDiameter/2; x <= widthDiameter/2; x+= 0.5){
            this.add(new Point2d(x, 0.0));
        }

        //Les deux moities
        for (Double y = 0.5; y <= heightDiameter/2; y += 0.5){
            Double xf = xi - slope;
            while (xf > 0){
                if (xf*xf*hxh + y*y*wxw <= hhxww){
                    break;
                }
                xf -= 0.5;
            }

            slope = xi - xf;
            xi = xf;

            for (Double x = -xi; x <= xi; x += 0.5)
            {
                this.add(new Point2d(x, -y));
                this.add(new Point2d(x, y));
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
