CREATE TABLE "dish" (
    "id" SERIAL PRIMARY KEY,
    "dishName" VARCHAR(200)
);

INSERT INTO "dish" ("dishName")
VALUES ('Burger'),
       ('Hot Dog'),
       ('wings');