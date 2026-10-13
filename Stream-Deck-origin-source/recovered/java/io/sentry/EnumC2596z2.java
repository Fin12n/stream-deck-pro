package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2596z2 implements InterfaceC2582w0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* JADX INFO: renamed from: io.sentry.z2$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC2596z2 a(W0 w8, ILogger iLogger) {
            return EnumC2596z2.valueOf(w8.G().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.c(name().toLowerCase(Locale.ROOT));
    }
}
