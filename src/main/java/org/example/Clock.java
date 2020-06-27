package org.example;

import java.time.Duration;

public class Clock {
    public static int Past(int h, int m, int s)
    {
        return (int) (1000 * (Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis()));
    }
}
