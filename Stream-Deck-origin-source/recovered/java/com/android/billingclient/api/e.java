package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17409b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17411b;

        public a() {
        }

        public e a() {
            if (!this.f17410a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new e(true, this.f17411b);
        }

        public a b() {
            this.f17410a = true;
            return this;
        }

        public a c() {
            this.f17411b = true;
            return this;
        }
    }

    public e(boolean z8, boolean z9) {
        this.f17408a = z8;
        this.f17409b = z9;
    }

    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.f17408a;
    }

    public boolean b() {
        return this.f17409b;
    }
}
