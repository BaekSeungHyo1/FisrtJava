package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서(여행)
        String nationally = "대한민국";
        String firstName = "백";
        String lastName = "승효";
        String dateOfBirth = "2003-09-26";
        String residentialAddress = "호텔 주소";
        String purposeOfVisit = "관광";
        String flightNo = "KE625";
        String flightNo_2 = "KE625";
        System.out.println(firstName + lastName + "남의 국적은"+ nationally);
        //System.out.println(firstName + lastName + "님의 국적은" + nationally + "이며", "비행기편은" + flightNo + "입니다.");
        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; // 체류 기간
        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용되는 경우(이름이 크게 중요하지 않을 때)

        int i = 0; // 변수
        String s = "";

        final String CODE = "KR";
        System.out.println(CODE);



    }
}
