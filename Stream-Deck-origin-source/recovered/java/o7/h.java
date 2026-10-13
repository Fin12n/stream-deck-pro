package o7;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f30995b;

        public a(f fVar) {
            this.f30995b = fVar;
            this.f30994a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f30995b;
            int iF = fVar.f();
            int i8 = this.f30994a;
            this.f30994a = i8 - 1;
            return fVar.i(iF - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30994a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f30997b;

        public b(f fVar) {
            this.f30997b = fVar;
            this.f30996a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f30997b;
            int iF = fVar.f();
            int i8 = this.f30996a;
            this.f30996a = i8 - 1;
            return fVar.g(iF - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30996a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Iterable, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f30998a;

        public c(f fVar) {
            this.f30998a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f30998a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Iterable, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f30999a;

        public d(f fVar) {
            this.f30999a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f30999a);
        }
    }

    public static final Iterable a(f fVar) {
        t.g(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        t.g(fVar, "<this>");
        return new d(fVar);
    }
}
