-- 서브쿼리
--1. SCOTT의 급여와 동일하거나 더 많이 바는 사원의 이름(ENAME)과 급여(SAL)를 출력하세요.
SELECT ENAME, SAL
FROM EMP
WHERE SAL >=(SELECT SAL
                FROM EMP
                WHERE ENAME ='SCOTT');

--2. 직급이 'CLERK'인 사람의 부서번호(DEPTNO)와 부서명(DNAME)을 출력하세요.   
SELECT DEPTNO, DNAME
    FROM DEPT
    WHERE DEPTNO IN (SELECT DEPTNO
                        FROM EMP
                        WHERE JOB='CLERK');

--3. 이름에 T를 포함하고 있는 사원들과 같은 부서에서 근무하는 사원의 사번(EMPNO)과 이름(ENAME)을 출력하세요.
SELECT EMPNO, ENAME
    FROM EMP
    WHERE DEPTNO IN (SELECT DEPTNO
                        FROM EMP
                        WHERE ENAME LIKE '%T%');

--4. 부서 위치가 DALLAS인 모든 사원의 이름(ENAME), 부서번호(DEPTNO)를 출력하세요.
SELECT ENAME, DEPTNO
    FROM EMP
    WHERE DEPTNO = (SELECT DEPTNO
                        FROM DEPT
                        WHERE LOC='DALLAS');

--5. SALES 부서의 모든 사원의 이름(ENAME)과 급여(SAL)를 출력하세요.

SELECT ENAME, SAL
    FROM EMP
    WHERE DEPTNO = (SELECT DEPTNO
                        FROM DEPT
                        WHERE DNAME='SALES');

--6.  KING에게 보고하는(=매니저가 KING인 사원) 모든 사원의 이름(ENAME)과 급여(SAL)를 출력하세요.
SELECT E.ENAME, E.SAL
    FROM EMP E, EMP M
    WHERE E.MGR = M.EMPNO
        AND M.ENAME = 'KING';

SELECT ENAME, SAL
    FROM EMP
    WHERE MGR = (SELECT EMPNO
                        FROM EMP
                        WHERE ENAME='KING');

/*
7.  자신의 급여가 평균급여보다 많고 이름에 S가 들어가는 사원과 동일한 부서에서 근무하는 
    모든 사원의 이름(ENAME), 급여(SAL)를 출력하세요.
*/
SELECT ENAME, SAL
    FROM EMP
    WHERE DEPTNO IN (SELECT DEPTNO
                        FROM EMP
                        WHERE ENAME LIKE '%S%'
                            AND SAL> (SELECT AVG(SAL)
                                        FROM EMP));