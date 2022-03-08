package u9pp.MonsterFighter;

import static org.mockito.Mockito.RETURNS_SELF;

class SlowMonster extends Monster{
    private int count = 1;
    private int exp;
    private int attack;
    private int maxHealth;
    private String name;

    public SlowMonster(String name, int maxHealth, int attack, int exp){
        super(name, maxHealth, attack, exp);
        this.exp = exp;
        this.name = name;
        this.maxHealth = maxHealth;
        this.attack = attack;
    }

    public int getExpGiven(){
        return exp;
    }

    public String takeTurn(Combatant target){
        String result = "";
        if(count % 2 == 0){
            result = super.takeTurn(target);
        } else{
            result = name + " is resting.";
        }
        
        count++;
        return result;
    }
}