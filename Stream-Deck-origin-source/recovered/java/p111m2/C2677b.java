package p111m2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1726i;
import java.util.ArrayList;

/* JADX INFO: renamed from: m2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2677b implements Parcelable {
    public static final Parcelable.Creator<C2677b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f29753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f29755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f29756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f29761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f29763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f29764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f29765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f29766n;

    /* JADX INFO: renamed from: m2.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2677b createFromParcel(Parcel parcel) {
            return new C2677b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2677b[] newArray(int i8) {
            return new C2677b[i8];
        }
    }

    public C2677b(C2676a c2676a) {
        int size = c2676a.f29663c.size();
        this.f29753a = new int[size * 6];
        if (!c2676a.f29669i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f29754b = new ArrayList(size);
        this.f29755c = new int[size];
        this.f29756d = new int[size];
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            G.a aVar = (G.a) c2676a.f29663c.get(i9);
            int i10 = i8 + 1;
            this.f29753a[i8] = aVar.f29680a;
            ArrayList arrayList = this.f29754b;
            ComponentCallbacksC2681f componentCallbacksC2681f = aVar.f29681b;
            arrayList.add(componentCallbacksC2681f != null ? componentCallbacksC2681f.f29862f : null);
            int[] iArr = this.f29753a;
            iArr[i10] = aVar.f29682c ? 1 : 0;
            iArr[i8 + 2] = aVar.f29683d;
            iArr[i8 + 3] = aVar.f29684e;
            int i11 = i8 + 5;
            iArr[i8 + 4] = aVar.f29685f;
            i8 += 6;
            iArr[i11] = aVar.f29686g;
            this.f29755c[i9] = aVar.f29687h.ordinal();
            this.f29756d[i9] = aVar.f29688i.ordinal();
        }
        this.f29757e = c2676a.f29668h;
        this.f29758f = c2676a.f29671k;
        this.f29759g = c2676a.f29751v;
        this.f29760h = c2676a.f29672l;
        this.f29761i = c2676a.f29673m;
        this.f29762j = c2676a.f29674n;
        this.f29763k = c2676a.f29675o;
        this.f29764l = c2676a.f29676p;
        this.f29765m = c2676a.f29677q;
        this.f29766n = c2676a.f29678r;
    }

    public final void a(C2676a c2676a) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z8 = true;
            if (i8 >= this.f29753a.length) {
                c2676a.f29668h = this.f29757e;
                c2676a.f29671k = this.f29758f;
                c2676a.f29669i = true;
                c2676a.f29672l = this.f29760h;
                c2676a.f29673m = this.f29761i;
                c2676a.f29674n = this.f29762j;
                c2676a.f29675o = this.f29763k;
                c2676a.f29676p = this.f29764l;
                c2676a.f29677q = this.f29765m;
                c2676a.f29678r = this.f29766n;
                return;
            }
            G.a aVar = new G.a();
            int i10 = i8 + 1;
            aVar.f29680a = this.f29753a[i8];
            if (y.E0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2676a + " op #" + i9 + " base fragment #" + this.f29753a[i10]);
            }
            aVar.f29687h = AbstractC1726i.b.values()[this.f29755c[i9]];
            aVar.f29688i = AbstractC1726i.b.values()[this.f29756d[i9]];
            int[] iArr = this.f29753a;
            int i11 = i8 + 2;
            if (iArr[i10] == 0) {
                z8 = false;
            }
            aVar.f29682c = z8;
            int i12 = iArr[i11];
            aVar.f29683d = i12;
            int i13 = iArr[i8 + 3];
            aVar.f29684e = i13;
            int i14 = i8 + 5;
            int i15 = iArr[i8 + 4];
            aVar.f29685f = i15;
            i8 += 6;
            int i16 = iArr[i14];
            aVar.f29686g = i16;
            c2676a.f29664d = i12;
            c2676a.f29665e = i13;
            c2676a.f29666f = i15;
            c2676a.f29667g = i16;
            c2676a.e(aVar);
            i9++;
        }
    }

    public C2676a b(y yVar) {
        C2676a c2676a = new C2676a(yVar);
        a(c2676a);
        c2676a.f29751v = this.f29759g;
        for (int i8 = 0; i8 < this.f29754b.size(); i8++) {
            String str = (String) this.f29754b.get(i8);
            if (str != null) {
                ((G.a) c2676a.f29663c.get(i8)).f29681b = yVar.c0(str);
            }
        }
        c2676a.n(1);
        return c2676a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f29753a);
        parcel.writeStringList(this.f29754b);
        parcel.writeIntArray(this.f29755c);
        parcel.writeIntArray(this.f29756d);
        parcel.writeInt(this.f29757e);
        parcel.writeString(this.f29758f);
        parcel.writeInt(this.f29759g);
        parcel.writeInt(this.f29760h);
        TextUtils.writeToParcel(this.f29761i, parcel, 0);
        parcel.writeInt(this.f29762j);
        TextUtils.writeToParcel(this.f29763k, parcel, 0);
        parcel.writeStringList(this.f29764l);
        parcel.writeStringList(this.f29765m);
        parcel.writeInt(this.f29766n ? 1 : 0);
    }

    public C2677b(Parcel parcel) {
        this.f29753a = parcel.createIntArray();
        this.f29754b = parcel.createStringArrayList();
        this.f29755c = parcel.createIntArray();
        this.f29756d = parcel.createIntArray();
        this.f29757e = parcel.readInt();
        this.f29758f = parcel.readString();
        this.f29759g = parcel.readInt();
        this.f29760h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f29761i = (CharSequence) creator.createFromParcel(parcel);
        this.f29762j = parcel.readInt();
        this.f29763k = (CharSequence) creator.createFromParcel(parcel);
        this.f29764l = parcel.createStringArrayList();
        this.f29765m = parcel.createStringArrayList();
        this.f29766n = parcel.readInt() != 0;
    }
}
