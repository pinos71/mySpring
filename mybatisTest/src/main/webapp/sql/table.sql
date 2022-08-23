create table sboard(
  num number not null primary key,
  writer varchar2(30) not null,
  title varchar2(60) not null,
  passwd varchar2(12) not null,
  content clob not null,
  reg_date date not null
);

create sequence sboard_seq;







