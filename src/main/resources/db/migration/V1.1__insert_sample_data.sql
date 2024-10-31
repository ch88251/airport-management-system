INSERT INTO Airlines (name, code)
VALUES
  ('SkyJet Airways', 'SJ'),
  ('BlueWave Airlines', 'BW'),
  ('AeroFleet', 'AF'),
  ('Global Sky', 'GS'),
  ('Pacific Wings', 'PW');

INSERT INTO Airports (name, code)
VALUES
  ('Oceanview International Airport', 'OIA'),
  ('Liberty City Airport', 'LCA'),
  ('Pacific Harbor Airport', 'PHA'),
  ('Sunset Bay Airport', 'SBA'),
  ('Grand Mountain Airport', 'GMA');

INSERT INTO Flights (airline_id, origin_airport_id, destination_airport_id, flight_number, departure_time, arrival_time, capacity, available_seats)
VALUES
  (1, 1, 2, 'FL001', '2023-06-17 10:00:00', '2023-06-17 12:00:00', 150, 150),
  (1, 2, 3, 'FL002', '2023-06-18 15:30:00', '2023-06-18 17:30:00', 200, 200),
  (2, 1, 3, 'FL003', '2023-06-19 08:45:00', '2023-06-19 10:45:00', 180, 180);

INSERT INTO Passengers (first_name, last_name, email, phone_number)
VALUES
  ('John', 'Doe', 'john.doe@example.com', '1234567890'),
  ('Jane', 'Smith', 'jane.smith@example.com', '9876543210'),
  ('Alice', 'Johnson', 'alice.johnson@example.com', '4567890123');

INSERT INTO Bookings (flight_id, passenger_id, seat_number)
VALUES
  (1, 1, 'A1'),
  (1, 2, 'B2'),
  (2, 3, 'C3');

