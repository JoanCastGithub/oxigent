



CREATE TABLE group_company(
brand_id IDENTITY PRIMARY KEY,
brand VARCHAR(25) NOT NULL
)



CREATE TABLE tarif(
    tarif_id IDENTITY PRIMARY KEY,
    start_date DATE NOT NULL ,
    end_date DATE NOT NULL,
    priority SMALLINT,
    product VARCHAR(25),
    price NUMERIC(8,2),
    curr VARCHAR(6)
)


ALTER TABLE tarif
  ADD CONSTRAINT fk_tarif_group
  FOREIGN KEY (brand_id)
  REFERENCES group_company(brand_id)
  ON DELETE CASCADE;

