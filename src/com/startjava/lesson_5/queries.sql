\echo выведите всю таблицу
SELECT *
  FROM jaegers;

\echo отобразите только не уничтоженных роботов
SELECT *
  FROM jaegers
 WHERE status = 'Active';

\echo отобразите роботов нескольких серий: Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo отобразите всех роботов, кроме Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo отсортируйте таблицу по убыванию по столбцу mark
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\echo отобразите информацию о самом старом роботе
SELECT *
  FROM jaegers
 WHERE launch = (SELECT MIN(launch)
		           FROM jaegers);

\echo отобразите роботов, которые уничтожили больше всех kaiju
SELECT *
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
		               FROM jaegers);

\echo отобразите средний вес роботов
SELECT ROUND(AVG(weight) :: NUMERIC, 2) AS avg_weight
  FROM jaegers;

\echo увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отобразите таблицу
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status != 'Destroyed';
SELECT *
  FROM jaegers
 ORDER BY id;

\echo удалите уничтоженных роботов, а затем отобразите оставшихся
DELETE FROM jaegers
 WHERE status = 'Destroyed';
SELECT *
  FROM jaegers
 ORDER BY id;
