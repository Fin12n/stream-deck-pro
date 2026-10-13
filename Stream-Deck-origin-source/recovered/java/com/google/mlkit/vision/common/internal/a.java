package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p087j5.b;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19043a = new HashMap();

    /* JADX INFO: renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0425a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f19044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f19045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19046c;

        public <DetectorT, OptionsT> C0425a(Class<? extends OptionsT> cls, b bVar, int i8) {
            this.f19044a = cls;
            this.f19045b = bVar;
            this.f19046c = i8;
        }

        public final int a() {
            return this.f19046c;
        }

        public final b b() {
            return this.f19045b;
        }

        public final Class c() {
            return this.f19044a;
        }

        public <DetectorT, OptionsT> C0425a(Class<? extends OptionsT> cls, b bVar) {
            this(cls, bVar, 100);
        }
    }

    public a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0425a c0425a = (C0425a) it.next();
            Class clsC = c0425a.c();
            if (!this.f19043a.containsKey(clsC) || c0425a.a() >= ((Integer) AbstractC3207p.k((Integer) map.get(clsC))).intValue()) {
                this.f19043a.put(clsC, c0425a.b());
                map.put(clsC, Integer.valueOf(c0425a.a()));
            }
        }
    }
}
