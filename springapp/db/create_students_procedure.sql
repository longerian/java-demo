DROP PROCEDURE IF EXISTS getRecord;
CREATE PROCEDURE getRecord(IN in_ID INT, OUT out_NAME VARCHAR(20), OUT out_AGE INT)
    READS SQL DATA
    BEGIN ATOMIC
        SELECT NAME, AGE INTO out_NAME, out_AGE FROM Student WHERE ID = in_ID;
    END