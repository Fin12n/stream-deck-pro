package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p010b0.C1749b;
import p066h2.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f15107o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f15108p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f15109q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f15111b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f15114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f15115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f15116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f15119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f15123n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f15110a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f15112c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f15113d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.d f15124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f15125c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0370a extends i {
            public C0370a() {
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                a.this.f15127a.p(th);
            }

            @Override // androidx.emoji2.text.c.i
            public void b(androidx.emoji2.text.f fVar) {
                a.this.f(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public int a(CharSequence charSequence, int i8) {
            return this.f15124b.b(charSequence, i8);
        }

        @Override // androidx.emoji2.text.c.b
        public int b(CharSequence charSequence, int i8) {
            return this.f15124b.c(charSequence, i8);
        }

        @Override // androidx.emoji2.text.c.b
        public void c() {
            try {
                this.f15127a.f15115f.a(new C0370a());
            } catch (Throwable th) {
                this.f15127a.p(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence d(CharSequence charSequence, int i8, int i9, int i10, boolean z8) {
            return this.f15124b.j(charSequence, i8, i9, i10, z8);
        }

        @Override // androidx.emoji2.text.c.b
        public void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f15125c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f15127a.f15117h);
        }

        public void f(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f15127a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f15125c = fVar;
            androidx.emoji2.text.f fVar2 = this.f15125c;
            j jVar = this.f15127a.f15116g;
            e eVar = this.f15127a.f15123n;
            c cVar = this.f15127a;
            this.f15124b = new androidx.emoji2.text.d(fVar2, jVar, eVar, cVar.f15118i, cVar.f15119j, p066h2.d.a());
            this.f15127a.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f15127a;

        public b(c cVar) {
            this.f15127a = cVar;
        }

        public abstract int a(CharSequence charSequence, int i8);

        public abstract int b(CharSequence charSequence, int i8);

        public abstract void c();

        public abstract CharSequence d(CharSequence charSequence, int i8, int i9, int i10, boolean z8);

        public abstract void e(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0371c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f15128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f15129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f15132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set f15133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15135h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15136i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e f15137j = new androidx.emoji2.text.b();

        public AbstractC0371c(h hVar) {
            T1.f.h(hVar, "metadataLoader cannot be null.");
            this.f15128a = hVar;
        }

        public final h a() {
            return this.f15128a;
        }

        public AbstractC0371c b(int i8) {
            this.f15136i = i8;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements j {
        @Override // androidx.emoji2.text.c.j
        public p066h2.e a(p066h2.j jVar) {
            return new k(jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        boolean a(CharSequence charSequence, int i8, int i9, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f15139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15140c;

        public g(f fVar, int i8) {
            this(Arrays.asList((f) T1.f.h(fVar, "initCallback cannot be null")), i8, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f15138a.size();
            int i8 = 0;
            if (this.f15140c != 1) {
                while (i8 < size) {
                    ((f) this.f15138a.get(i8)).a(this.f15139b);
                    i8++;
                }
            } else {
                while (i8 < size) {
                    ((f) this.f15138a.get(i8)).b();
                    i8++;
                }
            }
        }

        public g(Collection collection, int i8) {
            this(collection, i8, null);
        }

        public g(Collection collection, int i8, Throwable th) {
            T1.f.h(collection, "initCallbacks cannot be null");
            this.f15138a = new ArrayList(collection);
            this.f15140c = i8;
            this.f15139b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface j {
        p066h2.e a(p066h2.j jVar);
    }

    public c(AbstractC0371c abstractC0371c) {
        this.f15117h = abstractC0371c.f15130c;
        this.f15118i = abstractC0371c.f15131d;
        this.f15119j = abstractC0371c.f15132e;
        this.f15120k = abstractC0371c.f15134g;
        this.f15121l = abstractC0371c.f15135h;
        this.f15115f = abstractC0371c.f15128a;
        this.f15122m = abstractC0371c.f15136i;
        this.f15123n = abstractC0371c.f15137j;
        C1749b c1749b = new C1749b();
        this.f15111b = c1749b;
        j jVar = abstractC0371c.f15129b;
        this.f15116g = jVar == null ? new d() : jVar;
        Set set = abstractC0371c.f15133f;
        if (set != null && !set.isEmpty()) {
            c1749b.addAll(abstractC0371c.f15133f);
        }
        this.f15114e = new a(this);
        o();
    }

    public static c c() {
        c cVar;
        synchronized (f15107o) {
            cVar = f15109q;
            T1.f.j(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z8) {
        return androidx.emoji2.text.d.d(inputConnection, editable, i8, i9, z8);
    }

    public static boolean i(Editable editable, int i8, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.e(editable, i8, keyEvent);
    }

    public static c j(AbstractC0371c abstractC0371c) {
        c cVar;
        c cVar2 = f15109q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f15107o) {
            try {
                cVar = f15109q;
                if (cVar == null) {
                    cVar = new c(abstractC0371c);
                    f15109q = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean k() {
        return f15109q != null;
    }

    public int d(CharSequence charSequence, int i8) {
        return this.f15114e.a(charSequence, i8);
    }

    public int e() {
        return this.f15121l;
    }

    public int f(CharSequence charSequence, int i8) {
        return this.f15114e.b(charSequence, i8);
    }

    public int g() {
        this.f15110a.readLock().lock();
        try {
            return this.f15112c;
        } finally {
            this.f15110a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f15120k;
    }

    public final boolean m() {
        return g() == 1;
    }

    public void n() {
        T1.f.j(this.f15122m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f15110a.writeLock().lock();
        try {
            if (this.f15112c == 0) {
                this.f15110a.writeLock().unlock();
                return;
            }
            this.f15112c = 0;
            this.f15110a.writeLock().unlock();
            this.f15114e.c();
        } catch (Throwable th) {
            this.f15110a.writeLock().unlock();
            throw th;
        }
    }

    public final void o() {
        this.f15110a.writeLock().lock();
        try {
            if (this.f15122m == 0) {
                this.f15112c = 0;
            }
            this.f15110a.writeLock().unlock();
            if (g() == 0) {
                this.f15114e.c();
            }
        } catch (Throwable th) {
            this.f15110a.writeLock().unlock();
            throw th;
        }
    }

    public void p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f15110a.writeLock().lock();
        try {
            this.f15112c = 2;
            arrayList.addAll(this.f15111b);
            this.f15111b.clear();
            this.f15110a.writeLock().unlock();
            this.f15113d.post(new g(arrayList, this.f15112c, th));
        } catch (Throwable th2) {
            this.f15110a.writeLock().unlock();
            throw th2;
        }
    }

    public void q() {
        ArrayList arrayList = new ArrayList();
        this.f15110a.writeLock().lock();
        try {
            this.f15112c = 1;
            arrayList.addAll(this.f15111b);
            this.f15111b.clear();
            this.f15110a.writeLock().unlock();
            this.f15113d.post(new g(arrayList, this.f15112c));
        } catch (Throwable th) {
            this.f15110a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i8, int i9) {
        return t(charSequence, i8, i9, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i8, int i9, int i10) {
        return u(charSequence, i8, i9, i10, 0);
    }

    public CharSequence u(CharSequence charSequence, int i8, int i9, int i10, int i11) {
        boolean z8;
        T1.f.j(m(), "Not initialized yet");
        T1.f.e(i8, "start cannot be negative");
        T1.f.e(i9, "end cannot be negative");
        T1.f.e(i10, "maxEmojiCount cannot be negative");
        T1.f.b(i8 <= i9, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        T1.f.b(i8 <= charSequence.length(), "start should be < than charSequence length");
        T1.f.b(i9 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i8 == i9) {
            return charSequence;
        }
        if (i11 != 1) {
            z8 = i11 != 2 ? this.f15117h : false;
        } else {
            z8 = true;
        }
        return this.f15114e.d(charSequence, i8, i9, i10, z8);
    }

    public void v(f fVar) {
        T1.f.h(fVar, "initCallback cannot be null");
        this.f15110a.writeLock().lock();
        try {
            if (this.f15112c == 1 || this.f15112c == 2) {
                this.f15113d.post(new g(fVar, this.f15112c));
            } else {
                this.f15111b.add(fVar);
            }
        } finally {
            this.f15110a.writeLock().unlock();
        }
    }

    public void w(f fVar) {
        T1.f.h(fVar, "initCallback cannot be null");
        this.f15110a.writeLock().lock();
        try {
            this.f15111b.remove(fVar);
        } finally {
            this.f15110a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f15114e.e(editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
