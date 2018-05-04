create table product
(
id integer(20), 
name varchar(20), 
description varchar(20), 
price integer(10)
)

select * from product

CREATE TABLE revinfo
(
rev integer NOT NULL auto_increment,
revtstmp bigint,
CONSTRAINT revinfo_pkey PRIMARY KEY (rev)
)

select * from revinfo




CREATE TABLE product_aud
(
id bigint NOT NULL,
rev integer NOT NULL,
revtype smallint,
name varchar (25),
description varchar (25),
CONSTRAINT author_aud_pkey PRIMARY KEY (id, rev),
CONSTRAINT author_aud_revinfo FOREIGN KEY (rev)
REFERENCES revinfo (rev) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION
)

select * from product_aud

