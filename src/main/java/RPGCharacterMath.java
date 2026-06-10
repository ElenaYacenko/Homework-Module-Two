
public class RPGCharacterMath {
    public static void main(String[] args) {
        int swordDamage = 5;
        int strengthBonus = 10;
        int enemyArmor = 17;
        int totalDamage = swordDamage + strengthBonus;
        int gloves = 5;
        double potion = 1.155;
        int playerLevel = 13;
        int playerHealth = 75;
        int playerXp = Integer.MAX_VALUE - 50000;
        int playerXpMax = playerXp+100000;

        System.out.println("Total damage per hit: " + (swordDamage + strengthBonus));
        System.out.println("Damage for a 3-hit combo: " + (swordDamage + strengthBonus)*3);
        System.out.println("Damage after weakness debuff: " + ((swordDamage + strengthBonus)-3));
        System.out.println("Number of hits needed to penetrate enemy armor: " + (enemyArmor/(swordDamage + strengthBonus)+1));

        System.out.println("Total damage with potion and gloves: " + (totalDamage*potion+gloves));

        if ((playerLevel >=10 && playerLevel <=20) && playerHealth>0){
            System.out.println("You advance to the second level");
        }
        else{
            System.out.println("You failed, bro");
        }
        /*
         ТЕОРИЯ:
         1. Минимальные и максимальные значения получаются через классы-обертки:
            Float.MAX_VALUE, Double.MIN_VALUE и т.д.
         2. Отличие переполнения: int при переполнении "заворачивается" в отрицательное
            число (two's complement), а double при превышении MAX_VALUE становится
            специальным значением Infinity. При неопределенности (0.0/0.0) double дает NaN.
         */
        System.out.println("MAX float: " + Float.MAX_VALUE);
        System.out.println("MIN float: " + Float.MIN_VALUE);
        System.out.println("Overflow occurred! (float): " + Float.MAX_VALUE*2);
        System.out.println("Oops! (float): " + 0.0f/0.0);
        System.out.println("MAX double: " + Double.MAX_VALUE);
        System.out.println("MIN double: " + Double.MIN_VALUE);
        System.out.println("Overflow occurred! (double): " + Double.MAX_VALUE*10);
        System.out.println("Oops! (double): " + 0.0/0.0);

        System.out.println("Hero’s XP: " + playerXp);
        System.out.println("Artifact activated. Hero’s XP: " + playerXpMax);
    }
}