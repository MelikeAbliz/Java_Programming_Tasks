package groupTasks.twoFightersOneWinner;

public class Fighter {
    public String fighterName;
    public int health, damagePerAttack;

    public void setInfo(String fighterName, int health, int damagePerAttack) {
        this.fighterName = fighterName;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void declareWinner1(Fighter f1, Fighter f2, String fighterName) {
        int remainF1Health = 0;
        int remainF2Health = 0;
        for (int i = 1,j=1; i < f1.health; i++,j++) {
            remainF1Health = f1.health - f2.damagePerAttack * i;
            if (remainF1Health <=0) {
                break;
            }
            remainF2Health = f2.health - f1.damagePerAttack * j;
            if (remainF2Health <=0) {
                break;
            }
        }
        if (remainF1Health > remainF2Health) {
            System.out.println(f1.fighterName + " wins");
        } else System.out.println(f2.fighterName + "  wins");
    }

    public static String declareWinner2(Fighter fighter1, Fighter fighter2, String attacker) {
        do {
            if (attacker.equals(fighter1.fighterName)) {
                fighter2.health -= fighter1.damagePerAttack;
                attacker = fighter2.fighterName;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                attacker = fighter1.fighterName;
            }
        } while (fighter1.health > 0 && fighter2.health > 0);

        if (fighter2.health > 0) {
            return fighter2.fighterName + " wins";
        } else {
            return fighter1.fighterName + " wins";
        }
    }

    public static String declareWinner3(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = fighter1.fighterName.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = fighter1.fighterName.equals(firstAttacker) ? fighter2 : fighter1;

        while (true) {
            defender.health = defender.health - attacker.damagePerAttack;

            if (defender.health <= 0) {
                return attacker.fighterName + " wins";
            }

            // Swap attacker and defender for the next round
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}
/*
Both health and damagePerAttack will be integers and larger than 0.
Example 1:
 input :
 Fighter tom = new Fighter(); tom.setInfo("Tom", 10, 2);
 Fighter harry = new Fighter(); harry.setInfo("Harry", 5, 4);
 declareWinner(tom, harry, "Tom")
 output : "Tom wins"
 Explanation :
 Tom attacks Harry; Harry now has 3 health.
 Harry attacks Tom; Tom now has 6 health.
 Tom attacks Harry; Harry now has 1 health.
 Harry attacks Tom; Tom now has 2 health.
 Tom attacks Harry: Harry now has -1 health and is dead. Tom wins.
Example 2:
Fighter jerry = new Fighter(); jerry.setInfo("Jerry", 30, 3);
Fighter harald = new Fighter(); harald.setInfo("Harald", 20, 5);
declareWinner(jerry, harald, "Jerry") => Harald wins
 */
