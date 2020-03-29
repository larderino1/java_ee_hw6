CREATE TABLE IF NOT EXISTS books(
    Id         INT(11) PRIMARY KEY AUTO_INCREMENT,
    ISBN         VARCHAR(17) NOT NULL,
    Title VARCHAR(50) NOT NULL,
    Author  VARCHAR(50) NOT NULL
);
insert into books
values(0,'Jeffrey Brown','978-1-891830-71-6','AEIOU or Any Easy Intimacy');
values(1,'Jeffrey Brown','978-1-891830-71-6','AEIOU or Any Easy Intimacy');
values(2,'Jeffrey Brown','978-1-891830-71-6','AEIOU or Any Easy Intimacy');
values(3,'Jeffrey Brown','978-1-891830-71-6','AEIOU or Any Easy Intimacy');
