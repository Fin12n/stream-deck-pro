package p068h4;

import android.content.Context;
import p147q4.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f24439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24440d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f24437a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f24438b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f24439c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f24440d = str;
    }

    @Override // p068h4.h
    public Context b() {
        return this.f24437a;
    }

    @Override // p068h4.h
    public String c() {
        return this.f24440d;
    }

    @Override // p068h4.h
    public a d() {
        return this.f24439c;
    }

    @Override // p068h4.h
    public a e() {
        return this.f24438b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f24437a.equals(hVar.b()) && this.f24438b.equals(hVar.e()) && this.f24439c.equals(hVar.d()) && this.f24440d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f24437a.hashCode() ^ 1000003) * 1000003) ^ this.f24438b.hashCode()) * 1000003) ^ this.f24439c.hashCode()) * 1000003) ^ this.f24440d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f24437a + ", wallClock=" + this.f24438b + ", monotonicClock=" + this.f24439c + ", backendName=" + this.f24440d + "}";
    }
}
