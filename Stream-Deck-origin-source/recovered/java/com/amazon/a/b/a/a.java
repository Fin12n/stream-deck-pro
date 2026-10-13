package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16828a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f16829b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.f16829b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb = new StringBuilder();
        for (com.amazon.a.a.o.d.a aVar : cVar) {
            if (sb.length() != 0) {
                sb.append(f.f16777a);
            }
            sb.append(aVar.a().a());
        }
        return sb.toString();
    }

    public c d() {
        return this.f16829b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f16829b.toString();
    }
}
