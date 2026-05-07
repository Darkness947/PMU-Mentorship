stateDiagram-v2
    [*] --> Available : Mentor marks time slot available
    
    Available --> Pending : Mentee sends booking request
    
    state Pending_Review {
        Pending
    }
    
    Pending --> Confirmed : Mentor clicks 'Accept'
    Pending --> Rejected : Mentor clicks 'Reject'
    
    Rejected --> Available : Time slot becomes available again
    
    Confirmed --> Completed : Scheduled end time passes
    
    Completed --> [*]