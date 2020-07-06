package homework.lesson1;

public interface Movable {

    boolean walk(Track track);

    boolean jump(Wall wall);

    boolean overcome(Barrier barrier);

    boolean isDroppedOut();

    void setDroppedOut(boolean value);

}
