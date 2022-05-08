package com.pokemon;

// arraylist library
import java.util.ArrayList;

public class Pokemon {
    // instance variables

    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<Integer> health = new ArrayList<Integer>();
    private ArrayList<Integer> exp = new ArrayList<Integer>();
    private ArrayList<Integer> attack = new ArrayList<Integer>();
    private ArrayList<Integer> deffense = new ArrayList<Integer>();
    private ArrayList<Integer> agility = new ArrayList<Integer>();
    private ArrayList<String> type = new ArrayList<String>();

    // overloaded constructor
    public Pokemon(String name, int health, int exp, int attack, int deffense, int agility, String type) {
        // initialise instance variables
        this.name.add(name);
        this.health.add(health);
        this.exp.add(exp);
        this.attack.add(attack);
        this.deffense.add(deffense);
        this.agility.add(agility);
        this.type.add(type);
    }

    public Pokemon() {
        // initialise instance variables
        this.name.add("Player");
        this.health.add(100);
        this.exp.add(0);
        this.attack.add(10);
        this.deffense.add(10);
        this.agility.add(10);
        this.type.add("Normal");
    }

    // getter name
    public ArrayList<String> getName() {
        return name;
    }

    // getter health
    public int getHealth() {
        int currentHealth = health.get(health.size() - 1);
        return currentHealth;
    }

    // getter exp
    public int getExp() {
        int currentXP = exp.get(exp.size() - 1);
        return currentXP;
    }

    // getter attack
    public int getAttack() {
        int currentAttack = attack.get(attack.size() - 1);
        return currentAttack;
    }

    // getter deffense
    public int getDeffense() {
        int currentDeffense = deffense.get(deffense.size() - 1);
        return currentDeffense;
    }

    // getter agility
    public int getAgility() {
        int currentAgility = agility.get(agility.size() - 1);
        return currentAgility;
    }

    // getter type
    public ArrayList<String> getType() {
        return type;
    }

    // setter name
    public void setName(String name) {
        this.name.add(name);
    }

    // setter health
    public void sethealth(int health) {
        this.health.add(health);
    }

    // setter exp
    public void setExp(int exp) {
        this.exp.add(exp);
    }

    // setter attack
    public void setAttack(int attack) {
        this.attack.add(attack);
    }

    // setter deffense
    public void setDeffense(int deffense) {
        this.deffense.add(deffense);
    }

    // setter agility
    public void setAgility(int agility) {
        this.agility.add(agility);
    }

    // setter type
    public void setType(String type) {
        this.type.add(type);
    }

    public void showStats() {
        // show the pokemon stats
        Garis();
        System.out.printf("|%-12s|%-10s|%-5s|%-10s|%-10s|%-10s|%-10s|\n", "Name", "Health", "Exp", "Attack", "Deffense",
                "Agility", "Type");
        Garis();
        System.out.printf("|%-12s|%-10d|%-5d|%-10d|%-10d|%-10d|%-10s|\n", name.get(name.size() - 1), getHealth(),
                getExp(),
                getAttack(),
                getDeffense(), getAgility(), type.get(type.size() - 1));
        Garis();
    }

    public static void Garis() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
