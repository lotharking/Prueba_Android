-- Delete database
delete from histories;
delete from wishes;
delete from products;
delete from users;
delete from categories;

-- Insert data
INSERT INTO categories (name, description) VALUES
  ('PAPELERIA', ''),
  ('MUEBLES', ''),
  ('INMOBILIARIO', '');

INSERT INTO products (name, price, stock, category_id) 
SELECT 'PAPEL', 100, 500, c.id FROM categories c WHERE c.name = 'PAPELERIA';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'LAPIZ', 100, 500, c.id FROM categories c WHERE c.name = 'PAPELERIA';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'LAPICERO', 300, 500, c.id FROM categories c WHERE c.name = 'PAPELERIA';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'BORRADOR', 200, 500, c.id FROM categories c WHERE c.name = 'PAPELERIA';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'MUEBLE', 1600, 20, c.id FROM categories c WHERE c.name = 'MUEBLES';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'ESCRITORIO', 1500, 15, c.id FROM categories c WHERE c.name = 'MUEBLES';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'CASA', 100000, 2, c.id FROM categories c WHERE c.name = 'INMOBILIARIO';

INSERT INTO products (name, price, stock, category_id) 
SELECT 'APARTAMENTO', 50000, 1, c.id FROM categories c WHERE c.name = 'INMOBILIARIO';

INSERT INTO users (first_name, last_name, username, password) VALUES
  ('test', 'tst', 'test', 'test');