-- Delete database
delete from history where id > 0;
delete from wish where id > 0;
delete from product where id > 0;
delete from users where id > 0;

-- Insert data
-- INSERT INTO product (name, price, stock) VALUES
--   ('PAPEL', 200, 5),
--   ('LAPIZ', 300, 10),
--   ('LAPICERO', 100, 12),
--   ('MUEBLES', 1000, 15),
--   ('CASAS', 1002, 20),
--   ('BORRADORES', 500, 25);

-- INSERT INTO users (first_name, last_name, username, pwd) VALUES
--   ('test', 'tst', 'test', 'test');