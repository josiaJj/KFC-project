CREATE TABLE "dishIsAvailable" (
    "id" SERIAL PRIMARY KEY,
    "isAvailable" bool,
    "restaurantId" INT REFERENCES restaurant(id),
    "dishId" INT REFERENCES dish(id)
);