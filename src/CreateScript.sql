drop table if exists news;
drop table if exists journaliste;
drop table if exists note;


create table journaliste (
id integer primary key Auto_increment  NOT NULL ,
journalisteName varchar(30),
credit integer
);

create table news (
id integer primary key Auto_increment  NOT NULL,
titre varchar(20),
contenu varchar(50),
tag varchar(20),
date DATE,
fk_journaliste integer
);

create table note (
id integer primary key Auto_increment  NOT NULL,
noteValue int,
valideState boolean,
commentaire varchar(50),
fk_news integer,
fk_journaliste integer
);

create table tag (
id integer primary key Auto_increment  NOT NULL,
tagName varchar(20),
);

create table tagNews (
id integer primary key Auto_increment  NOT NULL,
fk_news integer,
fk_tag integer
);

alter table news
add constraint fk_journaliste
FOREIGN key (fk_journaliste)
references journaliste(id);

alter table note
add constraint fk_journaliste
FOREIGN key (fk_journaliste)
references journaliste(id);

alter table note
add constraint fk_news
FOREIGN key (fk_news)
references fk_news(id);