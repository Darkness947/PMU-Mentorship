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