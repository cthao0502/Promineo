CREATE DATABASE if not exists customers;

use customers;

DROP TABLE if exists comments;
DROP TABLE if exists posts;
DROP TABLE if exists users;

CREATE TABLE users (
	user_id int(11) not null auto_increment,
	username varchar(20) not null,
	email varchar(50),
	password varchar(50) not null,
	primary key (user_id)
);

CREATE TABLE posts (
	post_id int(11) not null auto_increment,
	user_id int(11) not null,
	time_created datetime default current_timestamp,
	post varchar(120),
	primary key (post_id),
	foreign key (user_id) references users(user_id)	
);

CREATE TABLE comments (
	comment_id int(11) not null auto_increment,
	post_id int(11) not null,
	user_id int(11) not null,
	time_created datetime default current_timestamp,
	comment varchar(120),
	primary key (comment_id),
	foreign key (post_id) references posts(post_id),
	foreign key (user_id) references users(user_id)
);
