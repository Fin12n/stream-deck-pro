package io.ktor.websocket;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25737a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean[] f25738b;

    public u() {
        Boolean bool = Boolean.FALSE;
        this.f25738b = new Boolean[]{bool, bool, bool};
    }

    public final List a() {
        List list = this.f25737a;
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p063h.s.a(((Function0) it.next()).invoke());
            arrayList.add(null);
        }
        return arrayList;
    }
}
