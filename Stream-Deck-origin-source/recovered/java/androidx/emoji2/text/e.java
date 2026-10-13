package androidx.emoji2.text;

import D6.iIQ.BmWxZhjGfw;
import L1.p;
import P1.k;
import Q1.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.emoji2.text.c.AbstractC0371c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f15160k = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, Q1.e eVar) {
            return g.b(context, null, eVar);
        }

        public void c(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements androidx.emoji2.text.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Q1.e f15162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f15164d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f15165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f15166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f15167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f15168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.emoji2.text.c.i f15169i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ContentObserver f15170j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Runnable f15171k;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z8, Uri uri) {
                b.this.d();
            }
        }

        public b(Context context, Q1.e eVar, a aVar) {
            T1.f.h(context, "Context cannot be null");
            T1.f.h(eVar, "FontRequest cannot be null");
            this.f15161a = context.getApplicationContext();
            this.f15162b = eVar;
            this.f15163c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(androidx.emoji2.text.c.i iVar) {
            T1.f.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f15164d) {
                this.f15169i = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f15164d) {
                try {
                    this.f15169i = null;
                    ContentObserver contentObserver = this.f15170j;
                    if (contentObserver != null) {
                        this.f15163c.d(this.f15161a, contentObserver);
                        this.f15170j = null;
                    }
                    Handler handler = this.f15165e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f15171k);
                    }
                    this.f15165e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f15167g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f15166f = null;
                    this.f15167g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d() {
            synchronized (this.f15164d) {
                try {
                    if (this.f15169i == null) {
                        return;
                    }
                    if (this.f15166f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = p066h2.b.b("emojiCompat");
                        this.f15167g = threadPoolExecutorB;
                        this.f15166f = threadPoolExecutorB;
                    }
                    this.f15166f.execute(new Runnable() { // from class: h2.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24396a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g.b e() {
            try {
                g.a aVarB = this.f15163c.b(this.f15161a, this.f15162b);
                if (aVarB.c() == 0) {
                    g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e8) {
                throw new RuntimeException("provider not found", e8);
            }
        }

        public final void f(Uri uri, long j8) {
            synchronized (this.f15164d) {
                try {
                    Handler handlerC = this.f15165e;
                    if (handlerC == null) {
                        handlerC = p066h2.b.c();
                        this.f15165e = handlerC;
                    }
                    if (this.f15170j == null) {
                        a aVar = new a(handlerC);
                        this.f15170j = aVar;
                        this.f15163c.c(this.f15161a, uri, aVar);
                    }
                    if (this.f15171k == null) {
                        this.f15171k = new Runnable() { // from class: h2.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f24397a.d();
                            }
                        };
                    }
                    handlerC.postDelayed(this.f15171k, j8);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(Executor executor) {
            synchronized (this.f15164d) {
                this.f15166f = executor;
            }
        }

        public void c() {
            synchronized (this.f15164d) {
                try {
                    if (this.f15169i == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f15164d) {
                                try {
                                    c cVar = this.f15168h;
                                    if (cVar != null) {
                                        long jA = cVar.a();
                                        if (jA >= 0) {
                                            f(bVarE.d(), jA);
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException(GIGvBf.vSv + iB + BmWxZhjGfw.sOSAFVulShM);
                        }
                        try {
                            k.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f15163c.a(this.f15161a, bVarE);
                            ByteBuffer byteBufferE = p.e(this.f15161a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferE);
                            k.b();
                            synchronized (this.f15164d) {
                                try {
                                    androidx.emoji2.text.c.i iVar = this.f15169i;
                                    if (iVar != null) {
                                        iVar.b(fVarB);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            b();
                        } catch (Throwable th3) {
                            k.b();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (this.f15164d) {
                            try {
                                androidx.emoji2.text.c.i iVar2 = this.f15169i;
                                if (iVar2 != null) {
                                    iVar2.a(th4);
                                }
                                b();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {
        public abstract long a();
    }

    public e(Context context, Q1.e eVar) {
        super(new b(context, eVar, f15160k));
    }

    public e c(Executor executor) {
        ((b) a()).g(executor);
        return this;
    }

    public e(Context context, Q1.e eVar, a aVar) {
        super(new b(context, eVar, aVar));
    }
}
