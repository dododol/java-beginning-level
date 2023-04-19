package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
    }
}
