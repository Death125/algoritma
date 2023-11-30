/*
 * Search max and min value of an array
 */
const MID_TERM_EXAM_SCORE = [30, 40, 22, 90, 100, 87, 66, 55, 10, 83];
let highestScoreIndex = MID_TERM_EXAM_SCORE[0];
let lowestScoreIndex = MID_TERM_EXAM_SCORE[0];
let highestScore;
let lowestScore;

function findMinMaxExamScore() {
  console.log("List Of Student Midterm Exam Scores : ");
  console.log(MID_TERM_EXAM_SCORE[0]);
  for (let i = 1; i < MID_TERM_EXAM_SCORE.length; i++) {
    console.log(MID_TERM_EXAM_SCORE[i]);
    if (highestScoreIndex > MID_TERM_EXAM_SCORE[i]) {
      highestScore = highestScoreIndex;
    } else {
      highestScoreIndex = MID_TERM_EXAM_SCORE[i];
      highestScore = MID_TERM_EXAM_SCORE[i];
    }

    if (lowestScoreIndex < MID_TERM_EXAM_SCORE[i]) {
      lowestScore = lowestScoreIndex;
    } else {
      lowestScoreIndex = MID_TERM_EXAM_SCORE[i];
      lowestScore = MID_TERM_EXAM_SCORE[i];
    }
  }
  console.log("------------------------------");
  console.log("Highest Midterm Exam Score : " + highestScore);
  console.log("Lowest Midterm Exam Score : " + lowestScore);
}

findMinMaxExamScore();
