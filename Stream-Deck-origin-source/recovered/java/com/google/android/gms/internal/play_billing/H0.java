package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends L0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f18772c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ H0(G0 g8) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    public final void a(Object obj, long j8) {
        Object objUnmodifiableList;
        List list = (List) G1.k(obj, j8);
        if (list instanceof F0) {
            objUnmodifiableList = ((F0) list).f();
        } else {
            if (f18772c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2001c1) && (list instanceof InterfaceC2078x0)) {
                InterfaceC2078x0 interfaceC2078x0 = (InterfaceC2078x0) list;
                if (interfaceC2078x0.j()) {
                    interfaceC2078x0.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        G1.x(obj, j8, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    public final void b(Object obj, Object obj2, long j8) {
        List list;
        List list2;
        List listB;
        List list3 = (List) G1.k(obj2, j8);
        int size = list3.size();
        List list4 = (List) G1.k(obj, j8);
        if (list4.isEmpty()) {
            if (list4 instanceof F0) {
                listB = new E0(size);
            } else {
                listB = ((list4 instanceof InterfaceC2001c1) && (list4 instanceof InterfaceC2078x0)) ? ((InterfaceC2078x0) list4).b(size) : new ArrayList(size);
            }
            G1.x(obj, j8, listB);
            list2 = listB;
        } else {
            if (f18772c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                G1.x(obj, j8, arrayList);
                list = arrayList;
            } else if (list4 instanceof B1) {
                E0 e8 = new E0(list4.size() + size);
                e8.addAll(e8.size(), (B1) list4);
                G1.x(obj, j8, e8);
                list = e8;
            } else if ((list4 instanceof InterfaceC2001c1) && (list4 instanceof InterfaceC2078x0)) {
                InterfaceC2078x0 interfaceC2078x0 = (InterfaceC2078x0) list4;
                if (!interfaceC2078x0.j()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    InterfaceC2078x0 interfaceC2078x0B = interfaceC2078x0.b(list4.size() + size);
                    G1.x(obj, j8, interfaceC2078x0B);
                    list2 = interfaceC2078x0B;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        G1.x(obj, j8, list3);
    }
}
