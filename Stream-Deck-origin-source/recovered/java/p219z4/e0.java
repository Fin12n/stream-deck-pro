package p219z4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Uri f39179f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f39182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39184e;

    public e0(ComponentName componentName, int i8) {
        this.f39180a = null;
        this.f39181b = null;
        AbstractC3207p.k(componentName);
        this.f39182c = componentName;
        this.f39183d = 4225;
        this.f39184e = false;
    }

    public final ComponentName a() {
        return this.f39182c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f39180a == null) {
            return new Intent().setComponent(this.f39182c);
        }
        Intent intent = null;
        if (this.f39184e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f39180a);
            try {
                bundleCall = context.getContentResolver().call(f39179f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e8) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f39180a)));
            }
        }
        return intent == null ? new Intent(this.f39180a).setPackage(this.f39181b) : intent;
    }

    public final String c() {
        return this.f39181b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC3206o.a(this.f39180a, e0Var.f39180a) && AbstractC3206o.a(this.f39181b, e0Var.f39181b) && AbstractC3206o.a(this.f39182c, e0Var.f39182c) && this.f39184e == e0Var.f39184e;
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f39180a, this.f39181b, this.f39182c, 4225, Boolean.valueOf(this.f39184e));
    }

    public final String toString() {
        String str = this.f39180a;
        if (str != null) {
            return str;
        }
        AbstractC3207p.k(this.f39182c);
        return this.f39182c.flattenToString();
    }

    public e0(String str, int i8, boolean z8) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public e0(String str, String str2, int i8, boolean z8) {
        AbstractC3207p.e(str);
        this.f39180a = str;
        AbstractC3207p.e(str2);
        this.f39181b = str2;
        this.f39182c = null;
        this.f39183d = 4225;
        this.f39184e = z8;
    }
}
