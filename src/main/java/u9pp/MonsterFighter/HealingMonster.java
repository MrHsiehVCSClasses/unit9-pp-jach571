package u9pp.MonsterFighter;

class HealingMonster extends Monster{
    private int exp;
    private int attack;
    private int maxHealth;
    private int healAmount;
    private String name;

    public HealingMonster(String name, int maxHealth, int attack, int exp, int healAmount){
        super(name, maxHealth, attack, exp);
        this.exp = exp;
        this.name = name;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.healAmount = healAmount;
    }

    public int getExpGiven(){
        return exp;
    }

    public String takeTurn(Combatant target){
        String result = super.takeTurn(target);
        this.heal(healAmount);

        return result + " Monster is now healing " + healAmount + " health.";
    }

    public int getHealingPerTurn(){
        return healAmount;
    }
}