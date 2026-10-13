package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class O implements N {
    public static int i(int i8, Object obj, Object obj2) {
        M m8 = (M) obj;
        L l8 = (L) obj2;
        int iA = 0;
        if (m8.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m8.entrySet()) {
            iA += l8.a(i8, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static M j(Object obj, Object obj2) {
        M mN = (M) obj;
        M m8 = (M) obj2;
        if (!m8.isEmpty()) {
            if (!mN.i()) {
                mN = mN.n();
            }
            mN.l(m8);
        }
        return mN;
    }

    @Override // com.google.protobuf.N
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.N
    public Object b(Object obj) {
        ((M) obj).k();
        return obj;
    }

    @Override // com.google.protobuf.N
    public L.a c(Object obj) {
        return ((L) obj).c();
    }

    @Override // com.google.protobuf.N
    public Map d(Object obj) {
        return (M) obj;
    }

    @Override // com.google.protobuf.N
    public Object e(Object obj) {
        return M.e().n();
    }

    @Override // com.google.protobuf.N
    public int f(int i8, Object obj, Object obj2) {
        return i(i8, obj, obj2);
    }

    @Override // com.google.protobuf.N
    public boolean g(Object obj) {
        return !((M) obj).i();
    }

    @Override // com.google.protobuf.N
    public Map h(Object obj) {
        return (M) obj;
    }
}
