package io.ktor.websocket;

import D6.C0934n;
import D6.I;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum i {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    f25685j(true, 10);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25678c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f25679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i[] f25680e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25688b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final i a(int i8) {
            if (i8 < 0 || i8 > i.f25679d) {
                return null;
            }
            return i.f25680e[i8];
        }

        public a() {
        }
    }

    i(boolean z8, int i8) {
        this.f25687a = z8;
        this.f25688b = i8;
    }

    public final boolean d() {
        return this.f25687a;
    }

    public final int e() {
        return this.f25688b;
    }

    static {
        i iVar;
        i[] iVarArrValues = values();
        if (iVarArrValues.length == 0) {
            iVar = null;
        } else {
            iVar = iVarArrValues[0];
            int iT = C0934n.T(iVarArrValues);
            if (iT != 0) {
                int i8 = iVar.f25688b;
                I it = new W6.i(1, iT).iterator();
                while (it.hasNext()) {
                    i iVar2 = iVarArrValues[it.nextInt()];
                    int i9 = iVar2.f25688b;
                    if (i8 < i9) {
                        iVar = iVar2;
                        i8 = i9;
                    }
                }
            }
        }
        kotlin.jvm.internal.t.d(iVar);
        int i10 = iVar.f25688b;
        f25679d = i10;
        int i11 = i10 + 1;
        i[] iVarArr = new i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            i[] iVarArrValues2 = values();
            int length = iVarArrValues2.length;
            i iVar3 = null;
            int i13 = 0;
            boolean z8 = false;
            while (true) {
                if (i13 >= length) {
                    if (z8) {
                        break;
                    }
                } else {
                    i iVar4 = iVarArrValues2[i13];
                    if (iVar4.f25688b == i12) {
                        if (!z8) {
                            z8 = true;
                            iVar3 = iVar4;
                        }
                    }
                    i13++;
                }
                iVar3 = null;
                break;
            }
            iVarArr[i12] = iVar3;
        }
        f25680e = iVarArr;
    }
}
