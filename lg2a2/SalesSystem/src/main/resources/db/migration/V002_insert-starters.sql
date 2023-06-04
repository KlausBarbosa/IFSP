--Inserir primeiro Region objects
INSERT INTO `salessystem`.`region` (`id`, `region_name`) VALUES ('1', 'Sudeste');

--Inserir Zone obj
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('1', 'São Paulo', '1', '1');
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('2', 'Guarulhos', '1', '2');
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('3', 'Santo Andre', '1', '3');
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('4', 'Curitiba', '2', '4');
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('5', 'Joinville', '2', '5');

--Inserir States
INSERT INTO `salessystem`.`state` (`id`, `state_name`, `region_id`) VALUES ('1', 'São Paulo', '1');

--Inserir Customer
INSERT INTO `salessystem`.`customer` (`id`, `cpf`, `customer_name`, `registration_date`, `zone_id`) VALUES ('1', '123456', 'Joao Vianei', '2023-04-24 19:00:00', '1');

--Inserir Vendor
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('1', '1', 'Lucas Albertini', '1');
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('2', '2', 'Sergio', '0');
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('3', '3', 'Lucas Barros', '0');
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('4', '4', 'AnaGrama', '1');
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('5', '5', 'Gabriel', '0');

--Inserir novos customers
INSERT INTO `salessystem`.`customer` (`id`, `cpf`, `customer_name`, `registration_date`, `zone_id`) VALUES ('2', '111111', 'Jose Oscar', '2023-06-04 20:00:00', '1');
INSERT INTO `salessystem`.`customer` (`id`, `cpf`, `customer_name`, `registration_date`, `zone_id`) VALUES ('3', '222333', 'Cesar', '2023-06-04 19:00:00', '4');
INSERT INTO `salessystem`.`customer` (`id`, `cpf`, `customer_name`, `registration_date`, `zone_id`) VALUES ('4', '333111', 'Lennon', '2023-06-04 10:00:00', '2');


--Inserir Orders
INSERT INTO `salessystem`.`customer_order` (`id`, `customer_cpf`, `order_date`, `price`, `product_id`, `zone_id`) VALUES ('1', '123456', '2023-06-02 10:00:00', '100', '1', '1');
INSERT INTO `salessystem`.`customer_order` (`id`, `customer_cpf`, `order_date`, `price`, `product_id`, `zone_id`) VALUES ('2', '123456', '2023-06-04 09:00:00', '100', '2', '1');
INSERT INTO `salessystem`.`customer_order` (`id`, `customer_cpf`, `order_date`, `price`, `product_id`, `zone_id`) VALUES ('3', '111111', '2023-06-04 09:00:00', '175', '3', '1');
INSERT INTO `salessystem`.`customer_order` (`id`, `customer_cpf`, `order_date`, `price`, `product_id`, `zone_id`) VALUES ('4', '222333', '2023-06-03 11:00:00', '300', '2', '4');
INSERT INTO `salessystem`.`customer_order` (`id`, `customer_cpf`, `order_date`, `price`, `product_id`, `zone_id`) VALUES ('5', '333111', '2023-06-04 17:00:00', '150', '2', '2');

