%%{init: {'theme': 'sketch', 'themeVariables': { 'fontFamily': 'arial', 'fontSize': '12px'}}}%%
classDiagram
    class User {
        - PMUiD: String
        - FirstName: String
        - LastName: String
        - Email: String
        - Password: String
        + getHello(): void
        + getEvent()
        + getReward()
    }

    class Mentee {
        - MenteeLevel: String
        - MenteeHours: String
        + menteeInstructor(): void
        + menteeEvents(): void
        + menteeSessions(): void
        + menteeSetStatus(): void
       
    }

    class Mentor {
        - Sessions: String
        - Stats: String
        - Courses: String
        + mentorInstructor(): void
        + mentorgetCourses(): void
        + mentorSetStatus(): void
        + mentorgetSessions(): void
        + mentorSessionContent(): void
        + mentorVoteForEvent(): void
    }

    class Admin {
        - adminId: String
        - adminName: String
        - adminAuthor: String
        + getAdminInformation(): void
        + getAdminMonitoring(): void
        + getAdmin(): void
        + getSessionCaption(): void
        + getRegsStatus(): void
    }

    class Session {
        - sessionId: String
        - sessionStatus: String
        + session(): void
        + sessionMethod(): void
        + sessionMethods(): void
    }

    class Event {
        - eventName: String
        - eventId: String
        + eventSession(): void
        + eventStatus(): void
        + eventUpdate(): void
    }

    class Resource {
        - resourceName: String
        - resourceId: String
        + associate(): void
        + resourceMentorCoordinate(): void
        + resourceMethods(): void
    }

    User <|-- Mentee
    User <|-- Mentor
    User <|-- Admin
    Mentee "1" --> "*" Session
    Mentor "1" --> "1..*" Session
    Mentor "1" --> "0..*" Event
    Mentor "1" --> "*" Resource
    