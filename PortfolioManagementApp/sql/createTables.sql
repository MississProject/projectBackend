CREATE DATABASE IF NOT EXISTS tradePortfolio;
use tradePortfolio;
create table users (emailAddress varchar(50) primary key,userName varchar(50),funds double);

CREATE TABLE stocks (stockSymbol varchar(50) primary key, stockName varchar(50),
                    stockPrice double             
);

CREATE TABLE stockOrders (orderID int primary key auto_increment,
		            orderStatus varchar(50) not null,
                    numOfShares int,
                    stockSymbol varchar(50),
                    userEmail varchar(50),
                    FOREIGN KEY (stockSymbol) REFERENCES stocks(stockSymbol),
                    FOREIGN KEY (userEmail) REFERENCES users(emailAddress)

);



insert into users values('abc@gmail.com','Jane Doe',25000.99);


insert into stocks values ('AAPL', 'apple', 265.26);
insert into stocks values ('AMZN', 'amazon', 2022.10);
insert into stocks values ('GOOGL', 'google', 1918.45);
insert into stocks values ('MSFT', 'microsoft', 157.14);



insert into stockOrders values (1, 'initial state', 1, 'AAPL', 'abc@gmail.com');
insert into stockOrders values (2, 'processing', 3, 'AAPL', 'abc@gmail.com');
insert into stockOrders values (3, 'success', 2, 'AAPL', 'abc@gmail.com');
insert into stockOrders values (4, 'success', 1, 'MSFT', 'abc@gmail.com');
