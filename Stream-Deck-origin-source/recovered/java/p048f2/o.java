package p048f2;

import C6.r;
import H6.c;
import I6.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f21748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f21749c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21752c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21754e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21752c = obj;
            this.f21754e |= Integer.MIN_VALUE;
            return o.i(o.this, this);
        }
    }

    public o(File file, B serializer) {
        t.g(file, "file");
        t.g(serializer, "serializer");
        this.f21747a = file;
        this.f21748b = serializer;
        this.f21749c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [f2.o] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [f2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [f2.o] */
    public static /* synthetic */ Object i(o oVar, G6.d dVar) throws IllegalAccessException, IOException, InvocationTargetException {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21754e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21754e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21752c;
        Object objF = c.f();
        ?? r8 = aVar.f21754e;
        try {
            if (r8 != 0) {
                if (r8 == 1) {
                    closeable2 = (Closeable) aVar.f21751b;
                    r8 = (o) aVar.f21750a;
                    try {
                        r.b(obj);
                        N6.a.a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            N6.a.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f21750a;
                try {
                    r.b(obj);
                    N6.a.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        N6.a.a(closeable, th);
                        throw th6;
                    }
                }
            }
            r.b(obj);
            oVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(oVar.f21747a);
                try {
                    B b8 = oVar.f21748b;
                    aVar.f21750a = oVar;
                    aVar.f21751b = fileInputStream;
                    aVar.f21754e = 1;
                    Object from = b8.readFrom(fileInputStream, aVar);
                    if (from != objF) {
                        closeable2 = fileInputStream;
                        obj = from;
                        N6.a.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r8 = oVar;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!oVar.f21747a.exists()) {
                    return oVar.f21748b.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(oVar.f21747a);
                try {
                    B b9 = oVar.f21748b;
                    aVar.f21750a = fileInputStream2;
                    aVar.f21751b = null;
                    aVar.f21754e = 2;
                    Object from2 = b9.readFrom(fileInputStream2, aVar);
                    if (from2 != objF) {
                        obj = from2;
                        closeable = fileInputStream2;
                        N6.a.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
            return objF;
        } catch (FileNotFoundException unused2) {
            oVar = r8;
        }
    }

    @Override // p048f2.InterfaceC2301d
    public void close() {
        this.f21749c.set(true);
    }

    @Override // p048f2.z
    public Object e(G6.d dVar) {
        return i(this, dVar);
    }

    public final void f() {
        if (this.f21749c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final File g() {
        return this.f21747a;
    }

    public final B h() {
        return this.f21748b;
    }
}
