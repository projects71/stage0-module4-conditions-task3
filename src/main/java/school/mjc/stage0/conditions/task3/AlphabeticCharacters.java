package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char c) {
        if(c >= 'A' && c <= 'Z')
            System.out.println("Consonant");
        else if(c >= 'a' && c <= 'z')
            System.out.println("Vowel");
        else
            System.out.println("wrong alphabet!");
    }
}
