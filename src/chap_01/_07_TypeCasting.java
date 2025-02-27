package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형 변환 TypeCasting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0
        float score_f=93.3f; //
        double score_D=98.8;
        System.out.println((int) score_f); //93
        System.out.println((int) score_D); //98
        score = 93 + (int) 93;
        System.out.println(score);

        score_D = 93 + 98.8; // 정수 + 실수인경우, 자동으로 정수는 실수로 계산이됨 ex 93 -> 93.0
        System.out.println(score_D); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreint = (int)score_D; // incompatible types: possible lossy conversion from float to int
        // double -> float -> long ->int (수동 형변환) ex) (int)를 수동으로 넣어주기! // (자료형 불일치: float에서 int로 변환하는 과정에서 데이터 손실 가능)

    }
}
