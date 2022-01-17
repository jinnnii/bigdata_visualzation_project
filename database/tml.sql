--DEPT 테이블을 복사해서 DEPT_TCL 테이블 만들기
CREATE TABLE DEPT_TCL
    AS SELECT * FROM DEPT;
    
--DEPT_TCL 테이블에 데이터를 입력, 수정, 삭제하기
INSERT INTO DEPT_TCL
    VALUES(50,'DATABASE','SEOUL');
    
UPDATE DEPT_TCL
    SET LOC = 'BUSAN'
    WHERE DEPTNO =40;
    
DELETE FROM DEPT_TCL
    WHERE DNAME = 'RESEARCH';
    
--ROLLBACK으로 명령어 실행 취소하기
ROLLBACK;

-------------------------------------------------
--DEPT_TCL 테이블에 데이터를 입력, 수정, 삭제하기
INSERT INTO DEPT_TCL
    VALUES(50,'NETWORK','SEOUL');
    
UPDATE DEPT_TCL
    SET LOC = 'BUSAN'
    WHERE DEPTNO =20;
    
DELETE FROM DEPT_TCL
    WHERE DEPTNO = 40;

--COMMIT으로 명령어 반영하기
COMMIT;

ROLLBACK;
---------------------------------------
SELECT *
    FROM DEPT_TCL;


UPDATE DEPT_TCL
    SET LOC='SEOUL'
    WHERE DEPTNO=30;

--CMD
--UPDATE DEPT_TCL
--    SET DNAME='DATABASE'
--    WHERE DEPTNO=30;
    
COMMIT;

SELECT *
    FROM DEPT_TCL;
-----------------------------------------
