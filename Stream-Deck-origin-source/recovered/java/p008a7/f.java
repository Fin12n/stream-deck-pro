package p008a7;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f extends e {
    public static final d d(char c8, boolean z8) {
        if (!z8) {
            if (c8 == 'D') {
                return d.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 == 'H') {
            return d.HOURS;
        }
        if (c8 == 'M') {
            return d.MINUTES;
        }
        if (c8 == 'S') {
            return d.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
    }

    public static final d e(String shortName) {
        t.g(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return d.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return d.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return d.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return d.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return d.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return d.HOURS;
            }
        } else if (shortName.equals("d")) {
            return d.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
