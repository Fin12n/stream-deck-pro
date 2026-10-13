package p174u;

import A.AbstractC0890p0;
import R0.pkXL.Oitvkwcwn;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import p198x.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f34333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f34334c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f34335d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f34336e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        StreamConfigurationMap a();

        Range[] b(Size size);

        Size[] c(int i8);

        long d(int i8, Size size);

        Size[] e(int i8);

        int[] f();

        Size[] g();
    }

    public y(StreamConfigurationMap streamConfigurationMap, m mVar) {
        this.f34332a = new z(streamConfigurationMap);
        this.f34333b = mVar;
    }

    public static y h(StreamConfigurationMap streamConfigurationMap, m mVar) {
        return new y(streamConfigurationMap, mVar);
    }

    public Size[] a(int i8) {
        if (this.f34335d.containsKey(Integer.valueOf(i8))) {
            if (((Size[]) this.f34335d.get(Integer.valueOf(i8))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f34335d.get(Integer.valueOf(i8))).clone();
        }
        Size[] sizeArrC = this.f34332a.c(i8);
        if (sizeArrC != null && sizeArrC.length > 0) {
            sizeArrC = this.f34333b.b(sizeArrC, i8);
        }
        this.f34335d.put(Integer.valueOf(i8), sizeArrC);
        if (sizeArrC != null) {
            return (Size[]) sizeArrC.clone();
        }
        return null;
    }

    public Range[] b(Size size) {
        return this.f34332a.b(size);
    }

    public Size[] c() {
        return this.f34332a.g();
    }

    public int[] d() {
        int[] iArrF = this.f34332a.f();
        if (iArrF == null) {
            return null;
        }
        return (int[]) iArrF.clone();
    }

    public long e(int i8, Size size) {
        try {
            return this.f34332a.d(i8, size);
        } catch (RuntimeException e8) {
            AbstractC0890p0.m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i8 + " and size = " + size, e8);
            return 0L;
        }
    }

    public StreamConfigurationMap g() {
        return this.f34332a.a();
    }

    public Size[] f(int i8) {
        Size[] sizeArrE = null;
        if (this.f34334c.containsKey(Integer.valueOf(i8))) {
            if (((Size[]) this.f34334c.get(Integer.valueOf(i8))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f34334c.get(Integer.valueOf(i8))).clone();
        }
        try {
            sizeArrE = this.f34332a.e(i8);
        } catch (Throwable th) {
            AbstractC0890p0.m("StreamConfigurationMapCompat", Oitvkwcwn.uTDkcAmu + i8, th);
        }
        if (sizeArrE != null && sizeArrE.length != 0) {
            Size[] sizeArrB = this.f34333b.b(sizeArrE, i8);
            this.f34334c.put(Integer.valueOf(i8), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        AbstractC0890p0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i8);
        return sizeArrE;
    }
}
