
    show databases;
create database dummy;
use dummy;

CREATE TABLE orders (
      order_id INT AUTO_INCREMENT PRIMARY KEY,
      customer_name VARCHAR(100) NOT NULL,
      product_name VARCHAR(100) NOT NULL,
      quantity INT NOT NULL,
      price DECIMAL(10,2)NOT NULL,
      order_data DATE NOT NULL,
      status VARCHAR(20) DEFAULT 'Pending'
);

desc orders;

INSERT INTO orders (customer_name, product_name, quantity, price, order_data, status)
VALUES 
('John Doe', 'Laptop', 1, 899.99, '2025-09-20', 'Shipped'),
('Alice Smith', 'Smartphone', 2, 499.49, '2025-09-21', 'Pending'),
('Bob Johnson', 'Tablet', 3, 199.99, '2025-09-22', 'Delivered'),
('Charlie Brown', 'Headphones', 1, 89.99, '2025-09-18', 'Pending'),
('David White', 'Smartwatch', 2, 179.95, '2025-09-19', 'Shipped'),
('Eve Green', 'Camera', 1, 499.00, '2025-09-17', 'Delivered'),
('Grace Lee', 'Monitor', 2, 229.50, '2025-09-20', 'Pending'),
('Hank Miller', 'Keyboard', 5, 49.99, '2025-09-21', 'Shipped'),
('Isla King', 'Mouse', 4, 25.75, '2025-09-22', 'Delivered'),
('James Walker', 'Printer', 1, 149.99, '2025-09-18', 'Pending');

select * from orders;

select * from orders order by price desc;

select * from orders order by price desc limit 1 offset 1;

select * from orders where status in('Processing','Shipped');