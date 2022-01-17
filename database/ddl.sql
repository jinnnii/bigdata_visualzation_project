-- 모든 열의 각 자료형을 정의해서 테이블 생성하기
CREATE TABLE EMP_DDL(
    EMPTNO      NUMBER(4),
    ENAME       VARCHAR2(10),
    JOB         VARCHAR2(9),
    MGR         NUMBER(4),
    HIREDATE    DATE,
    SAL         NUMBER(7,2), --7자리 숫자, 소숫점 2째자리 까지
    COMM        NUMBER(7,2),
    DEPTNO      NUMBER(2)
);

DESC EMP_DDL;

-- 다른 테이블을 복사하여 테이블 생성하기
CREATE TABLE DEPT_DDL
    AS SELECT * FROM DEPT;
    
-- 다른 테이블의 일부를 복사하여 테이블 생성하기
CREATE TABLE EMP_DDL_30
    AS SELECT * FROM EMP
        WHERE DEPTNO=30;
        
SELECT *
    FROM EMP_DDL_30;
    
-- 다른 테이블을 복사하여 테이블 생성하기
CREATE TABLE EMPDEPT_DDL
    AS SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, 
                D.DEPTNO, DNAME, LOC
            FROM EMP E ,DEPT D
            WHERE 1<>1;
            
SELECT * FROM EMPDEPT_DDL;

------------------------------------------- 다른 테이블을 복사하여 테이블 생성하기
CREATE TABLE DEPT_DDL
    AS SELECT * FROM DEPT;
    
-- 다른 테이블의 일부를 복사하여 테이블 생성하기
CREATE TABLE EMP_DDL_30
    AS SELECT * FROM EMP
        WHERE DEPTNO=30;
        
SELECT *
    FROM EMP_DDL_30;
    
-- 다른 테이블을 복사하여 테이블 생성하기
CREATE TABLE EMPDEPT_DDL
    AS SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, 
                D.DEPTNO, DNAME, LOC
            FROM EMP E ,DEPT D
            WHERE 1<>1;
            
            
--EMP 테이블을 복사하여 EMP_ALTER 테이블 생성
CREATE TABLE EMP_ALTER
    AS SELECT * FROM EMP;

--ALTER 명령어로 HP 열 추가
ALTER TABLE EMP_ALTER
    ADD HP VARCHAR2(20);
    
--ALTER 명령어로 HP 열 이름을 TEL로 변경
ALTER TABLE EMP_ALTER
    RENAME COLUMN HP TO TEL;
    
--ALTER 명령어로 DEPTNO 열 길이 변경하기
ALTER TABLE EMP_ALTER
    MODIFY EMPNO NUMBER(5);

--ALTER 명령어로 TEL 열 삭제하기
ALTER TABLE EMP_ALTER
    DROP COLUMN TEL;
    
-- 테이블 이름 변경하기
RENAME EMP_ALTER TO EMP_RENAME;

--TRUNCATE
TRUNCATE TABLE EMP_RENAME;

ROLLBACK; --안됨!

-- EMP_RENAME 테이블 삭제
DROP TABLE EMP_RENAME;


--12장 연습문제
--1.
CREATE TABLE EMP_HW(
    EMPTNO      NUMBER(4),
    ENAME       VARCHAR2(10),
    JOB         VARCHAR2(9),
    MGR         NUMBER(4),
    HIREDATE    DATE,
    SAL         NUMBER(7,2), 
    COMM        NUMBER(7,2),
    DEPTNO      NUMBER(2)
);

--2.
ALTER TABLE EMP_HW
    ADD BIGO VARCHAR(20);
    
--3.
ALTER TABLE EMP_HW
    MODIFY BIGO VARCHAR(30);

--4.
ALTER TABLE EMP_HW
    RENAME COLUMN BIGO TO REMARK; 
    
    
--5.
INSERT INTO EMP_HW (EMPTNO, ENAME,JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    SELECT *
        FROM EMP;
        
--6.
DROP TABLE EMP_HW;