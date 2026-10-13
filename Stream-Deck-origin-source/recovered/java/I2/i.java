package I2;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f3755e;

    public i(Object value, String tag, j verificationMode, g logger) {
        t.g(value, "value");
        t.g(tag, "tag");
        t.g(verificationMode, "verificationMode");
        t.g(logger, "logger");
        this.f3752b = value;
        this.f3753c = tag;
        this.f3754d = verificationMode;
        this.f3755e = logger;
    }

    @Override // I2.h
    public Object a() {
        return this.f3752b;
    }

    @Override // I2.h
    public h c(String message, Q6.k condition) {
        t.g(message, "message");
        t.g(condition, "condition");
        return ((Boolean) condition.invoke(this.f3752b)).booleanValue() ? this : new f(this.f3752b, this.f3753c, message, this.f3755e, this.f3754d);
    }
}
