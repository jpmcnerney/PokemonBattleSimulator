/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author jpmcnerney
 */
public class Pokemon {
    
    private String ID;
    private int HP;
    private String pokemonName;
    private String nickname;
    private String secondAbility;
    private String type;
    private int strength;
    
    public Pokemon(String ID) {
        this.ID = ID;
        this.HP = 100;
        this.pokemonName = "";
        this.nickname = "";
        this.secondAbility = "X";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSecondAbility() {
        return secondAbility;
    }

    public void setSecondAbility(String secondAbility) {
        this.secondAbility = secondAbility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    

    
    
  
}
