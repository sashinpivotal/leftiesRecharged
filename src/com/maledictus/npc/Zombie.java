package com.maledictus.npc;

import com.maledictus.npc.enemy.Enemy;
import com.maledictus.npc.enemy.EnemyType;

public class Zombie extends NPC implements Enemy {

    EnemyType enemyType;

    Zombie(int id, int hitPoints, String name, String description, boolean isHostile, EnemyType enemyType) {
        super(id, hitPoints, name, description, isHostile);
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void dropItem() {

    }
}