-- Delete database
delete from histories;
delete from wishes;
delete from products;
delete from users;

-- Insert data
INSERT INTO products (name, price, stock) VALUES
  ('PAPEL', 200, 5),
  ('LAPIZ', 300, 10),
  ('LAPICERO', 100, 12),
  ('MUEBLES', 1000, 15),
  ('CASAS', 1002, 20),
  ('BORRADORES', 500, 25);

INSERT INTO users (first_name, last_name, username, pwd) VALUES
  ('test', 'tst', 'test', 'test');