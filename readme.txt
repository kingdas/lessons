�ؼ��ֱ�
abstract assert boolean break
byte case catch char class const
continue	default	do	double	else
enum	extends	final	finally	float
for	goto	if	implements	import
instanceof	int	interface	long	native
new	package	private	protected	public
return	strictfp	short	static	super
switch	synchronized	this	throw	throws
transient	try	void	volatile	while
true	false	null	


������:
//abstract���� �����ǳ����ࣻ
//�����಻��ʵ����
//һ��javaԴ�ļ��п����ж���࣬��ֻ����һ�������࣬�����������Ҫ���ļ�ͬ��
//û�з�����ķ����ǡ����󷽷���
//���г��󷽷������Ȼ�ǳ�����
// �����಻һ�����г��󷽷�
//һ����̳���һ�������࣬�����Ҫô��ɳ���ģ�Ҫô��ʵ�ֳ�����ĳ��󷽷���

�ӿ�:
//�ӿ��еķ��������ǳ��󷽷�
//�ӿڲ���ʵ����
//�ӿ��г��󷽷�Ĭ�����η���public abstract
//�ӿ��п��������ԣ����Ե����η�Ĭ����public static final
////�ӿڿ��Լ̳н�;���ܶ�̳нӿ�
//��ֻ�ܵ��̳��࣬����ʵ�ֽӿ�
//��������ָ���������ʱ�����ܵ���������չ
//final���εı�������Ϊ������������������ʱ�����ò��ܱ䣻

�쳣��
//�쳣��exception--ArithmeticException��
//�����쳣ʱ�����Դ���Ļ�---������ֹ
//����ʽ���ѿ��ܲ����쳣�Ĵ������try������
//�����쳣ʱ�����׳���Ӧ���쳣����
//�׳��Ĵ��쳣����ᱻcatch�еı������յ�
//catch����(����)�쳣
//һ��try�����ж��catch;
//���catch˳��Ҫ���ӵ������������ں������ᱻִ�У�Ҳ������˼�ˣ���ƽ���ɲ���˳��
//try-catch�����һ��δ������һtry��
//finally�����Ƿ�����쳣��finally���鶼�ᱻִ�У���������return��  �����˳�Ӧ�ó���System.exit(0)����--һ�������ͷ���Դ
//return ;�����޷���ֵʱ�������������õķ�ʽ
//try����û��catch;try-finally
//NullPointerException,ArithmeticException,IndexOutOfBoundsException
//ע������ָ���쳣��������ַ����Ƚϣ���������ǰ��
//��throwһ���쳣����ʱ����ǰ����throws���쳣�����׸����ô�ȥ����
//RuntimeException������ʱ�쳣���ᱻǿ��Ҫ����

���ϣ�
Collection
List:���򣬿��ظ�
	ArrayList���ڲ�ʵ���Ƕ������飨��дЧ�ʸߣ�
	LinkedList���ڲ�ʵ�����������룬ɾ��Ч�ʸߣ�
Set:���򣬲��ظ�

Map
��ֵ��
Map��key�����ظ�
ͨ��keyȡ��value

final
�����಻�ܱ��̳У����η������ܱ���д�����α���Ϊ����


���ݿ�MySql��(oracle,sqlserver,sqlite)��ϵ�����ݿ�

drop database db_gw;

create database db_gw;#ע�ͣ��������ݿ�
show databases;#�鿴���ݿ�
select database();#�鿴��ǰ�������ݿ�
use db_gw;#�л����ݿ�
create table  t_user(id int primary key auto_increment,name varchar(50),tel varchar(20));#����
#����������,����

desc t_user;#�鿴��ṹ
set names gbk;#���ñ���
insert into t_user(id,name,tel)values( 1,'����' ,'112'),( 5,'����' ,'122');#����
select * from t_user; #��ѯ,*��ʾ������
insert into t_user(name,tel)values( '����' ,'132');
insert into t_user(name)values( '��С��');
update t_user set name='����' where id=5;#�ǵü�����
delete from t_user where id=6;#�ǵü�����
#delete from t_user where name='����';
#CRUD��ɾ�Ĳ飺insert,select,update,delete
select name,tel from t_user;
select * from t_user where id=2;#>,<,>=,<=,!=(<>),=,
select * from t_user where id>2 and tel=122;#and,or,
select * from t_user where name like '_��';_����һ�������ַ�
select * from t_user where name like '��_';
select * from t_user where name like '��%';#%��ʾ����������ַ�
select * from t_user where name like '%��%';#ģ����ѯ
select * from t_user where id in(1,5,9);#����
select * from t_user where id not in(1,5,9);
select * from t_user where id between 1 and 5;#[1,5]
select * from t_user where tel is null;
select * from t_user where tel is not null;
select count(id), avg(id), sum(id)/count(id) ,max(id),min(id),sum(id) from t_user;
select  concat(avg(id),'<==>',sum(id)/count(id))  from t_user;
select  concat('123','abc','...');
create table  t_group(id int primary key auto_increment,name varchar(50),remark varchar(100));#����

alter table t_user add column group_id int;#������
alter table t_user add constraint fk_ug foreign key t_user(group_id) references t_group(id);


create table  t_tmp(id int primary key auto_increment,name varchar(50),tel varchar(20),gid int,foreign key (gid) references t_group(id));#����
drop table if exists t_tmp;#�ǳ�Σ��
insert into t_group(name)values('������'),('�г���');

update t_user set group_id=1 where id=1 or id=7;
update t_user set group_id=2 where id=5;
#��ѯ����������
select count(*) from t_user where group_id=1;
select count(*) from t_user where group_id=2;
select group_id,count(id) from t_user group by group_id;#group by ����
select u.name,g.name from t_user as u,t_group g where u.group_id=g.id; #as ȡ������u.group_id=g.id��������������
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id;#group by ����
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id having count(u.id)>1;#��������having
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id order by count(u.id) desc;#���� ascĬ������ ,desc ����

select * from t_user order by id desc;

select * from t_user order by group_id;

select * from t_user order by group_id,name desc;

select * from t_user limit 1,2;#��ҳ
select * from t_user limit 0,1;

select * from t_user limit 2;


select g.name,tmp.c 
from 
t_group g,
(select group_id,count(id) c from t_user group by group_id) tmp
where g.id=tmp.group_id;#��ѯ����ɵ����á�


JDBC:
0.�����
1.ע������
2.��ȡ���Ӷ���
3.��ȡ�������
4.ִ��SQL���
5.������
6.�ͷ���Դ


���䣺��͸�࣬ʹ��֮

DAO(Data Access Object)��һ�����ݷ��ʽӿڣ����ݷ��ʣ�����˼����������ݿ�򽻵�

HTML:�������ı�����ǡ�����
A|href,html,head,body,title,hr,br,h(n:1-6)
&lt; &gt; &nbsp;&amp; &#65;&#97;&#48;
img|src,table|tr|td
form


JSP:ȫ��ΪJava Server Pages����������java������ҳ�棬�������һ���򻯵�Servlet��ƣ�����һ�ֶ�̬��ҳ������׼��
ҳ�洫ֵ������url?xx=2


form actionָ������ҳ��method�ύ��ʽ��get��Ĭ�ϣ�|post
EL���ʽ��${ }
---
get&post��
get:��������URL�����ñ����Ч������ȫ���ύ�������Ƚ�С
post:���������������з��͵ģ���ȫ���ύ�����ݴ�С����
---
�ض���&ת��:
�ض��򣺵�ַ�䣬���ݶ�
ת  ������ַ���䣬���ݱ���
---
request��������
---
JSTL:jsp��ǩ��
1.�����ǩ���
2.��JSP�м����ǩ��ָ��
---
������jsp:forwardת������
---
ָ�page,taglib
---
servlet
---
MVC��Model(javabean)-View(jsp)-Controller(servlet);
---
mybatis:ORM��ܣ�����--��ϵӳ��
1.����
2.д�����ļ�--���������񣺣�
3.ӳ���ļ���namespace="com.yc.userSys.UserDao"�����ռ�Ҫ���daoͬ��
4.ʹ�ã�SqlSessionFactory��SqlSession--commit|rollback
--
spring
IOC���Ʒ�ת|DI����ע��
ע�����ַ�ʽ�����ԡ����췽�����ӿڣ�spring��֧�֣�
�Զ�װ�䣺default-autowire="byType"�����ͣ�
--
springMvc
1.DispatcherServletǰ�˿�����
�����ļ���springMvc-servlet.xml����ǰ�˿����������ֿ�ͷ��-servlet.xml
2.InternalResourceViewResolver��ͼ������
		<property name="prefix" value="/WEB-INF/jsp/" /><!-- ǰ׺ -->
		<property name="suffix" value=".jsp" /><!-- ��׺ -->
3.	<mvc:annotation-driven /><!-- ��ע������ -->
	<context:component-scan base-package="com.yc" /><!-- ɨ��� -->
---
ssm:
web.xml
	<!-- �ò�����ʽ����spring�����ļ�λ�� -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>

	<!-- ������ :��������ʱ������ spring��IOC�� -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
spring-mybatis.xml
	<!-- ����Դ -->
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/db_gw" />
		<property name="username" value="root" />
		<property name="password" value="root" />
	</bean>
	<!-- session���� -->
	<bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations" value="classpath*:com/yc/userSys/dao/*.xml" />
	</bean>
	<!-- ��̬����DAOʵ�֡��ࡱ -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
------------------
ContextLoaderListener:context-param<->contextConfigLocation(classpath:spring-mybatis.xml)
BasicDataSource:driverClassName
SqlSessionFactoryBean:mapperLocations(classpath*:com/yc/userSys/dao/*.xml)
MapperScannerConfigurer:basePackage(com.yc.userSys.dao);sqlSessionFactoryBeanName
------------------

JSON(JavaScript Object Notation, JS �������) ��һ�������������ݽ�����ʽ�������� ECMAScript (ŷ�޼����Э���ƶ���js�淶)��һ���Ӽ���������ȫ�����ڱ�����Ե��ı���ʽ���洢�ͱ�ʾ���ݡ����������Ĳ�νṹʹ�� JSON ��Ϊ��������ݽ������ԡ� �������Ķ��ͱ�д��ͬʱҲ���ڻ������������ɣ�����Ч���������紫��Ч�ʡ�

--
ð������
--
�ݹ�
--
����---����򵥵����ģʽ
--
�Ƚ���
--
IO:
InputStream|OutputStream 
BufferedInputStream|BufferedOutputStream
DataInputStream|DataOutputStream
ObjectOutputStream|ObjectInputStream ���л�����������ļ��������л�
Serializable��ʶ�ӿ�
transient˲ʱ--���������л�
Reader|Writer�ַ���
InputStreamReader�ֽ���ת�ַ���
FilenameFilterͨ���ļ��������ļ�
--
thread:������ʱ��Ƭ�ֻ�
Runnable
synchronized
����
������������ģ��

---
javascript(JS)
JavaScript��"����Java��HTML֮�䡢"���ڶ���""�¼�����"�ı������;�������������ֱ������
---
AJAX
XMLHttpRequest:open(),send(),readyState,onreadystatechange,responseText


---
������ʽ
^[1-9]\d{0,9}$
\d<==>[0-9]


\,^,$,*{0,},+{1,},?{0,1},{n,m} ,x|y,[xyz],[^xyz],[a-z],[^a-z],\d [0-9],\D[^0-9],\w[A-Za-z0-9_],\W 
email:"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$" �ʼ�

gu-wei@1.com
gu.wei@w1.cc
gu@As.org
gu.wei-xx@ss
---
 spirng : default-autowire="byName|byType"  ��������|�����Զ�װ��
---
jsp���(%,!,@,--,=)
scope
el���ʽȡScope��Χֵʱ������page��Χ������ҵ�����ʾ������Ҳ���������request��Χ
page<request<session<application
---
jq:
jQuery��һ�����١�����JavaScript��ܣ���һ�������JavaScript����⣨��JavaScript��ܣ���
jQuery��Ƶ���ּ�ǡ�write Less��Do More����������д���ٵĴ��룬����������顣
����װJavaScript���õĹ��ܴ��룬�ṩһ�ּ���JavaScript���ģʽ���Ż�HTML�ĵ��������¼�����������ƺ�Ajax������
---
������
---
������
---
css:�����ʽ��:���������ʾHTMLԪ��
�﷨��selector {property: value}-->h1 {color:red; font-size:14px;}

---


---
target:
_blank -- ���´����д�����
_parent -- �ڸ������д�����
_self -- �ڵ�ǰ���������,��ΪĬ��ֵ
_top -- �ڵ�ǰ��������ӣ����滻��ǰ����������(���ҳ)
����ָ���ڿ��ҳ��λ����ʾ
---
frameset(rows,cols),frame(src,name)
---
upload
enctype="multipart/form-data"

DiskFileItemFactory
ServletFileUpload---isMultipartContent,parseRequest
FileItem---isFormField,write
--
oa
---
��֤��
---
��ֹ�ظ��ύ
---
enum


































