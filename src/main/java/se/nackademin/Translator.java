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
class WordList {
    String[] adjective = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk"};
    String[] noun = {"en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
    String[] verb = {"spring", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa"};
    String[][] wordList = {adjective, noun, verb};
}
public class Translator {
    int[] abcde = magicNumbers.calculate();
    public String fortuneText;
    fortuneText = translate(abcde);
}
public String translate(int []){
    String[] word;
    word[0] = adjective[abcde[0]];
    word[1] = verb[abcde[1]];
    word[2] = noun[abcde[2]];
    word[3] = verb[abcde[3]];
    word[4] = adjective[abcde[4]];
    String fortune_text;
    fortuneText = String.format("Din framtid är %d. Du borde sluta %d. " +
                                 "Vi ser att du snart kommer att skaffa " + 
                                 "%d. Snart kommer du att vilja %d, men " +
                                 "då är det viktigt att du är %d.", word[0], word[1], word[2], word[3], word[4]);
    return fortuneText;
}
