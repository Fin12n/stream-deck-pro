package p053f7;

import p035d7.d;
import p044e7.C;
import p044e7.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends C implements M {
    public z(int i8) {
        super(1, Integer.MAX_VALUE, d.DROP_OLDEST);
        d(Integer.valueOf(i8));
    }

    @Override // p044e7.M
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i8) {
        boolean zD;
        synchronized (this) {
            zD = d(Integer.valueOf(((Number) L()).intValue() + i8));
        }
        return zD;
    }
}
