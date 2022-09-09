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
   id                   int not null auto_increment comment '主键自增Id',
   class_name           varchar(50) comment '班级名称,高三一班',
   class_code           varchar(10) comment '20220281',
   create_time          datetime comment '创建时间',
   status_              smallint comment '1:启用;0:禁用',
   primary key (id)
);

/*==============================================================*/
/* Table: dormitory                                             */
/*==============================================================*/
create table dormitory
(
   id                   int not null auto_increment comment '主键自增id',
   create_time          datetime comment '创建时间',
   count_               int comment '可容纳人数',
   status_              smallint comment '1:启用；0：禁用',
   order_               int comment '序号',
   sum_number           int comment '截止目前可以容纳的总人数',
   host_floor_id        int comment '所属宿舍楼楼层id',
   guests_number        int comment '已入住人数',
   guests_accommodated  int comment '剩余可容纳人数',
   full_status          smallint comment '1:已住满;2:未住满',
   primary key (id)
);

/*==============================================================*/
/* Table: floor                                                 */
/*==============================================================*/
create table floor
(
   id                   int not null auto_increment comment '自增id',
   create_time          datetime comment '创建时间',
   status_              smallint comment '1:启用;0:禁用',
   code                 int comment '1:第一层;2:第二层',
   description          varchar(128) comment '楼层描述，比如第一层楼，第二层等',
   primary key (id)
);

/*==============================================================*/
/* Table: host                                                  */
/*==============================================================*/
create table host
(
   id                   int not null auto_increment comment '主键自增id',
   code                 int comment '编号，比如1表示为1号楼；2：表示为2号楼',
   description          varchar(200) comment '描述，比如南面宿舍楼',
   create_time          datetime comment '创建时间',
   status_              smallint comment '是否使用,1:启用;2:禁用',
   primary key (id)
);

/*==============================================================*/
/* Table: host_floor                                            */
/*==============================================================*/
create table host_floor
(
   id                   int not null auto_increment comment '主键自增id',
   create_time          datetime comment '创建时间',
   status_              smallint comment '1:启用;0:禁用',
   host_id              int comment '宿舍楼id',
   floor_id             int comment '楼层id',
   primary key (id)
);

/*==============================================================*/
/* Table: permission                                            */
/*==============================================================*/
create table permission
(
   id                   int not null auto_increment comment '权限自增Id',
   permission_name      varchar(128) comment '权限名称',
   permission_code      varchar(50) comment '权限码',
   status_              smallint comment '是否启用;1:启用;0:禁用',
   create_time          datetime comment '创建时间',
   is_menu              smallint comment '是否是菜单:1:表示为菜单;2:表示为接口和权限',
   primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null auto_increment comment '自增id',
   role_name            varchar(128) comment '角色名称',
   create_time          datetime comment '创建时间',
   status_              smallint comment '是否启用,1:启用;0:禁用',
   primary key (id)
);

/*==============================================================*/
/* Table: role_permission                                       */
/*==============================================================*/
create table role_permission
(
   id                   int not null auto_increment comment '主键自增id',
   role_id              int comment '角色id',
   permission_id        int comment '权限id',
   create_time          datetime comment '创建时间',
   status_              smallint comment '是否启用,1:启用;0:禁用',
   primary key (id)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   id                   int not null auto_increment comment '主键自增Id',
   sutdent_name         varchar(10) comment '学生姓名',
   student_sex          smallint comment '1:男;0:女',
   student_id_card      varchar(20) comment '学生学号',
   student_phone        varchar(16) comment '学生电话',
   create_time          datetime comment '创建时间',
   lodging              int comment '1:已经安排宿舍，0:未安排宿舍; 2:不需要安排宿舍',
   class_id             int comment '所在班级',
   remark_              varchar(200) comment '备注',
   gradle_id            int comment '所在年级',
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment comment '自增主键',
   create_time          datetime comment '创建日期',
   statue_              smallint comment '是否启用,1启用;2:禁用',
   user_name            varchar(128) comment '用户名称，登录名称',
   password             varchar(128) comment '登录密码',
   primary key (id)
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   id                   int not null auto_increment comment '自增id',
   user_id              int comment '用户id,关联用户user表',
   role_id              int comment '角色id',
   create_time          datetime comment '创建时间',
   status_              smallint comment '是否启用,1:启用;0:禁用',
   primary key (id)
);

