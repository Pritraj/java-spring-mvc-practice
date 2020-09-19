create table instructor_details
(
	id serial not null
		constraint instructor_details_pk
			primary key,
	youtube_channel varchar(100) not null,
	hobby varchar(50) not null
);

create table instructor
(
	id serial not null
		constraint instructor_pk
			primary key,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	email varchar(50),
	instructor_detail_id int
		constraint instructor_instructor_details_id_fk
			references instructor_details
				on update cascade on delete cascade
);

