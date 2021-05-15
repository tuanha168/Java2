USE master
GO
  IF NOT EXISTS (
    SELECT
      name
    FROM
      sys.databases
    WHERE
      name = N'ExampleLogin'
  ) CREATE DATABASE ExampleLogin
GO
  use ExampleLogin
GO
  IF OBJECT_ID('dbo.Users', 'U') IS NOT NULL DROP TABLE dbo.Users
GO
  CREATE TABLE dbo.Users (
    Email [NVARCHAR](50) NOT NULL PRIMARY KEY,
    Password [NVARCHAR](50) NOT NULL
  );

GO
INSERT INTO
  Users ([Email], [Password])
VALUES
  ('haha', 123)
GO
SELECT
  *
FROM
  Users
GO