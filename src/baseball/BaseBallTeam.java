package baseball;

public class BaseBallTeam {


    private String name;
    private int win;
    private int lose;
    private int drow;

    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int drow) {
        this.setName(name);
        this.setWin(win);
        this.setLose(lose);
        this.setDrow(drow);
    }

    public void report() {
        double get = getRate();
        System.out.println(this.getName() + "の2022年の成績は" + this.getWin() + "勝" +  this.getLose() + "負" + this.getDrow() + "分、勝率は" + get + "です。" );
    }

    public double getRate(){

        double get = (double)this.getWin() / (this.getWin() + this.getLose());
        return get;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDrow() {
        return drow;
    }

    public void setDrow(int drow) {
        this.drow = drow;
    }
}


