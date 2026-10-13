package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.u;
import p067h3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f24724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f24725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24726f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i8) {
            if (i8 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i8 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i8);
        }
    }

    public t(String str, a aVar, b bVar, b bVar2, b bVar3, boolean z8) {
        this.f24721a = str;
        this.f24722b = aVar;
        this.f24723c = bVar;
        this.f24724d = bVar2;
        this.f24725e = bVar3;
        this.f24726f = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new u(bVar, this);
    }

    public b b() {
        return this.f24724d;
    }

    public String c() {
        return this.f24721a;
    }

    public b d() {
        return this.f24725e;
    }

    public b e() {
        return this.f24723c;
    }

    public a f() {
        return this.f24722b;
    }

    public boolean g() {
        return this.f24726f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f24723c + ", end: " + this.f24724d + ", offset: " + this.f24725e + "}";
    }
}
