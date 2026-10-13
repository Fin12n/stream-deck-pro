package io.sentry;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum k3 implements InterfaceC2582w0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(RCHTTPStatusCodes.BAD_REQUEST),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(RCHTTPStatusCodes.BAD_REQUEST),
    ABORTED(409),
    OUT_OF_RANGE(RCHTTPStatusCodes.BAD_REQUEST),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k3 a(W0 w8, ILogger iLogger) {
            return k3.valueOf(w8.G().toUpperCase(Locale.ROOT));
        }
    }

    k3(int i8) {
        this.minHttpStatusCode = i8;
        this.maxHttpStatusCode = i8;
    }

    public static k3 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static k3 fromHttpStatusCode(int i8) {
        for (k3 k3Var : values()) {
            if (k3Var.matches(i8)) {
                return k3Var;
            }
        }
        return null;
    }

    private boolean matches(int i8) {
        return i8 >= this.minHttpStatusCode && i8 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.c(apiName());
    }

    public static k3 fromHttpStatusCode(Integer num, k3 k3Var) {
        k3 k3VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : k3Var;
        return k3VarFromHttpStatusCode != null ? k3VarFromHttpStatusCode : k3Var;
    }

    k3(int i8, int i9) {
        this.minHttpStatusCode = i8;
        this.maxHttpStatusCode = i9;
    }
}
