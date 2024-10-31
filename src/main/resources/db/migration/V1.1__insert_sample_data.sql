INSERT INTO airlines (name, code, date_created, date_modified)
VALUES
  ('SkyJet Airways', 'SJ', current_timestamp, null),
  ('BlueWave Airlines', 'BW', current_timestamp, null),
  ('AeroFleet', 'AF', current_timestamp, null),
  ('Global Sky', 'GS', current_timestamp, null),
  ('Pacific Wings', 'PW', current_timestamp, null);

INSERT INTO airports (name, code, date_created, date_modified)
VALUES
  ('Oceanview International Airport', 'OIA', current_timestamp, null),
  ('Liberty City Airport', 'LCA', current_timestamp, null),
  ('Pacific Harbor Airport', 'PHA', current_timestamp, null),
  ('Sunset Bay Airport', 'SBA', current_timestamp, null),
  ('Grand Mountain Airport', 'GMA', current_timestamp, null);

INSERT INTO flights (airline_id, origin_airport_id, destination_airport_id, flight_number, departure_time, arrival_time, status, capacity, available_seats, date_created, date_modified)
VALUES
  (1, 1, 2, 'FL001', '2023-06-17 10:00:00', '2023-06-17 12:00:00', 'ON_TIME', 150, 150, current_timestamp, null),
  (1, 2, 3, 'FL002', '2023-06-18 15:30:00', '2023-06-18 17:30:00', 'ON_TIME', 200, 200, current_timestamp, null),
  (2, 1, 3, 'FL003', '2023-06-19 08:45:00', '2023-06-19 10:45:00', 'ON_TIME', 180, 180, current_timestamp, null);

INSERT INTO passengers (first_name, last_name, email, phone_number, date_created, date_modified)
VALUES
  ('John', 'Doe', 'john.doe@example.com', '1234567890', current_timestamp, null),
  ('Jane', 'Smith', 'jane.smith@example.com', '9876543210', current_timestamp, null),
  ('Alice', 'Johnson', 'alice.johnson@example.com', '4567890123', current_timestamp, null);

INSERT INTO bookings (flight_id, passenger_id, seat_number)
VALUES
  (1, 1, 'A1'),
  (1, 2, 'B2'),
  (2, 3, 'C3');

INSERT INTO airports_flights (airport_id, flight_id)
VALUES
  (1, 1),
  (2, 1),
  (2, 2),
  (3, 2),
  (1, 3),
  (3, 3);

INSERT INTO airlines_flights (airline_id, flight_id)
VALUES
  (1, 1),
  (1, 2),
  (2, 3);

