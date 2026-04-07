---
# TP 3 - Gestión de Médicos con Hibernate

Proyecto desarrollado para la materia **Laboratorio V** de la **Tecnicatura Superior en Programación - UTN FRGP**.

El objetivo del trabajo es implementar una aplicación de consola que gestione médicos de una clínica utilizando **Hibernate como ORM**, permitiendo realizar operaciones básicas sobre una base de datos relacional.

---

# Objetivo del proyecto

Desarrollar una aplicación que permita gestionar médicos de una clínica mediante operaciones **ABML (Alta, Baja, Modificación y Listado)** utilizando **Hibernate** para el mapeo objeto-relacional.

Cada médico posee los siguientes datos:

* Legajo (identificador único)
* Nombre
* Apellido
* Sexo
* Fecha de nacimiento
* Dirección
* Localidad
* Correo electrónico
* Teléfono

El sistema:

* Inserta registros en la base de datos
* Modifica información de médicos existentes
* Elimina médicos por su legajo
* Lista todos los médicos registrados

---

# Tecnologías utilizadas

* **Java**
* **Hibernate ORM**
* **Maven**
* **PostgreSQL**
* **JDBC**
* **IntelliJ IDEA**
* **Arquitectura DAO**

---

# Arquitectura del proyecto

El proyecto sigue una estructura en capas para separar responsabilidades:

```
src/main/java
│
├── config
│   └── HibernateUtil.java
│
├── data
│   └── DoctorData.java
│
├── entity
│   └── Doctor.java
│
├── project
│   └── Main.java
│
├── repository
│   ├── GenericDAO.java
│   └── DoctorDAO.java
│
└── services
    └── DoctorService.java
```

### Descripción de cada capa

**config**

Contiene la configuración de Hibernate y la creación del `SessionFactory`.

```
HibernateUtil.java
```

Se encarga de:

* Inicializar Hibernate
* Crear sesiones
* Gestionar la conexión con la base de datos.

---

**entity**

Contiene las clases que representan las tablas de la base de datos.

```
Doctor.java
```

Es la entidad mapeada con Hibernate que representa a un médico.

---

**repository**

Implementa el patrón **DAO (Data Access Object)** para separar la lógica de acceso a datos.

```
GenericDAO.java
DoctorDAO.java
```

Permiten realizar operaciones como:

* guardar
* actualizar
* eliminar
* buscar

---

**services**

Contiene la lógica de negocio.

```
DoctorService.java
```

Se encarga de:

* coordinar las operaciones entre la capa de datos y la aplicación.

---

**data**

```
DoctorData.java
```

Clase utilizada para generar datos de prueba que serán insertados en la base de datos.

---

**project**

```
Main.java
```

Clase principal donde se ejecuta el programa y se prueban las operaciones ABML.

---

# Operaciones implementadas

El sistema realiza las siguientes operaciones:

### ➜ Alta de médicos

Se insertan registros en la base de datos utilizando Hibernate.

### ➜ Modificación

Se actualizan los datos de un médico existente (excepto el legajo).

### ➜ Baja

Se elimina un médico utilizando su **legajo**.

### ➜ Listado

Se muestran todos los médicos registrados mediante un `foreach`.

---

# Base de datos

El proyecto se conecta a una base de datos relacional mediante Hibernate.

Configuración gestionada en:

```
hibernate.cfg.xml
```

---

# Ejecución del proyecto

1️⃣ Clonar el repositorio

```
git clone https://github.com/usuario/repositorio.git
```

2️⃣ Entrar al proyecto

```
cd proyecto
```

3️⃣ Compilar con Maven

```
mvn clean install
```

4️⃣ Ejecutar la clase `Main`

---

# Conceptos aplicados

Este proyecto permite comprender conceptos fundamentales previos a **Spring Boot**, como:

* ORM (Object Relational Mapping)
* Hibernate
* DAO Pattern
* Separación en capas
* Gestión de sesiones
* Transacciones
* Maven

---

# Aprendizajes

Este trabajo práctico sirvió para:

* Comprender cómo Hibernate mapea **objetos Java a tablas SQL**
* Implementar **DAO genéricos**
* Gestionar **sesiones y transacciones**
* Aplicar **arquitectura en capas**
* Preparar el camino para trabajar con **Spring Boot y JPA**

---

# ‍💻 Autor

**Carlos Jasset Zubilete Sanchez**

Tecnicatura Superior en Programación
UTN - Facultad Regional General Pacheco

---


