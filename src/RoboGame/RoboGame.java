/**В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Задача — привести робота в заданную точку игрового поля.
 * */

package RoboGame;

public class RoboGame {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
        roboVoise();

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void roboVoise(){
        System.out.println("kill all human!");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) robot.turnRight();
            while (robot.getY() < toY) robot.stepForward();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
            while (robot.getY() > toY) robot.stepForward();
        }

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
            while (robot.getX() < toX) robot.stepForward();

        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) robot.turnRight();
            while (robot.getX() > toX) robot.stepForward();
        }

    }
}