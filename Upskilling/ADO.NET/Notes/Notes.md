# ADO.NET Notes

## SqlConnection
`using (SqlConnection conn = new SqlConnection(connectionString))`
Used to establish a connection to SQL Server.

## SqlCommand
`SqlCommand cmd = new SqlCommand(query, conn);`
Used to execute SQL queries and stored procedures.

## SqlDataReader
// Read data sequentially
`while(reader.Read()) { ... }`
Used for fast, forward-only reading of data.

## SqlDataAdapter
Used to fill a `DataSet` or `DataTable` for disconnected data access.