package java_al.level_0;

/*
 * Search max and min value of an array
 */
public class MaxMinValue {

    public static void main(String[] args) {
        findMinMaxTestScore();
    }

    public static void findMinMaxTestScore() {
        final int[] testScores = { 20, 30, 44, 55, 10, 2, 22, 90, 87, 50 };
        int highestScoreIndex = testScores[0];
        int lowestScoreIndex = testScores[0];
        int highestScore = 0;
        int lowestScore = 0;

        System.out.println("List Of Student Test Scores : ");
        System.out.print(testScores[0] + ", ");
        for (int i = 1; i < testScores.length; i++) {
            System.out.print(testScores[i] + ", ");

            if (highestScoreIndex > testScores[i]) {
                highestScore = highestScoreIndex;
            } else {
                highestScoreIndex = testScores[i];
                highestScore = testScores[i];
            }

            if (lowestScoreIndex < testScores[i]) {
                lowestScore = lowestScoreIndex;
            } else {
                lowestScoreIndex = testScores[i];
                lowestScore = testScores[i];
            }
        }
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Highest Test Score : " + highestScore);
        System.out.println("Lower Test Score : " + lowestScore);
    }
}
