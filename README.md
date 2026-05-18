# 🎓 PMU-Mentorship Portal

Welcome to the **PMU-Mentorship Portal**, a collaborative peer tutoring and mentorship platform designed for Prince Mohammad bin Fahd University (PMU). The application bridges the gap between high-achieving senior students (Mentors) and junior students (Mentees) seeking academic assistance, and is fully monitored by University Administrators.

---

## 🛠️ Tech Stack & Architecture
- **Frontend**: React.js SPA (Web Interface)
- **Backend**: Node.js & Express API Server
- **Database**: MySQL Relational Database
- **Storage**: File System / AWS S3 (Academic Handouts)
- **Core Engine**: Java (Domain models, business entity verification, and testing validation)

---

## 📂 Project Structure

```
PMU-Mentorship/
├── classes/          # Core Java Domain Implementation Models
│   ├── User.java     # Abstract base class for all roles
│   ├── Mentee.java   # Mentee-specific actions, login, and preferences
│   ├── Mentor.java   # Mentor scheduling, workshops, and event creations
│   ├── Event.java    # Workshop metadata, info, and details
│   └── Main.java     # Executable sandbox for testing flows
│
└── diagrams/         # Comprehensive UML and Process Diagrams Suite
    ├── architacture.md   # Presentation, App, and Data System Architecture
    ├── ativity.md        # Mentee Searching and Booking Activity Flow
    ├── class.md          # Domain UML Class Structure & Inheritances
    ├── db.md             # Normalized Database Entity-Relationship (ER) Schema
    ├── sequence.md       # Mentor Session Creation Messaging Sequence
    ├── sprints.md        # Scrum Project Milestones & Gantt Timeline
    ├── state.md          # Booking Slot State Transitions
    ├── use-case.md       # User, Mentor, and Admin Use Case Boundaries
    ├── component.md      # Decoupled Modules & Component Interfaces (NEW)
    ├── deployment.md     # Server Clusters & Cloud Hosting Architecture (NEW)
    ├── booking-sequence.md # Mentee Reservation & Race-Condition Sequence (NEW)
    ├── context.md        # Level 0 Context DFD Information Flow (NEW)
    └── user-journey.md   # UX Onboarding-to-Review User Journey Map (NEW)
```

---

## 🗺️ Complete Diagrams Catalog

This documentation suite includes **13 interactive diagrams** detailing every architectural layer, database schema, operational workflow, and UX flow of the platform.

### 🏗️ 1. [System Architecture Diagram](diagrams/architacture.md)
*High-level multi-tier diagram displaying presentation, application service layers, and backing database pools.*

### 🔄 2. [Mentee Booking Activity Diagram](diagrams/ativity.md)
*Workflow trace detailing search logic, database checks, and notifications for booking slots.*

### 🗂️ 3. [UML Class Diagram](diagrams/class.md)
*Domain models showing properties, getters, setters, inheritance hierarchies, and multi-relational associations.*

### 🛢️ 4. [Entity-Relationship (ER) Database Schema](diagrams/db.md)
*Normalized schema representing users, mentors, calendar sessions, and uploaded resources with PK/FK indexes.*

### 💬 5. [Session Creation Sequence Diagram](diagrams/sequence.md)
*Interactive messaging timeline tracing mentor creations, route requests, validations, and alternate responses.*

### 📅 6. [Sprint Timeline & Development Gantt Chart](diagrams/sprints.md)
*Agile Scrum timeline showing completed work (database, UML, Git setup) and active testing sprints.*

### 🚦 7. [Booking Slot State Machine Diagram](diagrams/state.md)
*Lifespan of a booking slot tracing states like Available, Pending Review, Confirmed, Rejected, and Completed.*

### 🎯 8. [PMU-Mentorship Use Case Diagram](diagrams/use-case.md)
*Logical boundaries delineating Mentee, Mentor, and Administrator responsibilities.*

### 🧩 9. [UML Component Diagram](diagrams/component.md) *(NEW)*
*System modularization showing SPA UI, route controllers, business services, and database connection layers.*

### 🖥️ 10. [UML Deployment Diagram](diagrams/deployment.md) *(NEW)*
*Physical cloud hosting topology showing AWS servers, RDS DB instances, S3 storage buckets, and API communication.*

### 📅 11. [Mentee Booking Sequence Diagram](diagrams/booking-sequence.md) *(NEW)*
*Real-time reservation messaging tracing race conditions, transaction lockouts, and SMTP email schedules.*

### 🌐 12. [System Context DFD Level 0](diagrams/context.md) *(NEW)*
*Unified data flow tracking credential inputs, search requests, analytics logs, and external SSO integrations.*

### 🗺️ 13. [Mentee User Journey Map](diagrams/user-journey.md) *(NEW)*
*Mermaid UX mapping plotting emotions and touchpoints from login, through tutoring, to session ratings.*
