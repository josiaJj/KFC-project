CREATE TABLE "stock" (
    "id" SERIAL PRIMARY KEY,
    "avaibleQty" FLOAT,
    "ingredientId" INT REFERENCES "ingredient"(id)
);