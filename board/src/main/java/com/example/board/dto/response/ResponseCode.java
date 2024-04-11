package com.example.board.dto.response;

public interface ResponseCode {
    // 200 : 성공
    String SUCCESS = "SU";
    // 400 : 유효성 검사 실패
    String VALIDATION_FAIL = "VF";
    // 400 : 중복된 이메일
    String DUPLICATE_EMAIL = "DE";
    // 400 : 중복된 닉네임
    String DUPLICATE_NICKNAME = "DN";
    // 400 : 중복된 휴대전화번호
    String DUPLICATE_TEL_NUMBER = "DT";
    // 400 : 존재하지 않는 유저
    String NOT_EXIST_USER = "NU";
    // 400 : 존재하지 않는 게시물
    String NOT_EXIST_BOARD = "NB";
    // 401 : 로그인 실패
    String SIGN_IN_FAIL = "SF";
    // 401 : 인증 실패
    String AUTHORIZATION_FAIL = "AF";
    // 403 : 권한 없음
    String NO_PERMISSION = "NP";
    // 500 : 데이터베이스 오류
    String DATABASE_ERROR = "DBE";
}