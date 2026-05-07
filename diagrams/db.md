erDiagram
  Users ||--o| Mentors : is
  Users ||--o{ Sessions : participates_as_mentee
  Mentors ||--o{ Sessions : participates_as_mentor
  Mentors ||--o{ Resources : uploads

  Users {
    INT UserID PK "unique identifier"
    VARCHAR Name
    VARCHAR Email
    VARCHAR Major
  }
  Mentors {
    INT MentorID PK "unique identifier"
    INT UserID FK "link to specific User"
    DECIMAL AverageRating
  }
  Sessions {
    INT SessionID PK "unique identifier"
    INT MentorID FK "link to Mentor"
    INT MenteeID FK "link to Mentee (User)"
    DATETIME Date
    VARCHAR Topic
    VARCHAR VideoLinkURL
  }
  Resources {
    INT ResourceID PK "unique identifier"
    INT MentorID FK "link to uploader"
    VARCHAR Title
    VARCHAR FilePath
  }
  