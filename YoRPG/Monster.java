public class Monster{
  private int health;
  private int def;
  private int atk;
  private double accuracy;

  public Monster() {
    health = 30;
    def = 5;
    atk = 4;
    accuracy = 0.4;
  }

  public int getHealth() {
    return health;
  }

  public Monster(int difficulty) {
    health = 30;
    def = 5;
    atk = 4;
    accuracy = 0.4;
    if (difficulty == 1) {
      //foo easy
    }
    if (difficulty == 2) {
      //foo medium
    }
    if (difficulty == 3) {
      //foo hard
    }
  }

  public boolean isAlive(){
    return health > 0;
  }

  public int attack(Protagonist pat){
    int turnAtk = atk * hitOrMiss();
    pat.damage(turnAtk);
    return pat.ouch(turnAtk);
  }


  public int ouch(int hit) {
    return hit / def;
  }

  public void damage(int hit){
    health -= ouch( hit );
  }

  public int hitOrMiss() {
    if ( Math.random() <= accuracy ) {
      return 1;
    }
    else {
      return 0;
    }
  }

}
