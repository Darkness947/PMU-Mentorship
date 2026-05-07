sequenceDiagram
    actor Mentor
    participant WebApp as Web App
    participant Server
    participant Database

    Mentor->>WebApp: Fill session details (topic, time, link)
    WebApp->>Server: POST /api/create-session (sessionData)
    
    Server->>Database: Validate data & mentor permissions
    Database-->>Server: Validation success
    
    Server->>Database: Create new session record(sessionData)
    Database-->>Server: Session created successfully
    
    Server-->>WebApp: 201 Created (Session ID)
    WebApp-->>Mentor: Display success & session details

    alt Invalid Data / Permission Denied
        Server->>Database: Validate data & mentor permissions
        Database-->>Server: Validation failed
        Server-->>WebApp: 400 Bad Request (Error Msg)
        WebApp-->>Mentor: Display error message
    end
    