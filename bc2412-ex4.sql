create database EX4;

use EX4;


CREATE TABLE PLAYERS(
	PLAYER_ID INTEGER NOT NULL UNIQUE,
    GROUP_ID INTEGER NOT NULL
);

CREATE TABLE MATCHES(
	MATCH_ID INTEGER NOT NULL UNIQUE,
    FIRST_PLAYER INTEGER NOT NULL,
    SECOND_PLAYER INTEGER NOT NULL,
    FIRST_SCORE INTEGER NOT NULL,
    SECOND_SCORE INTEGER NOT NULL
);


INSERT INTO PLAYERS(PLAYER_ID, GROUP_ID) VALUES
	(20, 2),
    (30, 1),
    (40, 3),
    (45, 1),
    (50, 2),
    (65, 1)
;

INSERT INTO MATCHES VALUES
	(1, 30, 45, 10, 12),
    (2, 20, 50, 5, 5),
    (13, 65, 45, 10, 10),
    (5, 30, 65, 3, 15),
    (42, 45, 65, 8, 4)
;

-- X
SELECT M.FIRST_PLAYER, SUM(M.FIRST_SCORE)
FROM PLAYERS P INNER JOIN MATCHES M
ON P.PLAYER_ID = M.FIRST_PLAYER
GROUP BY M.FIRST_PLAYER
;

-- x K

WITH MATCHES_I AS (
	SELECT M.FIRST_PLAYER AS PLAYER, SUM(M.FIRST_SCORE) AS SCORE, P.GROUP_ID
	FROM MATCHES M INNER JOIN PLAYERS P
    ON P.PLAYER_ID = M.FIRST_PLAYER
	GROUP BY M.FIRST_PLAYER
), MATCHES_II AS (
	SELECT M.SECOND_PLAYER AS PLAYER, SUM(M.SECOND_SCORE) AS SCORE, P.GROUP_ID
	FROM MATCHES M INNER JOIN PLAYERS P
    ON P.PLAYER_ID = M.SECOND_PLAYER
	GROUP BY M.SECOND_PLAYER
)
-- SELECT GROUP_CONCAT(I.FIRST_PLAYER, II.SECOND_PLAYER) AS ALL_PLAYER


SELECT *
FROM MATCHES_I I INNER JOIN MATCHES_II II
ON I.GROUP_ID = II.GROUP_ID
-- ON I.FIRST_PLAYER = II.SECOND_PLAYER
-- WHERE PLAYER IN (I.FIRST_PLAYER, II.SECOND_PLAYER)
GROUP BY I.FIRST_PLAYER, II.SECOND_PLAYER
;

-- K
SELECT
    p.group_id,
    CASE
        WHEN m.first_score > m.second_score THEN m.first_player
        ELSE m.second_player
    END AS winner_id
FROM matches m
JOIN players p ON p.player_id = 
    CASE 
        WHEN m.first_player = p.player_id THEN m.first_player 
        ELSE m.second_player 
    END;


-- ans
with score_board as (
	select p.group_id, m.first_player as player_id, m.first_score as score
    from matches m, players p
    where m.first_player = p.player_id
    union all
    select p2.group_id, m2.second_player as player_id, m2.second_score as score
    from matches m2, players p2
    where m2.second_player = p2.player_id
    union all
    select p3.group_id, p3.player_id, 0 as score
    from players p3
    where not exists (select 1 
						from matches m3 
						where m3.second_player = p3.player_id 
                        or m3.first_player = p3.player_id)
), player_score_board as (
		select group_id, player_id, sum(score) as player_score
        from score_board
        group by group_id, player_id
), all_ranks as (
		select row_number() over (partition by s.group_id 
									order by s.player_score desc, s.player_id asc) as group_rank
		, s.*
        from player_score_board s
), group_winner as (
		select group_id, player_id
        from all_ranks
        where group_rank = 1
)
select *
from group_winner
;



-- **
SELECT * FROM PLAYERS;
SELECT * FROM MATCHES;

drop database EX4;