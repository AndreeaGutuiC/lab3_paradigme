package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.util.StringRandomizer;

import java.util.Random;

public class PasswordMaker {
    static final int MAGIC_NUMBER = 5;
    static  String MAGIC_STRING;
    private String password;
    private String name;
    private static PasswordMaker instance;
    static{
        instance = null;
    }

    private PasswordMaker(){
        this.name = name;
        this.password = password;
    }

    java.util.Random rand = new java.util.Random();

    public String randomString(int n) {
        int countLetters = 'z' - 'a';
        char result[] = new char[n];

        for(int i=0; i<n; i++) {
            result[i] = (char)('a' + rand.nextInt(countLetters));
        }
        return new String(result);
    }
    public String randomString(int n, String alphabet) {
        int countLetters = alphabet.length();
        char result[] = new char[n];
        for(int i=0; i<n; i++) {
            result[i] = alphabet.charAt(rand.nextInt(countLetters));
        }

        return new String(result);


    }
    private int randomNumber() {
        return rand.nextInt(101);
    }

    public String getPassword(String name){

        String lungime;
        lungime = " " + name.length();
        password = randomString(MAGIC_NUMBER) + randomString(MAGIC_NUMBER, name) +name.length() + randomNumber();
        return password;
    }

    public static PasswordMaker getInstance(){
        if(instance == null){
            instance = new PasswordMaker();
        }
        return instance;
    }

}
