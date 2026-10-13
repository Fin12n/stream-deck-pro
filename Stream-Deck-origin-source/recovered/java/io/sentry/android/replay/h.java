package io.sentry.android.replay;

import C6.G;
import D6.C0941v;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.AbstractC2519l;
import io.sentry.C2517k1;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.K2;
import io.sentry.util.C2569a;
import io.sentry.util.C2576h;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f26811k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f26812l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.u f26814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f26817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.sentry.android.replay.video.c f26818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6.j f26819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f26820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f26821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6.j f26822j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0598a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F6.a.a(Long.valueOf(((i) obj).c()), Long.valueOf(((i) obj2).c()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return F6.a.a(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:90:0x0206  */
        public final io.sentry.android.replay.c c(J2 options, io.sentry.protocol.u replayId, Q6.k kVar) throws IllegalAccessException, IOException, InvocationTargetException {
            Date dateD;
            K2.b bVarValueOf;
            io.sentry.android.replay.c cVar;
            final h hVar;
            List listN;
            String str = "";
            kotlin.jvm.internal.t.g(options, "options");
            kotlin.jvm.internal.t.g(replayId, "replayId");
            File fileD = d(options, replayId);
            File file = new File(fileD, ".ongoing_segment");
            if (!file.exists()) {
                options.getLogger().c(EnumC2596z2.DEBUG, "No ongoing segment found for replay: %s", replayId);
                C2576h.a(fileD);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Z6.c.f12941b), 8192);
            try {
                Iterator it = N6.g.c(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List listA0 = Z6.w.A0((String) it.next(), new String[]{com.amazon.a.a.o.b.f.f16778b}, false, 2, 2, null);
                    C6.o oVarA = C6.v.a((String) listA0.get(0), (String) listA0.get(1));
                    linkedHashMap.put(oVarA.c(), oVarA.d());
                }
                N6.a.a(bufferedReader, null);
                String str2 = (String) linkedHashMap.get("config.height");
                Integer numM = str2 != null ? Z6.u.m(str2) : null;
                String str3 = (String) linkedHashMap.get("config.width");
                Integer numM2 = str3 != null ? Z6.u.m(str3) : null;
                String str4 = (String) linkedHashMap.get("config.frame-rate");
                Integer numM3 = str4 != null ? Z6.u.m(str4) : null;
                String str5 = (String) linkedHashMap.get("config.bit-rate");
                Integer numM4 = str5 != null ? Z6.u.m(str5) : null;
                String str6 = (String) linkedHashMap.get("segment.id");
                Integer numM5 = str6 != null ? Z6.u.m(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateD = AbstractC2519l.e(str7);
                } catch (Throwable unused) {
                    dateD = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get("replay.type");
                    if (str8 != null) {
                        str = str8;
                    }
                    bVarValueOf = K2.b.valueOf(str);
                } catch (Throwable unused2) {
                    bVarValueOf = null;
                }
                if (numM == null || numM2 == null || numM3 == null || numM4 == null || numM5 == null) {
                    cVar = null;
                } else {
                    cVar = null;
                    if (numM5.intValue() != -1 && dateD != null && bVarValueOf != null) {
                        u uVar = new u(numM2.intValue(), numM.intValue(), 1.0f, 1.0f, numM3.intValue(), numM4.intValue());
                        if (kVar == null || (hVar = (h) kVar.invoke(replayId)) == null) {
                            hVar = new h(options, replayId);
                        }
                        File fileR0 = hVar.r0();
                        if (fileR0 != null) {
                            fileR0.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.g
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file2, String str9) {
                                    return h.a.b(hVar, file2, str9);
                                }
                            });
                        }
                        if (hVar.i0().isEmpty()) {
                            options.getLogger().c(EnumC2596z2.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            C2576h.a(fileD);
                            return null;
                        }
                        List listI0 = hVar.i0();
                        if (listI0.size() > 1) {
                            C0941v.C(listI0, new C0598a());
                        }
                        K2.b bVar = K2.b.SESSION;
                        int iIntValue = bVarValueOf == bVar ? numM5.intValue() : 0;
                        if (bVarValueOf != bVar) {
                            dateD = AbstractC2519l.d(((i) D6.z.i0(hVar.i0())).c());
                            kotlin.jvm.internal.t.f(dateD, "{\n                // in ….timestamp)\n            }");
                        }
                        Date date = dateD;
                        long jC = (((i) D6.z.t0(hVar.i0())).c() - date.getTime()) + ((long) (1000 / numM3.intValue()));
                        String str9 = (String) linkedHashMap.get("replay.recording");
                        if (str9 != null) {
                            C2517k1 c2517k1 = (C2517k1) options.getSerializer().c(new StringReader(str9), C2517k1.class);
                            if ((c2517k1 != null ? c2517k1.a() : null) != null) {
                                List listA = c2517k1.a();
                                kotlin.jvm.internal.t.d(listA);
                                listN = new LinkedList(listA);
                            } else {
                                listN = null;
                            }
                            if (listN == null) {
                                listN = D6.r.n();
                            }
                        } else {
                            listN = D6.r.n();
                        }
                        return new io.sentry.android.replay.c(uVar, hVar, date, iIntValue, jC, bVarValueOf, (String) linkedHashMap.get("replay.screen-at-start"), D6.z.J0(listN, new b()));
                    }
                }
                options.getLogger().c(EnumC2596z2.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                C2576h.a(fileD);
                return cVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(bufferedReader, th);
                    throw th2;
                }
            }
        }

        public final File d(J2 options, io.sentry.protocol.u replayId) {
            kotlin.jvm.internal.t.g(options, "options");
            kotlin.jvm.internal.t.g(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(EnumC2596z2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            kotlin.jvm.internal.t.d(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        public a() {
        }

        public static final boolean b(h hVar, File file, String name) {
            kotlin.jvm.internal.t.g(hVar, ajyWhveMDgQ.DeSf);
            kotlin.jvm.internal.t.f(name, "name");
            if (Z6.v.u(name, ".jpg", false, 2, null)) {
                File file2 = new File(file, name);
                Long lO = Z6.u.o(N6.e.j(file2));
                if (lO != null) {
                    h.t(hVar, file2, lO.longValue(), null, 4, null);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            if (h.this.r0() == null) {
                return null;
            }
            File file = new File(h.this.r0(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26824a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            kotlin.jvm.internal.t.g(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return h.f26811k.d(h.this.f26813a, h.this.f26814b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f26826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f26827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f26828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8, h hVar, J j9) {
            super(1);
            this.f26826a = j8;
            this.f26827b = hVar;
            this.f26828c = j9;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i it) {
            kotlin.jvm.internal.t.g(it, "it");
            if (it.c() < this.f26826a) {
                this.f26827b.A(it.b());
                return Boolean.TRUE;
            }
            J j8 = this.f26828c;
            if (j8.f28779a == null) {
                j8.f28779a = it.a();
            }
            return Boolean.FALSE;
        }
    }

    public h(J2 options, io.sentry.protocol.u replayId) {
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(replayId, "replayId");
        this.f26813a = options;
        this.f26814b = replayId;
        this.f26815c = new AtomicBoolean(false);
        this.f26816d = new C2569a();
        this.f26817e = new C2569a();
        this.f26819g = C6.k.b(new d());
        this.f26820h = new ArrayList();
        this.f26821i = new LinkedHashMap();
        this.f26822j = C6.k.b(new b());
    }

    public static /* synthetic */ void t(h hVar, File file, long j8, String str, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        hVar.o(file, j8, str);
    }

    public static /* synthetic */ io.sentry.android.replay.b z(h hVar, long j8, long j9, int i8, int i9, int i10, int i11, int i12, File file, int i13, Object obj) {
        int i14;
        File file2;
        if ((i13 & 128) != 0) {
            File fileR0 = hVar.r0();
            StringBuilder sb = new StringBuilder();
            i14 = i8;
            sb.append(i14);
            sb.append(".mp4");
            file2 = new File(fileR0, sb.toString());
        } else {
            i14 = i8;
            file2 = file;
        }
        return hVar.y(j8, j9, i14, i9, i10, i11, i12, file2);
    }

    public final void A(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.f26813a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.f26813a.getLogger().a(EnumC2596z2.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final String A0(long j8) {
        J j9 = new J();
        D6.w.L(this.f26820h, new e(j8, this, j9));
        return (String) j9.f28779a;
    }

    public final boolean Y(i iVar) {
        if (iVar == null) {
            return false;
        }
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(iVar.b().getAbsolutePath());
            InterfaceC2480b0 interfaceC2480b0A = this.f26816d.a();
            try {
                io.sentry.android.replay.video.c cVar = this.f26818f;
                if (cVar != null) {
                    kotlin.jvm.internal.t.f(bitmap, "bitmap");
                    cVar.b(bitmap);
                    G g8 = G.f1419a;
                }
                O6.a.a(interfaceC2480b0A, null);
                bitmap.recycle();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    O6.a.a(interfaceC2480b0A, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f26813a.getLogger().b(EnumC2596z2.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        InterfaceC2480b0 interfaceC2480b0A = this.f26816d.a();
        try {
            io.sentry.android.replay.video.c cVar = this.f26818f;
            if (cVar != null) {
                cVar.i();
            }
            this.f26818f = null;
            G g8 = G.f1419a;
            O6.a.a(interfaceC2480b0A, null);
            this.f26815c.set(true);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                O6.a.a(interfaceC2480b0A, th);
                throw th2;
            }
        }
    }

    public final List i0() {
        return this.f26820h;
    }

    public final File j0() {
        return (File) this.f26822j.getValue();
    }

    public final void o(File screenshot, long j8, String str) {
        kotlin.jvm.internal.t.g(screenshot, "screenshot");
        this.f26820h.add(new i(screenshot, j8, str));
    }

    public final File r0() {
        return (File) this.f26819g.getValue();
    }

    public final void v(Bitmap bitmap, long j8, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.t.g(bitmap, "bitmap");
        if (r0() == null || bitmap.isRecycled()) {
            return;
        }
        File fileR0 = r0();
        if (fileR0 != null) {
            fileR0.mkdirs();
        }
        File file = new File(r0(), j8 + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.f26813a.getSessionReplay().h().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            G g8 = G.f1419a;
            N6.a.a(fileOutputStream, null);
            o(file, j8, str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final void w0(String key, String str) throws Exception {
        File fileJ0;
        File fileJ1;
        kotlin.jvm.internal.t.g(key, "key");
        InterfaceC2480b0 interfaceC2480b0A = this.f26817e.a();
        try {
            if (this.f26815c.get()) {
                O6.a.a(interfaceC2480b0A, null);
                return;
            }
            File fileJ2 = j0();
            if ((fileJ2 == null || !fileJ2.exists()) && (fileJ0 = j0()) != null) {
                fileJ0.createNewFile();
            }
            if (this.f26821i.isEmpty() && (fileJ1 = j0()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileJ1), Z6.c.f12941b), 8192);
                try {
                    Y6.g gVarC = N6.g.c(bufferedReader);
                    LinkedHashMap linkedHashMap = this.f26821i;
                    Iterator it = gVarC.iterator();
                    while (it.hasNext()) {
                        List listA0 = Z6.w.A0((String) it.next(), new String[]{com.amazon.a.a.o.b.f.f16778b}, false, 2, 2, null);
                        C6.o oVarA = C6.v.a((String) listA0.get(0), (String) listA0.get(1));
                        linkedHashMap.put(oVarA.c(), oVarA.d());
                    }
                    N6.a.a(bufferedReader, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        N6.a.a(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str == null) {
                this.f26821i.remove(key);
            } else {
                this.f26821i.put(key, str);
            }
            File fileJ3 = j0();
            if (fileJ3 != null) {
                Set setEntrySet = this.f26821i.entrySet();
                kotlin.jvm.internal.t.f(setEntrySet, "ongoingSegment.entries");
                N6.c.h(fileJ3, D6.z.r0(setEntrySet, "\n", null, null, 0, null, c.f26824a, 30, null), null, 2, null);
                G g8 = G.f1419a;
            }
            O6.a.a(interfaceC2480b0A, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                O6.a.a(interfaceC2480b0A, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[LOOP:0: B:23:0x00a0->B:42:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb A[EDGE_INSN: B:82:0x00eb->B:44:0x00eb BREAK  A[LOOP:0: B:23:0x00a0->B:42:0x00e7], SYNTHETIC] */
    public final io.sentry.android.replay.b y(long j8, long j9, int i8, int i9, int i10, int i11, int i12, File videoFile) throws Exception {
        InterfaceC2480b0 interfaceC2480b0;
        int i13;
        i iVar;
        kotlin.jvm.internal.t.g(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.f26820h.isEmpty()) {
            this.f26813a.getLogger().c(EnumC2596z2.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f26816d.a();
        try {
            interfaceC2480b0 = interfaceC2480b0A;
            try {
                io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.f26813a, new io.sentry.android.replay.video.a(videoFile, i10, i9, i11, i12, null, 32, null), null, 4, null);
                cVar.j();
                O6.a.a(interfaceC2480b0, null);
                this.f26818f = cVar;
                long j10 = ((long) 1000) / ((long) i11);
                i iVar2 = (i) D6.z.i0(this.f26820h);
                long j11 = j9 + j8;
                W6.j jVarU = W6.n.u(W6.n.w(j9, j11), j10);
                long jS = jVarU.s();
                long jT = jVarU.t();
                long jU = jVarU.u();
                if ((jU > 0 && jS <= jT) || (jU < 0 && jT <= jS)) {
                    i13 = 0;
                    while (true) {
                        Iterator it = this.f26820h.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                iVar = (i) it.next();
                                long j12 = jS + j10;
                                long jC = iVar.c();
                                if (jS <= jC && jC <= j12) {
                                    break;
                                }
                                if (iVar.c() > j12) {
                                }
                            }
                            iVar = iVar2;
                            break;
                        }
                        if (!Y(iVar)) {
                            if (iVar != null) {
                                A(iVar.b());
                                this.f26820h.remove(iVar);
                                iVar2 = null;
                            }
                            if (jS != jT) {
                                break;
                            }
                            jS += jU;
                        } else {
                            i13++;
                        }
                        iVar2 = iVar;
                        if (jS != jT) {
                            break;
                            break;
                        }
                        jS += jU;
                    }
                } else {
                    i13 = 0;
                }
                if (i13 == 0) {
                    this.f26813a.getLogger().c(EnumC2596z2.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    A(videoFile);
                    return null;
                }
                InterfaceC2480b0 interfaceC2480b0A2 = this.f26816d.a();
                try {
                    io.sentry.android.replay.video.c cVar2 = this.f26818f;
                    if (cVar2 != null) {
                        cVar2.i();
                    }
                    io.sentry.android.replay.video.c cVar3 = this.f26818f;
                    long jC2 = cVar3 != null ? cVar3.c() : 0L;
                    this.f26818f = null;
                    G g8 = G.f1419a;
                    O6.a.a(interfaceC2480b0A2, null);
                    A0(j11);
                    return new io.sentry.android.replay.b(videoFile, i13, jC2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        O6.a.a(interfaceC2480b0A2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    throw th4;
                } catch (Throwable th5) {
                    O6.a.a(interfaceC2480b0, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            interfaceC2480b0 = interfaceC2480b0A;
        }
    }
}
