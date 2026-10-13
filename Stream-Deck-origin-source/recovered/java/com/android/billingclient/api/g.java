package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2027j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p138p3.n0;
import p138p3.o0;
import p138p3.p0;
import p138p3.q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2027j f17454a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC2027j f17455a;

        public /* synthetic */ a(n0 n0Var) {
        }

        public g a() {
            return new g(this, null);
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f17455a = AbstractC2027j.F(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17457b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f17458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f17459b;

            public /* synthetic */ a(o0 o0Var) {
            }

            public b a() {
                if ("first_party".equals(this.f17459b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f17458a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f17459b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f17458a = str;
                return this;
            }

            public a c(String str) {
                this.f17459b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, p0 p0Var) {
            this.f17456a = aVar.f17458a;
            this.f17457b = aVar.f17459b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f17456a;
        }

        public final String c() {
            return this.f17457b;
        }
    }

    public /* synthetic */ g(a aVar, q0 q0Var) {
        this.f17454a = aVar.f17455a;
    }

    public static a a() {
        return new a(null);
    }

    public final AbstractC2027j b() {
        return this.f17454a;
    }

    public final String c() {
        return ((b) this.f17454a.get(0)).c();
    }
}
