
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

  primary key (id)

) engine=InnoDB default charset=utf8;

--

