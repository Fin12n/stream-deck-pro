package H1;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3466a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3467b = new Object();

    public static r a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new r(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    public static r[] b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        r[] rVarArr = new r[bundleArr.length];
        for (int i8 = 0; i8 < bundleArr.length; i8++) {
            rVarArr[i8] = a(bundleArr[i8]);
        }
        return rVarArr;
    }

    public static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle e(j.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = bVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.m() : 0);
        bundle.putCharSequence(com.amazon.a.a.o.b.f16718S, bVar.h());
        bundle.putParcelable("actionIntent", bVar.a());
        Bundle bundle2 = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", g(bVar.e()));
        bundle.putBoolean("showsUserInterface", bVar.g());
        bundle.putInt("semanticAction", bVar.f());
        return bundle;
    }

    public static Bundle f(r rVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", rVar.j());
        bundle.putCharSequence("label", rVar.i());
        bundle.putCharSequenceArray("choices", rVar.f());
        bundle.putBoolean("allowFreeFormInput", rVar.d());
        bundle.putBundle("extras", rVar.h());
        Set setE = rVar.e();
        if (setE != null && !setE.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setE.size());
            Iterator it = setE.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] g(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i8 = 0; i8 < rVarArr.length; i8++) {
            bundleArr[i8] = f(rVarArr[i8]);
        }
        return bundleArr;
    }

    public static j.b c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new j.b(bundle.getInt("icon"), bundle.getCharSequence(com.amazon.a.a.o.b.f16718S), (PendingIntent) bundle.getParcelable(cFAYKUlMj.TjpSZ), bundle.getBundle("extras"), b(d(bundle, "remoteInputs")), b(d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }
}
