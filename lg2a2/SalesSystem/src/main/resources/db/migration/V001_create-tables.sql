
--Customer create
create table customer (
  id bigint not null auto_increment,
  cpf varchar(12) not null,
  customer_name varchar(60) not null,
  registration_date datetime not null,

  primary key (id)
) engine=InnoDB default charset=utf8;

--Product create
create table product (
  id bigint not null auto_increment,

  primary key (id)
) engine=InnoDB default charset=utf8;

--order create
create table customer_order (
  id bigint not null auto_increment,
  customer_cpf char(11) not null,
  order_date datetime not null,
  price double not null,
  product_id bigint not null,

  primary key (id),

  constraint fk_customer_order_product foreign key (product_id) references product (id)

) engine=InnoDB default charset=utf8;

--create state
create table state (
  id bigint not null auto_increment,
  state_name char(60) not null,
  region_id bigint not null,

  primary key (id)

) engine=InnoDB default charset=utf8;

--create region
create table region (
  id bigint not null auto_increment,
  region_name char(60) not null,


  primary key (id)

) engine=InnoDB default charset=utf8;

--create vendor
create table vendor (
  id bigint not null auto_increment,
  zone_id bigint not null,
  vendor_name char(60) not null,
  is_region_agent bool default false,

  primary key (id)

) engine=InnoDB default charset=utf8;

--create zone
create table zone (
  id bigint not null auto_increment,
  zone_name char(60) not null,
  region_id bigint not null,
  vendor_id bigint not null,

  primary key (id)

) engine=InnoDB default charset=utf8;

alter table state add constraint fk_state_region
foreign key (region_id) references region (id);

alter table customer add zone_id char(60) not null;