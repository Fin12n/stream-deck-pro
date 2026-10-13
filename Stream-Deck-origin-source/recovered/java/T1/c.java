package T1;

import D6.J;
import android.util.LongSparseArray;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LongSparseArray f9822b;

        public a(LongSparseArray longSparseArray) {
            this.f9822b = longSparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9821a < this.f9822b.size();
        }

        @Override // D6.J
        public long nextLong() {
            LongSparseArray longSparseArray = this.f9822b;
            int i8 = this.f9821a;
            this.f9821a = i8 + 1;
            return longSparseArray.keyAt(i8);
        }
    }

    public static final J a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
