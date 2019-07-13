--------------------------------------
 
insert into PASSENGER (PASSENGER_ID, FIRST_NAME, LAST_NAME, AGE)
values (1, 'John', 'Doe', 22);
 
insert into PASSENGER (PASSENGER_ID, FIRST_NAME, LAST_NAME, AGE)
values (3, 'Jane', 'Doe', 24);

--------------------------------------
 
insert into FLIGHT (FLIGHT_ID, DEPARTURE, DESTINATION, DEPARTURE_DATE, DEPARTURE_HOUR)
values (1, 'TSR', 'MUC', '2019-07-07', '14:00');
 
insert into FLIGHT (FLIGHT_ID, DEPARTURE, DESTINATION, DEPARTURE_DATE, DEPARTURE_HOUR)
values (2, 'OTP', 'TSR', '2019-07-10', '15:00');
 
--------------------------------------
 
insert into PLANE (PLANE_ID, AIRCRAFT_MODEL, SEAT_NO)
values (1, 'CRJ104', 120);
 
insert into PLANE (PLANE_ID, AIRCRAFT_MODEL, SEAT_NO)
values (2, 'Airbus A320', 180);

--------------------------------------
 
insert into PASSENGER_FLIGHT (ID, PASSENGER_ID, FLIGHT_ID)
values (1, 1, 1);
 
insert into PASSENGER_FLIGHT (ID, PASSENGER_ID, FLIGHT_ID)
values (2, 1, 2);

insert into PASSENGER_FLIGHT (ID, PASSENGER_ID, FLIGHT_ID)
values (3, 3, 1);
 
---
 
insert into PLANE_FLIGHT (ID, PLANE_ID, FLIGHT_ID)
values (1, 1, 1);
 
insert into PLANE_FLIGHT (ID, PLANE_ID, FLIGHT_ID)
values (2, 2, 2);