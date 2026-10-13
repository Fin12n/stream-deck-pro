package io.ktor.websocket;

import C6.G;
import D6.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1794k0;
import p017b7.AbstractC1816w;
import p017b7.AbstractC1823z0;
import p017b7.I;
import p017b7.InterfaceC1812u;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.L;
import p017b7.Q;
import p017b7.Z;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements io.ktor.websocket.b, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f25602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1812u f25603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p035d7.g f25604c;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p035d7.g f25605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1818x f25606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G6.g f25608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Q f25611j;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f25597k = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final io.ktor.websocket.e.C0584e f25601o = new io.ktor.websocket.e.C0584e(new byte[0], j.f25689a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25598l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "pinger");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25599m = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25600n = AtomicIntegerFieldUpdater.newUpdater(c.class, "started");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25613b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25615d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25613b = obj;
            this.f25615d |= Integer.MIN_VALUE;
            return c.this.j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.websocket.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0583c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25618c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25620e;

        public C0583c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25618c = obj;
            this.f25620e |= Integer.MIN_VALUE;
            return c.this.n(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f25626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f25627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f25628h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f25629i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f25630j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p035d7.y f25632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p035d7.y yVar, G6.d dVar) {
            super(2, dVar);
            this.f25632l = yVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = c.this.new d(this.f25632l, dVar);
            dVar2.f25630j = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x016b  */
        /* JADX WARN: Code duplicated, block: B:40:0x017e A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0045, B:38:0x0176, B:40:0x017e, B:42:0x01a8, B:44:0x01b2, B:46:0x01c0, B:47:0x01c4, B:50:0x01e2, B:63:0x022d, B:65:0x0231, B:67:0x0237, B:70:0x0252, B:72:0x0261, B:74:0x0265, B:77:0x0280, B:100:0x03a3, B:21:0x00e0, B:26:0x00fc, B:29:0x0121), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:63:0x022d A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0045, B:38:0x0176, B:40:0x017e, B:42:0x01a8, B:44:0x01b2, B:46:0x01c0, B:47:0x01c4, B:50:0x01e2, B:63:0x022d, B:65:0x0231, B:67:0x0237, B:70:0x0252, B:72:0x0261, B:74:0x0265, B:77:0x0280, B:100:0x03a3, B:21:0x00e0, B:26:0x00fc, B:29:0x0121), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0254 A[PHI: r0 r6 r7 r8 r9 r10 r11 r12
          0x0254: PHI (r0v87 d7.i) = (r0v34 d7.i), (r0v58 d7.i), (r0v61 d7.i), (r0v69 d7.i), (r0v69 d7.i), (r0v69 d7.i), (r0v89 d7.i) binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r6v37 d7.x) = (r6v10 d7.x), (r6v20 d7.x), (r6v21 d7.x), (r6v31 d7.x), (r6v31 d7.x), (r6v31 d7.x), (r6v39 d7.x) binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r7v29 d7.y) = (r7v7 d7.y), (r7v17 d7.y), (r7v18 d7.y), (r7v20 d7.y), (r7v20 d7.y), (r7v20 d7.y), (r7v31 d7.y) binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r8v20 io.ktor.websocket.c) = 
          (r8v4 io.ktor.websocket.c)
          (r8v12 io.ktor.websocket.c)
          (r8v13 io.ktor.websocket.c)
          (r8v16 io.ktor.websocket.c)
          (r8v16 io.ktor.websocket.c)
          (r8v16 io.ktor.websocket.c)
          (r8v21 io.ktor.websocket.c)
         binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r9v28 kotlin.jvm.internal.F) = 
          (r9v9 kotlin.jvm.internal.F)
          (r9v19 kotlin.jvm.internal.F)
          (r9v20 kotlin.jvm.internal.F)
          (r9v24 kotlin.jvm.internal.F)
          (r9v24 kotlin.jvm.internal.F)
          (r9v24 kotlin.jvm.internal.F)
          (r9v29 kotlin.jvm.internal.F)
         binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r10v29 kotlin.jvm.internal.J) = 
          (r10v9 kotlin.jvm.internal.J)
          (r10v20 kotlin.jvm.internal.J)
          (r10v21 kotlin.jvm.internal.J)
          (r10v25 kotlin.jvm.internal.J)
          (r10v25 kotlin.jvm.internal.J)
          (r10v25 kotlin.jvm.internal.J)
          (r10v30 kotlin.jvm.internal.J)
         binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r11v22 kotlin.jvm.internal.J) = 
          (r11v4 kotlin.jvm.internal.J)
          (r11v13 kotlin.jvm.internal.J)
          (r11v14 kotlin.jvm.internal.J)
          (r11v17 kotlin.jvm.internal.J)
          (r11v17 kotlin.jvm.internal.J)
          (r11v17 kotlin.jvm.internal.J)
          (r11v24 kotlin.jvm.internal.J)
         binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]
          0x0254: PHI (r12v21 b7.J) = (r12v4 b7.J), (r12v12 b7.J), (r12v13 b7.J), (r12v16 b7.J), (r12v16 b7.J), (r12v16 b7.J), (r12v23 b7.J) binds: [B:155:0x0254, B:157:0x0254, B:95:0x0311, B:75:0x027c, B:66:0x0235, B:70:0x0252, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:72:0x0261 A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0045, B:38:0x0176, B:40:0x017e, B:42:0x01a8, B:44:0x01b2, B:46:0x01c0, B:47:0x01c4, B:50:0x01e2, B:63:0x022d, B:65:0x0231, B:67:0x0237, B:70:0x0252, B:72:0x0261, B:74:0x0265, B:77:0x0280, B:100:0x03a3, B:21:0x00e0, B:26:0x00fc, B:29:0x0121), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0265 A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0045, B:38:0x0176, B:40:0x017e, B:42:0x01a8, B:44:0x01b2, B:46:0x01c0, B:47:0x01c4, B:50:0x01e2, B:63:0x022d, B:65:0x0231, B:67:0x0237, B:70:0x0252, B:72:0x0261, B:74:0x0265, B:77:0x0280, B:100:0x03a3, B:21:0x00e0, B:26:0x00fc, B:29:0x0121), top: B:151:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:76:0x027e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0235 -> B:71:0x0254). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x027c -> B:71:0x0254). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instruction units count: 1264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25634b;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = c.this.new e(dVar);
            eVar.f25634b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.websocket.a aVar, G6.d dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f25633a;
            if (i8 == 0) {
                C6.r.b(obj);
                io.ktor.websocket.a aVar = (io.ktor.websocket.a) this.f25634b;
                c cVar = c.this;
                IOException iOException = new IOException("Ping timeout");
                this.f25633a = 1;
                if (cVar.v(aVar, iOException, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25637b;

        public f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new f(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
        
            if (io.ktor.websocket.x.b(r11, null, r10, 1, null) == r1) goto L58;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            f fVar;
            w wVar;
            Object objF = H6.c.f();
            try {
                try {
                    try {
                        switch (this.f25637b) {
                            case 0:
                                C6.r.b(obj);
                                c cVar = c.this;
                                this.f25637b = 1;
                                if (cVar.n(this) != objF) {
                                    d7.x.a.a(c.this.f25605d, null, 1, null);
                                    w wVar2 = c.this.f25602a;
                                    this.f25637b = 2;
                                    break;
                                }
                                return objF;
                            case 1:
                                C6.r.b(obj);
                                d7.x.a.a(c.this.f25605d, null, 1, null);
                                w wVar3 = c.this.f25602a;
                                this.f25637b = 2;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                            case 7:
                            case 9:
                                C6.r.b(obj);
                                return G.f1419a;
                            case 5:
                                C6.r.b(obj);
                                fVar = this;
                                d7.x.a.a(c.this.f25605d, null, 1, null);
                                w wVar4 = c.this.f25602a;
                                fVar.f25637b = 6;
                                break;
                            case 8:
                                C6.r.b(obj);
                                d7.x.a.a(c.this.f25605d, null, 1, null);
                                w wVar5 = c.this.f25602a;
                                this.f25637b = 9;
                                break;
                            case 10:
                                Throwable th = (Throwable) this.f25636a;
                                C6.r.b(obj);
                                throw th;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = this;
                        d7.x.a.a(c.this.f25605d, null, 1, null);
                        wVar = c.this.f25602a;
                        fVar.f25636a = th;
                        fVar.f25637b = 10;
                        if (x.b(wVar, null, this, 1, null) != objF) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fVar = this;
                    d7.x.a.a(c.this.f25605d, null, 1, null);
                    wVar = c.this.f25602a;
                    fVar.f25636a = th;
                    fVar.f25637b = 10;
                    if (x.b(wVar, null, this, 1, null) != objF) {
                        throw th;
                    }
                }
            } catch (p035d7.p unused) {
                d7.x.a.a(c.this.f25605d, null, 1, null);
                w wVar6 = c.this.f25602a;
                this.f25637b = 4;
            } catch (p035d7.q unused2) {
                d7.x.a.a(c.this.f25605d, null, 1, null);
                w wVar7 = c.this.f25602a;
                this.f25637b = 3;
            } catch (CancellationException unused3) {
                c cVar2 = c.this;
                io.ktor.websocket.a aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.NORMAL, "");
                this.f25637b = 5;
                fVar = this;
                try {
                    if (c.w(cVar2, aVar, null, fVar, 2, null) != objF) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    d7.x.a.a(c.this.f25605d, null, 1, null);
                    wVar = c.this.f25602a;
                    fVar.f25636a = th;
                    fVar.f25637b = 10;
                    if (x.b(wVar, null, this, 1, null) != objF) {
                        throw th;
                    }
                }
                return objF;
            } catch (p124n6.b unused4) {
                d7.x.a.a(c.this.f25605d, null, 1, null);
                w wVar8 = c.this.f25602a;
                this.f25637b = 7;
            } catch (Throwable th5) {
                c.this.f25605d.z(AbstractC1794k0.a("Failed to send frame", th5));
                w wVar9 = c.this.f25602a;
                this.f25637b = 8;
                if (x.c(wVar9, th5, this) != objF) {
                }
                return objF;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25642d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25644f;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25642d = obj;
            this.f25644f |= Integer.MIN_VALUE;
            return c.this.v(null, null, this);
        }
    }

    public c(w raw, long j8, long j9) {
        kotlin.jvm.internal.t.g(raw, "raw");
        this.f25602a = raw;
        this.pinger = null;
        InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
        this.f25603b = interfaceC1812uB;
        this.f25604c = p035d7.j.b(8, null, null, 6, null);
        this.f25605d = p035d7.j.b(q.a(), null, null, 6, null);
        this.closed = 0;
        InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a((InterfaceC1815v0) raw.getCoroutineContext().A(InterfaceC1815v0.f15985O));
        this.f25606e = interfaceC1818xA;
        this.f25607f = new ArrayList();
        this.started = 0;
        this.f25608g = raw.getCoroutineContext().P1(interfaceC1818xA).P1(new I("ws-default"));
        this.f25609h = j8;
        this.f25610i = j9;
        this.f25611j = interfaceC1812uB;
    }

    public static /* synthetic */ Object w(c cVar, io.ktor.websocket.a aVar, Throwable th, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        return cVar.v(aVar, th, dVar);
    }

    @Override // io.ktor.websocket.w
    public p035d7.y J0() {
        return this.f25605d;
    }

    @Override // io.ktor.websocket.w
    public void M1(long j8) {
        this.f25602a.M1(j8);
    }

    @Override // io.ktor.websocket.w
    public long X1() {
        return this.f25602a.X1();
    }

    @Override // io.ktor.websocket.w
    public p035d7.x c() {
        return this.f25604c;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f25608g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(p205x6.j jVar, io.ktor.websocket.e eVar, G6.d dVar) throws h {
        b bVar;
        int i8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f25615d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f25615d = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f25613b;
        Object objF = H6.c.f();
        int i10 = bVar.f25615d;
        if (i10 == 0) {
            C6.r.b(obj);
            int length = eVar.c().length + (jVar != null ? jVar.P1() : 0);
            if (length <= X1()) {
                return G.f1419a;
            }
            if (jVar != null) {
                jVar.T0();
            }
            io.ktor.websocket.a aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.TOO_BIG, "Frame is too big: " + length + ". Max size is " + X1());
            bVar.f25612a = length;
            bVar.f25615d = 1;
            if (x.a(this, aVar, bVar) == objF) {
                return objF;
            }
            i8 = length;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = bVar.f25612a;
            C6.r.b(obj);
        }
        throw new h(i8);
    }

    public List k() {
        return this.f25607f;
    }

    public long l() {
        return this.f25609h;
    }

    public long m() {
        return this.f25610i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d8 -> B:14:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(G6.d r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.c.n(G6.d):java.lang.Object");
    }

    @Override // io.ktor.websocket.b
    public void o1(List negotiatedExtensions) {
        kotlin.jvm.internal.t.g(negotiatedExtensions, "negotiatedExtensions");
        if (!f25600n.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        io.ktor.websocket.d.e().b("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + z.r0(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        this.f25607f.addAll(negotiatedExtensions);
        t();
        s(k.b(this, J0()));
        u();
    }

    public final io.ktor.websocket.e p(io.ktor.websocket.e eVar) {
        Iterator it = k().iterator();
        if (!it.hasNext()) {
            return eVar;
        }
        p063h.s.a(it.next());
        throw null;
    }

    @Override // io.ktor.websocket.w
    public Object q1(io.ktor.websocket.e eVar, G6.d dVar) {
        return io.ktor.websocket.b.a.a(this, eVar, dVar);
    }

    public final io.ktor.websocket.e r(io.ktor.websocket.e eVar) {
        Iterator it = k().iterator();
        if (!it.hasNext()) {
            return eVar;
        }
        p063h.s.a(it.next());
        throw null;
    }

    public final InterfaceC1815v0 s(p035d7.y yVar) {
        return AbstractC1789i.d(this, io.ktor.websocket.d.f25646b.P1(Z.d()), null, new d(yVar, null), 2, null);
    }

    public final void t() {
        c cVar;
        p035d7.y yVarA;
        long jL = l();
        if (this.closed == 0 && jL > 0) {
            cVar = this;
            yVarA = k.a(cVar, this.f25602a.J0(), jL, m(), new e(null));
        } else {
            cVar = this;
            yVarA = null;
        }
        p035d7.y yVar = (p035d7.y) f25598l.getAndSet(this, yVarA);
        if (yVar != null) {
            d7.y.a.a(yVar, null, 1, null);
        }
        if (yVarA != null) {
            p035d7.k.i(yVarA.m(f25601o));
        }
        if (cVar.closed == 0 || yVarA == null) {
            return;
        }
        t();
    }

    public final InterfaceC1815v0 u() {
        return AbstractC1785g.c(this, io.ktor.websocket.d.f25647c.P1(Z.d()), L.UNDISPATCHED, new f(null));
    }

    @Override // io.ktor.websocket.w
    public Object w0(G6.d dVar) {
        Object objW0 = this.f25602a.w0(dVar);
        return objW0 == H6.c.f() ? objW0 : G.f1419a;
    }

    public final boolean x() {
        return f25599m.compareAndSet(this, 0, 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(io.ktor.websocket.a aVar, Throwable th, G6.d dVar) throws Throwable {
        g gVar;
        c cVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i8 = gVar.f25644f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f25644f = i8 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f25642d;
        Object objF = H6.c.f();
        int i9 = gVar.f25644f;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.ktor.websocket.a) gVar.f25641c;
            th = (Throwable) gVar.f25640b;
            cVar = (c) gVar.f25639a;
            try {
                C6.r.b(obj);
                cVar.f25603b.r1(aVar);
                if (th != null) {
                    cVar.f25605d.d(th);
                    cVar.f25604c.d(th);
                }
                return G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                cVar.f25603b.r1(aVar);
                if (th != null) {
                    cVar.f25605d.d(th);
                    cVar.f25604c.d(th);
                }
                throw th;
            }
        }
        C6.r.b(obj);
        if (!x()) {
            return G.f1419a;
        }
        io.ktor.websocket.d.e().b("Sending Close Sequence for session " + this + " with reason " + aVar + " and exception " + th);
        this.f25606e.i1();
        if (aVar == null) {
            aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.NORMAL, jULK.LlBcj);
        }
        try {
            t();
            if (aVar.a() != io.ktor.websocket.a.EnumC0581a.CLOSED_ABNORMALLY.c()) {
                p035d7.y yVarJ0 = this.f25602a.J0();
                io.ktor.websocket.e.b bVar = new io.ktor.websocket.e.b(aVar);
                gVar.f25639a = this;
                gVar.f25640b = th;
                gVar.f25641c = aVar;
                gVar.f25644f = 1;
                if (yVarJ0.i(bVar, gVar) == objF) {
                    return objF;
                }
            }
            cVar = this;
            cVar.f25603b.r1(aVar);
            if (th != null) {
                cVar.f25605d.d(th);
                cVar.f25604c.d(th);
            }
            return G.f1419a;
        } catch (Throwable th3) {
            th = th3;
            cVar = this;
            cVar.f25603b.r1(aVar);
            if (th != null) {
                cVar.f25605d.d(th);
                cVar.f25604c.d(th);
            }
            throw th;
        }
    }
}
