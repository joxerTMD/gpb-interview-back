DROP TABLE IF EXISTS clients;
create table clients
(
    id bigint auto_increment
        primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    middle_name varchar(255) null,
    date_of_birth date not null
);

DROP TABLE IF EXISTS assets;

create table assets
(
    id bigint not null auto_increment
        primary key,
    name varchar(255) not null
);

DROP TABLE IF EXISTS trades;

create table trades
(
    id bigint not null auto_increment
        primary key,
    client_id bigint not null,
    asset_id bigint not null,
    datetime datetime not null,
    amount double not null,
    constraint tpa_id_fk
        foreign key (asset_id) references assets (id),
    constraint tpa_id_fk2
        foreign key (client_id) references clients (id)
);