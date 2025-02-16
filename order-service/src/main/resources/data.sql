-- Insert data into the orders table
INSERT INTO orders (total_price, order_status) VALUES 
(2500.00, 'CONFIRMED'),
(4500.50, 'PENDING'),
(1200.75, 'CANCELLED'),
(3000.00, 'CONFIRMED'),
(6500.20, 'PENDING'),
(4999.99, 'CANCELLED'),
(750.00, 'CONFIRMED'),
(8500.30, 'PENDING'),
(999.99, 'CANCELLED'),
(1234.56, 'CONFIRMED');

-- Insert data into the order_items table
INSERT INTO order_items (order_id, product_id, quantity) VALUES 
(1, 3, 2),
(1, 5, 1),
(2, 2, 3),
(2, 4, 2),
(3, 1, 1),
(4, 6, 4),
(5, 7, 2),
(6, 8, 5),
(7, 9, 1),
(8, 10, 3),
(9, 2, 2),
(10, 5, 4);
