-- Question 1
SELECT COUNT(*) 
FROM northwind.SUPPLIERS;

-- Question 2
SELECT sum(SALARY) 
FROM NORTHWIND.EMPLOYEES;

-- Question 3
SELECT MIN(UnitPrice) 
FROM NORTHWIND.PRODUCTS;

-- Question 4
SELECT AVG(UnitPrice) 
FROM NORTHWIND.PRODUCTS;

-- Question 5
SELECT MAX(UnitPrice) 
FROM NORTHWIND.PRODUCTS;

-- Question 6
SELECT SupplierID, COUNT(*)
FROM northwind.products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, avg(UnitPrice)
FROM northwind.products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) AS ItemCount
FROM northwind.products
GROUP BY SupplierID
HAVING ItemCount >= 5;

-- Question 9
SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
FROM northwind.products
ORDER BY InventoryValue;