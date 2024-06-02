CREATE TABLE "ingredient" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(200),
    "neededQty" FLOAT,
    "unity" VARCHAR(50),
    "unitPrice" FLOAT,
    "dishId" INT REFERENCES "dish"("id")
);