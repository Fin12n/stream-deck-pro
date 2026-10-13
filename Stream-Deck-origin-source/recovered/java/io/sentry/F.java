package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f25868b;

    public F(String str) {
        Pattern patternCompile;
        this.f25867a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            M1.q().b().getLogger().c(EnumC2596z2.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f25868b = patternCompile;
    }

    public String a() {
        return this.f25867a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f25868b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f25867a, ((F) obj).f25867a);
    }

    public int hashCode() {
        return Objects.hash(this.f25867a);
    }
}
