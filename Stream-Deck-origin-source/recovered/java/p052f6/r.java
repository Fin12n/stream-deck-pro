package p052f6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum r {
    WARNING(1),
    FATAL(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22129b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r[] f22130c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22134a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final r a(int i8) {
            r rVar = (i8 < 0 || i8 >= 256) ? null : r.f22130c[i8];
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i8);
        }

        public a() {
        }
    }

    static {
        r rVar;
        r[] rVarArr = new r[256];
        for (int i8 = 0; i8 < 256; i8++) {
            r[] rVarArrValues = values();
            int length = rVarArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    rVar = null;
                    break;
                }
                rVar = rVarArrValues[i9];
                if (rVar.f22134a == i8) {
                    break;
                } else {
                    i9++;
                }
            }
            rVarArr[i8] = rVar;
        }
        f22130c = rVarArr;
    }

    r(int i8) {
        this.f22134a = i8;
    }

    public final int c() {
        return this.f22134a;
    }
}
