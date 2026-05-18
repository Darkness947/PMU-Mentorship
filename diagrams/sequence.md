# 💬 Session Creation Sequence Diagram

This Sequence Diagram illustrates the step-by-step communication flow and API lifecycle when a Mentor creates a new mentorship session, demonstrating validation checks, database transactions, and alternative failure routing.

```mermaid
sequenceDiagram
    actor Mentor
    participant WebApp as Web App
    participant Server
    participant Database

    Mentor->>WebApp: Fill session details (topic, time, link)
    WebApp->>Server: POST /api/create-session (sessionData)
    
    Server->>Database: Validate data & mentor permissions
    Database-->>Server: Validation Result
    
    alt Validation Successful
        Server->>Database: Create new session record (sessionData)
        Database-->>Server: Session created successfully
        Server-->>WebApp: 201 Created (Session ID)
        WebApp-->>Mentor: Display success & session details
    else Invalid Data / Permission Denied
        Server-->>WebApp: 400 Bad Request / 403 Forbidden (Error Msg)
        WebApp-->>Mentor: Display error message
    end
```

---
### Interaction Flow Detailed

1. **Input**: The Mentor fills out session details on the Web App frontend, supplying a topic, date/time slot, and meeting connection link.
2. **Request Dispatch**: The Web App packages these details as a JSON payload and makes an HTTP POST request to the API backend.
3. **Database Validation**: The Backend Server validates the inputs and checks whether the Mentor holds necessary role permissions.
4. **Conditional Branches (`alt/else`)**:
   - **Path A (Success)**: A SQL insert transaction creates the record, returning a success HTTP `201 Created` status code, updating the Mentor's schedule view.
   - **Path B (Failure)**: In case of validation issues (e.g., overlapping slot or missing token), the backend stops execution, sends a `400 Bad Request` or `403 Forbidden` response, and displays a user-friendly error message.