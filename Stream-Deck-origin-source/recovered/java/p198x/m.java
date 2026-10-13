package p198x;

import A.AbstractC0890p0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtraSupportedOutputSizeQuirk f37153b = (ExtraSupportedOutputSizeQuirk) e.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f37154c;

    public m(String str) {
        this.f37152a = str;
        this.f37154c = new e(str);
    }

    public final void a(List list, int i8) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f37153b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrD = extraSupportedOutputSizeQuirk.d(i8);
        if (sizeArrD.length > 0) {
            list.addAll(Arrays.asList(sizeArrD));
        }
    }

    public Size[] b(Size[] sizeArr, int i8) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i8);
        c(arrayList, i8);
        if (arrayList.isEmpty()) {
            AbstractC0890p0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void c(List list, int i8) {
        List listA = this.f37154c.a(i8);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }
}
