package M0;

import C6.n;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final void a(a aVar, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            int iKeyAt = sparseArray.keyAt(i8);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            f fVar = f.f5071a;
            if (fVar.d(autofillValue)) {
                aVar.b().b(iKeyAt, fVar.i(autofillValue).toString());
            } else {
                if (fVar.b(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (fVar.c(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (fVar.e(autofillValue)) {
                    throw new n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(a aVar, ViewStructure viewStructure) {
        int iA = e.f5070a.a(viewStructure, aVar.b().a().size());
        for (Map.Entry entry : aVar.b().a().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            h hVar = (h) entry.getValue();
            e eVar = e.f5070a;
            ViewStructure viewStructureB = eVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                f fVar = f.f5071a;
                AutofillId autofillIdA = fVar.a(viewStructure);
                t.d(autofillIdA);
                fVar.g(viewStructureB, autofillIdA, iIntValue);
                eVar.d(viewStructureB, iIntValue, aVar.c().getContext().getPackageName(), null, null);
                fVar.h(viewStructureB, 1);
                List listC = hVar.c();
                ArrayList arrayList = new ArrayList(listC.size());
                int size = listC.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(b.a((j) listC.get(i8)));
                }
                fVar.f(viewStructureB, (String[]) arrayList.toArray(new String[0]));
                Q0.h hVarD = hVar.d();
                if (hVarD == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iD = S6.c.d(hVarD.i());
                    int iD2 = S6.c.d(hVarD.l());
                    int iD3 = S6.c.d(hVarD.j());
                    e.f5070a.c(viewStructureB, iD, iD2, 0, 0, iD3 - iD, S6.c.d(hVarD.e()) - iD2);
                }
            }
            iA++;
        }
    }
}
