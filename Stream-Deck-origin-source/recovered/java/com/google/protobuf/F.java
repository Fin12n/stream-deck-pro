package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2106q f19128e = C2106q.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2097h f19129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2106q f19130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile T f19131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AbstractC2097h f19132d;

    public F(C2106q c2106q, AbstractC2097h abstractC2097h) {
        a(c2106q, abstractC2097h);
        this.f19130b = c2106q;
        this.f19129a = abstractC2097h;
    }

    public static void a(C2106q c2106q, AbstractC2097h abstractC2097h) {
        if (c2106q == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC2097h == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public void b(T t8) {
        if (this.f19131c != null) {
            return;
        }
        synchronized (this) {
            if (this.f19131c != null) {
                return;
            }
            try {
                if (this.f19129a != null) {
                    this.f19131c = (T) t8.getParserForType().a(this.f19129a, this.f19130b);
                    this.f19132d = this.f19129a;
                } else {
                    this.f19131c = t8;
                    this.f19132d = AbstractC2097h.f19285b;
                }
            } catch (B unused) {
                this.f19131c = t8;
                this.f19132d = AbstractC2097h.f19285b;
            }
        }
    }

    public int c() {
        if (this.f19132d != null) {
            return this.f19132d.size();
        }
        AbstractC2097h abstractC2097h = this.f19129a;
        if (abstractC2097h != null) {
            return abstractC2097h.size();
        }
        if (this.f19131c != null) {
            return this.f19131c.getSerializedSize();
        }
        return 0;
    }

    public T d(T t8) {
        b(t8);
        return this.f19131c;
    }

    public T e(T t8) {
        T t9 = this.f19131c;
        this.f19129a = null;
        this.f19132d = null;
        this.f19131c = t8;
        return t9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        T t8 = this.f19131c;
        T t9 = f8.f19131c;
        if (t8 == null && t9 == null) {
            return f().equals(f8.f());
        }
        if (t8 == null || t9 == null) {
            return t8 != null ? t8.equals(f8.d(t8.getDefaultInstanceForType())) : d(t9.getDefaultInstanceForType()).equals(t9);
        }
        return t8.equals(t9);
    }

    public AbstractC2097h f() {
        if (this.f19132d != null) {
            return this.f19132d;
        }
        AbstractC2097h abstractC2097h = this.f19129a;
        if (abstractC2097h != null) {
            return abstractC2097h;
        }
        synchronized (this) {
            try {
                if (this.f19132d != null) {
                    return this.f19132d;
                }
                if (this.f19131c == null) {
                    this.f19132d = AbstractC2097h.f19285b;
                } else {
                    this.f19132d = this.f19131c.toByteString();
                }
                return this.f19132d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int hashCode() {
        return 1;
    }

    public F() {
    }
}
