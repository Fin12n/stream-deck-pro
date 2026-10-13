package p117n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class U extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f30330c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f30331d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f30332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f30333b;

    public U(Context context) {
        super(context);
        if (!c0.c()) {
            this.f30332a = new W(this, context.getResources());
            this.f30333b = null;
            return;
        }
        c0 c0Var = new c0(this, context.getResources());
        this.f30332a = c0Var;
        Resources.Theme themeNewTheme = c0Var.newTheme();
        this.f30333b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof U) || (context.getResources() instanceof W) || (context.getResources() instanceof c0) || !c0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f30330c) {
            try {
                ArrayList arrayList = f30331d;
                if (arrayList == null) {
                    f30331d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f30331d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f30331d.remove(size);
                        }
                    }
                    for (int size2 = f30331d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f30331d.get(size2);
                        U u8 = weakReference2 != null ? (U) weakReference2.get() : null;
                        if (u8 != null && u8.getBaseContext() == context) {
                            return u8;
                        }
                    }
                }
                U u9 = new U(context);
                f30331d.add(new WeakReference(u9));
                return u9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f30332a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f30332a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f30333b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        Resources.Theme theme = this.f30333b;
        if (theme == null) {
            super.setTheme(i8);
        } else {
            theme.applyStyle(i8, true);
        }
    }
}
