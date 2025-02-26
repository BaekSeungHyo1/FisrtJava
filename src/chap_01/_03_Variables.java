package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "백승효"; // 문자열 변수 정하기
        int hour = 15;

        System.out.println(name + "님, 곧 배송을 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println("님, 배송이 완료되었습니다");

        double score = 90.5; // 실수 자료형(평균 점수를 내기 위해 double 사용)&상대적으로 아주 정밀한 데이터 표현 적합
        char grade = 'A'; //한 글자인 경우 작은 따옴표 사용 & 하나의 문자는 char
        name = "강백호";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true; //참과 거짓을 판별하는 불리안(true와 false는 "" 사용X
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789; // 실수 표현
        float f = 3.14123456789F; //double과 같이 정밀한 데이터 표현이 안 되므로 3.14를 double값으로 넣을 수가 없음. -> 뒤에 F를 넣으면 float 자료형으로 변환이 됨
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; //정수 범위 21억을 초과하지 않으면 int사용 초과일 경우 long 자료 사용하기
        System.out.println(l);

    }
}
