create  database spring_security_demo_plaintext;


create table users
(
	username varchar(50) not null
		constraint users_pk
			primary key,
	password varchar(50) not null,
	enabled boolean
);


create table authorities
(
	username varchar(50) not null
		constraint authorities_users_username_fk
			references users,
	authority varchar(50) not null,
	constraint unique_authorities_key
		unique (username, authority)
);

