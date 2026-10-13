package H;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: H.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997p {

    /* JADX INFO: renamed from: H.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3169a = new ArrayList();

        public a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC0995o abstractC0995o = (AbstractC0995o) it.next();
                if (!(abstractC0995o instanceof b)) {
                    this.f3169a.add(abstractC0995o);
                }
            }
        }

        @Override // H.AbstractC0995o
        public void a(int i8) {
            Iterator it = this.f3169a.iterator();
            while (it.hasNext()) {
                ((AbstractC0995o) it.next()).a(i8);
            }
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            Iterator it = this.f3169a.iterator();
            while (it.hasNext()) {
                ((AbstractC0995o) it.next()).b(i8, interfaceC1014y);
            }
        }

        @Override // H.AbstractC0995o
        public void c(int i8, C0999q c0999q) {
            Iterator it = this.f3169a.iterator();
            while (it.hasNext()) {
                ((AbstractC0995o) it.next()).c(i8, c0999q);
            }
        }

        @Override // H.AbstractC0995o
        public void d(int i8) {
            Iterator it = this.f3169a.iterator();
            while (it.hasNext()) {
                ((AbstractC0995o) it.next()).d(i8);
            }
        }

        public List e() {
            return this.f3169a;
        }
    }

    public static AbstractC0995o a(List list) {
        if (list.isEmpty()) {
            return c();
        }
        return list.size() == 1 ? (AbstractC0995o) list.get(0) : new a(list);
    }

    public static AbstractC0995o b(AbstractC0995o... abstractC0995oArr) {
        return a(Arrays.asList(abstractC0995oArr));
    }

    public static AbstractC0995o c() {
        return new b();
    }

    /* JADX INFO: renamed from: H.p$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends AbstractC0995o {
        @Override // H.AbstractC0995o
        public void d(int i8) {
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
        }

        @Override // H.AbstractC0995o
        public void c(int i8, C0999q c0999q) {
        }
    }
}
