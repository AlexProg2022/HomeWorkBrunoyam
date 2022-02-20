package HomeWorkEasy1502;

public class Arithmetic {
    private int x;
    private int y;

    public void setX(int x) {
        if (x == 0)  {
            System.out.println("Вы должны ввести значение больше 0");
        } else
        this.x = x;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("Вы должны ввести значение больше 0");
        } else
            this.y = y;


    }
}
