CREATE TABLE "dishHasIngredient" (
    "id" SERIAL PRIMARY KEY,
    "dishId" INT REFERENCES "dish"(id),
    "ingredientId" INT REFERENCES "ingredient"(id)
);

INSERT INTO "dishHasIngredient" ("dishId", "ingredientId")
    VALUES (1, 3),
            (1, 4),
            (2, 1),
            (2, 2),
            (3, 1),
            (3, 4);