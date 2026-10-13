package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2106q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f19371b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C2106q f19372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2106q f19373d = new C2106q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19374a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f19375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19376b;

        public a(Object obj, int i8) {
            this.f19375a = obj;
            this.f19376b = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19375a == aVar.f19375a && this.f19376b == aVar.f19376b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19375a) * 65535) + this.f19376b;
        }
    }

    public C2106q(boolean z8) {
    }

    public static C2106q b() {
        C2106q c2106qA;
        if (!f19371b) {
            return f19373d;
        }
        C2106q c2106q = f19372c;
        if (c2106q != null) {
            return c2106q;
        }
        synchronized (C2106q.class) {
            try {
                c2106qA = f19372c;
                if (c2106qA == null) {
                    c2106qA = AbstractC2105p.a();
                    f19372c = c2106qA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2106qA;
    }

    public GeneratedMessageLite.e a(T t8, int i8) {
        return (GeneratedMessageLite.e) this.f19374a.get(new a(t8, i8));
    }
}
