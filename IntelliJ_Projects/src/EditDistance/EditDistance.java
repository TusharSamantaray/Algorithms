package EditDistance;

public class EditDistance {
    public static int editDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        //Create a memorization table to store previous calculations
        int [][]Table = new int[2][length1 + 1];

        for (int i=0; i <= length1; i++) Table[0][i] = i;

        for (int i=1; i <= length2; i++) { //For every character in the 2nd word
            for (int j=0; j <= length1; j++) { // Compare every character in the 1st word
                if (j == 0) Table[i % 2][j] = i;
                else if (word1.charAt(j - 1) == word2.charAt(i - 1))
                    Table[i % 2][j] = Table[(i - 1) % 2][j - 1];
                else {
                    Table[i % 2][j] = 1 + Math.min(Table[(i - 1) % 2][j],
                            Math.min(Table[i % 2][j - 1],
                                    Table[(i - 1) % 2][j - 1]));
                }
            }
        }
        return Table[length2 % 2][length1];
    }
}
