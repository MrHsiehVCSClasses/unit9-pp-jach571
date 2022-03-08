package u9pp.MonsterFighter;

class Monster extends Combatant{
    private int exp;
    private int attack;
    private int maxHealth;
    private String name;

    public Monster(String name, int maxHealth, int attack, int exp){
        super(name, maxHealth, attack);

        if(exp < 0){
            exp = 0;
        }

        if(maxHealth < 0){
            maxHealth = 0;
        }

        if(attack < 0){
            attack = 0;
        }

        this.exp = exp;
        this.name = name;
        this.maxHealth = maxHealth;
        this.attack = attack;
    }

    public int getExpGiven(){
        return exp;
    }

    public String takeTurn(Combatant target){
        target.getAttacked(attack);
        return name + " attacked " + target.getName() + ", with " + attack + " attack power.";
    }
}