INSERT INTO API_VUELOS (
FECHA_SALIDA,
FECHA_LLEGADA,
CIUDAD_ORIGEN,
CIUDAD_DESTINO,
NOMBRE_PASAJERO,
EDAD_PASAJERO,
TIENE_BODEGA_EQUIPAJE,
PRECIO,
HORA_SALIDA,
HORA_LLEGADA
) VALUES
(SYSDATE, SYSDATE, 'Mexico', 'Villahermosa', 'Williams', 28, 1, 10.50, SYSDATE, SYSDATE),
(SYSDATE, SYSDATE, 'Mexico', 'Cancun', 'Pedro', 28, 0, 10.50, SYSDATE, SYSDATE);