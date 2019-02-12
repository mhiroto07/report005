package jp.ac.uryukyu.ie.e185713;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{

    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);  //LivingThing.java
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if(getHitPoint() < 0){
            setDead(true);
            System.out.printf("勇者％sは道半ばで力尽きてしまった。\n", getName());
        }
    }

}
