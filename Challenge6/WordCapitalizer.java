package Teme.Challenge6;

public class WordCapitalizer {

    public static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder();

        //incepe noua fraza
        boolean newWord = true;

        //verificam fiecare litera
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // verificam sa fie caracter
            if (Character.isLetter(ch)) {
                // modificam doar primul caracter al cuvantului
                if (newWord) {
                    result.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            } else {
                //adaugam caracterele intr-un cuvant
                result.append(ch);


                newWord = true;
            }
        }

        return result.toString();
    }
}

