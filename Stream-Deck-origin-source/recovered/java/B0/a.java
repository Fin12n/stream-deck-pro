package B0;

import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3145c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f889c;

    public a() {
        this(0, 1, null);
    }

    public final void a() {
        this.f889c = 0;
        C0933m.w(this.f887a, null, 0, 0, 6, null);
        C0933m.w(this.f888b, null, 0, 0, 6, null);
    }

    public final boolean b(Object obj) {
        return c(obj) >= 0;
    }

    public final int c(Object obj) {
        int iC = AbstractC3145c.c(obj);
        int i8 = this.f889c - 1;
        Object[] objArr = this.f887a;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            Object obj2 = objArr[i10];
            int iC2 = AbstractC3145c.c(obj2);
            if (iC2 < iC) {
                i9 = i10 + 1;
            } else {
                if (iC2 <= iC) {
                    return obj == obj2 ? i10 : d(i10, obj, iC);
                }
                i8 = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public final int d(int i8, Object obj, int i9) {
        Object obj2;
        Object[] objArr = this.f887a;
        int i10 = this.f889c;
        for (int i11 = i8 - 1; -1 < i11; i11--) {
            Object obj3 = objArr[i11];
            if (obj3 == obj) {
                return i11;
            }
            if (AbstractC3145c.c(obj3) != i9) {
                break;
            }
        }
        do {
            i8++;
            if (i8 >= i10) {
                return -(i10 + 1);
            }
            obj2 = objArr[i8];
            if (obj2 == obj) {
                return i8;
            }
        } while (AbstractC3145c.c(obj2) == i9);
        return -(i8 + 1);
    }

    public final Object e(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f888b[iC];
        }
        return null;
    }

    public final Object[] f() {
        return this.f887a;
    }

    public final int g() {
        return this.f889c;
    }

    public final Object[] h() {
        return this.f888b;
    }

    public final boolean i() {
        return this.f889c > 0;
    }

    public final void j(Object obj, Object obj2) {
        Object[] objArr = this.f887a;
        Object[] objArr2 = this.f888b;
        int i8 = this.f889c;
        int iC = c(obj);
        if (iC >= 0) {
            objArr2[iC] = obj2;
            return;
        }
        int i9 = -(iC + 1);
        boolean z8 = i8 == objArr.length;
        Object[] objArr3 = z8 ? new Object[i8 * 2] : objArr;
        int i10 = i9 + 1;
        C0933m.i(objArr, objArr3, i10, i9, i8);
        if (z8) {
            C0933m.m(objArr, objArr3, 0, 0, i9, 6, null);
        }
        objArr3[i9] = obj;
        this.f887a = objArr3;
        Object[] objArr4 = z8 ? new Object[i8 * 2] : objArr2;
        C0933m.i(objArr2, objArr4, i10, i9, i8);
        if (z8) {
            C0933m.m(objArr2, objArr4, 0, 0, i9, 6, null);
            i9 = i9;
        }
        objArr4[i9] = obj2;
        this.f888b = objArr4;
        this.f889c++;
    }

    public a(int i8) {
        this.f887a = new Object[i8];
        this.f888b = new Object[i8];
    }

    public /* synthetic */ a(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 16 : i8);
    }
}
