### CRUD OPERATIONS:

BROWSER -> GET -> MySQL -> SELECT\
BROWSER -> POST -> MySQL -> INSERT\
BROWSER -> PUT -> MySQL -> UPDATE\
BROWSER -> DELETE -> MySQL -> DELETE\

Connect to MySQL by JDBC (Java Database Connectivity)
with JPA (Hibernate) API

### The Three Principal Layers

*(c) Patterns of Enterprise Application Architecture
By Martin Fowler, David Rice, Matthew Foemmel, Edward Hieatt, Robert Mee,
Randy Stafford*

Layer Responsibilities

| Layer        | Responsibilities                                                                                                                                                                     |
|:-------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Presentation | Provision of services, display of information (e.g., in Windows or HTML, handling of user request (mouse clicks, keyboard hits), HTTP requests, command-line invocations, batch API) |
| Domain       | Logic that is the real point of the system                                                                                                                                           |
| Data Source  | Communication with databases, messaging systems, transaction managers, other packages                                                                                                |

**Presentation** - *Controller* -  logic is about how to handle the interaction between the user and the software (e.g. browser).

**Domain** - *Business layer* - involves calculations based on inputs and
stored data, validation of any data that comes in from the presentation, and figuring out exactly what data
source logic to dispatch.

**Data Source** - *DAO layer* - logic is mostly about communicating with DB for storing persistent data.

