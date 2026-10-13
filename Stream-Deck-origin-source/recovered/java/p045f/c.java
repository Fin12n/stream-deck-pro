package p045f;

import C6.m;
import D6.z;
import V.ocy.SVzBK;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p036e.h;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends p045f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21231a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final ResolveInfo a(Context context) {
            t.g(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final String c(e input) {
            t.g(input, "input");
            if (input instanceof C0499c) {
                return "image/*";
            }
            if (input instanceof d) {
                return ((d) input).a();
            }
            if (input instanceof b) {
                return null;
            }
            throw new m();
        }

        public final boolean d(Context context) {
            t.g(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            t.g(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                return true;
            }
            return i8 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        public a() {
        }

        public final ResolveInfo b(Context context) {
            t.g(context, SVzBK.kmXViwct);
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21232a = new b();
    }

    /* JADX INFO: renamed from: f.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0499c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0499c f21233a = new C0499c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21234a;

        public d(String mimeType) {
            t.g(mimeType, "mimeType");
            this.f21234a = mimeType;
        }

        public final String a() {
            return this.f21234a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p045f.a.C0498a b(Context context, h input) {
        t.g(context, "context");
        t.g(input, "input");
        return null;
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i8, Intent intent) {
        if (i8 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) z.k0(p045f.b.f21230a.a(intent)) : data;
    }

    @Override // p045f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, h input) {
        t.g(context, "context");
        t.g(input, "input");
        a aVar = f21231a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo resolveInfoB = aVar.b(context);
            if (resolveInfoB == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoB.activityInfo;
            Intent intent2 = new Intent(toqHM.BVDKTIhEFbrdgr);
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (!aVar.d(context)) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(input.a()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
        ResolveInfo resolveInfoA = aVar.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo2 = resolveInfoA.activityInfo;
        Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
        intent4.setType(aVar.c(input.a()));
        return intent4;
    }
}
