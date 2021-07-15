-- asio_jobs.importer_schedule definition

CREATE TABLE `importer_schedule` (
  `ENTITY_ID` varchar(255) NOT NULL,
  `cron` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `user` varchar(255) NOT NULL, 
  `params` varchar(1024) NOT NULL,
  `created_date` datetime NOT NULL,
  `deleted_date` datetime DEFAULT NULL,
  `version` bigint(20) NOT NULL,
  PRIMARY KEY (`ENTITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE INDEX ix_importer_schedule_deleted_date USING BTREE ON asio_jobs.importer_schedule (deleted_date);