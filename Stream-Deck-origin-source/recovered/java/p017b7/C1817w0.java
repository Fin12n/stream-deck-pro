package p017b7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b7.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1817w0 extends CancellationException implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1815v0 f15987a;

    public C1817w0(String str, Throwable th, InterfaceC1815v0 interfaceC1815v0) {
        super(str);
        this.f15987a = interfaceC1815v0;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // p017b7.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1817w0 a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1817w0)) {
            return false;
        }
        C1817w0 c1817w0 = (C1817w0) obj;
        return t.c(c1817w0.getMessage(), getMessage()) && t.c(c1817w0.f15987a, this.f15987a) && t.c(c1817w0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        t.d(message);
        int iHashCode = ((message.hashCode() * 31) + this.f15987a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f15987a;
    }
}
