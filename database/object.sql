 /*
    오라클 데이터베이스
    사용자 테이블(user table)
    데이터 사전(data dictionary)
 */
 
 --SCOTT 계정에서 사용 가능한 데이터 사전 살펴보기
 SELECT * FROM DICT;
 SELECT * FROM DICTIONARY;
 
 --USER_접두어를 가진 데이터 사전
 --SCOTT 계정이 가지고 있는 객체 정보 살펴보기
 SELECT TABLE_NAME
    FROM USER_TABLES; 
    
 --ALL_접두어를 가진 데이터 사전
 --SCOTT 계정이 가지고 있는 객체 정보 살펴보기
 SELECT OWNER --테이블 소유자
        ,TABLE_NAME
    FROM ALL_TABLES;

 --DBA_접두어를 가진 데이터 사전
 SELECT *
    FROM DBA_TABLES; --관리 권한을 가진 사용자만 접근 가능!
    
    
--SCOTT 계정이 소유한 인덱스 정보 알아보기
SELECT *
    FROM USER_INDEXES;
    
--SCOTT 계정이 소유한 인덱스 컬럼 정보 알아보기
SELECT *
    FROM USER_IND_COLUMNS;
    
-- EMP 테이블에 SAL열에 인덱스를 생성하기
CREATE INDEX INDEX_EMP_SAL
    ON EMP(SAL);
    
SELECT *
    FROM USER_IND_COLUMNS
    WHERE TABLE_NAME = 'EMP'; --인덱스 확인
    
--인덱스 삭제하기
DROP INDEX INDEX_EMP_SAL;


--뷰 생성하기
CREATE VIEW VW_EMP20
    AS(SELECT EMPNO, ENAME, JOB, DEPTNO
            FROM EMP
            WHERE DEPTNO =20); --권한오류 -> SYSTEM에서 권한 부여
            
            
--생성한 뷰 확인하기
SELECT *
    FROM USER_VIEWS;
    
SELECT *
    FROM VW_EMP20;

--뷰 삭제하기
DROP VIEW VW_EMP20;

--ROWNUM을 추가로 조회하기 --게시글 페이징
SELECT ROWNUM,E.*
    FROM EMP E;
    
--EMP 테이블을 SAL 열 기준을 정렬하기
SELECT ROWNUM, E.*
    FROM EMP E
    ORDER BY SAL DESC;
    
--인라인 뷰(서브쿼리 사용)
SELECT ROWNUM, E.*
    FROM (SELECT *
            FROM EMP
            ORDER BY SAL DESC) E;
            
-- 인라인 뷰(WITH절 사용)
WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.*
    FROM E;

--인라인 뷰로 TOP-N 추출하기(서브쿼리 사용)
SELECT ROWNUM, E.*
    FROM (SELECT *
            FROM EMP
            ORDER BY SAL DESC) E
    WHERE ROWNUM <=3;

--인라인 뷰로 TOP-N 추출하기 (WITH절 사용)
WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.*
    FROM E
    WHERE ROWNUM <=3;
    
CREATE TABLE DEPT_SEQUENCE
    AS SELECT * 
        FROM DEPT 
        WHERE 1<>1;

SELECT *
    FROM DEPT_SEQUENCE;
    
--시퀀스 생성
CREATE SEQUENCE SEQ_DEPT_SEQUENCE
    INCREMENT BY 10
    START WITH 10
    MAXVALUE 90
    MINVALUE 0
    NOCYCLE
    CACHE 2;
    
--생성된 시퀀스 확인
SELECT *
    FROM USER_SEQUENCES;
    
--시퀀스에서 생성한 순번을 사용한 INSERT문 실행
INSERT INTO DEPT_SEQUENCE(DEPTNO, DNAME, LOC)
    VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE','SEOUL');
    
--가장 마지막으로 생성된 시퀀스 확인
SELECT SEQ_DEPT_SEQUENCE.CURRVAL
    FROM DUAL;
    
--시퀀스 옵션수정하기
ALTER SEQUENCE SEQ_DEPT_SEQUENCE
    INCREMENT BY 3
    MAXVALUE 99
    CYCLE;
    
--시퀀스 삭제하기
DROP SEQUENCE SEQ_DEPT_SEQUENCE;

-- EMP 테이블의 동의어 생성
CREATE SYNONYM E
    FOR EMP;

SELECT *
    FROM E;

-- 동의어 삭제 
DROP SYNONYM E;

--연습문제 13장
--1.
CREATE TABLE EMPIDX
    AS (SELECT *
            FROM EMP);

CREATE INDEX IDX_EMPIDX_EMPNO
    ON EMPIDX(EMPNO);
    
SELECT *
    FROM USER_IND_COLUMNS
    WHERE TABLE_NAME = 'EMPIDX';
    
--2.
CREATE VIEW EMPIDX_OVER15K
    AS(SELECT EMPNO, ENAME, JOB, DEPTNO, SAL, NVL2(COMM,'O','X') AS COMM
            FROM EMPIDX
            WHERE SAL>1500);
            
SELECT EMPNO, ENAME, JOB, DEPTNO, SAL, NVL2(COMM,'O','X') AS COMM
    FROM EMP;
    
SELECT *
    FROM EMPIDX_OVER15K;
    
--3.
CREATE TABLE DEPTSEQ
    AS (SELECT * FROM DEPT);

CREATE SEQUENCE SEQ_DEPT_SEQUENCE
    INCREMENT BY 1
    START WITH 1
    MAXVALUE 99
    MINVALUE 1
    NOCYCLE
    NOCACHE;
    
INSERT INTO DEPTSEQ
    VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');
INSERT INTO DEPTSEQ
    VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'WEB', 'BUSAN');
INSERT INTO DEPTSEQ
    VALUES(SEQ_DEPT_SEQUENCE.NEXTVAL, 'MOBILE', 'ILSAN');
    