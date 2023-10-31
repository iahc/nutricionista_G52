# Nutricionista_G52
 Proyecto Final <br />
 ahora si <br /> aca puedo editar sino esta todo protegido <br />
 <p>fork pablo</p>
NUTRICIONISTA <br />
La nutricionista al planificar la dieta para un paciente, y considera un conjunto de comidas. <br />
➢ Una comida puede ser considerada para diferentes pacientes que realizan dieta. <br />
➢ Una dieta se planifica para cada paciente y considera una lista de comidas. <br />
Clases y relaciones <br />
➢ Una nutricionista tiene pacientes con diferentes perfiles de dieta. Interesa saber su nombre completo, <br />
DNI, domicilio y celular. Peso actual (modificable) y peso deseado. Realizar el ABM paciente. <br />
➢ Una comida tiene un nombre, un detalle y una cantidad de calorías por gramo. Realizar el ABM <br />
comida. <br />
➢ Una dieta cuenta de una variedad de comidas, además tiene un paciente, una fecha de inicio, fecha de <br />
fin (finalizar dieta), un peso inicial y un peso buscado. ABM dieta. <br />
➢ Una Dieta, se conforma (o compone de) por varios consumos diarios (le llamaremos DietaComida), y <br />
en cada consumo se vincula un alimento o comida en particular, en una porción. Ej. 250 gr. o 300 gr. <br />
Además se puede elegir en qué horario se asigna, esto es (enum) {“Desayuno”, “Almuerzo”, <br />
”Merienda”, ”Cena”, “Snack”} <br />
Comportamientos: Listar: <br />
➢ Todos los pacientes cuya dieta esté terminada o vigente, y cuando es la fecha de culminación. <br />
➢ Se necesita listar los pacientes que a la fecha de culminación, no han llegado al peso buscado. <br />
➢ Se necesita saber las comidas incluidas en una dieta específica <br />
➢ Se necesita agregar o quitar comidas, o bien modificar las porciones de comida, a una dieta en particular. <br />
➢ Se necesita registrar un historial de cuánto pesa un paciente. El mismo podría registrar cambios en su peso. <br />
➢ Consultar la búsqueda de comidas que tengan una cantidad menor de un determinado número de calorías.**** <br />
