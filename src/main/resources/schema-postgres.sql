DROP TABLE IF EXISTS productos;
CREATE TABLE productos(codProducto VARCHAR(255), codCategoria VARCHAR(255), nombreProducto VARCHAR(255), marca VARCHAR(255), descripcionProducto VARCHAR(255), descripcionProducto VARCHAR(255) precio DECIMAL, stock integer);


INSERT INTO productos(id, codProducto, codCategoria, nombreProducto, marca, descripcionProducto, precio, stock) VALUES('P00001', 'C00001', 'Oakley v1', 'Oakley', 'Gafas Oakley v1', 999.99, 999);