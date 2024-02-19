package groupTasks.twoFightersOneWinner;

public class TestFighter {
    public static void main(String[] args) {
        Fighter tom=new Fighter();
        tom.setInfo("Tom", 10, 2);
        Fighter harry = new Fighter();
        harry.setInfo("Harry", 5, 4);
        tom.declareWinner2(tom,harry,"tom");
    }
}
