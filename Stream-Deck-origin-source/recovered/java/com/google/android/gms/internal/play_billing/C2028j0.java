package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2028j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2028j0 f18916d = new C2028j0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2067t1 f18917a = new C2029j1(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18919c;

    public C2028j0() {
    }

    public static int a(M1 m8, int i8, Object obj) {
        AbstractC1992a0.w(i8 << 3);
        if (M1.f18786k == null) {
            Charset charset = AbstractC2081y0.f19031a;
            if (((V0) obj) instanceof A) {
                throw null;
            }
        }
        N1 n8 = N1.INT;
        throw null;
    }

    public static int b(InterfaceC2024i0 interfaceC2024i0, Object obj) {
        M1 m1K = interfaceC2024i0.k();
        int iZza = interfaceC2024i0.zza();
        if (!interfaceC2024i0.o()) {
            return a(m1K, iZza, obj);
        }
        List list = (List) obj;
        int iA = 0;
        if (!interfaceC2024i0.l()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA += a(m1K, iZza, it.next());
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return AbstractC1992a0.w(iZza << 3) + AbstractC1992a0.w(0);
        }
        it2.next();
        M1 m8 = M1.f18777b;
        N1 n8 = N1.INT;
        throw null;
    }

    public static C2028j0 d() {
        return f18916d;
    }

    public static boolean k(Map.Entry entry) {
        p063h.s.a(entry.getKey());
        throw null;
    }

    public static final int l(Map.Entry entry) {
        p063h.s.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    public static final void m(InterfaceC2024i0 interfaceC2024i0, Object obj) {
        boolean z8;
        interfaceC2024i0.k();
        Charset charset = AbstractC2081y0.f19031a;
        obj.getClass();
        M1 m8 = M1.f18777b;
        N1 n8 = N1.INT;
        switch (r0.a()) {
            case INT:
                z8 = obj instanceof Integer;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case LONG:
                z8 = obj instanceof Long;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case FLOAT:
                z8 = obj instanceof Float;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case DOUBLE:
                z8 = obj instanceof Double;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case BOOLEAN:
                z8 = obj instanceof Boolean;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case STRING:
                z8 = obj instanceof String;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof S) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC2063s0)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            case MESSAGE:
                if (obj instanceof V0) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2024i0.zza()), interfaceC2024i0.k().a(), obj.getClass().getName()));
        }
    }

    public final int c() {
        int iL = 0;
        for (int i8 = 0; i8 < this.f18917a.b(); i8++) {
            iL += l(this.f18917a.g(i8));
        }
        Iterator it = this.f18917a.c().iterator();
        while (it.hasNext()) {
            iL += l((Map.Entry) it.next());
        }
        return iL;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2028j0 c2028j0 = new C2028j0();
        for (int i8 = 0; i8 < this.f18917a.b(); i8++) {
            Map.Entry entryG = this.f18917a.g(i8);
            p063h.s.a(entryG.getKey());
            c2028j0.h(null, entryG.getValue());
        }
        for (Map.Entry entry : this.f18917a.c()) {
            p063h.s.a(entry.getKey());
            c2028j0.h(null, entry.getValue());
        }
        c2028j0.f18919c = this.f18919c;
        return c2028j0;
    }

    public final Iterator e() {
        return this.f18919c ? new C0(this.f18917a.entrySet().iterator()) : this.f18917a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2028j0) {
            return this.f18917a.equals(((C2028j0) obj).f18917a);
        }
        return false;
    }

    public final void f() {
        if (this.f18918b) {
            return;
        }
        for (int i8 = 0; i8 < this.f18917a.b(); i8++) {
            Map.Entry entryG = this.f18917a.g(i8);
            if (entryG.getValue() instanceof AbstractC2056q0) {
                ((AbstractC2056q0) entryG.getValue()).s();
            }
        }
        this.f18917a.a();
        this.f18918b = true;
    }

    public final void g(C2028j0 c2028j0) {
        for (int i8 = 0; i8 < c2028j0.f18917a.b(); i8++) {
            j(c2028j0.f18917a.g(i8));
        }
        Iterator it = c2028j0.f18917a.c().iterator();
        while (it.hasNext()) {
            j((Map.Entry) it.next());
        }
    }

    public final void h(InterfaceC2024i0 interfaceC2024i0, Object obj) {
        if (!interfaceC2024i0.o()) {
            m(interfaceC2024i0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                m(interfaceC2024i0, arrayList.get(i8));
            }
            obj = arrayList;
        }
        this.f18917a.put(interfaceC2024i0, obj);
    }

    public final int hashCode() {
        return this.f18917a.hashCode();
    }

    public final boolean i() {
        for (int i8 = 0; i8 < this.f18917a.b(); i8++) {
            if (!k(this.f18917a.g(i8))) {
                return false;
            }
        }
        Iterator it = this.f18917a.c().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void j(Map.Entry entry) {
        p063h.s.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public C2028j0(boolean z8) {
        f();
        f();
    }
}
