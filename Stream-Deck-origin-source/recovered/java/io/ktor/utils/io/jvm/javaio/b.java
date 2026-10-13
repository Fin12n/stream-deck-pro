package io.ktor.utils.io.jvm.javaio;

import C6.k;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6.j f25519a = k.b(a.f25522a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f25520b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f25521c = new Object();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25522a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L7.a invoke() {
            return L7.b.i(io.ktor.utils.io.jvm.javaio.a.class);
        }
    }

    public static final L7.a b() {
        return (L7.a) f25519a.getValue();
    }

    public static final InputStream c(io.ktor.utils.io.g gVar, InterfaceC1815v0 interfaceC1815v0) {
        t.g(gVar, "<this>");
        return new d(interfaceC1815v0, gVar);
    }

    public static /* synthetic */ InputStream d(io.ktor.utils.io.g gVar, InterfaceC1815v0 interfaceC1815v0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1815v0 = null;
        }
        return c(gVar, interfaceC1815v0);
    }
}
