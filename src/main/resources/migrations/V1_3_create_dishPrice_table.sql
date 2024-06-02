CREATE TABLE "dishPrices" (
    "id" SERIAL PRIMARY KEY,
    "priceDate" DATE default CURRENT_DATE,
    "costPrice" FLOAT,
    "sellingPrice" FLOAT,
    "dishId" INT REFERENCES dish(id)
);

INSERT INTO "dishPrices" ("costPrice", "sellingPrice", "dishId")
VALUES (3750, 5000, 2),
       (4200, 7000, 1);