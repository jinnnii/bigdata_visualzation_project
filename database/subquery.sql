--���������� JONES�� �޿����� ���� �޿��� �޴� ��� ���� ���
SELECT *
    FROM EMP
    WHERE SAL > (SELECT SAL
                FROM EMP
                WHERE ENAME='JONES');
                
/*
1. ���� ������ �����ڿ� ���� �� �Ǵ� ��ȸ ����� �����ʿ� ���̸�, ��ȣ�� ��� ����մϴ�.
2. Ư���� ��� ��츦 ������ ��κ��� �������������� ORDER BY ���� ����� �� �����ϴ�.
3. ���������� SELECT ���� ����� ���� ���������� �� ���� ���� �ڷ����� ���� ������ �����ؾ� �մϴ�.
    �� ���� ���� �� ��� �����Ͱ� �ϳ���� ���������� SELECT�� ���� ���� �ڷ����� �� �ϳ��� �����ؾ� �մϴ�.
4. ���������� �ִ� SELECT ���� ��� �� ���� �Բ� ����ϴ� ���������� ������ ������ ȣȯ�� �����ؾ� �մϴ�.
    ���� ��� ���������� ����� �����ڰ� �� �ϳ��� �����ͷθ� ������ ������ �����ڶ�� ���������� ����� ���� �ݵ�� �ϳ����� �մϴ�.
*/

--���������� ��� ���� ��¥���� ���
SELECT *
    FROM EMP
    WHERE HIREDATE < (SELECT HIREDATE
                        FROM EMP
                        WHERE ENAME='SCOTT');
                        --87/04/19

-- �������� �ȿ��� �Լ��� ����� ���
-- ��պ��� ���� �޿��� �޴� ��� ��ȸ
SELECT EMPNO, ENAME, JOB, SAL,
        D.DEPTNO, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND E.DEPTNO =20
        AND E.SAL >(SELECT AVG(SAL)
                    FROM EMP);
                    --2073.214...
                    
                    
-- IN ������ ����ϱ�
SELECT *
    FROM EMP
    WHERE DEPTNO IN(20,30);
    
SELECT *
    FROM EMP
    WHERE SAL IN(SELECT MAX(SAL)
                    FROM EMP
                    GROUP BY DEPTNO);
                    
                    
--30�� �μ� ������� �ִ� �޿����� ���� �޿��� �޴� ��� ���� ���
SELECT EMPNO, ENAME,SAL
    FROM EMP
    WHERE SAL< ANY(SELECT SAL --2850
                    FROM EMP
                    WHERE DEPTNO =30)
    ORDER BY SAL, EMPNO;


--30�� �μ� ������� �ּ� �޿����� ���� �޿��� �޴� ��� ���� ���
SELECT EMPNO, ENAME,SAL
    FROM EMP
        WHERE SAL > ANY(SELECT SAL --950
                        FROM EMP
                        WHERE DEPTNO = 30);
                        
-- �μ� ��ȣ�� 30���� ������� �ּ� �޿����� �� ���� �޿��� �޴� ��� ���
SELECT *
    FROM EMP
    WHERE SAL<ALL(SELECT SAL --950
                    FROM EMP
                    WHERE DEPTNO =30);
--�Ʒ��� ����
SELECT *
    FROM EMP
    WHERE SAL<(SELECT MIN(SAL) --950
                    FROM EMP
                    WHERE DEPTNO =30);
                    
                    
-- �μ� ��ȣ�� 30���� ������� �ִ� �޿����� �� ���� �޿��� �޴� ��� ���
SELECT *
    FROM EMP
    WHERE SAL > ALL(SELECT SAL --2850
                    FROM EMP
                    WHERE DEPTNO =30);

--���� ���� ��� ���� �����ϴ� ���
SELECT *
    FROM EMP --��� ���
    WHERE EXISTS(SELECT DNAME --1���־� TRUE
                    FROM DEPT
                    WHERE DEPTNO =10);

                    
--���� ���� ��� ���� �������� �ʴ� ���
SELECT *
    FROM EMP
    WHERE EXISTS(SELECT DNAME
                    FROM DEPT
                    WHERE DEPTNO =50);
                    
-- ���߿� �������� ����ϱ�
SELECT *
    FROM EMP
    WHERE (DEPTNO,SAL) IN (SELECT DEPTNO, MAX(SAL) --10:5000/20:3000/30:2850
                            FROM EMP
                            GROUP BY DEPTNO);

SELECT DEPTNO, MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO;
    
    
-- �ζ��� �� ����ϱ�
-- �μ���ȣ�� 10���� ������� ���
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO,
        D.DNAME, D.LOC
    FROM (SELECT * FROM EMP WHERE DEPTNO=10) E10,
         (SELECT * FROM DEPT) D
    WHERE E10.DEPTNO =D.DEPTNO;
    
--WITH�� ����ϱ�
WITH
E10 AS (SELECT * FROM EMP WHERE DEPTNO=10),
D AS (SELECT *FROM DEPT)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO,
        D.DNAME, D.LOC
    FROM E10,D
    WHERE E10.DEPTNO =D.DEPTNO;
    
--��Į�� �������� ����ϱ� 
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
    
    
--9�� ���� ����
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