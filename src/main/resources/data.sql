--USER
INSERT INTO user(name)
VALUES ('David');

INSERT INTO user(name)
VALUES ('Jorge');

--OPERATION
INSERT INTO operation (coin, entry, entryBTC, entryUSD, exit, exitBTC, exitUSD, user_id, date, comment)
VALUES ('bitcoin', 100, 0.00000220000, 340, 130, 0.00000222111, 362, 1, '2018-01-01', 'First prinvest operation');

INSERT INTO operation (coin, entry, entryBTC, entryUSD, exit, exitBTC, exitUSD, user_id, date, comment)
VALUES ('cardano', 22, 0.00000110, 12, 45, 0.00000111, 15, 1, '2018-01-02', 'First prinvest operation');

INSERT INTO operation (coin, entry, entryBTC, entryUSD, exit, exitBTC, exitUSD, user_id, date, comment)
VALUES ('ethereum', 12, 0.00000110, 89, 13, 0.00000111, 80, 2, '2018-01-03', 'First prinvest operation');