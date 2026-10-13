package p219z4;

import android.content.Context;
import android.util.SparseIntArray;
import p195w4.e;
import p195w4.f;
import p203x4.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f39092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f39093b;

    public G() {
        this(e.m());
    }

    public final int a(Context context, int i8) {
        return this.f39092a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC3207p.k(context);
        AbstractC3207p.k(fVar);
        int iH = 0;
        if (!fVar.j()) {
            return 0;
        }
        int iK = fVar.k();
        int iA = a(context, iK);
        if (iA != -1) {
            return iA;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.f39092a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f39092a.keyAt(i8);
            if (iKeyAt > iK && this.f39092a.get(iKeyAt) == 0) {
                break;
            }
            i8++;
        }
        if (iH == -1) {
            iH = this.f39093b.h(context, iK);
        }
        this.f39092a.put(iK, iH);
        return iH;
    }

    public final void c() {
        this.f39092a.clear();
    }

    public G(f fVar) {
        this.f39092a = new SparseIntArray();
        AbstractC3207p.k(fVar);
        this.f39093b = fVar;
    }
}
