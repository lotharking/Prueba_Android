-- Delete database
-- delete from wish where id > 0;
delete from product where id > 0;

-- Insert data
INSERT INTO product (name, price, stock) VALUES
  ('casa', 200, 5),
  ('carro', 300, 10),
  ('beca', 100, 12),
  ('mina', 1000, 15),
  ('sal', 1002, 20),
  ('locion', 500, 25);