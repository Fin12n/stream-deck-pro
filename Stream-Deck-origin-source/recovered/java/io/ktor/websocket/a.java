package io.ktor.websocket;

import D6.L;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f25578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25579b;

    /* JADX INFO: renamed from: io.ktor.websocket.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum EnumC0581a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0582a f25580b = new C0582a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Map f25581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0581a f25582d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f25596a;

        /* JADX INFO: renamed from: io.ktor.websocket.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0582a {
            public /* synthetic */ C0582a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final EnumC0581a a(short s8) {
                return (EnumC0581a) EnumC0581a.f25581c.get(Short.valueOf(s8));
            }

            public C0582a() {
            }
        }

        static {
            EnumC0581a[] enumC0581aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(L.d(enumC0581aArrValues.length), 16));
            for (EnumC0581a enumC0581a : enumC0581aArrValues) {
                linkedHashMap.put(Short.valueOf(enumC0581a.f25596a), enumC0581a);
            }
            f25581c = linkedHashMap;
            f25582d = INTERNAL_ERROR;
        }

        EnumC0581a(short s8) {
            this.f25596a = s8;
        }

        public final short c() {
            return this.f25596a;
        }
    }

    public a(short s8, String message) {
        kotlin.jvm.internal.t.g(message, "message");
        this.f25578a = s8;
        this.f25579b = message;
    }

    public final short a() {
        return this.f25578a;
    }

    public final EnumC0581a b() {
        return EnumC0581a.f25580b.a(this.f25578a);
    }

    public final String c() {
        return this.f25579b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25578a == aVar.f25578a && kotlin.jvm.internal.t.c(this.f25579b, aVar.f25579b);
    }

    public int hashCode() {
        return (Short.hashCode(this.f25578a) * 31) + this.f25579b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseReason(reason=");
        Object objB = b();
        if (objB == null) {
            objB = Short.valueOf(this.f25578a);
        }
        sb.append(objB);
        sb.append(", message=");
        sb.append(this.f25579b);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(EnumC0581a code, String message) {
        this(code.c(), message);
        kotlin.jvm.internal.t.g(code, "code");
        kotlin.jvm.internal.t.g(message, "message");
    }
}
