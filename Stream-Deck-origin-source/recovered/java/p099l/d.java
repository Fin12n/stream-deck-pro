package p099l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p054g.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f28822f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f28824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f28825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f28826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f28827e;

    public d() {
        super(null);
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f28822f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f28822f = configuration2;
        }
        return configuration.equals(f28822f);
    }

    public void a(Configuration configuration) {
        if (this.f28827e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f28826d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f28826d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f28827e == null) {
            Configuration configuration = this.f28826d;
            if (configuration == null || e(configuration)) {
                this.f28827e = super.getResources();
            } else {
                this.f28827e = createConfigurationContext(this.f28826d).getResources();
            }
        }
        return this.f28827e;
    }

    public int c() {
        return this.f28823a;
    }

    public final void d() {
        boolean z8 = this.f28824b == null;
        if (z8) {
            this.f28824b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f28824b.setTo(theme);
            }
        }
        f(this.f28824b, this.f28823a, z8);
    }

    public void f(Resources.Theme theme, int i8, boolean z8) {
        theme.applyStyle(i8, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f28825c == null) {
            this.f28825c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f28825c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f28824b;
        if (theme != null) {
            return theme;
        }
        if (this.f28823a == 0) {
            this.f28823a = i.f22536c;
        }
        d();
        return this.f28824b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        if (this.f28823a != i8) {
            this.f28823a = i8;
            d();
        }
    }

    public d(Context context, int i8) {
        super(context);
        this.f28823a = i8;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f28824b = theme;
    }
}
