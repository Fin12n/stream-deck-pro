package p111m2;

import R0.pkXL.Oitvkwcwn;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1726i;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D implements Parcelable {
    public static final Parcelable.Creator<D> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f29644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f29645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f29646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f29648m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D createFromParcel(Parcel parcel) {
            return new D(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D[] newArray(int i8) {
            return new D[i8];
        }
    }

    public D(ComponentCallbacksC2681f componentCallbacksC2681f) {
        this.f29636a = componentCallbacksC2681f.getClass().getName();
        this.f29637b = componentCallbacksC2681f.f29862f;
        this.f29638c = componentCallbacksC2681f.f29879o;
        this.f29639d = componentCallbacksC2681f.f29888x;
        this.f29640e = componentCallbacksC2681f.f29889y;
        this.f29641f = componentCallbacksC2681f.f29890z;
        this.f29642g = componentCallbacksC2681f.f29840C;
        this.f29643h = componentCallbacksC2681f.f29876m;
        this.f29644i = componentCallbacksC2681f.f29839B;
        this.f29645j = componentCallbacksC2681f.f29864g;
        this.f29646k = componentCallbacksC2681f.f29838A;
        this.f29647l = componentCallbacksC2681f.f29859d0.ordinal();
    }

    public ComponentCallbacksC2681f a(p pVar, ClassLoader classLoader) {
        ComponentCallbacksC2681f componentCallbacksC2681fA = pVar.a(classLoader, this.f29636a);
        Bundle bundle = this.f29645j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC2681fA.u1(this.f29645j);
        componentCallbacksC2681fA.f29862f = this.f29637b;
        componentCallbacksC2681fA.f29879o = this.f29638c;
        componentCallbacksC2681fA.f29881q = true;
        componentCallbacksC2681fA.f29888x = this.f29639d;
        componentCallbacksC2681fA.f29889y = this.f29640e;
        componentCallbacksC2681fA.f29890z = this.f29641f;
        componentCallbacksC2681fA.f29840C = this.f29642g;
        componentCallbacksC2681fA.f29876m = this.f29643h;
        componentCallbacksC2681fA.f29839B = this.f29644i;
        componentCallbacksC2681fA.f29838A = this.f29646k;
        componentCallbacksC2681fA.f29859d0 = AbstractC1726i.b.values()[this.f29647l];
        Bundle bundle2 = this.f29648m;
        if (bundle2 != null) {
            componentCallbacksC2681fA.f29854b = bundle2;
            return componentCallbacksC2681fA;
        }
        componentCallbacksC2681fA.f29854b = new Bundle();
        return componentCallbacksC2681fA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f29636a);
        parcel.writeString(this.f29637b);
        parcel.writeInt(this.f29638c ? 1 : 0);
        parcel.writeInt(this.f29639d);
        parcel.writeInt(this.f29640e);
        parcel.writeString(this.f29641f);
        parcel.writeInt(this.f29642g ? 1 : 0);
        parcel.writeInt(this.f29643h ? 1 : 0);
        parcel.writeInt(this.f29644i ? 1 : 0);
        parcel.writeBundle(this.f29645j);
        parcel.writeInt(this.f29646k ? 1 : 0);
        parcel.writeBundle(this.f29648m);
        parcel.writeInt(this.f29647l);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f29636a);
        sb.append(" (");
        sb.append(this.f29637b);
        sb.append(")}:");
        if (this.f29638c) {
            sb.append(" fromLayout");
        }
        if (this.f29640e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f29640e));
        }
        String str = this.f29641f;
        if (str != null && !str.isEmpty()) {
            sb.append(Oitvkwcwn.Yfs);
            sb.append(this.f29641f);
        }
        if (this.f29642g) {
            sb.append(" retainInstance");
        }
        if (this.f29643h) {
            sb.append(kDsnNkYbBsI.UTktMsXjt);
        }
        if (this.f29644i) {
            sb.append(" detached");
        }
        if (this.f29646k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public D(Parcel parcel) {
        this.f29636a = parcel.readString();
        this.f29637b = parcel.readString();
        this.f29638c = parcel.readInt() != 0;
        this.f29639d = parcel.readInt();
        this.f29640e = parcel.readInt();
        this.f29641f = parcel.readString();
        this.f29642g = parcel.readInt() != 0;
        this.f29643h = parcel.readInt() != 0;
        this.f29644i = parcel.readInt() != 0;
        this.f29645j = parcel.readBundle();
        this.f29646k = parcel.readInt() != 0;
        this.f29648m = parcel.readBundle();
        this.f29647l = parcel.readInt();
    }
}
