package K1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f4514a;

        public c(d[] dVarArr) {
            this.f4514a = dVarArr;
        }

        public d[] a() {
            return this.f4514a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f4518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4520f;

        public d(String str, int i8, boolean z8, String str2, int i9, int i10) {
            this.f4515a = str;
            this.f4516b = i8;
            this.f4517c = z8;
            this.f4518d = str2;
            this.f4519e = i9;
            this.f4520f = i10;
        }

        public String a() {
            return this.f4515a;
        }

        public int b() {
            return this.f4520f;
        }

        public int c() {
            return this.f4519e;
        }

        public String d() {
            return this.f4518d;
        }

        public int e() {
            return this.f4516b;
        }

        public boolean f() {
            return this.f4517c;
        }
    }

    public static int a(TypedArray typedArray, int i8) {
        return a.a(typedArray, i8);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i8) {
        if (i8 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i8)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), G1.f.f2686h);
        String string = typedArrayObtainAttributes.getString(G1.f.f2687i);
        String string2 = typedArrayObtainAttributes.getString(G1.f.f2691m);
        String string3 = typedArrayObtainAttributes.getString(G1.f.f2692n);
        int resourceId = typedArrayObtainAttributes.getResourceId(G1.f.f2688j, 0);
        int integer = typedArrayObtainAttributes.getInteger(G1.f.f2689k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(G1.f.f2690l, 500);
        String string4 = typedArrayObtainAttributes.getString(G1.f.f2693o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0162e(new Q1.e(string, string2, string3, (List<List<byte[]>>) c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), G1.f.f2694p);
        int i8 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(G1.f.f2703y) ? G1.f.f2703y : G1.f.f2696r, RCHTTPStatusCodes.BAD_REQUEST);
        boolean z8 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(G1.f.f2701w) ? G1.f.f2701w : G1.f.f2697s, 0);
        int i9 = typedArrayObtainAttributes.hasValue(G1.f.f2704z) ? G1.f.f2704z : G1.f.f2698t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(G1.f.f2702x) ? G1.f.f2702x : G1.f.f2699u);
        int i10 = typedArrayObtainAttributes.getInt(i9, 0);
        int i11 = typedArrayObtainAttributes.hasValue(G1.f.f2700v) ? G1.f.f2700v : G1.f.f2695q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i11, 0);
        String string2 = typedArrayObtainAttributes.getString(i11);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i8, z8, string, i10, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K1.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0162e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1.e f4521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f4524d;

        public C0162e(Q1.e eVar, int i8, int i9, String str) {
            this.f4521a = eVar;
            this.f4523c = i8;
            this.f4522b = i9;
            this.f4524d = str;
        }

        public int a() {
            return this.f4523c;
        }

        public Q1.e b() {
            return this.f4521a;
        }

        public String c() {
            return this.f4524d;
        }

        public int d() {
            return this.f4522b;
        }

        public C0162e(Q1.e eVar, int i8, int i9) {
            this(eVar, i8, i9, null);
        }
    }
}
