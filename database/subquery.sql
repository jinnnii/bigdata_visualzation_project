--서브쿼리로 JONES의 급여보다 높은 급여를 받는 사원 정보 출력
SELECT *
    FROM EMP
    WHERE SAL > (SELECT SAL
                FROM EMP
                WHERE ENAME='JONES');
                
/*
1. 서브 쿼리는 연산자와 같은 비교 또는 조회 대상의 오른쪽에 놓이며, 괄호로 묶어서 사용합니다.
2. 특수한 몇몇 경우를 제외한 대부분의 서브쿼리에서는 ORDER BY 절을 사용할 수 없습니다.
3. 서브쿼리의 SELECT 절에 명시한 열은 메인쿼리의 비교 대상과 같은 자료형과 같은 개수로 지정해야 합니다.
    즉 메인 쿼리 비교 대상 데이터가 하나라면 서브쿼리의 SELECT절 역시 같은 자료형인 열 하나를 지정해야 합니다.
4. 서브쿼리에 있는 SELECT 문의 결과 행 수는 함께 사용하는 메인쿼리의 연산자 종류와 호환이 가능해야 합니다.
    예를 들어 메인쿼리에 사용한 연산자가 단 하나의 데이터로만 연산이 가능한 연산자라면 서브쿼리의 결과행 수는 반드시 하나여야 합니다.
*/

--서브쿼리의 결과 값이 날짜형일 경우
SELECT *
    FROM EMP
    WHERE HIREDATE < (SELECT HIREDATE
                        FROM EMP
                        WHERE ENAME='SCOTT');
                        --87/04/19

-- 서브쿼리 안에서 함수를 사용한 경우
-- 평균보다 높은 급여를 받는 사원 조회
SELECT EMPNO, ENAME, JOB, SAL,
        D.DEPTNO, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND E.DEPTNO =20
        AND E.SAL >(SELECT AVG(SAL)
                    FROM EMP);
                    --2073.214...
                    
                    
-- IN 연산자 사용하기
SELECT *
    FROM EMP
    WHERE DEPTNO IN(20,30);
    
SELECT *
    FROM EMP
    WHERE SAL IN(SELECT MAX(SAL)
                    FROM EMP
                    GROUP BY DEPTNO);
                    
                    
--30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원 정보 출력
SELECT EMPNO, ENAME,SAL
    FROM EMP
    WHERE SAL< ANY(SELECT SAL --2850
                    FROM EMP
                    WHERE DEPTNO =30)
    ORDER BY SAL, EMPNO;


--30번 부서 사원들의 최소 급여보다 많은 급여를 받는 사원 정보 출력
SELECT EMPNO, ENAME,SAL
    FROM EMP
        WHERE SAL > ANY(SELECT SAL --950
                        FROM EMP
                        WHERE DEPTNO = 30);
                        
-- 부서 번호가 30번인 사원들의 최소 급여보다 더 적은 급여를 받는 사원 출력
SELECT *
    FROM EMP
    WHERE SAL<ALL(SELECT SAL --950
                    FROM EMP
                    WHERE DEPTNO =30);
--아래와 같음
SELECT *
    FROM EMP
    WHERE SAL<(SELECT MIN(SAL) --950
                    FROM EMP
                    WHERE DEPTNO =30);
                    
                    
-- 부서 번호가 30번인 사원들의 최대 급여보다 더 높은 급여를 받는 사원 출력
SELECT *
    FROM EMP
    WHERE SAL > ALL(SELECT SAL --2850
                    FROM EMP
                    WHERE DEPTNO =30);

--서브 쿼리 결과 값이 존재하는 경우
SELECT *
    FROM EMP --모두 출력
    WHERE EXISTS(SELECT DNAME --1개있어 TRUE
                    FROM DEPT
                    WHERE DEPTNO =10);

                    
--서브 쿼리 결과 값이 존재하지 않는 경우
SELECT *
    FROM EMP
    WHERE EXISTS(SELECT DNAME
                    FROM DEPT
                    WHERE DEPTNO =50);
                    
-- 다중열 서브쿼리 사용하기
SELECT *
    FROM EMP
    WHERE (DEPTNO,SAL) IN (SELECT DEPTNO, MAX(SAL) --10:5000/20:3000/30:2850
                            FROM EMP
                            GROUP BY DEPTNO);

SELECT DEPTNO, MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO;
    
    
-- 인라인 뷰 사용하기
-- 부서번호가 10번인 사원정보 출력
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO,
        D.DNAME, D.LOC
    FROM (SELECT * FROM EMP WHERE DEPTNO=10) E10,
         (SELECT * FROM DEPT) D
    WHERE E10.DEPTNO =D.DEPTNO;
    
--WITH절 사용하기
WITH
E10 AS (SELECT * FROM EMP WHERE DEPTNO=10),
D AS (SELECT *FROM DEPT)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO,
        D.DNAME, D.LOC
    FROM E10,D
    WHERE E10.DEPTNO =D.DEPTNO;
    
--스칼라 서브쿼리 사용하기 
SELECT 
    EMPNO, ENAME, JOB, SAL,
    (SELECT GRADE
        FROM SALGRADE
        WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE,
    DEPTNO,
    (SELECT DNAME
        FROM DEPT
        WHERE E.DEPTNO =DEPT.DEPTNO) AS DNAME
    FROM EMP E;
    
    
--9장 연습 문제
--1.
SELECT JOB, EMPNO, ENAME, SAL, D.DEPTNO, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND JOB IN(SELECT JOB
                    FROM EMP
                    WHERE ENAME='ALLEN');
--2.
SELECT EMPNO, ENAME, DNAME, HIREDATE, LOC, SAL, GRADE
    FROM EMP E, DEPT D, SALGRADE S
    WHERE SAL BETWEEN LOSAL AND HISAL
        AND SAL > (SELECT AVG(SAL) FROM EMP)
        AND E.DEPTNO= D.DEPTNO
    ORDER BY SAL DESC, EMPNO;
    
    
--3.
SELECT EMPNO, ENAME, JOB, 
        D.DEPTNO, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = 10
        AND E.DEPTNO = D.DEPTNO
        AND JOB NOT IN(SELECT JOB
                        FROM EMP
                        WHERE DEPTNO = 30);

SELECT JOB
    FROM EMP
    WHERE DEPTNO = 30;

--4.
SELECT EMPNO, ENAME, SAL, GRADE
    FROM EMP, SALGRADE
    WHERE SAL BETWEEN LOSAL AND HISAL
        AND SAL > ALL(SELECT SAL
                        FROM EMP
                        WHERE JOB = 'SALESMAN')
    ORDER BY EMPNO;
    
SELECT EMPNO, ENAME, SAL, GRADE
    FROM EMP, SALGRADE
    WHERE SAL BETWEEN LOSAL AND HISAL
        AND SAL > (SELECT 
                        FROM EMP
                        WHERE JOB = 'SALESMAN')
    ORDER BY EMPNO;