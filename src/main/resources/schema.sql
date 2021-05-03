DROP TABLE IF EXISTS ORDERS;
DROP TABLE IF EXISTS PAYMENT_DETAILS;
DROP TABLE IF EXISTS PRODUCT_ORDERED;

CREATE TABLE ORDERS (order_id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
payment_id INT NOT NULL);

CREATE TABLE PRODUCT_ORDERED (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         order_id INT NOT NULL,
                         item_id INT NOT NULL,
                         item_name VARCHAR(250) NOT NULL);

CREATE TABLE PAYMENT_DETAILS ( payment_id INT AUTO_INCREMENT PRIMARY KEY, payment_type VARCHAR(250) NOT NULL,
card_num VARCHAR(250) NOT NULL, exp_date VARCHAR(250) NOT NULL,
order_id INT NOT NULL);
alter table PRODUCT_ORDERED add constraint FK_PAYMENT foreign key (order_id) references ORDERS(order_id);
alter table PAYMENT_DETAILS add constraint FK_ORDERS foreign key (order_id) references ORDERS(order_id);