import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {
		
		
		
	}
	
	
class TwoDimArray1 {
			private String[] name = { "ȫ�浿", "�̼���", "������", "������", "�̼���" };

			public void getRank() {
				int[][] score = { { 70, 80, 60, 0, 0, 1 }, { 80, 90, 90, 0, 0, 1 }, { 90, 80, 90, 0, 0, 1 },
						{ 75, 80, 80, 0, 0, 1 }, { 60, 70, 60, 0, 0, 1 } };

				// ���� �� ���
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j < 3; j++) {
						score[i][3] = score[i][3] + score[i][j];
					}
					score[i][4] = score[i][3] / 3;
				}

				// ���
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j < score.length; j++) {
						if (score[i][3] < score[j][3]) {
							score[i][5]++;
						}
					}
				}

				// ���� ����
				Arrays.sort(score, (a, b) -> Integer.compare(b[5], a[5])); // ����� �������� �������� ����

				System.out.println("       **** ����ǥ ****");
				System.out.println("--------------------------------------");
				System.out.println("�̸�       ����        ����       ����       ����       ���     ���");
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


