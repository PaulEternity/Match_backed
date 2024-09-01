-- auto-generated definition
create table user
(
    id           bigint auto_increment
        primary key,
    userAccount  varchar(256)                                    null,
    userName     varchar(256) default 'Unknown'                  not null,
    avatarUrl    varchar(1024)                                   null,
    gender       tinyint                                         null,
    userPassword varchar(512)                                    not null,
    phone        varchar(128)                                    null,
    email        varchar(512)                                    null,
    userStatus   tinyint      default 0                          not null,
    creatTime    datetime     default CURRENT_TIMESTAMP          null,
    updateTime   datetime     default CURRENT_TIMESTAMP          null,
    isDelete     tinyint      default 0                          null,
    userRole     int          default 0                          not null comment '用户角色 0：普通用户 1：管理员',
    planetCode   varchar(512)                                    null comment '编号',
    tags         varchar(1024)                                   null comment '标签列表 json',
    profile      varchar(512) default 'Too lazy to say anything' null comment '个人简介'
)
    comment '用户';

