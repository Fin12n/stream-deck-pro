package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.n;
import p067h3.b;
import p067h3.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f24661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f24662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f24663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f24664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f24665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f24666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f24667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24668k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24672a;

        a(int i8) {
            this.f24672a = i8;
        }

        public static a b(int i8) {
            for (a aVar : values()) {
                if (aVar.f24672a == i8) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, b bVar, m mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z8, boolean z9) {
        this.f24658a = str;
        this.f24659b = aVar;
        this.f24660c = bVar;
        this.f24661d = mVar;
        this.f24662e = bVar2;
        this.f24663f = bVar3;
        this.f24664g = bVar4;
        this.f24665h = bVar5;
        this.f24666i = bVar6;
        this.f24667j = z8;
        this.f24668k = z9;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new n(j8, bVar, this);
    }

    public b b() {
        return this.f24663f;
    }

    public b c() {
        return this.f24665h;
    }

    public String d() {
        return this.f24658a;
    }

    public b e() {
        return this.f24664g;
    }

    public b f() {
        return this.f24666i;
    }

    public b g() {
        return this.f24660c;
    }

    public m h() {
        return this.f24661d;
    }

    public b i() {
        return this.f24662e;
    }

    public a j() {
        return this.f24659b;
    }

    public boolean k() {
        return this.f24667j;
    }

    public boolean l() {
        return this.f24668k;
    }
}
