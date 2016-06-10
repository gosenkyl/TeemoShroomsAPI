DROP SCHEMA IF EXISTS `teemo_shrooms`;

CREATE SCHEMA `teemo_shrooms` ;

USE `teemo_shrooms`;

CREATE TABLE `teemo_shrooms`.`REFERENCE_DATA` (
  `id` VARCHAR(36) NOT NULL,
  `set_id` VARCHAR(45) NOT NULL,
  `key` VARCHAR(45) NOT NULL,
  `value` VARCHAR(45) NOT NULL,
  `order` INT NULL,
  `active_flag` TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `teemo_shrooms`.`USER` (
  `id` varchar(36) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `last_polled` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'kr', 'Korea', 10, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'na', 'Korea', 20, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'br', 'Brazil', 30, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'oce', 'Oceania', 40, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'tr', 'Turkey', 50, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'rus', 'Russia', 60, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'lan', 'Latin America North', 70, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'las', 'Latin America South', 80, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'ene', 'Europe East & Nordic', 90, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'euw', 'Europe West', 100, 1);