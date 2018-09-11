package robert.proxy.dynamic;

import java.time.LocalDateTime;

public class DateTimeServiceImpl implements DateTimeService {

    @Override
    public LocalDateTime getCurrentDateAndTime() {
        return LocalDateTime.now();
    }
}
