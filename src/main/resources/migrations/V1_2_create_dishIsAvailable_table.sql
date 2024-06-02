CREATE TABLE "dishIsAvailable" (
    "id" SERIAL PRIMARY KEY,
    "isAvailable" bool,
    "restaurantId" INT REFERENCES restaurant(id),
    "dishId" INT REFERENCES dish(id)
);

INSERT INTO "dishIsAvailable" ("isAvailable", "restaurantId", "dishId")
VALUES ('t', 7, 1),
       ('f', 7, 2),
       ('t', 8, 1);