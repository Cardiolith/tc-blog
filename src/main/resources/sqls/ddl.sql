create table `blog`
(
    id           bigint(20)  not null auto_increment primary key,
    title        varchar(64) not null,
    file_path    varchar(128),
    date_created timestamp,
    last_updated timestamp,
    create_by    bigint(20),
    update_by    bigint(20)
);

create table `keyword`
(
    id           bigint(20)  not null auto_increment primary key,
    value      varchar(64) not null,
    date_created timestamp,
    last_updated timestamp,
    create_by    bigint(20),
    update_by    bigint(20)
);

create table `category`
(
    id           bigint(20)  not null auto_increment primary key,
    value     varchar(32) not null,
    date_created timestamp,
    last_updated timestamp,
    create_by    bigint(20),
    update_by    bigint(20)
)