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
    