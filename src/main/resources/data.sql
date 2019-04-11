truncate ingdb.product_groups;
truncate ingdb.products;
truncate ingdb.product_count;
truncate ingdb.product_groups;
insert into ingdb.product_groups values(1,0,'EN','Mortgage');
insert into ingdb.product_groups values(2,0,'EN','Payments');
insert into ingdb.product_groups values(3,0,'EN','Savings');

insert into ingdb.products values(1,200,'sample',1,'EN','Banking saving mortgage');
insert into ingdb.products values(2,200,'sample',1,'EN','Interest only');
insert into ingdb.products values(3,200,'sample',1 , 'EN','Annuity');
insert into ingdb.products values(4,200,'sample',1,'EN','Linear');

insert into ingdb.products values(5,200,'sample',2,'EN','Payments account');
insert into ingdb.products values(6,200,'sample',2,'EN','Debit card');
insert into ingdb.products values(7,200,'sample',2 , 'EN','Quarterly limit');
insert into ingdb.products values(8,200,'sample',2,'EN','Continuously limit');

insert into ingdb.products values(9,200,'sample',3,'EN','Orange savings account');
insert into ingdb.products values(10,200,'sample',3,'EN','Child savings account');
insert into ingdb.products values(11,200,'sample',3,'EN','Savings account for unicef');
insert into ingdb.products values(12,200,'sample',3,'EN','Bonus interest account');
insert into ingdb.products values(13,200,'sample',3,'EN','Savings deposit');
insert into ingdb.products values(14,200,'sample',3,'EN','Green savings deposit');

insert into ingdb.product_count values(1,0,1);
insert into ingdb.product_count values(2,0,2);
insert into ingdb.product_count values(3,0,3);
insert into ingdb.product_count values(4,0,4);
insert into ingdb.product_count values(5,0,5);
insert into ingdb.product_count values(6,0,6);
insert into ingdb.product_count values(7,0,7);
insert into ingdb.product_count values(8,0,8);
insert into ingdb.product_count values(9,0,9);
insert into ingdb.product_count values(10,0,10);
insert into ingdb.product_count values(11,0,11);
insert into ingdb.product_count values(12,0,12);
insert into ingdb.product_count values(13,0,13);
insert into ingdb.product_count values(14,0,14);
insert into ingdb.product_groups values(4,0,'EN','Loyalty points');


insert into ingdb.products values(15,400,'Earn Your Points : With all Savings account <br/> Put In : Earns is automatically',4,'EN','Profit in the ING Shop');