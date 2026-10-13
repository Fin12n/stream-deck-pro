package s7;

import C6.C0920i;
import java.util.Iterator;
import r7.EnumC2878b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33175a;

        static {
            int[] iArr = new int[EnumC2878b.values().length];
            try {
                iArr[EnumC2878b.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2878b.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2878b.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33175a = iArr;
        }
    }

    public static final Iterator a(EnumC2878b mode, r7.c json, W lexer, p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(mode, "mode");
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(lexer, "lexer");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        int i8 = a.f33175a[b(lexer, mode).ordinal()];
        if (i8 == 1) {
            return new F(json, lexer, deserializer);
        }
        if (i8 == 2) {
            return new D(json, lexer, deserializer);
        }
        if (i8 != 3) {
            throw new C6.m();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    public static final EnumC2878b b(AbstractC2894a abstractC2894a, EnumC2878b enumC2878b) {
        int i8 = a.f33175a[enumC2878b.ordinal()];
        if (i8 == 1) {
            return EnumC2878b.WHITESPACE_SEPARATED;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                return c(abstractC2894a) ? EnumC2878b.ARRAY_WRAPPED : EnumC2878b.WHITESPACE_SEPARATED;
            }
            throw new C6.m();
        }
        if (c(abstractC2894a)) {
            return EnumC2878b.ARRAY_WRAPPED;
        }
        AbstractC2894a.z(abstractC2894a, (byte) 8, false, 2, null);
        throw new C0920i();
    }

    public static final boolean c(AbstractC2894a abstractC2894a) {
        if (abstractC2894a.H() != 8) {
            return false;
        }
        abstractC2894a.k((byte) 8);
        return true;
    }
}
