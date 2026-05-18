# 🎯 PMU-Mentorship System Use Case Diagram

This Use Case Diagram depicts the system boundary and roles of actors (**Mentee**, **Mentor**, and **Admin**) interacting with the various modules of the PMU-Mentorship application.

```mermaid
flowchart LR
    %% Actors
    Mentee("👤 Mentee")
    Mentor("👤 Mentor")
    Admin("👤 Admin")

    %% System Boundary
    subgraph PmuMentorSystem["PmuMentor System"]
        direction TB
        
        %% Use Cases
        UC_Search(["Search for Mentors"])
        UC_Book(["Book a Session"])
        UC_Download(["Download Resources"])
        
        UC_Messages(["Send Private Messages"])
        
        UC_Availability(["Manage Availability"])
        UC_Share(["Share Resources"])
        UC_Requests(["Accept/Reject Requests"])
        
        UC_ManageUsers(["Manage Users"])
        UC_ViewReports(["View Reports"])
    end

    %% Mentee Connections
    Mentee --- UC_Search
    Mentee --- UC_Book
    Mentee --- UC_Download
    Mentee --- UC_Messages

    %% Mentor Connections
    Mentor --- UC_Messages
    Mentor --- UC_Availability
    Mentor --- UC_Share
    Mentor --- UC_Requests

    %% Admin Connections
    UC_ManageUsers --- Admin
    UC_ViewReports --- Admin

    %% Styling to mimic the clean UML look
    classDef actor fill:transparent,stroke:none,font-weight:bold;
    classDef usecase fill:#ffffff,stroke:#000000,stroke-width:2px;
    class Mentee,Mentor,Admin actor;
    class UC_Search,UC_Book,UC_Download,UC_Messages,UC_Availability,UC_Share,UC_Requests,UC_ManageUsers,UC_ViewReports usecase;
```

---
### Actors & Operational Scopes

1. **Mentee (Student)**:
   - Primary operations: Searching for active peer mentors by major, booking time slots, reviewing academic files/study guides, and exchanging messages.
2. **Mentor (Senior/Tutor)**:
   - Primary operations: Creating session slots, approving or declining incoming booking requests, uploading study files, and chatting with mentees.
3. **Admin (University Staff)**:
   - Primary operations: Overall system administration, user management (suspending/registering), and generating/viewing metrics and reports.