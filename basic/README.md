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
코드 변경 시 터미널에서 다시 실행 후 clean 작업하고 배포 작업 진행

### 배포
java -jar build/libs/back-1.jar
=> 브라우저 : localhost:4000 실행 시 local 환경에서 실행 중 ...
java -jar -Dspring.profiles.active=development build/libs/back-1.jar
=> 브라우저 : localhost:4000 실행 시 development환경에서 실행 중 ...

### mySQL 엑셀 파일 임포트
- E-R Diagram : 
Database -> Syncronize Model with Database -> 넥스트 누르면서 비번, 체크 하기 -> finish
- Schema : 
엑셀 파일 넣을 테이블 컬럼 마우스 우클릭 -> Table Data Import Wizard -> 원하는 엑셀 파일 선택 -> 넥스트 -> finish
