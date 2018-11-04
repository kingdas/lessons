set names gbk;
create database db_crud;
use db_crud;
create table t_user(operator_id int primary key auto_increment,name varchar(50),password varchar(50),status int comment '1表示有效，0表示无效');
insert into t_user(name,password,status)values('zs','zs',1);
select * from t_user;
