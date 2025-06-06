-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName
FROM northwind.Products p 
JOIN northwind.Categories c ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

-- Question 2
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM northwind.Products p
JOIN northwind.Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;

-- Question 3
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName, s.CompanyName
FROM northwind.Products p
JOIN northwind.Categories c ON p.CategoryID = c.CategoryID
JOIN northwind.Suppliers s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;

-- Question 4
SELECT p.ProductName, c.CategoryName
FROM northwind.Products p
JOIN northwind.Categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (
	SELECT MAX(UnitPrice)
	FROM northwind.Products
    );
    
-- Question 5
SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName AS ShippingCompany
FROM northwind.Orders o
Join northwind.Shippers s ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry = "Germany";

-- Question 6
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM northwind.Orders o
JOIN northwind.`Order Details` od ON o.OrderID = od.OrderID
JOIN northwind.Products p ON od.ProductID = p.ProductID
WHERE p.ProductName = "Sasquatch Ale";
