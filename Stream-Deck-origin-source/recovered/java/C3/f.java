package C3;

import A3.n;
import C6.G;
import C6.r;
import D6.C0934n;
import D6.C0938s;
import D6.z;
import Q6.o;
import Q6.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.util.Size;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1303g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1304h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T3.a f1305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f1306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f1308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f1309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f1310f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f1313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1314d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C3.b.e f1315a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3.b.e eVar) {
                super(1);
                this.f1315a = eVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
                t.g(it, "it");
                KnownHost.Device.Builder customFaceplate = it.setCustomFaceplate(this.f1315a.b());
                t.f(customFaceplate, "setCustomFaceplate(...)");
                return customFaceplate;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, int i8, G6.d dVar) {
            super(2, dVar);
            this.f1313c = uri;
            this.f1314d = i8;
        }

        public static final void k(f fVar, int i8, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            t.f(size, "getSize(...)");
            Size sizeL = fVar.l(size, i8);
            imageDecoder.setTargetSize(sizeL.getWidth(), sizeL.getHeight());
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new c(this.f1313c, this.f1314d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
            H6.c.f();
            if (this.f1311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(f.this.f1307c.getContentResolver(), this.f1313c);
            final f fVar = f.this;
            final int i8 = this.f1314d;
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: C3.g
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    f.c.k(fVar, i8, imageDecoder, imageInfo, source);
                }
            });
            t.f(bitmapDecodeBitmap, "decodeBitmap(...)");
            File file = new File(f.this.h(), UUID.randomUUID() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmapDecodeBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                N6.a.a(fileOutputStream, null);
                fileOutputStream.close();
                C3.b.e eVar = new C3.b.e(file);
                x xVar = f.this.f1308d;
                xVar.setValue(z.C0((Collection) xVar.getValue(), eVar));
                f.this.f1305a.k(new a(eVar));
                return G.f1419a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(fileOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1316a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
            t.g(it, "it");
            KnownHost.Device.Builder defaultFaceplate = it.setDefaultFaceplate(new C3.b.h().b());
            t.f(defaultFaceplate, "setDefaultFaceplate(...)");
            return defaultFaceplate;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f1319c;

        public e(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(KnownHost.Device device, boolean z8, G6.d dVar) {
            e eVar = f.this.new e(dVar);
            eVar.f1318b = device;
            eVar.f1319c = z8;
            return eVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((KnownHost.Device) obj, ((Boolean) obj2).booleanValue(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            H6.c.f();
            if (this.f1317a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            KnownHost.Device device = (KnownHost.Device) this.f1318b;
            String strB = C3.e.b(device, this.f1319c);
            if (!device.hasCustomFaceplate()) {
                return C3.b.f1260f.a(strB);
            }
            Iterator it = ((Iterable) f.this.i().getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((C3.b.e) next).b(), strB));
            C3.b.e eVar = (C3.b.e) next;
            return eVar != null ? eVar : new C3.b.h();
        }
    }

    /* JADX INFO: renamed from: C3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0056f extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3.b f1321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0056f(C3.b bVar) {
            super(1);
            this.f1321a = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
            t.g(it, "it");
            C3.b bVar = this.f1321a;
            if (bVar instanceof C3.b.e) {
                KnownHost.Device.Builder customFaceplate = it.setCustomFaceplate(bVar.b());
                t.f(customFaceplate, "setCustomFaceplate(...)");
                return customFaceplate;
            }
            KnownHost.Device.Builder defaultFaceplate = it.setDefaultFaceplate(bVar.b());
            t.f(defaultFaceplate, "setDefaultFaceplate(...)");
            return defaultFaceplate;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1322a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1323a;

            /* JADX INFO: renamed from: C3.f$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0057a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1324a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1325b;

                public C0057a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1324a = obj;
                    this.f1325b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1323a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0057a c0057a;
                if (dVar instanceof C0057a) {
                    c0057a = (C0057a) dVar;
                    int i8 = c0057a.f1325b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0057a.f1325b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0057a = new C0057a(dVar);
                    }
                } else {
                    c0057a = new C0057a(dVar);
                }
                Object obj2 = c0057a.f1324a;
                Object objF = H6.c.f();
                int i9 = c0057a.f1325b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1323a;
                    KnownHost.Device deviceA = ((T3.a.C0274a) obj).a();
                    c0057a.f1325b = 1;
                    if (interfaceC2261g.emit(deviceA, c0057a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public g(InterfaceC2260f interfaceC2260f) {
            this.f1322a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1322a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    public f(T3.a deviceSettingsEditor, J coroutineScope, n purchaseService, Context context) {
        List<File> listN;
        t.g(deviceSettingsEditor, "deviceSettingsEditor");
        t.g(coroutineScope, "coroutineScope");
        t.g(purchaseService, "purchaseService");
        t.g(context, "context");
        this.f1305a = deviceSettingsEditor;
        this.f1306b = coroutineScope;
        this.f1307c = context;
        File[] fileArrListFiles = h().listFiles();
        if (fileArrListFiles != null) {
            t.d(fileArrListFiles);
            listN = C0934n.o0(fileArrListFiles, new b());
            listN = listN == null ? D6.r.n() : listN;
        }
        ArrayList arrayList = new ArrayList(C0938s.y(listN, 10));
        for (File file : listN) {
            t.d(file);
            arrayList.add(new C3.b.e(file));
        }
        x xVarA = O.a(arrayList);
        this.f1308d = xVarA;
        this.f1309e = xVarA;
        this.f1310f = AbstractC2262h.T(AbstractC2262h.k(new g(this.f1305a.e()), purchaseService.d(), new e(null)), this.f1306b, H.a.b(H.f20929a, 0L, 0L, 3, null), new C3.b.h());
    }

    public final void f(Uri imageUri, int i8) {
        t.g(imageUri, "imageUri");
        V3.f.b(h.a(f1303g, P3.f.h(((T3.a.C0274a) this.f1305a.e().getValue()).a()), P3.f.j(((T3.a.C0274a) this.f1305a.e().getValue()).a())));
        AbstractC1789i.d(this.f1306b, null, null, new c(imageUri, i8, null), 3, null);
    }

    public final void g(C3.b.e faceplate) {
        t.g(faceplate, "faceplate");
        if (t.c(((C3.b) this.f1310f.getValue()).b(), faceplate.b())) {
            this.f1305a.k(d.f1316a);
        }
        faceplate.f().delete();
        x xVar = this.f1308d;
        xVar.setValue(z.z0((Iterable) xVar.getValue(), faceplate));
    }

    public final File h() {
        File filesDir = this.f1307c.getFilesDir();
        t.f(filesDir, "getFilesDir(...)");
        File fileL = N6.e.l(filesDir, "faceplates");
        if (!fileL.exists()) {
            fileL.mkdir();
        }
        return fileL;
    }

    public final M i() {
        return this.f1309e;
    }

    public final M j() {
        return this.f1310f;
    }

    public final void k(C3.b faceplate) {
        t.g(faceplate, "faceplate");
        this.f1305a.k(new C0056f(faceplate));
    }

    public final Size l(Size size, int i8) {
        float f8;
        int width;
        float f9 = 1.0f;
        if (size.getWidth() > size.getHeight()) {
            if (size.getHeight() > i8) {
                f8 = i8;
                width = size.getHeight();
                f9 = f8 / width;
            }
        } else if (size.getWidth() > i8) {
            f8 = i8;
            width = size.getWidth();
            f9 = f8 / width;
        }
        return new Size((int) (size.getWidth() * f9), (int) (size.getHeight() * f9));
    }
}
