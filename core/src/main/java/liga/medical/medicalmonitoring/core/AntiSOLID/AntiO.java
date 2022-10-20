package liga.medical.medicalmonitoring.core.AntiSOLID;

public class AntiO {
    public int operation(Integer a, Integer b, Character character){
        int res;
        if (character.equals('+')){
            res = a + b;
        } else if (character.equals('-')) {
            res = a - b;
        } else if (character.equals('*')){
            res = a * b;
        } else {
            res = 0;
        }
        return res;
    }
}
