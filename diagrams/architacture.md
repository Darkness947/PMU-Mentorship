# 🏗️ PMU-Mentorship System Architecture Diagram

This diagram visualizes the multi-tier architecture of the PMU-Mentorship system, illustrating the distinct boundaries and communication flows between the **Presentation Layer (Client)**, the **Application Layer (Server)**, and the **Data Layer (Storage)**.

```mermaid
flowchart TD
    %% Presentation Layer
    subgraph Client ["Presentation Layer (Client)"]
        UI["Web Browser / Mobile App<br/>(React.js UI)"]
    end

    %% Application Layer
    subgraph Server ["Application Layer (Server)"]
        WS["Web Server<br/>(Node.js / Express)"]
        Auth["Auth Service<br/>(Login Logic)"]
        Logic["Mentorship Logic<br/>(Booking / Search)"]
        
        WS -- Validate User --> Auth
        WS -- Process Request --> Logic
    end

    %% Data Layer
    subgraph Storage ["Data Layer (Storage)"]
        DB[("MySQL Database<br/>(Users, Events)")]
        FS[("File Storage<br/>(Study Guides)")]
    end

    %% Connections across layers
    UI <-->|HTTP Request (JSON) / Response| WS
    Logic -- SQL Query --> DB
    Logic -- Upload / Download --> FS

    %% Styling
    classDef layer fill:#f9f9f9,stroke:#333,stroke-width:2px,stroke-dasharray: 5 5;
    class Client,Server,Storage layer;
```

---
### Layer Breakdown

1. **Presentation Layer (Client)**: 
   - A modern React.js web interface where Mentees and Mentors interact with the platform.
2. **Application Layer (Server)**:
   - A Node.js and Express backend acting as the web server, housing specific authentication and core mentorship business logic (booking, scheduling, calendar, etc.).
3. **Data Layer (Storage)**:
   - A MySQL relational database storing user profiles, event details, and booking sessions.
   - A File System / Object Storage for study guides, slide presentations, and shared academic resources.