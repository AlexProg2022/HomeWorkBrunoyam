package HomeWorkEasy1502;

public class Arithmetic {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
        if (x == 0);{
            System.out.println("Вы должны ввести значение больше 0");
        }
    }

    public void setY(int y) {
        this.y = y;
        if (y == 0){
            System.out.println("Вы должны ввести значение больше 0");
        }
    }
}
