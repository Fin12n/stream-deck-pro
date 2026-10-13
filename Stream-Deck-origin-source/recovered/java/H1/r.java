package H1;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f3488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f3489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f3492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f3493g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(r rVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(rVar.j()).setLabel(rVar.i()).setChoices(rVar.f()).setAllowFreeFormInput(rVar.d()).addExtras(rVar.h());
            Set setE = rVar.e();
            if (setE != null) {
                Iterator it = setE.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, rVar.g());
            }
            return builderAddExtras.build();
        }

        public static r c(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            d dVarA = new d(remoteInput.getResultKey()).g(remoteInput.getLabel()).e(remoteInput.getChoices()).d(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            Set<String> setB = b.b(remoteInput);
            if (setB != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    dVarA.c(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                dVarA.f(c.a(remoteInput));
            }
            return dVarA.b();
        }

        public static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static void a(r rVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(r.a(rVar), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z8) {
            return builder.setAllowDataType(str, z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i8) {
            return builder.setEditChoicesBeforeSending(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3494a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f3497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f3498e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f3495b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f3496c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3499f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3500g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f3494a = str;
        }

        public d a(Bundle bundle) {
            if (bundle != null) {
                this.f3496c.putAll(bundle);
            }
            return this;
        }

        public r b() {
            return new r(this.f3494a, this.f3497d, this.f3498e, this.f3499f, this.f3500g, this.f3496c, this.f3495b);
        }

        public d c(String str, boolean z8) {
            if (z8) {
                this.f3495b.add(str);
                return this;
            }
            this.f3495b.remove(str);
            return this;
        }

        public d d(boolean z8) {
            this.f3499f = z8;
            return this;
        }

        public d e(CharSequence[] charSequenceArr) {
            this.f3498e = charSequenceArr;
            return this;
        }

        public d f(int i8) {
            this.f3500g = i8;
            return this;
        }

        public d g(CharSequence charSequence) {
            this.f3497d = charSequence;
            return this;
        }
    }

    public r(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z8, int i8, Bundle bundle, Set set) {
        this.f3487a = str;
        this.f3488b = charSequence;
        this.f3489c = charSequenceArr;
        this.f3490d = z8;
        this.f3491e = i8;
        this.f3492f = bundle;
        this.f3493g = set;
        if (g() == 2 && !d()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(r rVar) {
        return a.b(rVar);
    }

    public static RemoteInput[] b(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i8 = 0; i8 < rVarArr.length; i8++) {
            remoteInputArr[i8] = a(rVarArr[i8]);
        }
        return remoteInputArr;
    }

    public static r c(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    public boolean d() {
        return this.f3490d;
    }

    public Set e() {
        return this.f3493g;
    }

    public CharSequence[] f() {
        return this.f3489c;
    }

    public int g() {
        return this.f3491e;
    }

    public Bundle h() {
        return this.f3492f;
    }

    public CharSequence i() {
        return this.f3488b;
    }

    public String j() {
        return this.f3487a;
    }

    public boolean k() {
        if (d()) {
            return false;
        }
        return ((f() != null && f().length != 0) || e() == null || e().isEmpty()) ? false : true;
    }
}
