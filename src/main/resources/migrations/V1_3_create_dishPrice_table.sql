CREATE TABLE "dishPrices" (
    "id" SERIAL PRIMARY KEY,
    "priceDate" DATE default CURRENT_DATE,
    "costPrice" FLOAT,
    "sellingPrice" FLOAT,
    "dishId" INT REFERENCES dish(id)
);