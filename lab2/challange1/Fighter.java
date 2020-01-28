package lab2.challange1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;
    private static int numberOfFighters =0;

    public Fighter(String name,int health,int damage){
        this.name = name;
        this.health = health;
        damagePerAttack = damage;
        numberOfFighters++;
    }
    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;
    }
    public String toString(){
        return "Name : " + name + " health " + health + " damage " + damagePerAttack;

    }
    public int getHealth(){
        return health;
    }
    public String getName() {
        return name;
    }

    public static int getNumberOfFighters() {
        return numberOfFighters;
    }
}

