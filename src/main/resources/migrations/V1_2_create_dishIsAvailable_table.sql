CREATE TABLE "dishIsAvailable" (
    "id" SERIAL PRIMARY KEY,
    "isAvailable" bool,
    "restaurantId" INT REFERENCES restaurant(id),
    "dishId" INT REFERENCES dish(id)
);

INSERT INTO "dishIsAvailable" ("isAvailable", "restaurantId", "dishId")
VALUES ('t', 3, 1),
       ('f', 2, 2),
       ('t', 1, 1);