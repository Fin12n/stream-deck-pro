package p052f6;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum q {
    ExplicitPrime(1),
    ExplicitChar(2),
    NamedCurve(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22122b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q[] f22123c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22128a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }

        public final q a(int i8) {
            q qVar = (i8 < 0 || i8 >= 256) ? null : q.f22123c[i8];
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalArgumentException(LYdqVGvOGMNr.BAbWh + i8);
        }
    }

    static {
        q qVar;
        q[] qVarArr = new q[256];
        for (int i8 = 0; i8 < 256; i8++) {
            q[] qVarArrValues = values();
            int length = qVarArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    qVar = null;
                    break;
                }
                qVar = qVarArrValues[i9];
                if (qVar.f22128a == i8) {
                    break;
                } else {
                    i9++;
                }
            }
            qVarArr[i8] = qVar;
        }
        f22123c = qVarArr;
    }

    q(int i8) {
        this.f22128a = i8;
    }

    public final int c() {
        return this.f22128a;
    }
}
