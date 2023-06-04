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

--Inserir order
