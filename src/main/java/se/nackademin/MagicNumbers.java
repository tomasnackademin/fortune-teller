package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;
    
    private int charCounter(String word, char letter){
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(word.charAt(i) == letter){ 
                count = count + 1;
            }    
        }
        return count;
    }

    public int calculateA() {
        int a = 0;
        a = charCounter(name, ' ') + 1;
        a = a + age;
        while(a < 10){
            a = a - 7;
        }
        return a;
    }

    public int calculateB() {
        //TODO: calculate B
        return 0;
    }

    public int calculateC() {
        //TODO: calculate C
        return 0;
    }

    public int calculateD() {
        //TODO: calculate D
        return 0;
    }

    public int calculateE() {
        //TODO: calculate E
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
