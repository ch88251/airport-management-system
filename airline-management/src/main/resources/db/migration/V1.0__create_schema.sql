create sequence if not exists airlines_seq start with 100 increment by 50;

create table "airlines"
(
    "id"          bigint    not null,
    "name"        varchar(32),
    "icao_code"   varchar(3) not null,
    "status"      varchar(16) not null
);
alter table "airlines"
    add constraint "airlines_pk" primary key ("id");
