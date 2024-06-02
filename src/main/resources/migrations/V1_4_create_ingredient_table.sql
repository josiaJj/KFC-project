CREATE TABLE "ingredient" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(200),
    "neededQty" FLOAT,
    "unity" VARCHAR(50),
    "unitPrice" FLOAT,
    "dishId" INT REFERENCES "dish"("id")
);


INSERT INTO "ingredient"("name", "neededQty", "unity", "unitPrice", "dishId")
VALUES ('pain', 1, 'pièce', 500, 2),
       ('saucisse', 0.125, 'KG', 20000, 2),
       ('Mayonnaise', 0.05, 'Litre', 10000, 2),
       ('Ketchup', 0.05, 'Litre', 5000, 2);