DROP TABLE t_role;
create table t_role (
  rolename varchar(255) NOT NULL,
  note varchar(255) NOT NULL,
  id bigint NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE t_user;
create table t_user (
  user_name varchar(255) NOT NULL,
  note varchar(255) NOT NULL,
  id bigint NOT NULL,
  sex char  NOT NULL,
  cnname varchar(255) NOT NULL,
  birthday date NOT NULL,
  mobile varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  PRIMARY KEY (id)
);