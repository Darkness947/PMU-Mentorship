# 🌐 System Context Diagram (DFD Level 0)

This System Context Diagram (Data Flow Diagram Level 0) establishes the functional boundaries of the PMU-Mentorship platform. It treats the entire system as a singular central process node, displaying the data inputs, query structures, and response outputs exchanged with all external entities (Mentees, Mentors, Admins, and the external PMU SSO Identity Provider).

```mermaid
flowchart LR
    %% External Entities
    Mentee["👤 Mentee (Student)"]
    Mentor["👤 Mentor (Senior/Tutor)"]
    Admin["⚙️ Admin (Staff)"]
    PMU_SSO["🔑 PMU University SSO<br/>(Authentication API)"]

    %% Central Process System
    System(("🌐 PMU-Mentorship System<br/>(Central Platform)"))

    %% Interactions with Mentee
    Mentee -->|1. Credentials| System
    Mentee -->|2. Search Queries & Booking Requests| System
    System -->|3. Matching Mentors & Session Confirmations| System
    System -->|4. Study Guides & Notifications| Mentee

    %% Interactions with Mentor
    Mentor -->|1. Availability Schedule & Resources| System
    Mentor -->|2. Booking Approvals / Rejections| System
    System -->|3. Mentee Bookings & Session Schedules| System
    System -->|4. Performance Ratings & Feedback| Mentor

    %% Interactions with Admin
    Admin -->|1. Security Reports & User Audits| System
    System -->|2. Platform Analytics & Performance Logs| Admin

    %% Interactions with External SSO
    System -->|1. Authentication Requests| PMU_SSO
    PMU_SSO -->|2. Student Token & Active Status| System

    %% Styling
    classDef entity fill:#f5f5f5,stroke:#9e9e9e,stroke-width:2px,font-weight:bold;
    classDef core fill:#e1f5fe,stroke:#0288d1,stroke-width:3px,font-weight:bold;
    classDef external fill:#fff3e0,stroke:#f57c00,stroke-width:2px,stroke-dasharray: 5 5;

    class Mentee,Mentor,Admin entity;
    class System core;
    class PMU_SSO external;
```

---
### Interfaces & Information Exchange Flows

1. **Student / Mentee**:
   - Sends: Login credentials, search queries (for academic topics or specific mentor profiles), and session reservation requests.
   - Receives: Profiles of matching mentors, booking notifications, downloadable study resources, and calendar reminders.
2. **Senior / Mentor**:
   - Sends: Custom schedules (available hours), approved/rejected booking states, resource files, and interactive chat text.
   - Receives: Booking requests, session details, calendar synchronizations, and ratings/feedback metrics.
3. **University Admin**:
   - Sends: System configuration updates, user blocklists, and system auditing queries.
   - Receives: Operational reporting, system health analytics, database audits, and security metrics.
4. **PMU University SSO Identity Provider**:
   - Interfaces via standard OAuth2 protocols. Receives verification requests, validating student details against university servers and returning active student status tokens.
