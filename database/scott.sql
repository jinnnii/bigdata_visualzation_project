--주석

/*여러 줄 주석*/

-- 열이 한개 일 때 중복 제거
SELECT DISTINCT DEPTNO
    FROM EMP;
    
--열이 여러개 일때 중복 제거

SELECT DISTINCT JOB,DEPTNO
    FROM EMP;
    
--열 제거 없이 그대로 출력    
SELECT ALL JOB,DEPTNO
    FROM EMP;

SELECT JOB,DEPTNO
    FROM EMP;


-- 별칭 지정 하기
-- 1. 연산 문장 띄우고 별칭 적기
-- 2. 연산 문장 띄우고 AS 별칭 적기

SELECT ENAME,SAL,SAL*12+COMM ANNSAL,COMM
    FROM EMP;

SELECT ENAME,SAL,SAL*12+COMM AS ANNSAL,COMM
    FROM EMP;
    
-- 출력 데이터 정렬
-- 1. 오름차순 정렬 (낮->높)
SELECT * 
    FROM EMP
    ORDER BY SAL ASC;

-- 2. 내림차순 정렬 (높->낮)
SELECT * 
    FROM EMP
    ORDER BY SAL DESC;
    
-- 3. 오름차순 내림차순 동시에 (첫번째 정렬 우선, 중에서 두번째 정렬)
SELECT *
    FROM EMP
    ORDER BY DEPTNO ASC, SAL DESC;

-- WHERE : 선별하기 위한 조건식!
-- 조건문 

SELECT *
    FROM EMP
    WHERE DEPTNO=30;
    
-- AND, OR
SELECT *
    FROM EMP
    WHERE DEPTNO=30
        AND JOB='SALESMAN';
        
SELECT *
    FROM EMP
    WHERE DEPTNO=30
        OR JOB='CLERK';
        
SELECT *
    FROM EMP
    WHERE JOB=UPPER('clerk');

--산술/비교 연산자
-- 1. 곱셈 연산자
SELECT *
    FROM EMP
    WHERE SAL * 12 = 36000;


-- 2. 나머지 연산자
SELECT *
    FROM EMP
    WHERE MOD(SAL,1000)=0;
    
--3. 숫자 대소 비교 연산자로 비교 
SELECT *
    FROM EMP
    WHERE SAL>=3000;
    
--4. 문자를 대소 비교 연산자로 비교 (문자열 문자 하나)
SELECT *
    FROM EMP
    WHERE ENAME>='F'
    ORDER BY ENAME;
    
--5. 문자를 대소 비교 연산자로 비교 (문자열 문자 여러개)
SELECT *
    FROM EMP
    WHERE ENAME<='FORZ'
    ORDER BY ENAME;
    
-- 6. 부정 비교 연산자
SELECT *
    FROM EMP
    WHERE SAL !=3000;
SELECT *
    FROM EMP
    WHERE SAL <>3000;  
SELECT *
    FROM EMP
    WHERE SAL ^=3000;
    
-- NOT 연산자
SELECT *
    FROM EMP
    WHERE NOT SAL = 3000;
    
-- IN 연산자: 해당 데이터들이 포함된 행 출력
SELECT *
    FROM EMP
    WHERE JOB IN ('MANAGER','SALESMAN','CLERK');
    
    --아래와 같음, 하지만 간단해짐!
SELECT *
    FROM EMP   
    WHERE JOB='MANAGER'
        OR JOB='SALESMAN'
        OR JOB='CLERK';
        
-- NOT IN : 등가 비교 연산자와 AND 연산자를 사용
SELECT *
    FROM EMP
    WHERE JOB !='MANAGER'
    AND JOB<>'SALESMAN'
    AND JOB^='CLERK';

SELECT *
    FROM EMP
    WHERE JOB NOT IN ('MANAGER','SALESMAN','CLERK');
    
    
-- BETWEEN ...AND .. : 데이터가  A~B 사이인 행 출력
SELECT *
    FROM EMP
    WHERE DEPTNO BETWEEN 20 AND 30;
    

--LIKE 연산자
--1. S로 시작하는 사원이름
SELECT *
    FROM EMP
    WHERE ENAME LIKE 'S%';

--2. 2번째 글자가 L인 사원 이름  
SELECT *
    FROM EMP
    WHERE ENAME LIKE '_L%';

--3. AM 이 포함된 사원 이름    
SELECT *
    FROM EMP
    WHERE ENAME LIKE '%AM%';

--4. AM 이 포함되어 있지 않는 사원이름
SELECT *
    FROM EMP
    WHERE ENAME NOT LIKE '%AM%';
    

--NULL 값 비교
SELECT COMM
    FROM EMP
    WHERE COMM IS NULL;

--직속 상관이 있는 사원 데이터만 출력

SELECT *
    FROM EMP
    WHERE MGR IS NOT NULL;
    

-- 집합 연산자(UNION): 중복 제거
-- SELECT 할 시, 자료형과 개수가 같아야 함 ✔✔✔✔
-- 부서 번호가 10, 20인 데이터

SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO =10
    UNION
        SELECT EMPNO, ENAME, SAL, DEPTNO
        FROM EMP
        WHERE DEPTNO =20;


--집합 연산자(UNION) : 중복 허용
SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO =10
    UNION
        SELECT EMPNO, ENAME, SAL, DEPTNO
        FROM EMP
        WHERE DEPTNO =10;
        
SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO =10
    UNION ALL
        SELECT EMPNO, ENAME, SAL, DEPTNO
        FROM EMP
        WHERE DEPTNO =10;

-- 집합 연산자 (MINUS) : 차집합
SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    MINUS  
        SELECT *
        FROM EMP
        WHERE DEPTNO IN (10,20);


-- 집합 연산자 (INTERSECT) : 교집합
SELECT *
    FROM EMP
    WHERE DEPTNO=30
    INTERSECT
        SELECT *
        FROM EMP
        WHERE JOB='SALESMAN';
        


--------------------------6장-------------------------------

--대소문자 변환

SELECT ENAME, UPPER(ENAME), LOWER(ENAME),INITCAP(ENAME)
    FROM EMP;
    

SELECT *
    FROM EMP
    WHERE UPPER(ENAME) LIKE UPPER('%scott%');


--문자열 길이
SELECT ENAME, LENGTH(ENAME)
    FROM EMP;
    
SELECT *
    FROM nls_database_parameters
    WHERE parameter LIKE 'NLS_CHARACTERSET';

SELECT LENGTH('한글'), LENGTHB('한글')
    FROM DUAL;
    

-- 사원 이름 길이 5 이상인 행 출력

SELECT ENAME, LENGTH(ENAME)
    FROM EMP
    WHERE LENGTH(ENAME)>=5;


--SUBSTR 함수 : 문자열 일부 추출하는 함수
SELECT JOB, SUBSTR(JOB,1,2),SUBSTR(JOB,3,2),SUBSTR(JOB,5)
    FROM EMP;


--SUBSTR 함수 음수사용
SELECT JOB,
    SUBSTR(JOB,-LENGTH(JOB)),
    SUBSTR(JOB,-LENGTH(JOB),2),
    SUBSTR(JOB,-3)
    FROM EMP;


--INSTR로 특정 문자열 찾기
    --문자열의 인덱스값(1,2,3...) 반환
SELECT INSTR('HELLO, ORACLE!','L') AS INSTR_1,
    --문자열 인덱스 5부터 시작 문자열 찾아 인덱스 값 반환
    INSTR('HELLO, ORACLE!','L',5) AS INSTR_2,
    -- 문자열 인덱스 2부터 시작, 두번째로 나오는 문자열 찾아 인덱스 값 반환
    INSTR('HELLO, ORACLE!','L',2,2) AS INSTR_3
    FROM DUAL;
    

-- 사원 이름에 문자 S가 있는 행 구하기
SELECT *
    FROM EMP
    WHERE INSTR(ENAME,'S')>0;
    
    
-- REPLACE 함수로 문자열 안에 있는 특정 문자 바꾸기
SELECT '010-1234-5678' AS REPLACE_BEFORE,
    REPLACE('010-1234-5678','-',' ') AS REPLACE_1,
    REPLACE('010-1234-5678','-') AS REPLACE_2
    FROM DUAL;
    

-- LPAD, RPAD 함수 이용하여 출력
-- 총 문자열 공간에서 빈공간에 문자/띄어쓰기 입력, L;LEFT, R:RIGHT 부터
SELECT 'Oracle',
    LPAD('Oracle',10,'#') AS LPAD_1,
    RPAD('Oracle',10,'*') AS RPAD_1,
    LPAD('Oracle',10) AS LPAD_2,
    RPAD('Oracle',10) AS RPAD_2
    FROM DUAL;
    
--RPAD 주민번호 뒷자리
SELECT
    RPAD('971225-',14,'*') AS RPAD_JMNO,
    RPAD('010-1234-',13,'*') AS RPAD_PHONE
    FROM DUAL;
    
--CONCAT : 두 문자열 합치기
SELECT CONCAT(EMPNO,ENAME),
    CONCAT(EMPNO,CONCAT(':',ENAME))
    FROM EMP
    WHERE ENAME='SCOTT';

--연습문제 4장
--1.
SELECT DISTINCT JOB
    FROM EMP;

--2.
SELECT EMPNO EMPLOYEE_NO, 
    ENAME EMPLOYEE_NAME, 
    JOB, MGR MANAGER, 
    HIREDATE, 
    SAL SALARY, 
    COMM COMMISSION, 
    DEPTNO DEPARTMENT_NO
    FROM EMP
    ORDER BY DEPTNO DESC, ENAME ASC;


-- 연습문제 5장
--1.
SELECT *
    FROM EMP
    WHERE ENAME LIKE '%S';
    
--2.
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO=30 AND JOB='SALESMAN';
    
--3.1
SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO IN (20,30)
        AND SAL>2000;
        
--3.2
SELECT EMPNO, ENAME, SAL, DEPTNO
    FROM EMP
    WHERE DEPTNO IN(20,30)
    INTERSECT
        SELECT EMPNO, ENAME, SAL, DEPTNO
        FROM EMP
        WHERE SAL>2000;
    
--4.
SELECT *
    FROM EMP
    WHERE SAL<2000
        OR SAL>3000;
        
--5.
SELECT ENAME,EMPNO, SAL, DEPTNO
    FROM EMP
    WHERE ENAME LIKE '%E%'
        AND DEPTNO =30
        AND SAL NOT BETWEEN 1000 AND 2000;
--6.
SELECT *
    FROM EMP
    WHERE COMM IS NULL 
        AND MGR IS NOT NULL
        AND JOB IN ('MANAGER','CLERK')
        AND ENAME NOT LIKE '_L%';