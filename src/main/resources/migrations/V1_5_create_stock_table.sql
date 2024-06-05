CREATE TABLE "stock" (
    "id" SERIAL PRIMARY KEY,
    "availableQty" FLOAT,
    "ingredientId" INT REFERENCES "ingredient"(id)
);

INSERT INTO "stock" ("avaibleQty", "ingredientId")
VALUES (10, 1),
       (5, 2),
       (3, 3);