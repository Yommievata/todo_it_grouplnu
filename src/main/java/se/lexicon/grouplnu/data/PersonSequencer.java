package se.lexicon.grouplnu.data;

public class PersonSequencer {
    private static int personId;

    public static int nextPersonId(){
        personId = ++personId;
        return personId;
    }
    static void reset(){
        personId = 0;
    }
}

