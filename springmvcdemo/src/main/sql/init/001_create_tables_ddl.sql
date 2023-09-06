
create table user
(
    uid      int auto_increment
        primary key,
    uname    varchar(255) null,
    password varchar(255) null,
    gender   varchar(255) null,
    phone    varchar(255) null,
    email    varchar(255) null,
    address  varchar(255) null
)
    charset = utf8mb4;

