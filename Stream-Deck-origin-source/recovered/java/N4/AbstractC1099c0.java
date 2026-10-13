package N4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: N4.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1099c0 extends AbstractC1111d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f7060a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7061b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7062c;

    public AbstractC1099c0(int i8) {
    }

    public final AbstractC1099c0 b(Object obj) {
        obj.getClass();
        d(this.f7061b + 1);
        Object[] objArr = this.f7060a;
        int i8 = this.f7061b;
        this.f7061b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    public final AbstractC1111d0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f7061b + collection.size());
            if (collection instanceof AbstractC1123e0) {
                this.f7061b = ((AbstractC1123e0) collection).c(this.f7060a, this.f7061b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final void d(int i8) {
        Object[] objArr = this.f7060a;
        int length = objArr.length;
        if (length >= i8) {
            if (this.f7062c) {
                this.f7060a = (Object[]) objArr.clone();
                this.f7062c = false;
                return;
            }
            return;
        }
        int i9 = length + (length >> 1) + 1;
        if (i9 < i8) {
            int iHighestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        if (i9 < 0) {
            i9 = Integer.MAX_VALUE;
        }
        this.f7060a = Arrays.copyOf(objArr, i9);
        this.f7062c = false;
    }
}
