INSERT INTO group_company (brand_id, brand) VALUES (1,'ZARA'), (2,'OXIGEN'), (3,'WHITE BRAND');

INSERT INTO tarif (tarif_id, start_date, end_date, priority, product, price, curr, brand_id) VALUES
(1,  '2020-06-14 00.00.00',  '2020-12-31 23.59.59', 0, '35455', 35.50, 'EUR', 1),
(2,  '2020-06-14 15.00.00', '2020-06-14 18.30.00', 1, '35455', 25.45, 'EUR', 1),
(3,  '2020-06-15 00.00.00',  '2020-06-15 11.00.00', 1, '35455', 30.50, 'EUR', 1),
(4,  '2020-06-15 16.00.00',  '2020-12-31 23.59.59', 1, '35455', 38.95, 'EUR', 1);