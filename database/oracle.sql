SELECT EMPNO|| ENAME,
        EMPNO || ':' || ENAME
    FROM EMP;
    
--TRIM : 특정 문자 지우기
--공백 제거하여 출력
--TRIM,BOTH : 양쪽 공백 제거
--LEADING : 왼쪽 공백 제거
--TRAILING: 오른쪽 공백 제거

SELECT '[' ||TRIM(' _ _ORACLE_ _ ') || ']' AS TRIM,
        '[' || TRIM(LEADING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_lEADING,
        '[' || TRIM(TRAILING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_TRAILING,
        '[' || TRIM(BOTH FROM ' _ _Oracle_ _ ') || ']' AS TRIM_BOTH
        FROM DUAL;
        
--TRIM함수로 삭제할 문자가 있을 때 출력
SELECT '[' ||TRIM('_' FROM'_ _ORACLE_ _') || ']' AS TRIM,
        '[' || TRIM(LEADING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_lEADING,
        '[' || TRIM(TRAILING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_TRAILING,
        '[' || TRIM(BOTH '_' FROM '_ _Oracle_ _') || ']' AS TRIM_BOTH
        FROM DUAL;
        
--TRIM, LTRIM, RTRIM 사용하여 문자열 출력
SELECT 
    '['||TRIM(' _ORACLE_ ')|| ']' AS TRIM,
    '['||LTRIM(' _ORACLE_ ')|| ']' AS LTRIM,
    '['||LTRIM('<_ORACLE_>','_<')|| ']' AS LTRIM_2,
    '['||RTRIM(' _ORACLE_ ')|| ']' AS RTRIM,
    '['||LTRIM( '<_ORACLE_>','_<')|| ']' AS LTRIM
    FROM DUAL;
    
--ROUND 함수를 사용하여 반올림된 숫자 출력
SELECT
    ROUND(1234.5678) AS ROUND,
    ROUND(1234.5678, 0) AS ROUND_0,
    ROUND(1234.5678, 1) AS ROUND_1,
    ROUND(1234.5678, 2) AS ROUND_2,
    ROUND(1234.5678, -1) AS ROUND_MINUS1,
    ROUND(1234.5678, -2) AS ROUND_MINUS2
    FROM DUAL;
    
    
--TRUNC 함수를 사용하여 버림된 숫자 출력
SELECT
    TRUNC(1234.5678) AS TRUNC,
    TRUNC(1234.5678, 0) AS TRUNC_0,
    TRUNC(1234.5678, 1) AS TRUNC_1,
    TRUNC(1234.5678, 2) AS TRUNC_2,
    TRUNC(1234.5678, -1) AS TRUNC_MINUS1,
    TRUNC(1234.5678, -2) AS TRUNC_MINUS2
    FROM DUAL;

--CEIL, FLOOR 함수로 숫자 출력
SELECT
    CEIL(3.14),
    FLOOR(3.14),
    CEIL(-3.14),
    FLOOR(-3.14)
    FROM DUAL;
    
SELECT
    MOD(15,6),
    MOD(10,2),
    MOD(11,2)
    FROM DUAL;
    
SELECT
    SYSDATE AS NOW,
    SYSDATE-1 AS YESTERDAY,
    SYSDATE+1 AS TOMORROW
    FROM DUAL;
    
--SYSDATE 와 ADD_MONTHS 함수로 3개월 후 날짜 구하기
SELECT
    SYSDATE,
    ADD_MONTHS(SYSDATE,3)
    FROM DUAL;

--입사 10주년이 되는 사원들 데이터 출력
SELECT EMPNO, ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 120) AS WORK10YEAR
FROM EMP;

-- HIREDATE와 SYSDATE 사이의 개우러 수를 MONTHS_BETWEEN 함수로 출력
SELECT EMPNO, ENAME, HIREDATE, SYSDATE,
    MONTHS_BETWEEN(HIREDATE, SYSDATE) AS MONTHS1,
    MONTHS_BETWEEN(SYSDATE, HIREDATE) AS MONTHS2,
    TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE)) AS MONTHS2
    FROM EMP;
    
--NEXT_DAY, LAST_DAY 함수를 사용하여 출력
SELECT
    SYSDATE,
    NEXT_DAY(SYSDATE,'월요일'),
    NEXT_DAY(SYSDATE,'화'),
    LAST_DAY(SYSDATE)
    FROM DUAL;
    
--SYSDATE 날짜 형식 지정하여 출력
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')AS 현재날짜시간
    FROM DUAL;
    
/*
    형식//설명
    YYYY,RRRR 연(4자리 숫자)
    YY,RR 연(2자리 숫자)
    MM 월(2자리 숫자)
    MON 월(언어별 월 이름 약자)
    MONTH 월(언어별 월 이름 전체)
    DD 일(2자리 숫자)
    DDD 1년중 며칠(1-365)
    DY 요일(언어별 요일 이름 약자)
    DAY 요일(언어별 요일 이름 전체)
    W 1년 중 몇 번째 주(1-53)
*/

--월과 요일 다양한 형식으로 출력
SELECT
    SYSDATE,
    TO_CHAR(SYSDATE, 'MM') AS MM,
    TO_CHAR(SYSDATE, 'MON') AS MON,
    TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
    TO_CHAR(SYSDATE, 'DD') AS DD,
    TO_CHAR(SYSDATE, 'DY') AS DY,
    TO_CHAR(SYSDATE, 'DAY') AS DAY
    FROM DUAL;
    
-- 여러 언어로 날짜(월) 출력하기
SELECT 
    SYSDATE,
    TO_CHAR(SYSDATE,'MM') AS MM,
    TO_CHAR(SYSDATE,'MON', 'NLS_DATE_LANGUAGE = KOREAN') AS MON_KOR,
    TO_CHAR(SYSDATE,'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
    TO_CHAR(SYSDATE,'MON', 'NLS_DATE_LANGUAGE = ENGLISH') AS MON_ENG,
    TO_CHAR(SYSDATE,'MONTH', 'NLS_DATE_LANGUAGE = KOREAN') AS MON_KOR,
    TO_CHAR(SYSDATE,'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
    TO_CHAR(SYSDATE,'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH') AS MON_ENG
    FROM DUAL;
    
/*
    HH24 24시간으로 표현한 시간
    HH, HH12 12시간으로 표현한 시간
    MI
    MM 분
    SS 초
    AM, PM, A.M., P.M. 오전 오후 표시
*/

--SYSDATE 시간 형식 지정하여 출력
SELECT
    SYSDATE,
    TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
    TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AN,
    TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
    FROM DUAL;
    
/*
    9 숫자의 한 자리를 의미(빈 자리를 채우지 않음)
    0 빈자리를 0으로 채움을 의미
    $ - 달러 표시를 붙여서 출력함
    L L(Locale) 지역 화폐 단위 기호를 붙여서 출력
    . 소수점을 표시
    , 천 단위의 구분 기호를 표시
*/

-- 여러가지 숫자 형식을 사용하여 급여 출력
SELECT
    SAL,
    TO_CHAR(SAL, '$999,999') AS SAL_$,
    TO_CHAR(SAL, 'L999,999') AS SAL_L,
    TO_CHAR(SAL, '$999,999.00') AS SAL_1,
    TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
    TO_CHAR(SAL, '000999999.99') AS SAL_3,
    TO_CHAR(SAL, '999,999,00') AS SAL_4
    FROM EMP;
    
--TO_NUMBER 함수로 연산하여 출력
SELECT
    1300-'1500',
    '1300'-1500
    FROM DUAL;

--SELECT
--    '1,300'-'1,500'
--    FROM DUAL; 오류

SELECT TO_NUMBER('1,300','999,999')-TO_NUMBER('1,500','999,999')
FROM DUAL;

--TO_DATE 함수로 문자 데이터를 날짜 데이터 변환하기
SELECT
    TO_DATE('2018-07-14','YYYY-MM-DD') AS TODATE1,
    TO_DATE('20180714','YYYY-MM-DD') AS TODATE2
    FROM DUAL;
    
--NVL 함수를 사용하여 출력
--첫번째 데이터가 NULL 일경우 두번째 데이터로 변환
SELECT 
    EMPNO, ENAME, SAL, COMM, SAL+COMM,
    NVL(COMM,0),
    SAL+NVL(COMM,0)
    FROM EMP;
    
--NVL2 함수를 사용하여 출력
SELECT
    EMPNO, ENAME, COMM,
    NVL2(COMM, 'O','X'),
    NVL2(COMM,SAL*12+COMM,SAL*12)AS ANNSAL
    FROM EMP;
    
SELECT
    EMPNO, ENAME, JOB, SAL,
    DECODE(JOB,
            'MANAGER', SAL*1.1,
            'SALESMAN', SAL*1.05,
            'ANALYST',SAL,
            SAL*1.03) AS UPSAL
    FROM EMP;
    
--CASE 문을 사용하여 출력(기준 데이터를 저장하는 경우)
SELECT
    EMPNO, ENAME, JOB, SAL,
    CASE JOB
        WHEN 'MANAGER' THEN SAL*1.1
        WHEN 'SALESMAN' THEN SAL*1.05
        WHEN 'ANALYST' THEN SAL
        ELSE SAL*1.03
        END AS UPSAL
    FROM EMP;
    
--CASE 문을 사용하여 출력(기준 데이터를 지정하지 않는 경우)
SELECT
    EMPNO, ENAME, COMM,
    CASE
        WHEN COMM IS NULL THEN '해당사항 없음'
        WHEN COMM=0 THEN '수당 없음'
        WHEN COMM>0 THEN '수당:'||COMM
        END AS COMM_TEXT
    FROM EMP;
    
--연습문제
--1.
SELECT
    EMPNO,
    REPLACE(EMPNO,SUBSTR(EMPNO,-2),'**') AS MASKING_EMPNO,
    ENAME,
    REPLACE(ENAME,SUBSTR(ENAME,-4),'****') AS MASKING_ENAME
    FROM EMP
    WHERE LENGTH(ENAME)=5;
--해답
SELECT
    EMPNO,
    RPAD(SUBSTR(EMPNO,1,2),4,'*') AS MASKING_EMPNO,
    ENAME,
    RPAD(SUBSTR(ENAME,1,1),LENGTH(ENAME),'*') AS MASKING_ENAME
    FROM EMP
    WHERE LENGTH(ENAME)=5;
    
--2.
SELECT 
    EMPNO,
    ENAME,
    TRUNC(SAL/21.5,2) AS DAY_PAY,
    ROUND(SAL/21.5/8, 1) AS TIME_PAY
    FROM EMP;
    
--3.
SELECT
    EMPNO,ENAME,HIREDATE,
    TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 3),'월'),'YYYY-MM-DD') AS R_JOB,
    NVL(TO_CHAR(COMM),'N/A')AS COMM
    FROM EMP;
    
--4.
SELECT
    EMPNO, ENAME,MGR,
    CASE 
        WHEN MGR IS NULL THEN '0000'
        WHEN MGR LIKE '75%' THEN '5555'
        WHEN MGR LIKE '76%' THEN '6666'
        WHEN MGR LIKE '77%' THEN '7777'
        WHEN MGR LIKE '78%' THEN '8888'
        ELSE TO_CHAR(MGR)
        END AS CHG_MGR
    FROM EMP;
    --WHEN SUBSTR(MGR,1,2)=75 THEN '5555' <= 해답
    
    
--추가 수당 합계 구하기
-- SUM 함수는 NULL 데이터 제외
SELECT SUM(COMM)
FROM EMP;