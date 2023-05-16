import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {
		
		
		
	}
	
	
class TwoDimArray1 {
			private String[] name = { "홍길동", "이순신", "정몽주", "강감찬", "이성계" };

			public void getRank() {
				int[][] score = { { 70, 80, 60, 0, 0, 1 }, { 80, 90, 90, 0, 0, 1 }, { 90, 80, 90, 0, 0, 1 },
						{ 75, 80, 80, 0, 0, 1 }, { 60, 70, 60, 0, 0, 1 } };

				// 총점 및 평균
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j < 3; j++) {
						score[i][3] = score[i][3] + score[i][j];
					}
					score[i][4] = score[i][3] / 3;
				}

				// 등수
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j < score.length; j++) {
						if (score[i][3] < score[j][3]) {
							score[i][5]++;
						}
					}
				}

				// 성적 정렬
				Arrays.sort(score, (a, b) -> Integer.compare(b[5], a[5])); // 등수를 기준으로 내림차순 정렬

				System.out.println("       **** 성적표 ****");
				System.out.println("--------------------------------------");
				System.out.println("이름       국어        영어       수학       총점       평균     등수");
				System.out.println("--------------------------------------");
				printScore(score);
			}

			public void printScore(int[][] score) {
				for (int i = 0; i < score.length; i++) {
					System.out.print(name[i] + " ");
					for (int j = 0; j < score[i].length; j++) {
						System.out.printf("%6d", score[i][j]);
					}
					System.out.println();

				}
			}
		}

	}


