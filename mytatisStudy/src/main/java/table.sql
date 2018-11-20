DROP TABLE t_role;
create table t_role (
  role_name varchar(255) NOT NULL,
  note varchar(255) NOT NULL,
  id bigint auto_increment NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE t_user;
create table t_user (
  user_name varchar(255) NOT NULL,
  note varchar(255) NOT NULL,
  id bigint NOT NULL,
  sex int  NOT NULL,
  cnname varchar(255) NOT NULL,
  birthday date NOT NULL,
  mobile varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE t_student;
create table t_student (
  cnname varchar(60) NOT NULL,
  sex tinyint(4) NOT NULL,
  selfcard_no int(20) NOT NULL,
  note varchar(255) NOT NULL,
  id int(20) auto_increment NOT NULL,
  PRIMARY KEY (id)
);
insert into t_student(cnname,sex,selfcard_no,note) values('離開家',1,1001,'hello');

DROP TABLE t_student_selfcard;
create table t_student_selfcard (
  student_id int(20) NOT NULL,
  native varchar(60) NOT NULL,
  issue_date date NOT NULL,
  end_date date NOT NULL,
  note varchar(255) NOT NULL,
  id int(20) auto_increment NOT NULL,
  PRIMARY KEY (id)
);
insert into t_student_selfcard(note,student_id,native,issue_date,end_date,id) values('離開家',1,"lj",now(),now(),1001);

DROP TABLE t_student_lecture;
create table t_student_lecture(
   id int(20) auto_increment NOT NULL,
   student_id int(20) NOT NULL,
   lecture_id int(20) NOT NULL,
   grade decimal(16,2) NOT NULL,
   note varchar(255) NOT NULL,
   PRIMARY KEY (id)
);
insert into t_student_lecture(id,student_id,lecture_id,grade,note) values(201,1,101,59.5,'考的不行');
DROP TABLE t_lecture;
create table t_lecture(
  id int(20) auto_increment NOT NULL,
  lecture_name varchar(60) NOT NULL,
  note varchar(255) NOT NULL,
  PRIMARY KEY (id)
);
insert into t_lecture(id,lecture_name,note) values(101,'数学','辣鸡');
insert into t_lecture(id,lecture_name,note) values(102,'语文','小辣鸡');