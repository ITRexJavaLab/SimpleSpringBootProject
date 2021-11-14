CREATE TABLE IF NOT EXISTS room
(
    id               BIGINT                         NOT NULL AUTO_INCREMENT,
    room_number        VARCHAR(20),
    floor            INT,
    PRIMARY KEY (id),
    CONSTRAINT UNIQUE_NUMBER UNIQUE (room_number)
    );

INSERT INTO room(room_number, floor)
VALUES ('202', 2),
       ('406', 4);

COMMIT;