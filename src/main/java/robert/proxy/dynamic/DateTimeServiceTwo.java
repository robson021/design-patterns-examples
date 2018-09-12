package robert.proxy.dynamic;

import java.time.LocalDateTime;

public class DateTimeServiceTwo implements DateTimeService {

    @Override
    public LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now().plusHours(1).plusMinutes(30);
    }
}
