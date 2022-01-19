--1. EMP 테이블의 열 구조만 같고 데이터는 없는 빈 EMP_TEMP3 테이블을 생성하는 SQL문을 작성하세요.
CREATE TABLE EMP_TEMP3
    AS SELECT * FROM EMP
        WHERE 1<>1;

--2. EMP_TEMP3 테이블에 홍길동 사원을 추가 합니다.
    /*사원번호(EMPNO)는 9999, 사원이름(ENAME)은 홍길동, 직책(JOB)은 PRESIDENT, 직속상관(MGR)은 NULL값,
    고용일자(HIREDATE)는 오늘 날짜, 급여(SAL)는 5000, 추가수당(COMM)은 1000, 부서번호(DEPTNO)는 10으로
    데이터를 추가하는 SQL문을 작성하여 입력하세요.*/
INSERT INTO EMP_TEMP3 (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUES(9999,'홍길동','PRESIDENT',NULL,SYSDATE,5000,1000,10);

--3. DEPT 테이블을 복사하여 DEPT_TEMP3 테이블을 생성하는 SQL문을 작성하세요.
CREATE TABLE DEPT_TEMP3
    AS SELECT * FROM DEPT;

--4. DEPT_TEMP3 테이블에서 40번 부서의 부서이름(DNAME)을 DATABASE로 수정하고
--   지역(LOC)를 SEOUL로 수정하는 SQL문을 작성하세요.
UPDATE DEPT_TEMP3
    SET DNAME ='DATABASE',
        LOC ='SEOUL'
    WHERE DEPTNO = 40;