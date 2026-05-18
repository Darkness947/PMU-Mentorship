# 🗂️ PMU-Mentorship UML Class Diagram

This Class Diagram represents the domain model and structural blueprint of the PMU-Mentorship application. It illustrates the object-oriented design, including inheritance hierarchies from the base abstract `User` class to the concrete roles (`Mentee`, `Mentor`, `Admin`), as well as relationship multiplicities between core entities like `Session`, `Event`, and academic `Resource`.

```mermaid
%%{init: {'theme': 'default', 'themeVariables': { 'fontFamily': 'arial', 'fontSize': '12px'}}}%%
classDiagram
    class User {
        <<abstract>>
        # PMUiD: String
        # FirstName: String
        # LastName: String
        # Email: String
        # Password: String
        + getEvents()* void
        + getNode(nodeID: String) void
        + getRewards() void
    }

    class Mentee {
        - Major: String
        - GPA: double
        + login(inputEmail: String, inputPassword: String) boolean
        + getEvents() void
        + getMajor() String
    }

    class Mentor {
        - ExpertiseArea: String
        - createdEvents: List~String~
        + login(inputEmail: String, inputPassword: String) boolean
        + getEvents() void
        + createEvent(eventName: String) void
    }

    class Admin {
        - adminId: String
        - adminName: String
        - adminAuthor: String
        + getAdminInformation() void
        + getAdminMonitoring() void
        + getAdmin() void
        + getSessionCaption() void
        + getRegsStatus() void
    }

    class Session {
        - sessionId: String
        - sessionStatus: String
        - mentorID: String
        - menteeID: String
        - date: Date
        - topic: String
        - videoLinkURL: String
        + session() void
        + sessionMethod() void
        + sessionMethods() void
    }

    class Event {
        - EventName: String
        - EventId: String
        - EventDetails: String
        + displayEventInfo() void
        + EventDetails() void
    }

    class Resource {
        - resourceName: String
        - resourceId: String
        + associate() void
        + resourceMentorCoordinate() void
        + resourceMethods() void
    }

    User <|-- Mentee
    User <|-- Mentor
    User <|-- Admin
    Mentee "1" --> "*" Session : participates
    Mentor "1" --> "1..*" Session : conducts
    Mentor "1" --> "0..*" Event : schedules
    Mentor "1" --> "*" Resource : uploads
```

---
### Object-Oriented Principles Demonstrated

1. **Inheritance (Generalization)**:
   - `User` is an abstract base class that encapsulates common fields (`PMUiD`, `FirstName`, `LastName`, `Email`, `Password`) and defines the abstract signature `getEvents()`.
   - `Mentee`, `Mentor`, and `Admin` extend `User`, inheriting these properties while introducing specialized attributes and behaviors (e.g., `Mentee.Major`, `Mentor.ExpertiseArea`).

2. **Associations & Multiplicities**:
   - A `Mentee` participates in zero or more (`*`) `Sessions`.
   - A `Mentor` leads one or more (`1..*`) `Sessions`, publishes zero or more (`0..*`) `Events`, and uploads any number of educational `Resources`.