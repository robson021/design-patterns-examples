package robert.proxy.dynamic;

import java.time.LocalDateTime;

public class DateTimeServiceOne implements DateTimeService {

    @Override
    public LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now();
    }
}
