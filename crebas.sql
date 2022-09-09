/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2022/8/30 10:30:25                           */
/*==============================================================*/

create database if not exists dormitory;

drop table if exists class;

drop table if exists dormitory;

drop table if exists floor;

drop table if exists host;

drop table if exists host_floor;

drop table if exists permission;

drop table if exists role;

drop table if exists role_permission;

drop table if exists student;

drop table if exists user;

drop table if exists user_role;

/*==============================================================*/
/* Table: class                                                 */
/*==============================================================*/
create table class
(
   id                   int not null auto_increment comment '��������Id',
   class_name           varchar(50) comment '�༶����,����һ��',
   class_code           varchar(10) comment '20220281',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '1:����;0:����',
   primary key (id)
);

/*==============================================================*/
/* Table: dormitory                                             */
/*==============================================================*/
create table dormitory
(
   id                   int not null auto_increment comment '��������id',
   create_time          datetime comment '����ʱ��',
   count_               int comment '����������',
   status_              smallint comment '1:���ã�0������',
   order_               int comment '���',
   sum_number           int comment '��ֹĿǰ�������ɵ�������',
   host_floor_id        int comment '��������¥¥��id',
   guests_number        int comment '����ס����',
   guests_accommodated  int comment 'ʣ�����������',
   full_status          smallint comment '1:��ס��;2:δס��',
   primary key (id)
);

/*==============================================================*/
/* Table: floor                                                 */
/*==============================================================*/
create table floor
(
   id                   int not null auto_increment comment '����id',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '1:����;0:����',
   code                 int comment '1:��һ��;2:�ڶ���',
   description          varchar(128) comment '¥�������������һ��¥���ڶ����',
   primary key (id)
);

/*==============================================================*/
/* Table: host                                                  */
/*==============================================================*/
create table host
(
   id                   int not null auto_increment comment '��������id',
   code                 int comment '��ţ�����1��ʾΪ1��¥��2����ʾΪ2��¥',
   description          varchar(200) comment '������������������¥',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '�Ƿ�ʹ��,1:����;2:����',
   primary key (id)
);

/*==============================================================*/
/* Table: host_floor                                            */
/*==============================================================*/
create table host_floor
(
   id                   int not null auto_increment comment '��������id',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '1:����;0:����',
   host_id              int comment '����¥id',
   floor_id             int comment '¥��id',
   primary key (id)
);

/*==============================================================*/
/* Table: permission                                            */
/*==============================================================*/
create table permission
(
   id                   int not null auto_increment comment 'Ȩ������Id',
   permission_name      varchar(128) comment 'Ȩ������',
   permission_code      varchar(50) comment 'Ȩ����',
   status_              smallint comment '�Ƿ�����;1:����;0:����',
   create_time          datetime comment '����ʱ��',
   is_menu              smallint comment '�Ƿ��ǲ˵�:1:��ʾΪ�˵�;2:��ʾΪ�ӿں�Ȩ��',
   primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null auto_increment comment '����id',
   role_name            varchar(128) comment '��ɫ����',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '�Ƿ�����,1:����;0:����',
   primary key (id)
);

/*==============================================================*/
/* Table: role_permission                                       */
/*==============================================================*/
create table role_permission
(
   id                   int not null auto_increment comment '��������id',
   role_id              int comment '��ɫid',
   permission_id        int comment 'Ȩ��id',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '�Ƿ�����,1:����;0:����',
   primary key (id)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   id                   int not null auto_increment comment '��������Id',
   sutdent_name         varchar(10) comment 'ѧ������',
   student_sex          smallint comment '1:��;0:Ů',
   student_id_card      varchar(20) comment 'ѧ��ѧ��',
   student_phone        varchar(16) comment 'ѧ���绰',
   create_time          datetime comment '����ʱ��',
   lodging              int comment '1:�Ѿ��������ᣬ0:δ��������; 2:����Ҫ��������',
   class_id             int comment '���ڰ༶',
   remark_              varchar(200) comment '��ע',
   gradle_id            int comment '�����꼶',
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment comment '��������',
   create_time          datetime comment '��������',
   statue_              smallint comment '�Ƿ�����,1����;2:����',
   user_name            varchar(128) comment '�û����ƣ���¼����',
   password             varchar(128) comment '��¼����',
   primary key (id)
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   id                   int not null auto_increment comment '����id',
   user_id              int comment '�û�id,�����û�user��',
   role_id              int comment '��ɫid',
   create_time          datetime comment '����ʱ��',
   status_              smallint comment '�Ƿ�����,1:����;0:����',
   primary key (id)
);

