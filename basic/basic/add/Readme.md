useContext, useReducer 복잡해서 도와주는 라이브러리가 있음
zustand : 상태관리 라이브러리
react-router : SPA에서 url을 상태로 관리하는 라이브러리
axios : HTTP 통신 라이브러리
react-cookie : 브라우저의 쿠키를 관리하는 라이브러리

dayjs, chartjs, react-daum-postcode, socket-id

SELECT *
FROM user
WHERE id = service123 


GET - http://localhost:4000/auth/phone => 토큰 확인
POST - http://localhost:4000/validation => body / raw / 토큰 입력 => phone 출력
GET - http://localhost:4000/main/ => authorization / bearer token / 토큰 입력 => spring boot!!
POST - http://localhost:4000/student/ => authorization / bearer token / 토큰 입력 => 403
GET - http://localhost:4000/auth/phone => authorization / bearer token / 토큰 입력 => 다른 토큰 값 출력
POST - http://localhost:4000/validation 
=> authorization - no auth / body - raw - 다른 토큰 값 입력 => phone 출력
POST - http://localhost:4000/validation
=> authorization - bearer token - 다른 토큰값 입력 / body - raw - 다른 토큰 입력 => 403

GET - http://localhost:4000/auth/phone => 토큰 확인
POST - http://localhost:4000/student/ => no-auth / bearer token => 403
GET - http://localhost:4000/auth/qwer(아무거나) => 토큰 확인
DELETE - http://localhost:4000/student/1 => bearer token - (qwer)토큰 값 입력 => 403
GET - http://localhost:4000/auth/student => 토큰 확인
DELETE - http://localhost:4000/student/1 => bearer token - (student)토큰 값 입력 => 200


