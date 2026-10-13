package p203x4;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import p211y4.InterfaceC3103d;
import p211y4.InterfaceC3109j;
import p219z4.AbstractC3194c;
import p219z4.AbstractC3207p;
import p219z4.C3195d;
import p219z4.InterfaceC3201j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0839a f37378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f37379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37380c;

    /* JADX INFO: renamed from: x4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0839a extends e {
        public f a(Context context, Looper looper, C3195d c3195d, Object obj, x4.f.a aVar, x4.f.b bVar) {
            return b(context, looper, c3195d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C3195d c3195d, Object obj, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0840a f37381a = new C0840a(null);

        /* JADX INFO: renamed from: x4.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0840a implements d {
            public /* synthetic */ C0840a(k kVar) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class e {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f extends b {
        boolean a();

        void b(AbstractC3194c.InterfaceC0857c interfaceC0857c);

        Set d();

        void e(InterfaceC3201j interfaceC3201j, Set set);

        void f(String str);

        boolean g();

        String h();

        void i();

        boolean j();

        int k();

        p195w4.d[] l();

        void m(AbstractC3194c.e eVar);

        String n();

        boolean o();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends c {
    }

    public <C extends f> a(String str, AbstractC0839a abstractC0839a, g gVar) {
        AbstractC3207p.l(abstractC0839a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC3207p.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f37380c = str;
        this.f37378a = abstractC0839a;
        this.f37379b = gVar;
    }

    public final AbstractC0839a a() {
        return this.f37378a;
    }

    public final String b() {
        return this.f37380c;
    }
}
