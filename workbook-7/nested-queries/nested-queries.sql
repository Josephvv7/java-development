
-- Question 1
SELECT ProductName 
FROM northwind.products
WHERE UnitPrice = (
	SELECT MAX(UnitPrice)
	FROM northwind.products
);

-- Question 2
SELECT OrderID, ShipName, ShipAddress 
FROM northwind.orders
WHERE ShipVia = (
SELECT ShipperID
	FROM northwind.shippers
	WHERE CompanyName
);
                        
-- Question 3
SELECT OrderID
FROM northwind.`Order Details`
WHERE ProductID = (
SELECT ProductID
FROM northwind.products
WHERE ProductName = "Sasquatch Ale"
);

-- Question 4
SELECT FirstName, LastName
FROM northwind.employees
WHERE EmployeeID = (
SELECT EmployeeID
FROM northwind.orders
WHERE OrderID = 10266
);

-- Question 5
SELECT CompanyName
FROM northwind.customers
WHERE CustomerID = (
SELECT CustomerID
FROM northwind.orders
WHERE OrderID = 10266
);
