# learn-jpa-and-hibernate
![image](https://user-images.githubusercontent.com/91777037/229006011-5e7c5b56-c5f9-4255-a695-190617c90064.png)

H2 Db --> spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb

![image](https://user-images.githubusercontent.com/91777037/229008958-352ce168-4943-4d33-81e2-e6ccf133f603.png)
create table course(
	id bigint not null,
	name varchar(255) not null,
	author varchar(255) not null,
	primary key (id)
);
