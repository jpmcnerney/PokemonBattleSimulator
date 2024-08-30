/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author jpmcnerney
 */
public class Arena extends javax.swing.JFrame {

    /**
     * Creates new form Arena
     */
    
    Color red = new Color(215, 0, 0);
    Color orange = new Color(255, 153, 51);
    Color blue = new Color(102, 255, 255);
    Color green = new Color(51, 255, 51);
    Color yellow = new Color(255, 255, 51);
    Color purple = new Color(178, 102, 255);
    Color pink = new Color(255, 153, 204);
    Color brown = new Color(130, 71, 0);
    Color gray = new Color(160, 160, 160);
    Color black = new Color (0, 0, 0);
    Color white = new Color(255, 255, 255);
    Color pokemonBackgroundColor = new Color(153, 204, 255);
    
    int pokemon1Ability2Damage = 0;
    int pokemon2Ability2Damage = 0;
    boolean pokemon1Turn = true;
    Pokemon pokemon1 = new Pokemon("001");
    Pokemon pokemon2 = new Pokemon("001");
    
    public Arena() {
        initComponents();
        
        setPokemon1("004");
        setPokemon2("001");
        
       

    }
    
    public void setPokemon1(String ID) {
        
        pokemon1.setID(ID);
        
        switch (ID) {
            case "001":
                labelPokemon1("Bulbasaur", "Grass", 2);
                break;
            case "002":
                labelPokemon1("Ivysaur", "Grass",  3);
                break;
            case "003":
                labelPokemon1("Venusaur", "Grass",  4);
                break;
            case "004":
                labelPokemon1("Charmander", "Fire", 2);
                break;
            case "005":
                labelPokemon1("Charmeleon", "Fire", 3);
                break;
            case "006":
                labelPokemon1("Charizard", "Fire", 4);
                break;
            case "007":
                labelPokemon1("Squirtle", "Water", 2);
                break;
            case "008":
                labelPokemon1("Wartortle", "Water", 3);
                break;
            case "009":
                labelPokemon1("Blastoise", "Water", 4);
                break;
            case "010":
                labelPokemon1("Caterpie", "Bug", 1);
                break;
            case "011":
                labelPokemon1("Metapod", "Bug", 2);
                break;
            case "012":
                labelPokemon1("Butterfree", "Bug", 2);
                break;
            case "013":
                labelPokemon1("Weedle", "Bug", 1);
                break;
            case "014":
                labelPokemon1("Kakuna", "Bug", 1);
                break;
            case "015":
                labelPokemon1("Beedrill", "Bug", 3);
                break;
            case "016":
                labelPokemon1("Pidgey", "Normal", 2);
                break;
            case "017":
                labelPokemon1("Pidgeotto", "Normal", 3);
                break;
            case "018":
                labelPokemon1("Pidgeot", "Normal", 4);
                break;
            case "019":
                labelPokemon1("Rattata", "Normal", 1);
                break;
            case "020":
                labelPokemon1("Raticate", "Normal", 3);
                break;
            case "021":
                labelPokemon1("Spearow", "Normal", 2);
                break;
            case "023":
                labelPokemon1("Fearow", "Normal", 4);
                break;
            case "024":
                labelPokemon1("Ekans", "Poison", 2);
                break;
            case "025":
                labelPokemon1("Arbok", "Poison", 3);
                break;
            case "026":
                labelPokemon1("Raichu", "Electric", 4);
                break;
            case "027":
                labelPokemon1("Sandshrew", "Ground", 2);
                break;
            case "028":
                labelPokemon1("Sandslash", "Ground", 3);
                break;
            case "029":
                labelPokemon1("Nidoran (F)", "Poison", 1);
                break;
            case "030":
                labelPokemon1("Nidorina", "Poison", 2);
                break;
            case "031":
                labelPokemon1("Nidoqueen", "Poison", 4);
                break;
            case "032":
                labelPokemon1("Nidoran (M)", "Poison", 1);
                break;
            case "033":
                labelPokemon1("Nidorino", "Poison", 2);
                break;
            case "034":
                labelPokemon1("Nidoking", "Poison", 4);
                break;
            case "035":
                labelPokemon1("Clefairy", "Fairy", 3);
                break;
            case "036":
                labelPokemon1("Clefable", "Fairy", 4);
                break;
            case "037":
                labelPokemon1("Vulpix", "Fire", 3);
                break;
            case "038":
                labelPokemon1("Ninetales", "Fire", 5);
                break;
            case "039":
                labelPokemon1("Jigglypuff", "Fairy", 3);
                break;
            case "040":
                labelPokemon1("Wigglytuff", "Fairy", 4);
                break;
            case "041":
                labelPokemon1("Zubat", "Poison", 1);
                break;
            case "042":
                labelPokemon1("Golbat", "Poison", 3);
                break;
            case "043":
                labelPokemon1("Oddish", "Grass", 1);
                break;
            case "044":
                labelPokemon1("Gloom", "Grass", 2);
                break;
            case "045":
                labelPokemon1("Vileplume", "Grass", 3);
                break;
            case "046":
                labelPokemon1("Paras", "Bug", 1);
                break;
            case "047":
                labelPokemon1("Parasect", "Bug", 2);
                break;
            case "048":
                labelPokemon1("Venonat", "Bug", 1);
                break;
            case "049":
                labelPokemon1("Venomoth", "Bug", 2);
                break;
            case "050":
                labelPokemon1("Diglett", "Ground", 1);
                break;
            case "051":
                labelPokemon1("Dugtrio", "Ground", 3);
                break;
            case "052":
                labelPokemon1("Meowth", "Normal", 3);
                break;
            case "053":
                labelPokemon1("Persian", "Normal", 4);
                break;
            case "054":
                labelPokemon1("Psyduck", "Psychic", 2);
                break;
            case "055":
                labelPokemon1("Golduck", "Water", 3);
                break;
            case "056":
                labelPokemon1("Mankey", "Fighting", 1);
                break;
            case "057":
                labelPokemon1("Primeape", "Fighting", 3);
                break;
            case "058":
                labelPokemon1("Growlithe", "Fire", 3);
                break;
            case "059":
                labelPokemon1("Arcanine", "Fire", 5);
                break;
            case "060":
                labelPokemon1("Poliwag", "Water", 1);
                break;
            case "061":
                labelPokemon1("Poliwhirl", "Water", 2);
                break;
            case "062":
                labelPokemon1("Poliwhirl", "Water", 4);
                break;
            case "063":
                labelPokemon1("Abra", "Psychic", 2);
                break;
            case "064":
                labelPokemon1("Kadabra", "Psychic", 4);
                break;
            case "065":
                labelPokemon1("Alakazam", "Psychic", 6);
                break;
            case "066":
                labelPokemon1("Machop", "Fighting", 2);
                break;
            case "067":
                labelPokemon1("Machoke", "Fighting", 3);
                break;
            case "068":
                labelPokemon1("Machamp", "Fighting", 5);
                break;
            case "069":
                labelPokemon1("Bellsprout", "Grass", 1);
                break;
            case "070":
                labelPokemon1("Weepinbell", "Grass", 2);
                break;
            case "071":
                labelPokemon1("Victreebell", "Grass", 3);
                break;
            case "072":
                labelPokemon1("Tentacool", "Water", 2);
                break;
            case "073":
                labelPokemon1("Tentacruel", "Water", 4);
                break;
            case "074":
                labelPokemon1("Geodude", "Rock", 2);
                break;
            case "075":
                labelPokemon1("Graveler", "Rock", 4);
                break;
            case "076":
                labelPokemon1("Golem", "Rock", 5);
                break;
            case "077":
                labelPokemon1("Ponyta", "Fire", 3);
                break;
            case "078":
                labelPokemon1("Rapidash", "Fire", 5);
                break;
            case "079":
                labelPokemon1("Slowpoke", "Normal", 3);
                break;
            case "080":
                labelPokemon1("Slowbro", "Normal", 4);
                break;
            case "081":
                labelPokemon1("Magnemite", "Electric", 2);
                break;
            case "082":
                labelPokemon1("Magneton", "Electric", 4);
                break;
            case "083":
                labelPokemon1("Farfetch'd", "Normal", 3);
                break;
            case "084":
                labelPokemon1("Doduo", "WNormal", 2);
                break;
            case "085":
                labelPokemon1("Dodrio", "Normal", 4);
                break;
            case "086":
                labelPokemon1("Seel", "Water", 2);
                break;
            case "087":
                labelPokemon1("Dewgong", "Water", 3);
                break;
            case "088":
                labelPokemon1("Grimer", "Poison", 2);
                break;
            case "089":
                labelPokemon1("Muk", "Poison", 4);
                break;
            case "090":
                labelPokemon1("Shellder", "Water", 1);
                break;
            case "091":
                labelPokemon1("Cloyster", "Water", 3);
                break;
            case "092":
                labelPokemon1("Gastly", "Ghost", 1);
                break;
            case "093":
                labelPokemon1("Haunter", "Ghost", 3);
                break;
            case "094":
                labelPokemon1("Gengar", "Ghost", 6);
                break;
            case "095":
                labelPokemon1("Onix", "Rock", 5);
                break;
            case "096":
                labelPokemon1("Drowzee", "Psychic", 2);
                break;
            case "097":
                labelPokemon1("Hypno", "Psychic", 3);
                break;
            case "098":
                labelPokemon1("Krabby", "Water", 2);
                break;
            case "099":
                labelPokemon1("Kingler", "Water", 3);
                break;
            case "100":
                labelPokemon1("Voltorb", "Electric", 2);
                break;
            case "101":
                labelPokemon1("Electrode", "Electric", 3);
                break;
            case "102":
                labelPokemon1("Exeggcute", "Grass", 3);
                break;
            case "103":
                labelPokemon1("Exeggcutor", "Psychic", 5);
                break;
            case "104":
                labelPokemon1("Cubone", "Ground", 2);
                break;
            case "105":
                labelPokemon1("Marowak", "Ground", 3);
                break;
            case "106":
                labelPokemon1("Hitmonlee", "Fighting", 4);
                break;
            case "107":
                labelPokemon1("Hitmonchan", "Fighting", 4);
                break;
            case "108":
                labelPokemon1("Lickitung", "Normal", 3);
                break;
            case "109":
                labelPokemon1("Koffing", "Poison", 2);
                break;
            case "110":
                labelPokemon1("Weezing", "Poison", 3);
                break;
            case "111":
                labelPokemon1("Rhyhorn", "Ground", 4);
                break;
            case "112":
                labelPokemon1("Rhydon", "Ground", 6);
                break;
            case "113":
                labelPokemon1("Chansey", "Normal", 3);
                break;
            case "114":
                labelPokemon1("Tangela", "Grass", 2);
                break;
            case "115":
                labelPokemon1("Kangaskhan", "Normal", 6);
                break;
            case "116":
                labelPokemon1("Horsea", "Water", 2);
                break;
            case "117":
                labelPokemon1("Seadra", "Water", 3);
                break;
            case "118":
                labelPokemon1("Goldeen", "Water", 2);
                break;
            case "119":
                labelPokemon1("Seaking", "Water", 3);
                break;
            case "120":
                labelPokemon1("Staryu", "Water", 1);
                break;
            case "121":
                labelPokemon1("Starmie", "Water", 3);
                break;
            case "122":
                labelPokemon1("Mr. Mime", "Psychic", 4);
                break;
            case "123":
                labelPokemon1("Scyther", "Bug", 5);
                break;
            case "124":
                labelPokemon1("Jynx", "Psychic", 4);
                break;
            case "125":
                labelPokemon1("Electabuzz", "Electric", 5);
                break;
            case "126":
                labelPokemon1("Magmar", "Fire", 4);
                break;
            case "127":
                labelPokemon1("Pinsir", "Bug", 5);
                break;
            case "128":
                labelPokemon1("Tauros", "Normal", 5);
                break;
            case "129":
                labelPokemon1("Magikarp", "Water", 0);
                break;
            case "130":
                labelPokemon1("Gyarados", "Water", 7);
                break;
            case "131":
                labelPokemon1("Lapras", "Water", 6);
                break;
            case "132":
                labelPokemon1("Ditto", "Normal", 4);
                break;
            case "133":
                labelPokemon1("Eevee", "Normal", 3);
                break;
            case "134":
                labelPokemon1("Vaporeon", "Water", 5);
                break;
            case "135":
                labelPokemon1("Jolteon", "Electric", 5);
                break;
            case "136":
                labelPokemon1("Flareon", "Fire", 5);
                break;
            case "137":
                labelPokemon1("Porygon", "Normal", 2);
                break;
            case "138":
                labelPokemon1("Omanyte", "Rock", 2);
                break;
            case "139":
                labelPokemon1("Omastar", "Rock", 4);
                break;
            case "140":
                labelPokemon1("Kabuto", "Rock", 1);
                break;
            case "141":
                labelPokemon1("Kabutops", "Rock", 5);
                break;
            case "142":
                labelPokemon1("Aerodactyl", "Rock", 6);
                break;
            case "143":
                labelPokemon1("Snorlax", "Normal", 6);
                break;
            case "144":
                labelPokemon1("Articuno", "Ice", 8);
                break;
            case "145":
                labelPokemon1("Zapdos", "Electric", 8);
                break;
            case "146":
                labelPokemon1("Moltres", "Fire", 8);
                break;
            case "147":
                labelPokemon1("Dratini", "Dragon", 5);
                break;
            case "148":
                labelPokemon1("Dragonair", "Dragon", 6);
                break;
            case "149":
                labelPokemon1("Dragonite", "Dragon", 7);
                break;
            case "150":
                labelPokemon1("Mewtwo", "Psychic", 10);
                break;
            case "151":
                labelPokemon1("Mew", "Psychic", 8);
                break;
            default: //INVALID ID
                labelPokemon1("Bulbasaur", "Grass", 2);
                pokemon1IDTextField.setText("001");
                break;
        }
        
    }
    
    public void setPokemon2(String ID) {
        
        pokemon2.setID(ID);
        
        switch (ID) {
            case "001":
                labelPokemon2("Bulbasaur", "Grass", 2);
                break;
            case "002":
                labelPokemon2("Ivysaur", "Grass",  3);
                break;
            case "003":
                labelPokemon2("Venusaur", "Grass",  4);
                break;
            case "004":
                labelPokemon2("Charmander", "Fire", 2);
                break;
            case "005":
                labelPokemon2("Charmeleon", "Fire", 3);
                break;
            case "006":
                labelPokemon2("Charizard", "Fire", 4);
                break;
            case "007":
                labelPokemon2("Squirtle", "Water", 2);
                break;
            case "008":
                labelPokemon2("Wartortle", "Water", 3);
                break;
            case "009":
                labelPokemon2("Blastoise", "Water", 4);
                break;
            case "010":
                labelPokemon2("Caterpie", "Bug", 1);
                break;
            case "011":
                labelPokemon2("Metapod", "Bug", 2);
                break;
            case "012":
                labelPokemon2("Butterfree", "Bug", 2);
                break;
            case "013":
                labelPokemon2("Weedle", "Bug", 1);
                break;
            case "014":
                labelPokemon2("Kakuna", "Bug", 1);
                break;
            case "015":
                labelPokemon2("Beedrill", "Bug", 3);
                break;
            case "016":
                labelPokemon2("Pidgey", "Normal", 2);
                break;
            case "017":
                labelPokemon2("Pidgeotto", "Normal", 3);
                break;
            case "018":
                labelPokemon2("Pidgeot", "Normal", 4);
                break;
            case "019":
                labelPokemon2("Rattata", "Normal", 1);
                break;
            case "020":
                labelPokemon2("Raticate", "Normal", 3);
                break;
            case "021":
                labelPokemon2("Spearow", "Normal", 2);
                break;
            case "023":
                labelPokemon2("Fearow", "Normal", 4);
                break;
            case "024":
                labelPokemon2("Ekans", "Poison", 2);
                break;
            case "025":
                labelPokemon2("Arbok", "Poison", 3);
                break;
            case "026":
                labelPokemon2("Raichu", "Electric", 4);
                break;
            case "027":
                labelPokemon2("Sandshrew", "Ground", 2);
                break;
            case "028":
                labelPokemon2("Sandslash", "Ground", 3);
                break;
            case "029":
                labelPokemon2("Nidoran (F)", "Poison", 1);
                break;
            case "030":
                labelPokemon2("Nidorina", "Poison", 2);
                break;
            case "031":
                labelPokemon2("Nidoqueen", "Poison", 4);
                break;
            case "032":
                labelPokemon2("Nidoran (M)", "Poison", 1);
                break;
            case "033":
                labelPokemon2("Nidorino", "Poison", 2);
                break;
            case "034":
                labelPokemon2("Nidoking", "Poison", 4);
                break;
            case "035":
                labelPokemon2("Clefairy", "Fairy", 3);
                break;
            case "036":
                labelPokemon2("Clefable", "Fairy", 4);
                break;
            case "037":
                labelPokemon2("Vulpix", "Fire", 3);
                break;
            case "038":
                labelPokemon2("Ninetales", "Fire", 5);
                break;
            case "039":
                labelPokemon2("Jigglypuff", "Fairy", 3);
                break;
            case "040":
                labelPokemon2("Wigglytuff", "Fairy", 4);
                break;
            case "041":
                labelPokemon2("Zubat", "Poison", 1);
                break;
            case "042":
                labelPokemon2("Golbat", "Poison", 3);
                break;
            case "043":
                labelPokemon2("Oddish", "Grass", 1);
                break;
            case "044":
                labelPokemon2("Gloom", "Grass", 2);
                break;
            case "045":
                labelPokemon2("Vileplume", "Grass", 3);
                break;
            case "046":
                labelPokemon2("Paras", "Bug", 1);
                break;
            case "047":
                labelPokemon2("Parasect", "Bug", 2);
                break;
            case "048":
                labelPokemon2("Venonat", "Bug", 1);
                break;
            case "049":
                labelPokemon2("Venomoth", "Bug", 2);
                break;
            case "050":
                labelPokemon2("Diglett", "Ground", 1);
                break;
            case "051":
                labelPokemon2("Dugtrio", "Ground", 3);
                break;
            case "052":
                labelPokemon2("Meowth", "Normal", 3);
                break;
            case "053":
                labelPokemon2("Persian", "Normal", 4);
                break;
            case "054":
                labelPokemon2("Psyduck", "Psychic", 2);
                break;
            case "055":
                labelPokemon2("Golduck", "Water", 3);
                break;
            case "056":
                labelPokemon2("Mankey", "Fighting", 1);
                break;
            case "057":
                labelPokemon2("Primeape", "Fighting", 3);
                break;
            case "058":
                labelPokemon2("Growlithe", "Fire", 3);
                break;
            case "059":
                labelPokemon2("Arcanine", "Fire", 5);
                break;
            case "060":
                labelPokemon2("Poliwag", "Water", 1);
                break;
            case "061":
                labelPokemon2("Poliwhirl", "Water", 2);
                break;
            case "062":
                labelPokemon2("Poliwhirl", "Water", 4);
                break;
            case "063":
                labelPokemon2("Abra", "Psychic", 2);
                break;
            case "064":
                labelPokemon2("Kadabra", "Psychic", 4);
                break;
            case "065":
                labelPokemon2("Alakazam", "Psychic", 6);
                break;
            case "066":
                labelPokemon2("Machop", "Fighting", 2);
                break;
            case "067":
                labelPokemon2("Machoke", "Fighting", 3);
                break;
            case "068":
                labelPokemon2("Machamp", "Fighting", 5);
                break;
            case "069":
                labelPokemon2("Bellsprout", "Grass", 1);
                break;
            case "070":
                labelPokemon2("Weepinbell", "Grass", 2);
                break;
            case "071":
                labelPokemon2("Victreebell", "Grass", 3);
                break;
            case "072":
                labelPokemon2("Tentacool", "Water", 2);
                break;
            case "073":
                labelPokemon2("Tentacruel", "Water", 4);
                break;
            case "074":
                labelPokemon2("Geodude", "Rock", 2);
                break;
            case "075":
                labelPokemon2("Graveler", "Rock", 4);
                break;
            case "076":
                labelPokemon2("Golem", "Rock", 5);
                break;
            case "077":
                labelPokemon2("Ponyta", "Fire", 3);
                break;
            case "078":
                labelPokemon2("Rapidash", "Fire", 5);
                break;
            case "079":
                labelPokemon2("Slowpoke", "Normal", 3);
                break;
            case "080":
                labelPokemon2("Slowbro", "Normal", 4);
                break;
            case "081":
                labelPokemon2("Magnemite", "Electric", 2);
                break;
            case "082":
                labelPokemon2("Magneton", "Electric", 4);
                break;
            case "083":
                labelPokemon2("Farfetch'd", "Normal", 3);
                break;
            case "084":
                labelPokemon2("Doduo", "WNormal", 2);
                break;
            case "085":
                labelPokemon2("Dodrio", "Normal", 4);
                break;
            case "086":
                labelPokemon2("Seel", "Water", 2);
                break;
            case "087":
                labelPokemon2("Dewgong", "Water", 3);
                break;
            case "088":
                labelPokemon2("Grimer", "Poison", 2);
                break;
            case "089":
                labelPokemon2("Muk", "Poison", 4);
                break;
            case "090":
                labelPokemon2("Shellder", "Water", 1);
                break;
            case "091":
                labelPokemon2("Cloyster", "Water", 3);
                break;
            case "092":
                labelPokemon2("Gastly", "Ghost", 1);
                break;
            case "093":
                labelPokemon2("Haunter", "Ghost", 3);
                break;
            case "094":
                labelPokemon2("Gengar", "Ghost", 6);
                break;
            case "095":
                labelPokemon2("Onix", "Rock", 5);
                break;
            case "096":
                labelPokemon2("Drowzee", "Psychic", 2);
                break;
            case "097":
                labelPokemon2("Hypno", "Psychic", 3);
                break;
            case "098":
                labelPokemon2("Krabby", "Water", 2);
                break;
            case "099":
                labelPokemon2("Kingler", "Water", 3);
                break;
            case "100":
                labelPokemon2("Voltorb", "Electric", 2);
                break;
            case "101":
                labelPokemon2("Electrode", "Electric", 3);
                break;
            case "102":
                labelPokemon2("Exeggcute", "Grass", 3);
                break;
            case "103":
                labelPokemon2("Exeggcutor", "Psychic", 5);
                break;
            case "104":
                labelPokemon2("Cubone", "Ground", 2);
                break;
            case "105":
                labelPokemon2("Marowak", "Ground", 3);
                break;
            case "106":
                labelPokemon2("Hitmonlee", "Fighting", 4);
                break;
            case "107":
                labelPokemon2("Hitmonchan", "Fighting", 4);
                break;
            case "108":
                labelPokemon2("Lickitung", "Normal", 3);
                break;
            case "109":
                labelPokemon2("Koffing", "Poison", 2);
                break;
            case "110":
                labelPokemon2("Weezing", "Poison", 3);
                break;
            case "111":
                labelPokemon2("Rhyhorn", "Ground", 4);
                break;
            case "112":
                labelPokemon2("Rhydon", "Ground", 6);
                break;
            case "113":
                labelPokemon2("Chansey", "Normal", 3);
                break;
            case "114":
                labelPokemon2("Tangela", "Grass", 2);
                break;
            case "115":
                labelPokemon2("Kangaskhan", "Normal", 6);
                break;
            case "116":
                labelPokemon2("Horsea", "Water", 2);
                break;
            case "117":
                labelPokemon2("Seadra", "Water", 3);
                break;
            case "118":
                labelPokemon2("Goldeen", "Water", 2);
                break;
            case "119":
                labelPokemon2("Seaking", "Water", 3);
                break;
            case "120":
                labelPokemon2("Staryu", "Water", 1);
                break;
            case "121":
                labelPokemon2("Starmie", "Water", 3);
                break;
            case "122":
                labelPokemon2("Mr. Mime", "Psychic", 4);
                break;
            case "123":
                labelPokemon2("Scyther", "Bug", 5);
                break;
            case "124":
                labelPokemon2("Jynx", "Psychic", 4);
                break;
            case "125":
                labelPokemon2("Electabuzz", "Electric", 5);
                break;
            case "126":
                labelPokemon2("Magmar", "Fire", 4);
                break;
            case "127":
                labelPokemon2("Pinsir", "Bug", 5);
                break;
            case "128":
                labelPokemon2("Tauros", "Normal", 5);
                break;
            case "129":
                labelPokemon2("Magikarp", "Water", 0);
                break;
            case "130":
                labelPokemon2("Gyarados", "Water", 7);
                break;
            case "131":
                labelPokemon2("Lapras", "Water", 6);
                break;
            case "132":
                labelPokemon2("Ditto", "Normal", 4);
                break;
            case "133":
                labelPokemon2("Eevee", "Normal", 3);
                break;
            case "134":
                labelPokemon2("Vaporeon", "Water", 5);
                break;
            case "135":
                labelPokemon2("Jolteon", "Electric", 5);
                break;
            case "136":
                labelPokemon2("Flareon", "Fire", 5);
                break;
            case "137":
                labelPokemon2("Porygon", "Normal", 2);
                break;
            case "138":
                labelPokemon2("Omanyte", "Rock", 2);
                break;
            case "139":
                labelPokemon2("Omastar", "Rock", 4);
                break;
            case "140":
                labelPokemon2("Kabuto", "Rock", 1);
                break;
            case "141":
                labelPokemon2("Kabutops", "Rock", 5);
                break;
            case "142":
                labelPokemon2("Aerodactyl", "Rock", 6);
                break;
            case "143":
                labelPokemon2("Snorlax", "Normal", 6);
                break;
            case "144":
                labelPokemon2("Articuno", "Ice", 8);
                break;
            case "145":
                labelPokemon2("Zapdos", "Electric", 8);
                break;
            case "146":
                labelPokemon2("Moltres", "Fire", 8);
                break;
            case "147":
                labelPokemon2("Dratini", "Dragon", 5);
                break;
            case "148":
                labelPokemon2("Dragonair", "Dragon", 6);
                break;
            case "149":
                labelPokemon2("Dragonite", "Dragon", 7);
                break;
            case "150":
                labelPokemon2("Mewtwo", "Psychic", 10);
                break;
            case "151":
                labelPokemon2("Mew", "Psychic", 8);
                break;
            default: //INVALID ID
                labelPokemon2("Bulbasaur", "Grass", 2);
                pokemon2IDTextField.setText("001");
                break;
        }
        
    }
    
    public void labelPokemon1(String name, String type, int strength) {
        Random rNumber = new Random();
        pokemon1.setPokemonName(name);
        pokemon1.setNickname(name);
        pokemon1NameLabel.setText(pokemon1.getNickname());
        pokemon1.setStrength(strength);
        pokemon1.setType(type);
        setPokemon1Ability(pokemon1.getType());
        pokemon1.setHP(pokemon1.getStrength() * 27 + rNumber.nextInt(23));
        pokemon1HPLabel.setText("HP: " + pokemon1.getHP());
        pokemon1Icon.setIcon(new ImageIcon(getClass().getResource(pokemon1NameLabel.getText() + ".png")));
    }
    
    public void labelPokemon2(String name, String type, int strength) {
        Random rNumber = new Random();
        pokemon2.setPokemonName(name);
        pokemon2.setNickname(name);
        pokemon2NameLabel.setText(pokemon2.getNickname());
        pokemon2.setStrength(strength);
        pokemon2.setType(type);
        setPokemon2Ability(pokemon2.getType());
        pokemon2.setHP(pokemon2.getStrength() * 27 + rNumber.nextInt(23));
        pokemon2HPLabel.setText("HP: " + pokemon2.getHP());
        pokemon2Icon.setIcon(new ImageIcon(getClass().getResource(pokemon2NameLabel.getText() + ".png")));
    }
    
    public void disablePokemon1Buttons() {
        pokemon1AbilityButton1.setEnabled(false);
        pokemon1AbilityButton2.setEnabled(false);
        
        pokemon2AbilityButton1.setEnabled(true);
        pokemon2AbilityButton2.setEnabled(true);
        
        pokemon1Turn = false;
    }
    
    public void disablePokemon2Buttons() {
        pokemon2AbilityButton1.setEnabled(false);
        pokemon2AbilityButton2.setEnabled(false);
        
        pokemon1AbilityButton1.setEnabled(true);
        pokemon1AbilityButton2.setEnabled(true);
        
        pokemon1Turn = true;
    }
    
    public void setPokemon1Ability(String type) {
        Random rNumber = new Random();
        int decider = rNumber.nextInt(3);
        switch (type) {
            case "Grass":
                pokemon1AbilityButton2.setBackground(green);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Power Whip");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Petal Blizzard");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Leaf Blade");
                        break;
                }
                break;
            case "Fire":
                pokemon1AbilityButton2.setBackground(red);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Pyro Ball");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Searing Shot");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Lava Plume");
                        break;
                }
                break;
            case "Water":
                pokemon1AbilityButton2.setBackground(blue);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Bubble Beam");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Aqua Jet");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Aqua Tail");
                        break;
                }
                break;
            case "Ice":
                pokemon1AbilityButton2.setBackground(blue);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Icicle Spear");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Ice Beam");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Blizzard");
                        break;
                }
                break;
            case "Bug":
                pokemon1AbilityButton2.setBackground(green);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Bug Bite");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Fell Stinger");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Fury Cutter");
                        break;
                }
                break;
            case "Normal":
                pokemon1AbilityButton2.setBackground(gray);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Fury Swipes");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Cut");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Crush Claw");
                        break;
                }
                break;
            case "Poison":
                pokemon1AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Acid Spray");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Poison Fang");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Poison Sting");
                        break;
                }
                break;
            case "Electric":
                pokemon1AbilityButton2.setBackground(yellow);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Shock Wave");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Fusion Bolt");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Electro Ball");
                        break;
                }
                break;
            case "Ghost":
                pokemon1AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Shadow Ball");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Phantom Force");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Poltergeist");
                        break;
                }
                break;
            case "Fairy":
                pokemon1AbilityButton2.setBackground(pink);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Fleur Cannon");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Fairy Wind");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Dazzling Gleam");
                        break;
                }
                break;
            case "Psychic":
                pokemon1AbilityButton2.setBackground(pink);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Luster Purge");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Prismatic Laser");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Photon Geyser");
                        break;
                }
                break;
            case "Fighting":
                pokemon1AbilityButton2.setBackground(red);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Seismic Toss");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Rolling Kick");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Sky Uppercut");
                        break;
                }
                break;
            case "Rock":
                pokemon1AbilityButton2.setBackground(gray);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Smack Down");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Stone Edge");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Meteor Beam");
                        break;
                }
                break;
            case "Dragon":
                pokemon1AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Dynamax Cannon");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Draco Meteor");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Eternabeam");
                        break;
                }
                break;
            case "Flying":
                pokemon1AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon1AbilityButton2.setText("Beak Blast");
                        break;
                    case 1:
                        pokemon1AbilityButton2.setText("Aerial Ace");
                        break;
                    case 2:
                        pokemon1AbilityButton2.setText("Oblivion Wing");
                        break;
                }
                break;
        }
        
        decider = 5 + rNumber.nextInt(4);
        pokemon1Ability2Damage = decider * pokemon1.getStrength();
        
    }
    
    public void setPokemon2Ability(String type) {
        Random rNumber = new Random();
        int decider = rNumber.nextInt(3);
        switch (type) {
            case "Grass":
                pokemon2AbilityButton2.setBackground(green);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Power Whip");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Petal Blizzard");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Leaf Blade");
                        break;
                }
                break;
            case "Fire":
                pokemon2AbilityButton2.setBackground(red);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Pyro Ball");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Searing Shot");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Lava Plume");
                        break;
                }
                break;
            case "Water":
                pokemon2AbilityButton2.setBackground(blue);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Bubble Beam");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Aqua Jet");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Aqua Tail");
                        break;
                }
                break;
            case "Ice":
                pokemon2AbilityButton2.setBackground(blue);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Icicle Spear");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Ice Beam");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Blizzard");
                        break;
                }
                break;
            case "Bug":
                pokemon2AbilityButton2.setBackground(green);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Bug Bite");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Fell Stinger");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Fury Cutter");
                        break;
                }
                break;
            case "Normal":
                pokemon2AbilityButton2.setBackground(gray);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Fury Swipes");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Cut");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Crush Claw");
                        break;
                }
                break;
            case "Poison":
                pokemon2AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Acid Spray");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Poison Fang");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Poison Sting");
                        break;
                }
                break;
            case "Electric":
                pokemon2AbilityButton2.setBackground(yellow);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Shock Wave");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Fusion Bolt");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Electro Ball");
                        break;
                }
                break;
            case "Ghost":
                pokemon2AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Shadow Ball");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Phantom Force");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Poltergeist");
                        break;
                }
                break;
            case "Fairy":
                pokemon2AbilityButton2.setBackground(pink);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Fleur Cannon");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Fairy Wind");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Dazzling Gleam");
                        break;
                }
                break;
            case "Psychic":
                pokemon2AbilityButton2.setBackground(pink);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Luster Purge");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Prismatic Laser");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Photon Geyser");
                        break;
                }
                break;
            case "Fighting":
                pokemon2AbilityButton2.setBackground(red);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Seismic Toss");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Rolling Kick");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Sky Uppercut");
                        break;
                }
                break;
            case "Rock":
                pokemon2AbilityButton2.setBackground(gray);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Smack Down");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Stone Edge");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Meteor Beam");
                        break;
                }
                break;
            case "Dragon":
                pokemon2AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Dynamax Cannon");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Draco Meteor");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Eternabeam");
                        break;
                }
                break;
            case "Flying":
                pokemon2AbilityButton2.setBackground(purple);
                switch (decider) {
                    case 0:
                        pokemon2AbilityButton2.setText("Beak Blast");
                        break;
                    case 1:
                        pokemon2AbilityButton2.setText("Aerial Ace");
                        break;
                    case 2:
                        pokemon2AbilityButton2.setText("Oblivion Wing");
                        break;
                }
                break;
        }
        
        decider = 5 + rNumber.nextInt(4);
        pokemon2Ability2Damage = decider * pokemon1.getStrength();
        
    }
    
    public void pokemon1Randomize() {
        Random rNumber = new Random();
        int firstDigit = rNumber.nextInt(2);
        int secondDigit = rNumber.nextInt(10);
        int thirdDigit = rNumber.nextInt(10);
        int randomID = Integer.parseInt("" + firstDigit + secondDigit + thirdDigit);
        if (randomID > 151) {
            pokemon1Randomize();
        } else {
            setPokemon1("" + firstDigit + secondDigit + thirdDigit);
            pokemon1IDTextField.setText("" + firstDigit + secondDigit + thirdDigit);
        }
    }
    
    public void pokemon2Randomize() {
        Random rNumber = new Random();
        int firstDigit = rNumber.nextInt(2);
        int secondDigit = rNumber.nextInt(10);
        int thirdDigit = rNumber.nextInt(10);
        int randomID = Integer.parseInt("" + firstDigit + secondDigit + thirdDigit);
        if (randomID > 151) {
            pokemon2Randomize();
        } else {
            setPokemon2("" + firstDigit + secondDigit + thirdDigit);
            pokemon2IDTextField.setText("" + firstDigit + secondDigit + thirdDigit);
        }
    }
    
    public void pokemon1Ability1Used() {
        Random rNumber = new Random();
        if (pokemon1Turn == true) {
            pokemon2.setHP(pokemon2.getHP() - 5 - rNumber.nextInt(5) + rNumber.nextInt(5));
            pokemon2HPLabel.setText("HP: " + pokemon2.getHP());
            abilityUsedLabel.setText(pokemon1.getNickname() + " used " + pokemon1AbilityButton1.getText() + "!");
        }
        disablePokemon1Buttons();
        endBattleCheck();
    }
    
    public void pokemon1Ability2Used() {
        Random rNumber = new Random();
        int adjustedDamage = pokemon1Ability2Damage + rNumber.nextInt(10) - rNumber.nextInt(10);
        if (pokemon1EffectiveCheck().equals("More Effective")) {
            adjustedDamage = adjustedDamage * 2;
            effectivenessLabel.setText("It was super effective!");
        } else if (pokemon1EffectiveCheck().equals("Less Effective")) {
            adjustedDamage = adjustedDamage / 2;
            effectivenessLabel.setText("It wasn't very effective..");
        } else if (pokemon1EffectiveCheck().equals("Not Effective")) {
            adjustedDamage = 0;
            effectivenessLabel.setText("It had no effect.");
        } else {
            effectivenessLabel.setText("");
        }
        if (pokemon1Turn == true) {
            pokemon2.setHP(pokemon2.getHP() - adjustedDamage);
            pokemon2HPLabel.setText("HP: " + pokemon2.getHP());
            abilityUsedLabel.setText(pokemon1.getNickname() + " used " + pokemon1AbilityButton2.getText() + "!");
        }
        disablePokemon1Buttons();
        endBattleCheck();
    }
    
    public void pokemon2Ability1Used() {
        Random rNumber = new Random();
        if (pokemon1Turn == false) {
            pokemon1.setHP(pokemon1.getHP() - 5 - rNumber.nextInt(5) + rNumber.nextInt(5));
            pokemon1HPLabel.setText("HP: " + pokemon1.getHP());
            abilityUsedLabel.setText(pokemon2.getNickname() + " used " + pokemon2AbilityButton1.getText() + "!");
        }
        disablePokemon2Buttons();
        endBattleCheck();
    }
    
    public void pokemon2Ability2Used() {
        Random rNumber = new Random();
        int adjustedDamage = pokemon2Ability2Damage + rNumber.nextInt(10) - rNumber.nextInt(10);
        if (pokemon2EffectiveCheck().equals("More Effective")) {
            adjustedDamage = adjustedDamage * 2;
            effectivenessLabel.setText("It was super effective!");
        } else if (pokemon2EffectiveCheck().equals("Less Effective")) {
            adjustedDamage = adjustedDamage / 2;
            effectivenessLabel.setText("It wasn't very effective...");
        } else if (pokemon2EffectiveCheck().equals("Not Effective")) {
            adjustedDamage = 0;
            effectivenessLabel.setText("It had no effect.");
        } else {
            effectivenessLabel.setText("");
        }
        if (pokemon1Turn == false) {
            pokemon1.setHP(pokemon1.getHP() - adjustedDamage);
            pokemon1HPLabel.setText("HP: " + pokemon1.getHP());
            abilityUsedLabel.setText(pokemon2.getNickname() + " used " + pokemon2AbilityButton2.getText() + "!");
        }
        disablePokemon2Buttons();
        endBattleCheck();
    }
    
    public String pokemon1EffectiveCheck() {
        switch (pokemon1.getType()) {
            //Grass, Fire, Water, Ice, Bug, Normal, Poison, Electric, Ghost, Psychic, Fairy, Fighting, Rock, Dragon, Flying
            case "Grass":
                if (pokemon2.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Water")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Bug")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
            case "Fire":
                if (pokemon2.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
                case "Water":
                if (pokemon2.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
            case "Ice":
                if (pokemon2.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ice")) {
                    return "Less Effective";
                }
                break;
            case "Bug":
                if (pokemon2.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Psychic")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Fighting")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ghost")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fairy")) {
                    return "Less Effective";
                }
                break;
            case "Normal":
                if (pokemon2.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ghost")) {
                    return "Not Effective";
                }
            break;
                case "Poison":
                if (pokemon2.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Fairy")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ground")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ghost")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Not Effective";
                }
                break;
            case "Electric":
                if (pokemon2.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Water")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Electric")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ground")) {
                    return "Not Effective";
                }
                break;
            case "Ghost":
                if (pokemon2.getType().equals("Ghost")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Psychic")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dark")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Normal")) {
                    return "Not Effective";
                }
                break;
            case "Psychic":
                if (pokemon2.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Psychic")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Dark")) {
                    return "Not Effective";
                }
            case "Fairy":
                if (pokemon2.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "Less Effective";
                }
                break;
            case "Fighting":
                if (pokemon2.getType().equals("Normal")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Bug")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Psychic")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fairy")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ghost")) {
                    return "Not Effective";
                }
                break;
            case "Rock":
                if (pokemon2.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Fire")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Fighting")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Ground")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                break;
            case "Dragon":
                if (pokemon2.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Fairy")) {
                    return "Not Effective";
                }
                break;
            case "Flying":
                if (pokemon2.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon2.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon2.getType().equals("Electric")) {
                    return "Less Effective";
                }
                break;
        }
        return "No Particular Effectiveness";
    }
    
    public String pokemon2EffectiveCheck() {
        switch (pokemon2.getType()) {
            //Grass, Fire, Water, Ice, Bug, Normal, Poison, Electric, Ghost, Psychic, Fairy, Fighting, Rock, Dragon, Flying
            case "Grass":
                if (pokemon1.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Water")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Bug")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
            case "Fire":
                if (pokemon1.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
                case "Water":
                if (pokemon1.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                break;
            case "Ice":
                if (pokemon1.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Ground")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Water")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ice")) {
                    return "Less Effective";
                }
                break;
            case "Bug":
                if (pokemon1.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Psychic")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Fighting")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ghost")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fairy")) {
                    return "Less Effective";
                }
                break;
            case "Normal":
                if (pokemon1.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ghost")) {
                    return "Not Effective";
                }
            break;
                case "Poison":
                if (pokemon1.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Fairy")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ground")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ghost")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Not Effective";
                }
                break;
            case "Electric":
                if (pokemon1.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Water")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Electric")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ground")) {
                    return "Not Effective";
                }
                break;
            case "Ghost":
                if (pokemon1.getType().equals("Ghost")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Psychic")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dark")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Normal")) {
                    return "Not Effective";
                }
                break;
            case "Psychic":
                if (pokemon1.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Psychic")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Dark")) {
                    return "Not Effective";
                }
            case "Fairy":
                if (pokemon1.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "Less Effective";
                }
                break;
            case "Fighting":
                if (pokemon1.getType().equals("Normal")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Dark")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Flying")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Poison")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Bug")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Psychic")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fairy")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ghost")) {
                    return "Not Effective";
                }
                break;
            case "Rock":
                if (pokemon1.getType().equals("Flying")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Fire")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Ice")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Fighting")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Ground")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                break;
            case "Dragon":
                if (pokemon1.getType().equals("Dragon")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Fairy")) {
                    return "Not Effective";
                }
                break;
            case "Flying":
                if (pokemon1.getType().equals("Fighting")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Bug")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Grass")) {
                    return "More Effective";
                }
                if (pokemon1.getType().equals("Rock")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Steel")) {
                    return "Less Effective";
                }
                if (pokemon1.getType().equals("Electric")) {
                    return "Less Effective";
                }
                break;
        }
        return "No Particular Effectiveness";
    }

    public void endBattleCheck() {
        
        if (pokemon2.getHP() <= 0) {
            pokemon2.setHP(0);
            pokemon2HPLabel.setText("HP: " + pokemon2.getHP());
            abilityUsedLabel.setText(pokemon1.getNickname() + " has won the battle!");
            pokemon1Icon.setBackground(yellow);
            pokemon2Icon.setBackground(black);
            effectivenessLabel.setText("");
            pokemon1AbilityButton1.setEnabled(false);
            pokemon1AbilityButton2.setEnabled(false);
            pokemon2AbilityButton1.setEnabled(false);
            pokemon2AbilityButton2.setEnabled(false);
        } else if (pokemon1.getHP() <= 0) {
            pokemon1.setHP(0);
            pokemon1HPLabel.setText("HP: " + pokemon1.getHP());
            abilityUsedLabel.setText(pokemon2.getNickname() + " has won the battle!");
            pokemon2Icon.setBackground(yellow);
            pokemon1Icon.setBackground(black);
            effectivenessLabel.setText("");
            pokemon1AbilityButton1.setEnabled(false);
            pokemon1AbilityButton2.setEnabled(false);
            pokemon2AbilityButton1.setEnabled(false);
            pokemon2AbilityButton2.setEnabled(false);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokemon1Panel = new javax.swing.JPanel();
        pokemon1Icon = new javax.swing.JLabel();
        pokemon1NameLabel = new javax.swing.JLabel();
        pokemon1HPLabel = new javax.swing.JLabel();
        pokemon1IDPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pokemon1SetButton = new javax.swing.JButton();
        pokemon1IDTextField = new javax.swing.JTextField();
        pokemon1RandomButton = new javax.swing.JButton();
        pokemon1NicknamePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pokemon1NicknameTextField = new javax.swing.JTextField();
        pokemon1SetNicknameButton = new javax.swing.JButton();
        pokemon1AbilityButton1 = new javax.swing.JButton();
        pokemon1AbilityButton2 = new javax.swing.JButton();
        pokemon2Panel = new javax.swing.JPanel();
        pokemon2NameLabel = new javax.swing.JLabel();
        pokemon2HPLabel = new javax.swing.JLabel();
        pokemon2IDPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pokemon2IDTextField = new javax.swing.JTextField();
        pokemon2SetButton = new javax.swing.JButton();
        pokemon2RandomButton = new javax.swing.JButton();
        pokemon1NicknamePanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pokemon2NicknameTextField = new javax.swing.JTextField();
        pokemon2SetNicknameButton = new javax.swing.JButton();
        pokemon2Icon = new javax.swing.JLabel();
        pokemon2AbilityButton2 = new javax.swing.JButton();
        pokemon2AbilityButton1 = new javax.swing.JButton();
        abilityUsedLabel = new javax.swing.JLabel();
        effectivenessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pokemon1Panel.setBackground(new java.awt.Color(204, 0, 0));
        pokemon1Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pokemon1Icon.setBackground(new java.awt.Color(153, 204, 255));
        pokemon1Icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1Icon.setOpaque(true);

        pokemon1NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        pokemon1NameLabel.setFont(new java.awt.Font("Silom", 0, 36)); // NOI18N
        pokemon1NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon1NameLabel.setText("?");
        pokemon1NameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1NameLabel.setOpaque(true);

        pokemon1HPLabel.setBackground(new java.awt.Color(255, 255, 255));
        pokemon1HPLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        pokemon1HPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon1HPLabel.setText("HP: ?");
        pokemon1HPLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1HPLabel.setOpaque(true);

        pokemon1IDPanel.setBackground(new java.awt.Color(255, 153, 153));
        pokemon1IDPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        pokemon1SetButton.setBackground(new java.awt.Color(255, 102, 102));
        pokemon1SetButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon1SetButton.setText("Set");
        pokemon1SetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1SetButton.setOpaque(true);
        pokemon1SetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon1SetButtonActionPerformed(evt);
            }
        });

        pokemon1IDTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pokemon1IDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1IDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon1IDTextFieldMouseClicked(evt);
            }
        });

        pokemon1RandomButton.setBackground(new java.awt.Color(255, 102, 102));
        pokemon1RandomButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon1RandomButton.setText("Random");
        pokemon1RandomButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1RandomButton.setOpaque(true);
        pokemon1RandomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon1RandomButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon1IDPanelLayout = new javax.swing.GroupLayout(pokemon1IDPanel);
        pokemon1IDPanel.setLayout(pokemon1IDPanelLayout);
        pokemon1IDPanelLayout.setHorizontalGroup(
            pokemon1IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1IDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pokemon1SetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pokemon1IDPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon1IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pokemon1IDPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pokemon1RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pokemon1IDPanelLayout.setVerticalGroup(
            pokemon1IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1IDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemon1IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(pokemon1SetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pokemon1RandomButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pokemon1NicknamePanel.setBackground(new java.awt.Color(255, 153, 153));
        pokemon1NicknamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Nickname:");

        pokemon1NicknameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pokemon1SetNicknameButton.setBackground(new java.awt.Color(255, 102, 102));
        pokemon1SetNicknameButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon1SetNicknameButton.setText("Set");
        pokemon1SetNicknameButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1SetNicknameButton.setOpaque(true);
        pokemon1SetNicknameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon1SetNicknameButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon1NicknamePanelLayout = new javax.swing.GroupLayout(pokemon1NicknamePanel);
        pokemon1NicknamePanel.setLayout(pokemon1NicknamePanelLayout);
        pokemon1NicknamePanelLayout.setHorizontalGroup(
            pokemon1NicknamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1NicknamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon1NicknameTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon1SetNicknameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pokemon1NicknamePanelLayout.setVerticalGroup(
            pokemon1NicknamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1NicknamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1NicknamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon1SetNicknameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon1NicknameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );

        pokemon1AbilityButton1.setBackground(new java.awt.Color(255, 255, 255));
        pokemon1AbilityButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon1AbilityButton1.setText("Scratch");
        pokemon1AbilityButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1AbilityButton1.setOpaque(true);
        pokemon1AbilityButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon1AbilityButton1MouseClicked(evt);
            }
        });

        pokemon1AbilityButton2.setBackground(java.awt.Color.gray);
        pokemon1AbilityButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon1AbilityButton2.setText("X");
        pokemon1AbilityButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon1AbilityButton2.setOpaque(true);
        pokemon1AbilityButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon1AbilityButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon1PanelLayout = new javax.swing.GroupLayout(pokemon1Panel);
        pokemon1Panel.setLayout(pokemon1PanelLayout);
        pokemon1PanelLayout.setHorizontalGroup(
            pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pokemon1Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(pokemon1PanelLayout.createSequentialGroup()
                        .addComponent(pokemon1NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon1HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pokemon1PanelLayout.createSequentialGroup()
                        .addComponent(pokemon1IDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pokemon1AbilityButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pokemon1AbilityButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pokemon1NicknamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pokemon1PanelLayout.setVerticalGroup(
            pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pokemon1HPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon1NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon1Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokemon1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pokemon1PanelLayout.createSequentialGroup()
                        .addComponent(pokemon1AbilityButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon1AbilityButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon1NicknamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pokemon1IDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pokemon2Panel.setBackground(new java.awt.Color(51, 51, 255));
        pokemon2Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pokemon2NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        pokemon2NameLabel.setFont(new java.awt.Font("Silom", 0, 36)); // NOI18N
        pokemon2NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon2NameLabel.setText("?");
        pokemon2NameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2NameLabel.setOpaque(true);

        pokemon2HPLabel.setBackground(new java.awt.Color(255, 255, 255));
        pokemon2HPLabel.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        pokemon2HPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon2HPLabel.setText("HP: ?");
        pokemon2HPLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2HPLabel.setOpaque(true);

        pokemon2IDPanel.setBackground(new java.awt.Color(153, 153, 255));
        pokemon2IDPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("ID:");

        pokemon2IDTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pokemon2IDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2IDTextField.setOpaque(true);
        pokemon2IDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon2IDTextFieldMouseClicked(evt);
            }
        });

        pokemon2SetButton.setBackground(new java.awt.Color(102, 102, 255));
        pokemon2SetButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon2SetButton.setText("Set");
        pokemon2SetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2SetButton.setOpaque(true);
        pokemon2SetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon2SetButtonActionPerformed(evt);
            }
        });

        pokemon2RandomButton.setBackground(new java.awt.Color(102, 102, 255));
        pokemon2RandomButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon2RandomButton.setText("Random");
        pokemon2RandomButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2RandomButton.setOpaque(true);
        pokemon2RandomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon2RandomButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon2IDPanelLayout = new javax.swing.GroupLayout(pokemon2IDPanel);
        pokemon2IDPanel.setLayout(pokemon2IDPanelLayout);
        pokemon2IDPanelLayout.setHorizontalGroup(
            pokemon2IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon2IDPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pokemon2IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pokemon2SetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pokemon2IDPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon2IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pokemon2RandomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        pokemon2IDPanelLayout.setVerticalGroup(
            pokemon2IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon2IDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon2IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemon2IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pokemon2SetButton)
                .addGap(12, 12, 12)
                .addComponent(pokemon2RandomButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pokemon1NicknamePanel1.setBackground(new java.awt.Color(153, 153, 255));
        pokemon1NicknamePanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Nickname:");

        pokemon2NicknameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2NicknameTextField.setOpaque(true);

        pokemon2SetNicknameButton.setBackground(new java.awt.Color(102, 102, 255));
        pokemon2SetNicknameButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon2SetNicknameButton.setText("Set");
        pokemon2SetNicknameButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2SetNicknameButton.setOpaque(true);
        pokemon2SetNicknameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon2SetNicknameButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon1NicknamePanel1Layout = new javax.swing.GroupLayout(pokemon1NicknamePanel1);
        pokemon1NicknamePanel1.setLayout(pokemon1NicknamePanel1Layout);
        pokemon1NicknamePanel1Layout.setHorizontalGroup(
            pokemon1NicknamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1NicknamePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon2NicknameTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon2SetNicknameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pokemon1NicknamePanel1Layout.setVerticalGroup(
            pokemon1NicknamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon1NicknamePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon1NicknamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon2SetNicknameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon2NicknameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap())
        );

        pokemon2Icon.setBackground(new java.awt.Color(153, 204, 255));
        pokemon2Icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2Icon.setOpaque(true);

        pokemon2AbilityButton2.setBackground(new java.awt.Color(255, 255, 255));
        pokemon2AbilityButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon2AbilityButton2.setText("X");
        pokemon2AbilityButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2AbilityButton2.setEnabled(false);
        pokemon2AbilityButton2.setOpaque(true);
        pokemon2AbilityButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon2AbilityButton2MouseClicked(evt);
            }
        });

        pokemon2AbilityButton1.setBackground(new java.awt.Color(255, 255, 255));
        pokemon2AbilityButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pokemon2AbilityButton1.setText("Scratch");
        pokemon2AbilityButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pokemon2AbilityButton1.setEnabled(false);
        pokemon2AbilityButton1.setOpaque(true);
        pokemon2AbilityButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemon2AbilityButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pokemon2PanelLayout = new javax.swing.GroupLayout(pokemon2Panel);
        pokemon2Panel.setLayout(pokemon2PanelLayout);
        pokemon2PanelLayout.setHorizontalGroup(
            pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pokemon2PanelLayout.createSequentialGroup()
                        .addComponent(pokemon2NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon2HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pokemon2PanelLayout.createSequentialGroup()
                        .addComponent(pokemon2Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pokemon2PanelLayout.createSequentialGroup()
                        .addComponent(pokemon2IDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pokemon1NicknamePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pokemon2AbilityButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pokemon2AbilityButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pokemon2PanelLayout.setVerticalGroup(
            pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokemon2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pokemon2HPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pokemon2NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon2Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokemon2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pokemon2PanelLayout.createSequentialGroup()
                        .addComponent(pokemon2AbilityButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon2AbilityButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemon1NicknamePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pokemon2IDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abilityUsedLabel.setFont(new java.awt.Font("Silom", 3, 30)); // NOI18N
        abilityUsedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abilityUsedLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        effectivenessLabel.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        effectivenessLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        effectivenessLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pokemon1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(effectivenessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(abilityUsedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pokemon2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pokemon1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abilityUsedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(effectivenessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pokemon1SetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon1SetButtonActionPerformed
        setPokemon1(pokemon1IDTextField.getText());
    }//GEN-LAST:event_pokemon1SetButtonActionPerformed

    private void pokemon1IDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon1IDTextFieldMouseClicked
        pokemon1IDTextField.selectAll();
    }//GEN-LAST:event_pokemon1IDTextFieldMouseClicked

    private void pokemon1SetNicknameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon1SetNicknameButtonMouseClicked
        pokemon1.setNickname(pokemon1NicknameTextField.getText());
        pokemon1NameLabel.setText(pokemon1.getNickname());
    }//GEN-LAST:event_pokemon1SetNicknameButtonMouseClicked

    private void pokemon1AbilityButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon1AbilityButton1MouseClicked
        pokemon1Ability1Used();
    }//GEN-LAST:event_pokemon1AbilityButton1MouseClicked

    private void pokemon1AbilityButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon1AbilityButton2MouseClicked
        pokemon1Ability2Used();
    }//GEN-LAST:event_pokemon1AbilityButton2MouseClicked

    private void pokemon1RandomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon1RandomButtonMouseClicked
        pokemon1Randomize();
    }//GEN-LAST:event_pokemon1RandomButtonMouseClicked

    private void pokemon2AbilityButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon2AbilityButton1MouseClicked
        pokemon2Ability1Used();
    }//GEN-LAST:event_pokemon2AbilityButton1MouseClicked

    private void pokemon2AbilityButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon2AbilityButton2MouseClicked
        pokemon2Ability2Used();
    }//GEN-LAST:event_pokemon2AbilityButton2MouseClicked

    private void pokemon2SetNicknameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon2SetNicknameButtonMouseClicked
        pokemon2.setNickname(pokemon2NicknameTextField.getText());
        pokemon2NameLabel.setText(pokemon2.getNickname());
    }//GEN-LAST:event_pokemon2SetNicknameButtonMouseClicked

    private void pokemon2RandomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon2RandomButtonMouseClicked
        pokemon2Randomize();
    }//GEN-LAST:event_pokemon2RandomButtonMouseClicked

    private void pokemon2SetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon2SetButtonActionPerformed
        setPokemon2(pokemon2IDTextField.getText());
    }//GEN-LAST:event_pokemon2SetButtonActionPerformed

    private void pokemon2IDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemon2IDTextFieldMouseClicked
        pokemon2IDTextField.selectAll();
    }//GEN-LAST:event_pokemon2IDTextFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abilityUsedLabel;
    private javax.swing.JLabel effectivenessLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton pokemon1AbilityButton1;
    private javax.swing.JButton pokemon1AbilityButton2;
    private javax.swing.JLabel pokemon1HPLabel;
    private javax.swing.JPanel pokemon1IDPanel;
    private javax.swing.JTextField pokemon1IDTextField;
    private javax.swing.JLabel pokemon1Icon;
    private javax.swing.JLabel pokemon1NameLabel;
    private javax.swing.JPanel pokemon1NicknamePanel;
    private javax.swing.JPanel pokemon1NicknamePanel1;
    private javax.swing.JTextField pokemon1NicknameTextField;
    private javax.swing.JPanel pokemon1Panel;
    private javax.swing.JButton pokemon1RandomButton;
    private javax.swing.JButton pokemon1SetButton;
    private javax.swing.JButton pokemon1SetNicknameButton;
    private javax.swing.JButton pokemon2AbilityButton1;
    private javax.swing.JButton pokemon2AbilityButton2;
    private javax.swing.JLabel pokemon2HPLabel;
    private javax.swing.JPanel pokemon2IDPanel;
    private javax.swing.JTextField pokemon2IDTextField;
    private javax.swing.JLabel pokemon2Icon;
    private javax.swing.JLabel pokemon2NameLabel;
    private javax.swing.JTextField pokemon2NicknameTextField;
    private javax.swing.JPanel pokemon2Panel;
    private javax.swing.JButton pokemon2RandomButton;
    private javax.swing.JButton pokemon2SetButton;
    private javax.swing.JButton pokemon2SetNicknameButton;
    // End of variables declaration//GEN-END:variables
}
