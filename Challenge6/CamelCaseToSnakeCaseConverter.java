package Teme.Challenge6;

public class CamelCaseToSnakeCaseConverter {

    public static String convertToSnakeCase(String camelCase) {

    StringBuilder snakeCase = new StringBuilder();


        for (int i = 0; i < camelCase.length(); i++) {
        char currentChar = camelCase.charAt(i);


        if (i > 0 && Character.isUpperCase(currentChar)) {
            snakeCase.append("_");
        }


        snakeCase.append(Character.toLowerCase(currentChar));
    }

        return snakeCase.toString();
}

}
