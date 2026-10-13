package O4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K3 extends AbstractC1455l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f7934a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7935b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7936c;

    public K3(int i8) {
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f7935b + 1);
        Object[] objArr = this.f7934a;
        int i8 = this.f7935b;
        this.f7935b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    public final void b(int i8) {
        Object[] objArr = this.f7934a;
        int length = objArr.length;
        if (length >= i8) {
            if (this.f7936c) {
                this.f7934a = (Object[]) objArr.clone();
                this.f7936c = false;
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
        this.f7934a = Arrays.copyOf(objArr, i9);
        this.f7936c = false;
    }
}
