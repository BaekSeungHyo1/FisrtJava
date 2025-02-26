package chap_01;

public class Java_Notes {
    //자바 프로젝트에서 VCS(버전 관리 시스템, 예: Git)에 .jar 파일과 .properties 파일을 추가하는 것이 일반적으로 권장되지 않는 이유
    /** 1. Jar 파일
    빌드 산출물 관리 문제: .jar 파일은 보통 프로젝트를 빌드하면서 생성되므로, VCS에 포함하면 불필요하게 저장소가 커지고, 매번 빌드할 때마다 변경 사항이 생길 수 있음.
    의존성 관리 문제: .jar 파일을 직접 추가하면, 개발자가 직접 추가하고 관리해야 하는 부담이 생김. Maven 또는 Gradle 같은 의존성 관리 도구를 사용하여 pom.xml 또는 build.gradle을 VCS에 추가하는 것이 더 좋은 방법.
    충돌 가능성: 여러 개발자가 각자 다른 버전의 .jar 파일을 커밋하면, 충돌이 발생할 가능성이 높음.

    해결 방법:
     • gitignore 파일에 *.jar을 추가하여 VCS에서 제외.
     • Maven/Gradle을 사용하여 의존성을 관리하고, pom.xml 또는 build.gradle 파일만 VCS에 추가.
     **/

    /** 2. Properties 파일
    환경 설정 정보 포함 가능성: .properties 파일에는 DB 연결 정보, API 키, 비밀번호 등의 민감한 데이터가 포함될 수 있음. 이를 VCS에 올리면 보안 문제가 발생할 수 있음.
    환경별 설정 차이: 개발 환경, 테스트 환경, 운영 환경별로 다른 설정이 필요할 수 있음. 특정 환경의 설정을 VCS에 올리면, 다른 환경에서 충돌이 발생할 수 있음.

    해결 방법:
     •gitignore 파일에 *.properties 추가.
     •properties.template 또는 .env.example 파일을 만들어 기본 형식만 제공하고, 실제 .properties 파일은 개발자가 직접 생성하도록 유도.
    Spring Boot의 경우, application.properties 대신 application.yml을 사용하고 환경 변수 기반으로 설정을 관리.
    **/
}
