package Q1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f9115a = new Comparator() { // from class: Q1.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f9116a;

        public b(Context context, Uri uri) {
            this.f9116a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // Q1.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f9116a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e8) {
                Log.w("FontsProvider", "Unable to query the content provider", e8);
                return null;
            }
        }

        @Override // Q1.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f9116a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            byte b9 = bArr2[i8];
            if (b8 != b9) {
                return b8 - b9;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!Arrays.equals((byte[]) list.get(i8), (byte[]) list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : K1.e.c(resources, eVar.c());
    }

    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, g(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f9115a);
        List listD = d(eVar, resources);
        for (int i8 = 0; i8 < listD.size(); i8++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i8));
            Collections.sort(arrayList, f9115a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    public static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        a aVar;
        a aVar2;
        Uri uriWithAppendedId;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        a aVarA = a.a(context, uriBuild);
        Cursor cursorB = null;
        try {
            cursorB = aVarA.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorB == null || cursorB.getCount() <= 0) {
                aVar2 = aVarA;
            } else {
                int columnIndex = cursorB.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorB.getColumnIndex("_id");
                int columnIndex3 = cursorB.getColumnIndex("file_id");
                int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorB.getColumnIndex("font_weight");
                int columnIndex6 = cursorB.getColumnIndex("font_italic");
                while (cursorB.moveToNext()) {
                    int i8 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                    int i9 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        aVar = aVarA;
                        try {
                            uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursorB != null) {
                                cursorB.close();
                            }
                            aVar.close();
                            throw th;
                        }
                    } else {
                        aVar = aVarA;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                    }
                    int i10 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : RCHTTPStatusCodes.BAD_REQUEST;
                    if (columnIndex6 != -1) {
                        z8 = true;
                        if (cursorB.getInt(columnIndex6) != 1) {
                            z8 = false;
                        }
                    } else {
                        z8 = false;
                    }
                    arrayList2.add(g.b.a(uriWithAppendedId, i9, i10, z8, i8));
                    aVarA = aVar;
                }
                aVar2 = aVarA;
                arrayList = arrayList2;
            }
            if (cursorB != null) {
                cursorB.close();
            }
            aVar2.close();
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th2) {
            th = th2;
            aVar = aVarA;
        }
    }
}
