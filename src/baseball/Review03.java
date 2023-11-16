package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam emp01 = new BaseBallTeam();
        emp01.setName("東京ヤクルトスワローズ");
        emp01.setWin(80);
        emp01.setLose(59);
        emp01.setDrow(4);
        emp01.report();

        BaseBallTeam emp02 = new BaseBallTeam();
        emp02.setName("横浜DeNAベイスターズ");
        emp02.setWin(73);
        emp02.setLose(68);
        emp02.setDrow(2);
        emp02.report();

        BaseBallTeam emp03 = new BaseBallTeam();
        emp03.setName("阪神タイガース");
        emp03.setWin(68);
        emp03.setLose(71);
        emp03.setDrow(4);
        emp03.report();

        BaseBallTeam emp04 = new BaseBallTeam();
        emp04.setName("読売ジャイアンツ");
        emp04.setWin(68);
        emp04.setLose(72);
        emp04.setDrow(3);
        emp04.report();

        BaseBallTeam emp05 = new BaseBallTeam();
        emp05.setName("広島東洋カープ");
        emp05.setWin(66);
        emp05.setLose(74);
        emp05.setDrow(3);
        emp05.report();

        BaseBallTeam emp06 = new BaseBallTeam();
        emp06.setName("中日ドラゴンズ");
        emp06.setWin(66);
        emp06.setLose(75);
        emp06.setDrow(2);
        emp06.report();

    }

}
