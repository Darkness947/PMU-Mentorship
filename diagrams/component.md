# 🧩 UML Component Diagram

This UML Component Diagram shows the modular structure of the PMU-Mentorship application, displaying how separate software components (Frontend SPA, Auth, Session Manager, Event Manager, Resource Manager, and database/storage controllers) interact via defined interfaces and connectors.

```mermaid
flowchart TD
    subgraph Frontend ["Client-Side UI (SPA)"]
        UI["Web Browser App / React SPA"]
    end

    subgraph Backend ["Node.js / Express Backend Server"]
        Router["Express Router<br/>(API Gateway)"]
        
        subgraph Services ["Application Components"]
            AuthSvc["Auth Component<br/>(Login/Registration)"]
            SessionMgr["Session Component<br/>(Booking & Schedules)"]
            EventMgr["Event Component<br/>(Workshop Scheduler)"]
            ResourceMgr["Resource Component<br/>(Document Upload/Download)"]
        end

        subgraph Connectors ["Data Access Interfaces"]
            DBConnector["MySQL Database Connector"]
            FileConnector["File Storage Connector"]
        end
    end

    subgraph Storage ["Database & File Store"]
        MySQL[(MySQL Relational DB)]
        DiskStore[(File System Storage)]
    end

    %% Interactions
    UI -->|JSON API Requests| Router
    Router --> AuthSvc
    Router --> SessionMgr
    Router --> EventMgr
    Router --> ResourceMgr

    AuthSvc --> DBConnector
    SessionMgr --> DBConnector
    EventMgr --> DBConnector
    ResourceMgr --> DBConnector
    ResourceMgr --> FileConnector

    DBConnector -->|SQL Queries| MySQL
    FileConnector -->|File Streams| DiskStore

    %% Styling
    classDef client fill:#e1f5fe,stroke:#0288d1,stroke-width:2px;
    classDef api fill:#efebe9,stroke:#5d4037,stroke-width:2px;
    classDef comp fill:#e8f5e9,stroke:#388e3c,stroke-width:2px;
    classDef conn fill:#fff3e0,stroke:#f57c00,stroke-width:2px;
    classDef db fill:#ede7f6,stroke:#512da8,stroke-width:2px;

    class UI client;
    class Router api;
    class AuthSvc,SessionMgr,EventMgr,ResourceMgr comp;
    class DBConnector,FileConnector conn;
    class MySQL,DiskStore db;
```

---
### Architectural Components Explained

1. **Client-Side UI (SPA)**:
   - Built using React.js, providing an interactive dashboard. Communicates with the backend exclusively via HTTPS asynchronous API calls sending/receiving JSON payloads.
2. **Express Router**:
   - The entryway of the application server (API Gateway) that handles request dispatching, authentication token verification (JWT), and rate-limiting.
3. **Application Components (Services Layer)**:
   - **Auth Component**: Verifies user logins and signs JWT credentials.
   - **Session Component**: Manages calendars, creates slot bookings, and triggers slot status transitions.
   - **Event Component**: Handles student workshops and group tutoring reservations.
   - **Resource Component**: Manages file system descriptors, associating uploaded PDF slide sets with respective mentors.
4. **Data Access Interfaces**:
   - Decoupled modules that manage persistence logic. The `DBConnector` pool handles MySQL queries, while the `FileConnector` handles raw binary byte streams for local or cloud file systems.
