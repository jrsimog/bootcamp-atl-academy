CREATE TABLE users(
id int AUTO_INCREMENT,
email varchar(255) NOT NULL,
password varchar(255) NOT NULL,
phone varchar(255), 
role_name varchar(255) NOT NULL,

PRIMARY KEY(id)
); -- ok

CREATE TABLE bars(
id int auto_increment,
name varchar(255) NOT NULL,
address varchar(255)NOT NULL,
description varchar(255)NOT NULL,

PRIMARY KEY(id)
); -- ok

CREATE TABLE category(
id int auto_increment,
name varchar(255) not null,

PRIMARY KEY(id)
); -- ok

CREATE TABLE products(
id int auto_increment,
name varchar(255) NOT NULL,
description varchar(255) NOT NULL,
price decimal(10,3) NOT NULL,
categoryFK int NOT NULL,

FOREIGN KEY(categoryFK) REFERENCES category(id),
PRIMARY KEY(id)
); -- ok

CREATE TABLE 'tables'(
id int NOT NULL,
number_table int NOT NULL,
is_active bit,

PRIMARY KEY(id)
); -- ok

CREATE TABLE shopping_cart(
id int auto_increment not null,
date_buy datetime not null,
state bit,
userFK int not null,
barFK int not null,

FOREIGN KEY(userFK) REFERENCES users(id),
FOREIGN KEY(barFK) REFERENCES bars(id),
PRIMARY KEY(id)
); -- ok

CREATE TABLE detail_shop_cart(
id int auto_increment not null,
count int not null,
shop_cart_FK int not null,
productFK int not null,

FOREIGN KEY(shop_cart_FK) REFERENCES shopping_cart(id),
FOREIGN KEY(productFK) REFERENCES products(id),
PRIMARY KEY(id)
); -- ok

CREATE TABLE payments(
id int auto_increment not null,
discount decimal(10,3) null,
amount decimal(10,3) not null,
date_pay datetime not null,
shop_cart_FK int not null,

FOREIGN KEY(shop_cart_FK) REFERENCES shopping_cart(id),
PRIMARY KEY(id)
); -- ok

CREATE TABLE feedback_user(
id int not null,
comment varchar(255) not null,
score int not null,
userFK int not null,
barFK int not null,

FOREIGN KEY(userFK) REFERENCES users(id),
FOREIGN KEY(barFK) REFERENCES bars(id),
PRIMARY KEY(id)
); -- ok
