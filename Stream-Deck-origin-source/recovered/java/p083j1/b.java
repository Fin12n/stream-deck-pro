package p083j1;

import C6.m;
import android.R;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28121b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28122a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28122a = iArr;
        }
    }

    b(int i8) {
        this.f28120a = i8;
        this.f28121b = i8;
    }

    public final int b() {
        return this.f28120a;
    }

    public final int c() {
        return this.f28121b;
    }

    public final int d() {
        int i8 = a.f28122a[ordinal()];
        if (i8 == 1) {
            return R.string.copy;
        }
        if (i8 == 2) {
            return R.string.paste;
        }
        if (i8 == 3) {
            return R.string.cut;
        }
        if (i8 == 4) {
            return R.string.selectAll;
        }
        throw new m();
    }
}
