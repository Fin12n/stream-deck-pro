package M4;

import java.util.Arrays;

/* JADX INFO: renamed from: M4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5563a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5564b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1053g f5565c;

    public final C1054h a(Object obj, Object obj2) {
        int i8 = this.f5564b + 1;
        Object[] objArr = this.f5563a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f5563a = Arrays.copyOf(objArr, AbstractC1048b.a(length, i9));
        }
        X.a(obj, obj2);
        Object[] objArr2 = this.f5563a;
        int i10 = this.f5564b;
        int i11 = i10 + i10;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f5564b = i10 + 1;
        return this;
    }

    public final AbstractC1055i b() {
        C1053g c1053g = this.f5565c;
        if (c1053g != null) {
            throw c1053g.a();
        }
        C1063q c1063qG = C1063q.g(this.f5564b, this.f5563a, this);
        C1053g c1053g2 = this.f5565c;
        if (c1053g2 == null) {
            return c1063qG;
        }
        throw c1053g2.a();
    }
}
