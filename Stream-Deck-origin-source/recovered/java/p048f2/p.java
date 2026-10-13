package p048f2;

import C6.G;
import Q6.k;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p implements F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21755d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f21756e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f21757f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f21758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f21760c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21761a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u invoke(File it) {
            t.g(it, "it");
            return w.a(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Set a() {
            return p.f21756e;
        }

        public final Object b() {
            return p.f21757f;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f21762a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f21762a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m197invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m197invoke() {
            b bVar = p.f21755d;
            Object objB = bVar.b();
            File file = this.f21762a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                G g8 = G.f1419a;
            }
        }
    }

    public p(B serializer, k coordinatorProducer, Function0 produceFile) {
        t.g(serializer, "serializer");
        t.g(coordinatorProducer, "coordinatorProducer");
        t.g(produceFile, "produceFile");
        this.f21758a = serializer;
        this.f21759b = coordinatorProducer;
        this.f21760c = produceFile;
    }

    @Override // p048f2.F
    public G a() throws IOException {
        File file = ((File) this.f21760c.invoke()).getCanonicalFile();
        synchronized (f21757f) {
            String path = file.getAbsolutePath();
            Set set = f21756e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            t.f(path, "path");
            set.add(path);
        }
        t.f(file, "file");
        return new q(file, this.f21758a, (u) this.f21759b.invoke(file), new c(file));
    }

    public /* synthetic */ p(B b8, k kVar, Function0 function0, int i8, AbstractC2633k abstractC2633k) {
        this(b8, (i8 & 2) != 0 ? a.f21761a : kVar, function0);
    }
}
