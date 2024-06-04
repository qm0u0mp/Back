### Sprign Project 생성
f1- spring create gradle .. - 3.1.11 - java - com.경로명 - 파일명 - War - 17

spring web(build)
lombok
validation
mysql driver
jpa
security
oauth2 client security
=> selected

### Build
./gradlew clean build

### 배포
java -jar build/libs/back-1.jar
=> 브라우저 : localhost:4000 실행 시 local 환경에서 실행 중 ...
java -jar -Dspring.profiles.active=development build/libs/back-1.jar
=> 브라우저 : localhost:4000 실행 시 development환경에서 실행 중 ...
