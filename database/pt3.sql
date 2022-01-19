--1. emp2 테이블에서 pay가 50,000,000 이상인 사람의 이름(name), 연봉(pay), 직급(postion)을 표시하라. 
SELECT NAME, PAY, POSITION
FROM EMP2
WHERE PAY>=50000000;

--2. emp2 테이블에서 이름, 급여, 보너스, 세금을 출력하라, 보너스는 급여의 50%, 세금은 급여의 10%로 계산하여 출력하고 
--보너스와 세금 필드의 별명은 각각 “보너스”, “세금”으로 지정한다. 
SELECT NAME, TO_CHAR(PAY,'999,999,999,999'), PAY*0.5 AS BONUS, PAY*0.1 AS TAX
FROM EMP2;

--3. emp2 테이블에서 취미(hobby)가 “Music, Climb, Swim”인 사람의 이름과 취미를 출력하라.
SELECT NAME, HOBBY
FROM EMP2
-- WHERE HOBBY IN(INITCAP('MUSIC'),INITCAP('CLIMB'),INITCAP('SWIM'));
WHERE UPPER(HOBBY) IN ('MUSIC','CLIMB','SWIM');

--4. 교수(professor) 테이블에서 연봉이 5000 이상인 교수의 name, pay, bonus, 연봉(pay*12+bonus)를 출력하라. 
SELECT NAME, PAY, BONUS, PAY*12+NVL(BONUS,0) AS YEAR_PAY
    FROM PROFESSOR
    WHERE PAY*12+NVL(BONUS,0)>=5000;

--5. 교수(professor) 테이블에서 id가 “s"로 시작하는 교수의 이름(name), 아이디(id)를 출력하라. 
SELECT NAME, ID
    FROM PROFESSOR
    WHERE UPPER(ID) LIKE 'S%';

--6. 교수 테이블에서 홈페이지(hpage)가 있는 교수의 이름(name), 홈페이지(hpage)를 출력하라. 
SELECT NAME, HPAGE
FROM PROFESSOR
WHERE HPAGE IS NOT NULL;

--7. emp2 테이블에서 급여(pay)가 30,000,000~50,000,000 사이인 사람의 이름과 급여를 출력하라. 
SELECT NAME, PAY
    FROM EMP2
    WHERE PAY BETWEEN 30000000 AND 50000000;

--8. 교수 테이블에서 이름, id, 직급을 직급순으로 오름차순, id순으로 내림차순으로 정렬하여 출력하라. 
SELECT NAME, ID, POSITION
    FROM PROFESSOR
    ORDER BY POSITION ASC, ID DESC;

--9. 학생(student) 테이블에서 키가 180이상이면서 몸무게가 70이하인 사람의 이름(name), 키(height), 몸무게(weight)를 
--이름순으로 오름차순으로 정렬하여 출력하라
SELECT NAME, HEIGHT, WEIGHT
    FROM STUDENT 
    WHERE HEIGHT>=180
        AND WEIGHT <=70
    ORDER BY NAME;