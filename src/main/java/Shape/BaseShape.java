package Shape;

import Interface.Transform;
import Point.Point2d;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinates
     */
    public BaseShape() {
        this.coords = new ArrayList<Point2d>(0);
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        ArrayList<Point2d> newCoords = new ArrayList<Point2d>(coords);
//        this.coords = new ArrayList<Point2d>(coords.size());
//        this.coords.addAll(coords);
        this.coords = newCoords;
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        Point2d point = new Point2d(coord.X(), coord.Y());
        this.coords.add(point);
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        for(Point2d t: shape.coords)
        {
            this.add(t);
        }
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        for (Point2d t : coords)
        {
            this.add(t);
        }
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        for (Point2d t : shape.coords)
        {
            this.remove(t);
        }
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        for(Point2d t: coords)
        {
            this.coords.remove(t);
        }
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        this.coords.clear();
        this.addAll(newCoords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        return new ArrayList<Point2d>(coords);
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return cloneCoords(this.coords);
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        Double maxCoordX = -1.7976931348623157E308;
        for (Point2d t: this.coords)
        {
            if (t.X() > maxCoordX)
            {
                maxCoordX = t.X();
            }
        }
        return maxCoordX;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        Double maxY = -1.7976931348623157E308;
        for (Point2d t: this.coords)
        {
            if (t.Y() > maxY)
            {
                maxY = t.Y();
            }
        }
        return maxY;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        Double maxX = getMaxX();
        Double maxY = getMaxY();
        return new Point2d(maxX, maxY);
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        Double minX = 1.7976931348623157E308;
        for (Point2d t: this.coords)
        {
            if (t.X() < minX)
            {
                minX = t.X();
            }
        }
        return minX;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        Double minY = 1.7976931348623157E308;
        for (Point2d t: this.coords)
        {
            if (t.Y() < minY)
            {
                minY = t.Y();
            }
        }
        return minY;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        Double minX = getMinX();
        Double minY = getMinY();
        return new Point2d(minX, minY);
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        Collection<Point2d> newCoords = cloneCoords(this.coords);
        BaseShape newShape = new BaseShape(newCoords);
        return newShape;
    }
}
