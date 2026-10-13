package X3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import q7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i
public enum f {
    Debug,
    Info,
    f11712d,
    Error,
    Fatal;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ J6.a f11716h = J6.b.a(a());
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6.j f11709a = C6.k.a(C6.l.PUBLICATION, a.f11717a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11717a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke() {
            return G.a("com.elgato.telemetry.core.ErrorLevel", f.values());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final /* synthetic */ p116m7.b a() {
            return (p116m7.b) f.f11709a.getValue();
        }

        public final p116m7.b serializer() {
            return a();
        }

        public b() {
        }
    }
}
