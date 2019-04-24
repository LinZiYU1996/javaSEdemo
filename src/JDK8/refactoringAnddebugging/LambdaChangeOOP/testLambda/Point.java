package JDK8.refactoringAnddebugging.LambdaChangeOOP.testLambda;



/*
*
 * @Author Mr.Lin
 * @Description //
 *
 * @Date 19:47 2019/4/24
 **/
public class Point

{
    private final int x;
    private final int y;
    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }

    public int getY() { return y; }
    public Point moveRightBy(int x){
        return new Point(this.x + x, this.y);
    }

}
