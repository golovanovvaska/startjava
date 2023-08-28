DROP TABLE IF EXISTS jaegers;

\c robots;

CREATE TABLE jaegers (
	id 		   SERIAL PRIMARY KEY,
	model_name VARCHAR(30),
	mark 	   VARCHAR(6),
	height 	   REAL,
	weight 	   REAL,
	status 	   VARCHAR(10),
	origin 	   VARCHAR(10),
	launch 	   DATE,
	kaiju_kill INT
);

\ir 'init_db.sql';
\ir 'queries.sql';