package B0;

import kotlin.jvm.internal.t;
import p010b0.u;
import p010b0.v;
import p010b0.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f906a = z.b();

    public final void a(Object obj, Object obj2) {
        u uVar = this.f906a;
        int iJ = uVar.j(obj);
        boolean z8 = iJ < 0;
        Object obj3 = z8 ? null : uVar.f15648c[iJ];
        if (obj3 != null) {
            if (obj3 instanceof v) {
                t.e(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((v) obj3).g(obj2);
            } else if (obj3 != obj2) {
                v vVar = new v(0, 1, null);
                t.e(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                vVar.g(obj3);
                vVar.g(obj2);
                obj2 = vVar;
            }
            obj2 = obj3;
        }
        if (!z8) {
            uVar.f15648c[iJ] = obj2;
            return;
        }
        int i8 = ~iJ;
        uVar.f15647b[i8] = obj;
        uVar.f15648c[i8] = obj2;
    }

    public final void b() {
        this.f906a.h();
    }

    public final boolean c(Object obj) {
        return this.f906a.a(obj);
    }

    public final u d() {
        return this.f906a;
    }

    public final boolean e(Object obj, Object obj2) {
        Object objB = this.f906a.b(obj);
        if (objB == null) {
            return false;
        }
        if (!(objB instanceof v)) {
            if (!t.c(objB, obj2)) {
                return false;
            }
            this.f906a.n(obj);
            return true;
        }
        v vVar = (v) objB;
        boolean zP = vVar.p(obj2);
        if (zP && vVar.d()) {
            this.f906a.n(obj);
        }
        return zP;
    }

    public final void f(Object obj) {
        long[] jArr;
        long[] jArr2;
        long j8;
        char c8;
        long j9;
        int i8;
        boolean zD;
        v vVar;
        long[] jArr3;
        int i9;
        v vVar2;
        u uVarD = d();
        long[] jArr4 = uVarD.f15646a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr4[i10];
            char c9 = 7;
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j10 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        c8 = c9;
                        Object obj2 = uVarD.f15647b[i14];
                        Object obj3 = uVarD.f15648c[i14];
                        j9 = j11;
                        if (obj3 instanceof v) {
                            t.e(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            v vVar3 = (v) obj3;
                            Object[] objArr = vVar3.f15564b;
                            long[] jArr5 = vVar3.f15563a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i15 = i11;
                                v vVar4 = vVar3;
                                int i16 = 0;
                                while (true) {
                                    long j12 = jArr5[i16];
                                    j8 = j10;
                                    if ((((~j12) << c8) & j12 & j9) != j9) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j12 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i19 = (i16 << 3) + i18;
                                                i9 = i18;
                                                if (objArr[i19] == obj) {
                                                    vVar2 = vVar4;
                                                    vVar2.q(i19);
                                                }
                                                j12 >>= i15;
                                                vVar4 = vVar2;
                                                i18 = i9 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i9 = i18;
                                            }
                                            vVar2 = vVar4;
                                            j12 >>= i15;
                                            vVar4 = vVar2;
                                            i18 = i9 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        vVar = vVar4;
                                        if (i17 != i15) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        vVar = vVar4;
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16++;
                                    vVar4 = vVar;
                                    j10 = j8;
                                    jArr4 = jArr2;
                                    i15 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j8 = j10;
                                vVar = vVar3;
                            }
                            zD = vVar.d();
                        } else {
                            jArr2 = jArr4;
                            j8 = j10;
                            t.e(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            uVarD.o(i14);
                        }
                        i8 = 8;
                    } else {
                        jArr2 = jArr4;
                        j8 = j10;
                        c8 = c9;
                        j9 = j11;
                        i8 = i11;
                    }
                    j10 = j8 >> i8;
                    i13++;
                    i11 = i8;
                    c9 = c8;
                    j11 = j9;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i12 != i11) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            jArr4 = jArr;
        }
    }
}
