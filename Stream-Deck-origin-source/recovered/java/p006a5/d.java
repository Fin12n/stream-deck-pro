package p006a5;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f13422b = new d(new a5.e.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f13423c = new d(new p006a5.e.C0336e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f13424d = new d(new a5.e.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f13425e = new d(new a5.e.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f13426f = new d(new a5.e.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f13427g = new d(new a5.e.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f13428h = new d(new a5.e.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13429a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p006a5.e f13430a;

        @Override // a5.d.e
        public Object a(String str) {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f13430a.a(str, (Provider) it.next());
                } catch (Exception e8) {
                    if (exc == null) {
                        exc = e8;
                    }
                }
            }
            return this.f13430a.a(str, null);
        }

        public b(p006a5.e eVar) {
            this.f13430a = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p006a5.e f13431a;

        @Override // a5.d.e
        public Object a(String str) {
            return this.f13431a.a(str, null);
        }

        public c(p006a5.e eVar) {
            this.f13431a = eVar;
        }
    }

    /* JADX INFO: renamed from: a5.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0335d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p006a5.e f13432a;

        @Override // a5.d.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = d.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f13432a.a(str, (Provider) it.next());
                } catch (Exception e8) {
                    if (exc == null) {
                        exc = e8;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public C0335d(p006a5.e eVar) {
            this.f13432a = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        Object a(String str);
    }

    public d(p006a5.e eVar) {
        if (Z4.b.c()) {
            this.f13429a = new C0335d(eVar);
        } else if (h.a()) {
            this.f13429a = new b(eVar);
        } else {
            this.f13429a = new c(eVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f13429a.a(str);
    }
}
