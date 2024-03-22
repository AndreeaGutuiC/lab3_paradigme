package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.util.StringRandomizer;

import java.util.Random;

public class PasswordMaker {
    static final int MAGIC_NUMBER = 238;
    static  String MAGIC_STRING;
    String password;
    String name;

    public PasswordMaker(String name){
        this.name = name;
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

    public String getPassword(){

        String lungime;
        lungime = " " + name.length();
        password = randomString(MAGIC_NUMBER) + randomString(MAGIC_NUMBER, name) +name.length() + randomNumber();
        return password;
    }




}
