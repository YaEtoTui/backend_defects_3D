CREATE TABLE IF NOT EXISTS defects
(
    id    BIGSERIAL PRIMARY KEY ,
    nameDefect  VARCHAR NOT NULL,
    description  VARCHAR NOT NULL,
    reasons  VARCHAR NOT NULL,
    solutions  VARCHAR NOT NULL,
    picture VARCHAR
);