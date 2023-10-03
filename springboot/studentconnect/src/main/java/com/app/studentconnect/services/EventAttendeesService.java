package com.app.studentconnect.services;
import java.util.List;
import org.springframework.stereotype.Service;
// import com.app.studentconnect.requestDTO;
// import com.app.studentconnect.responseDTO;
import com.app.studentconnect.entities.EventAttendees;
import com.app.studentconnect.repositories.EventAttendeesRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
public class EventAttendeesService {
    private final EventAttendeesRepo eventAttendeesRepo;
}