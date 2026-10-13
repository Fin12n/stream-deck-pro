package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.B;
import p138p3.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17405b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17407b = "";

        public /* synthetic */ a(X x8) {
        }

        public d a() {
            d dVar = new d();
            dVar.f17404a = this.f17406a;
            dVar.f17405b = this.f17407b;
            return dVar;
        }

        public a b(String str) {
            this.f17407b = str;
            return this;
        }

        public a c(int i8) {
            this.f17406a = i8;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f17405b;
    }

    public int b() {
        return this.f17404a;
    }

    public String toString() {
        return "Response Code: " + B.g(this.f17404a) + ", Debug Message: " + this.f17405b;
    }
}
