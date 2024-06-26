DROP TABLE IF EXISTS todos;

CREATE TABLE todos (
    id serial PRIMARY KEY,
    todo varchar(255) NOT NULL,
    detail text,
    created_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);