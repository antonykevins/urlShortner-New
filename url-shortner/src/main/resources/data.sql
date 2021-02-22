DROP TABLE IF EXISTS Url;

CREATE TABLE Url (
  id VARCHAR(250) NOT NULL,
  long_url VARCHAR(250) NOT NULL
);

INSERT INTO Url (id, long_url) VALUES
  ('abcd', 'www.google.com');