CREATE TABLE IF NOT EXISTS defects
(
    id    BIGSERIAL PRIMARY KEY ,
    text  VARCHAR NOT NULL,
    picture VARCHAR
);