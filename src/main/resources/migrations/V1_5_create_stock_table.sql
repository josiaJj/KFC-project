CREATE TABLE "stock" (
    "id" SERIAL PRIMARY KEY,
    "availableQty" FLOAT,
    "supplyDateTime" TIMESTAMP default CURRENT_TIMESTAMP,
    "ingredientId" INT REFERENCES "ingredient"(id)
);

INSERT INTO "stock" ("availableQty", "ingredientId")
VALUES (10, 1),
       (5, 2),
       (3, 3);