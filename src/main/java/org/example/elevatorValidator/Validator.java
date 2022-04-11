package org.example.elevatorValidator;

public class Validator {

    public static boolean isValid(int countFloors, String log) {

        if (log == null || log.isBlank()) {
            return false;
        }

        char[] letters = log.toUpperCase().toCharArray();

        int floor = 1;
        StringBuilder temp = new StringBuilder();
        char lastChar = letters[0]; //getFirst element

        for (char letter : letters) {
            if (letter == 'G') {
                floor++;
            } else {
                floor--;
            }
            if(floor % countFloors >= countFloors){
                return false;
            }
            if (letter == lastChar) {
                temp.append(letter);
            } else {
                temp = new StringBuilder();
                temp.append(letter);
                lastChar = letter;
            }
            if (temp.length() >= countFloors) {
                return false;
            }
        }
        return true;
    }
}
