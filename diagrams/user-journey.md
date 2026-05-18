# 🗺️ Mentee User Journey Map

This User Journey Map represents the lifecycle of a student's (Mentee) interaction with the PMU-Mentorship platform. It details user actions, satisfaction scores (emotional states from 1 to 5), and platform touchpoints across five distinct phases: Onboarding, Search, Reservation, Session, and Feedback.

```mermaid
journey
    title Mentee Session Booking User Journey
    section Onboarding
      Access Platform: 5: Mentee, Browser
      Authenticate via PMU SSO: 4: Mentee, PMU SSO
      Set up Profile & Interests: 4: Mentee, Browser
    section Search & Discovery
      Search Mentors by Major: 5: Mentee, Database
      Read Mentor Reviews: 4: Mentee, Database
      Compare Availability: 3: Mentee, Browser
    section Reservation
      Select Time Slot: 5: Mentee, Browser
      Submit Booking Request: 4: Mentee, Server
      Wait for Mentor Approval: 2: Mentee, Mentor
    section Session Execution
      Receive Confirmation Notification: 5: Mentee, Server
      Join Video Session: 4: Mentee, Mentor, Video API
      Complete Peer Session: 5: Mentee, Mentor
    section Feedback
      Submit Star Rating: 5: Mentee, Database
      Download Shared PDF Guides: 5: Mentee, Server
```

---
### Phase Analysis & System Highlights

1. **Onboarding**:
   - *Experience*: Easy entry via single-sign-on (SSO), building immediate confidence.
   - *Touchpoints*: SSO interface, initial profile interest checklist.
2. **Search & Discovery**:
   - *Experience*: Highly satisfying due to instant filtering by major, though finding a match depends on availability (satisfaction drops slightly during date comparison).
   - *Touchpoints*: Search controller, mentor listing cards.
3. **Reservation (The Waiting Period)**:
   - *Experience*: Tension points occur while the Mentee awaits approval from the Mentor (satisfaction dips to 2). This highlights the system need for active notification systems to reduce latency.
   - *Touchpoints*: Booking API transaction, approval emails.
4. **Session Execution**:
   - *Experience*: Maximum value delivered! Peer tutoring session occurs on-platform, resolving academic questions.
   - *Touchpoints*: Video meeting interface, whiteboard sharing.
5. **Feedback & Resources**:
   - *Experience*: High satisfaction closing loop. The student rates the tutor and downloads study guide handouts.
   - *Touchpoints*: Stars selection review form, S3 PDF resource manager.
