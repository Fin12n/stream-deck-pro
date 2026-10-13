package p141p6;

import D6.iIQ.BmWxZhjGfw;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum g {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH(BmWxZhjGfw.kpLci),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31341b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31355a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a(int i8) {
            return g.values()[i8];
        }

        public final g b(String value) {
            g gVar;
            t.g(value, "value");
            g[] gVarArrValues = g.values();
            int length = gVarArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i8];
                if (t.c(gVar.b(), value)) {
                    break;
                }
                i8++;
            }
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException(("Invalid month: " + value).toString());
        }

        public a() {
        }
    }

    g(String str) {
        this.f31355a = str;
    }

    public final String b() {
        return this.f31355a;
    }
}
