CREATE TABLE "ingredient" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(200),
    "neededQty" FLOAT,
    "unity" VARCHAR(50),
    "unitPrice" FLOAT
);


INSERT INTO "ingredient"("name", "neededQty", "unity", "unitPrice")
VALUES ('pain', 1, 'pièce', 500),
       ('saucisse', 0.125, 'KG', 20000),
       ('Mayonnaise', 0.05, 'Litre', 10000),
       ('Ketchup', 0.05, 'Litre', 5000);