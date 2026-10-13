package p048f2;

import C6.G;
import H6.c;
import I6.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends o implements L {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21784c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21786e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21784c = obj;
            this.f21786e |= Integer.MIN_VALUE;
            return r.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(File file, B serializer) {
        super(file, serializer);
        t.g(file, "file");
        t.g(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p048f2.L
    public Object a(Object obj, G6.d dVar) throws IllegalAccessException, IOException, InvocationTargetException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21786e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21786e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj2 = aVar.f21784c;
        Object objF = c.f();
        int i9 = aVar.f21786e;
        if (i9 == 0) {
            C6.r.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                B bH = h();
                J j8 = new J(fileOutputStream2);
                aVar.f21782a = fileOutputStream2;
                aVar.f21783b = fileOutputStream2;
                aVar.f21786e = 1;
                if (bH.writeTo(obj, j8, aVar) == objF) {
                    return objF;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f21783b;
            closeable = (Closeable) aVar.f21782a;
            try {
                C6.r.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    N6.a.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        G g8 = G.f1419a;
        N6.a.a(closeable, null);
        return G.f1419a;
    }
}
