CREATE TABLE airlines (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(10) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_modified TIMESTAMP
);

CREATE TABLE airports (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(10) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_modified TIMESTAMP
);

CREATE TABLE flights (
    id SERIAL PRIMARY KEY,
    airline_id INT REFERENCES Airlines(id),
    origin_airport_id INT REFERENCES Airports(id),
    destination_airport_id INT REFERENCES Airports(id),
    flight_number VARCHAR(20) NOT NULL,
    departure_time TIMESTAMP NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    capacity INT NOT NULL,
    available_seats INT NOT NULL,
    status VARCHAR(20) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_modified TIMESTAMP
);

CREATE TABLE passengers (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_modified TIMESTAMP
);

CREATE TABLE bookings (
    id SERIAL PRIMARY KEY,
    flight_id INT REFERENCES flights(id),
    passenger_id INT REFERENCES passengers(id),
    seat_number VARCHAR(10) NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE airports_flights (
    airport_id bigint not null,
    flight_id bigint not null
);

ALTER TABLE airports_flights
    add constraint airports_flights_pk primary key (airport_id, flight_id);

CREATE TABLE airlines_flights (
    airline_id bigint not null,
    flight_id bigint not null
);

ALTER TABLE airlines_flights
    add constraint airlines_flights_pk primary key (airline_id, flight_id);
