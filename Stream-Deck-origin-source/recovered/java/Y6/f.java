package Y6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.k f12527b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12529b = -2;

        public a() {
        }

        private final void b() {
            Object objInvoke;
            if (this.f12529b == -2) {
                objInvoke = f.this.f12526a.invoke();
            } else {
                Q6.k kVar = f.this.f12527b;
                Object obj = this.f12528a;
                t.d(obj);
                objInvoke = kVar.invoke(obj);
            }
            this.f12528a = objInvoke;
            this.f12529b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12529b < 0) {
                b();
            }
            return this.f12529b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f12529b < 0) {
                b();
            }
            if (this.f12529b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f12528a;
            t.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f12529b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Function0 getInitialValue, Q6.k getNextValue) {
        t.g(getInitialValue, "getInitialValue");
        t.g(getNextValue, "getNextValue");
        this.f12526a = getInitialValue;
        this.f12527b = getNextValue;
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a();
    }
}
