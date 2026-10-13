package p062g7;

import G6.g;

/* JADX INFO: renamed from: g7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2371j extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g f23842a;

    public C2371j(g gVar) {
        this.f23842a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f23842a.toString();
    }
}
