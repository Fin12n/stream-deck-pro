package p115m6;

import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2695e {
    public static final void a(InterfaceC2692b interfaceC2692b, InterfaceC2692b other) {
        t.g(interfaceC2692b, "<this>");
        t.g(other, "other");
        for (C2691a c2691a : other.f()) {
            t.e(c2691a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            interfaceC2692b.d(c2691a, other.b(c2691a));
        }
    }
}
