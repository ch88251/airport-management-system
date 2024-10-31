CREATE TABLE Airlines (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(10) NOT NULL
);

CREATE TABLE Airports (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(10) NOT NULL
);

CREATE TABLE Flights (
    id SERIAL PRIMARY KEY,
    airline_id INT REFERENCES Airlines(id),
    origin_airport_id INT REFERENCES Airports(id),
    destination_airport_id INT REFERENCES Airports(id),
    flight_number VARCHAR(20) NOT NULL,
    departure_time TIMESTAMP NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    capacity INT NOT NULL,
    available_seats INT NOT NULL
);

CREATE TABLE Passengers (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE Bookings (
    id SERIAL PRIMARY KEY,
    flight_id INT REFERENCES Flights(id),
    passenger_id INT REFERENCES Passengers(id),
    seat_number VARCHAR(10) NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
