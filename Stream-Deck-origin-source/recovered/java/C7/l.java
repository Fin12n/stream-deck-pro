package C7;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1659a = a.f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1660b = new a.C0063a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f1661a = new a();

        /* JADX INFO: renamed from: C7.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0063a implements l {
            @Override // C7.l
            public boolean a(int i8, List requestHeaders) {
                t.g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // C7.l
            public boolean b(int i8, List responseHeaders, boolean z8) {
                t.g(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // C7.l
            public boolean c(int i8, J7.g source, int i9, boolean z8) {
                t.g(source, "source");
                source.skip(i9);
                return true;
            }

            @Override // C7.l
            public void d(int i8, b errorCode) {
                t.g(errorCode, "errorCode");
            }
        }
    }

    boolean a(int i8, List list);

    boolean b(int i8, List list, boolean z8);

    boolean c(int i8, J7.g gVar, int i9, boolean z8);

    void d(int i8, b bVar);
}
