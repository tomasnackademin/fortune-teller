/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author tomas
 */

public class Translator {
    String[] adjective = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk"};
    String[] noun = {"en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
    String[] verb = {"spring", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa"};
    
    int[] abcde = new int[5];
    abcde = MagicNumbers.calculate();
    String fortuneText;
    fortuneText = translate(abcde[]);

    public String translate(int[]){
    String[] word = new String[5];
    word[0] = adjective[abcde[0]];
    word[1] = verb[abcde[1]];
    word[2] = noun[abcde[2]];
    word[3] = verb[abcde[3]];
    word[4] = adjective[abcde[4]];
    String fortune_text;
    fortuneText = String.format("Din framtid är %s. Du borde sluta %s. " +
                                 "Vi ser att du snart kommer att skaffa " + 
                                 "%s. Snart kommer du att vilja %s, men " +
                                 "då är det viktigt att du är %s.", word[0], word[1], word[2], word[3], word[4]);
    return fortuneText;
    }
}

