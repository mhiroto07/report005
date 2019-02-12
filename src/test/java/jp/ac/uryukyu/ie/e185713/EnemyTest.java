package jp.ac.uryukyu.ie.e185713;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    //「死んでいる状態では攻撃できない事」を確認
    @Test
    public void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);  //enemy.dead = true;
        for(int i=0; i<10; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.getHitPoint());  //assertEquals(heroHP, hero.hitPoint);
    }

}
