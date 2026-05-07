flowchart TD
    Start((Start)) --> Login[Mentee Logs In]
    Login --> Search[Search for Mentor by Major]
    Search --> ViewProfile[View Mentor Profile & Calendar]
    ViewProfile --> SelectSlot[Select 'Available' Time Slot]
    SelectSlot --> RequestBooking[Send Booking Request]
    
    RequestBooking --> CheckDB{Database Check:<br/>Is Slot Available?}
    
    CheckDB -- Yes --> UpdateDB[Create Booking Record]
    UpdateDB --> StatusPending[Set Status to 'Pending']
    StatusPending --> NotifyMentor[Notify Mentor]
    NotifyMentor --> EndSuccess(((Success)))
    
    CheckDB -- No --> ErrorMsg[Display Error: Slot Taken]
    ErrorMsg --> ViewProfile