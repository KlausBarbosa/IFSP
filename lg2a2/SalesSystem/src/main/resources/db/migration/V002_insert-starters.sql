--Inserir primeiro Region objects
INSERT INTO `salessystem`.`region` (`id`, `region_name`) VALUES ('1', 'Sudeste');

--Inserir Zone obj
INSERT INTO `salessystem`.`zone` (`id`, `zone_name`, `region_id`, `vendor_id`) VALUES ('1', 'São Paulo', '1', '1');


--Inserir States
INSERT INTO `salessystem`.`state` (`id`, `state_name`, `region_id`) VALUES ('1', 'São Paulo', '1');

--Inserir Customer
INSERT INTO `salessystem`.`customer` (`id`, `cpf`, `customer_name`, `registration_date`, `zone_id`) VALUES ('1', '123456', 'Joao Vianei', '2023-04-24 19:00:00', '1');

--Inserir Vendor
INSERT INTO `salessystem`.`vendor` (`id`, `zone_id`, `vendor_name`, `is_region_agent`) VALUES ('1', '1', 'Sergio', '1');

--Inserir order
