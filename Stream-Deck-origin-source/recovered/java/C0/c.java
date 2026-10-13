package C0;

import D6.AbstractC0922b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface c extends List, b, R6.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC0922b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f1247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1250e;

        public a(c cVar, int i8, int i9) {
            this.f1247b = cVar;
            this.f1248c = i8;
            this.f1249d = i9;
            G0.d.c(i8, i9, cVar.size());
            this.f1250e = i9 - i8;
        }

        @Override // D6.AbstractC0921a
        public int c() {
            return this.f1250e;
        }

        @Override // D6.AbstractC0922b, java.util.List
        public Object get(int i8) {
            G0.d.a(i8, this.f1250e);
            return this.f1247b.get(this.f1248c + i8);
        }

        @Override // D6.AbstractC0922b, java.util.List, C0.c
        public c subList(int i8, int i9) {
            G0.d.c(i8, i9, this.f1250e);
            c cVar = this.f1247b;
            int i10 = this.f1248c;
            return new a(cVar, i8 + i10, i10 + i9);
        }
    }

    @Override // java.util.List
    default c subList(int i8, int i9) {
        return new a(this, i8, i9);
    }
}
