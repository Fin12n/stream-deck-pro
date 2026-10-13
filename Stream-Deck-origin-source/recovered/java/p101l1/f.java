package p101l1;

import java.util.Arrays;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String a(int i8, int i9, Object[] objArr, InterfaceC3163l interfaceC3163l, int i10) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(523207213, i10, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = e.a(interfaceC3163l, 0).getQuantityString(i8, i9, Arrays.copyOf(objArr, objArr.length));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return quantityString;
    }

    public static final String b(int i8, InterfaceC3163l interfaceC3163l, int i9) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1223887937, i9, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = e.a(interfaceC3163l, 0).getString(i8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return string;
    }

    public static final String c(int i8, Object[] objArr, InterfaceC3163l interfaceC3163l, int i9) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(2071230100, i9, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = e.a(interfaceC3163l, 0).getString(i8, Arrays.copyOf(objArr, objArr.length));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return string;
    }
}
