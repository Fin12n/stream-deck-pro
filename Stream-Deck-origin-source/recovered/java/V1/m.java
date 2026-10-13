package V1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10512a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f10513a;

        public a(m mVar) {
            this.f10513a = mVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            l lVarB = this.f10513a.b(i8);
            if (lVarB == null) {
                return null;
            }
            return lVarB.G0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i8) {
            List listC = this.f10513a.c(str, i8);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(((l) listC.get(i9)).G0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i8) {
            l lVarD = this.f10513a.d(i8);
            if (lVarD == null) {
                return null;
            }
            return lVarD.G0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return this.f10513a.f(i8, i9, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends a {
        public b(m mVar) {
            super(mVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f10513a.a(i8, l.H0(accessibilityNodeInfo), str, bundle);
        }
    }

    public m() {
        this.f10512a = new b(this);
    }

    public l b(int i8) {
        return null;
    }

    public List c(String str, int i8) {
        return null;
    }

    public l d(int i8) {
        return null;
    }

    public Object e() {
        return this.f10512a;
    }

    public boolean f(int i8, int i9, Bundle bundle) {
        return false;
    }

    public m(Object obj) {
        this.f10512a = obj;
    }

    public void a(int i8, l lVar, String str, Bundle bundle) {
    }
}
