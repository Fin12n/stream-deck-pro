package androidx.emoji2.text;

import P1.k;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p066h2.h;
import p066h2.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p075i2.b f15173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f15174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15175c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f15176d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f15177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f15178b;

        public a() {
            this(1);
        }

        public a a(int i8) {
            SparseArray sparseArray = this.f15177a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i8);
        }

        public final j b() {
            return this.f15178b;
        }

        public void c(j jVar, int i8, int i9) {
            a aVarA = a(jVar.b(i8));
            if (aVarA == null) {
                aVarA = new a();
                this.f15177a.put(jVar.b(i8), aVarA);
            }
            if (i9 > i8) {
                aVarA.c(jVar, i8 + 1, i9);
            } else {
                aVarA.f15178b = jVar;
            }
        }

        public a(int i8) {
            this.f15177a = new SparseArray(i8);
        }
    }

    public f(Typeface typeface, p075i2.b bVar) {
        this.f15176d = typeface;
        this.f15173a = bVar;
        this.f15174b = new char[bVar.k() * 2];
        a(bVar);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            k.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, h.b(byteBuffer));
        } finally {
            k.b();
        }
    }

    public final void a(p075i2.b bVar) {
        int iK = bVar.k();
        for (int i8 = 0; i8 < iK; i8++) {
            j jVar = new j(this, i8);
            Character.toChars(jVar.f(), this.f15174b, i8 * 2);
            h(jVar);
        }
    }

    public char[] c() {
        return this.f15174b;
    }

    public p075i2.b d() {
        return this.f15173a;
    }

    public int e() {
        return this.f15173a.l();
    }

    public a f() {
        return this.f15175c;
    }

    public Typeface g() {
        return this.f15176d;
    }

    public void h(j jVar) {
        T1.f.h(jVar, "emoji metadata cannot be null");
        T1.f.b(jVar.c() > 0, "invalid metadata codepoint length");
        this.f15175c.c(jVar, 0, jVar.c() - 1);
    }
}
