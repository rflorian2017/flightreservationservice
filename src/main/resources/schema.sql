-- Create table
create table FLIGHT
(
  FLIGHT_ID      		BIGINT not null,
  DEPARTURE  			VARCHAR(128) not null,
  DESTINATION			VARCHAR(128) not null,
  DEPARTURE_DATE 	    DATE,
  DEPARTURE_HOUR 	    VARCHAR(30)
) ;
--  
alter table FLIGHT
  add constraint FLIGHT_PK primary key (FLIGHT_ID);
  
  -- Create table
create table PASSENGER
(
  PASSENGER_ID   BIGINT not null,
  FIRST_NAME VARCHAR(30) not null,
  LAST_NAME VARCHAR(30) not null,
  AGE INT
) ;
--  
alter table PASSENGER
  add constraint PASSENGER_PK primary key (PASSENGER_ID);
 
 
-- Create table
create table PASSENGER_FLIGHT
(
  ID      		BIGINT not null,
  PASSENGER_ID 	BIGINT not null,
  FLIGHT_ID 	BIGINT not null
);
--  
alter table PASSENGER_FLIGHT
  add constraint PASSENGER_FLIGHT_PK primary key (ID);
 
alter table PASSENGER_FLIGHT
  add constraint PASSENGER_FLIGHT_UK unique (PASSENGER_ID, FLIGHT_ID);
 
alter table PASSENGER_FLIGHT
  add constraint PASSENGER_FLIGHT_FK1 foreign key (PASSENGER_ID)
  references PASSENGER (PASSENGER_ID);
 
alter table PASSENGER_FLIGHT
  add constraint PASSENGER_FLIGHT_FK2 foreign key (FLIGHT_ID)
  references FLIGHT (FLIGHT_ID);
  
  
  -- Create table
create table PLANE
(
  PLANE_ID   BIGINT not null,
  AIRCRAFT_MODEL VARCHAR(128) not null,
  SEAT_NO INT
) ;
--  
alter table PLANE
  add constraint PLANE_PK primary key (PLANE_ID);
  
-- Create table
create table PLANE_FLIGHT
(
  ID      		BIGINT not null,
  PLANE_ID 	BIGINT not null,
  FLIGHT_ID 	BIGINT not null
);
--  
alter table PLANE_FLIGHT
  add constraint PLANE_FLIGHT_PK primary key (ID);
 
alter table PLANE_FLIGHT
  add constraint PLANE_FLIGHT_UK unique (PLANE_ID, FLIGHT_ID);
 
alter table PLANE_FLIGHT
  add constraint PLANE_FLIGHT_FK1 foreign key (PLANE_ID)
  references PLANE (PLANE_ID);
 
alter table PLANE_FLIGHT
  add constraint PLANE_FLIGHT_FK2 foreign key (FLIGHT_ID)
  references FLIGHT (FLIGHT_ID);