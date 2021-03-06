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
    public int[] calculate() {
        int[] abcde;
        abcde = new int[5];
        abcde[0] = calculateA();
        abcde[1] = calculateB();
        abcde[2] = calculateC();
        abcde[3] = calculateD();
        abcde[4] = calculateE();
        return abcde;
    }
    public int calculateA() {
        int a = charCounter(this.name, ' ') + 1;
        a = a + this.age;
        while(a > 10){
            a = a - 7;
        }
        return a;
    }

    public int calculateB() {
        int b = this.location.length();
        b = b + this.income;
        while(b > 10){
            b = b - 7;
        }
        return b;
    }

    public int calculateC() {
        int c = calculateA() + calculateB() - this.height; 
        while(c < 0){
            c = c + 10;
        }
        return c;
    }

    public int calculateD() {
        int d = calculateA();
        if(d > 5){
            d = d + calculateB();
        }
        if(d <= 5){
            d = d + calculateC();
        }
        d = d - this.income;
        while(d < 0){
            d = d + 10;        
        }
        return d;
    }

    public int calculateE() {
        double e = this.age * this.income;
        e = e * this.income;
        e = e * this.height;
        e = Math.sqrt(e);
        while(e > 10){
            e = e / 2;
        }
        e = Math.round(e);
        int intE = (int) e;
        return intE;
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
