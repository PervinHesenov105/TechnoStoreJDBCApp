create table category(
id int primary key auto_increment,
category_name varchar(20));

insert into category(category_name) values ('General'),('Phone'),('PC'),('TV'),('HeadSet');

create table store(
id int primary key auto_increment,
store_name varchar(20),
location varchar(50),
phone varchar(13));

insert into store(store_name,location,phone) values ('Apple','America','+154545646'),
('Apple','Canada','+155774141'),('LG','Finland','+781545454'),('Xiomi','China','+632245414'),
('Samsung','KOREA','+82142799');

create table users(
id int primary key auto_increment,
username varchar(30) unique,
password varchar(20) );

create table product(
id int primary key auto_increment,
name varchar(20),
price double(10,2),
quantity int,
category_id int,
store_id int,
constraint cfk_id foreign key(category_id) references category(id),
constraint sfk_id foreign key(store_id ) references store(id));

insert into product(name,price,quantity,category_id,store_id) values ('Iphone 14 pro',3000,5,2,1),
('Airpods pro+',450,25,5,2),('Lg202090a',1500,1,4,3),('9400f',2500,3,3,5);