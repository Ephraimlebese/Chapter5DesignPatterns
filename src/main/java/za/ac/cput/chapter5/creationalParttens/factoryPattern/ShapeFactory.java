package za.ac.cput.chapter5.creationalParttens.factoryPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ShapeFactory {
    private static ShapeFactory shapeFactory = null;
    private ShapeFactory(){

    }

    public static ShapeFactory getShapeFactoryInstance(){
        if(shapeFactory == null)
            return new ShapeFactory();
        return shapeFactory;
    }

    public Shape gethowManyCorners(String shape){
        if("Triangle".equalsIgnoreCase(shape)) {
            return new Triangle();
        }else {
            return new Rectangle();
        }
    }

}
